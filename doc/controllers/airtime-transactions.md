# Airtime-Transactions

```java
AirtimeTransactionsController airtimeTransactionsController = client.getAirtimeTransactionsController();
```

## Class Name

`AirtimeTransactionsController`

## Methods

* [Reloadly-Airtime-Transactions](../../doc/controllers/airtime-transactions.md#reloadly-airtime-transactions)
* [Reloadly-Airtime-Transaction-by-Id](../../doc/controllers/airtime-transactions.md#reloadly-airtime-transaction-by-id)


# Reloadly-Airtime-Transactions

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeTransactionsAsync(
    final String accept,
    final String authorization,
    final Integer size,
    final Integer page,
    final Integer countrycode,
    final String operatorid,
    final String operatorName,
    final String customIdentifier,
    final String startDate,
    final String endDate)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `size` | `Integer` | Query, Optional | This indicates the number of transactions to be retrieved on a page. Default value is 200. |
| `page` | `Integer` | Query, Optional | This indicates the page of the transactions list being retrieved. Default value is 1. |
| `countrycode` | `Integer` | Query, Optional | Indicates the ISO code of the country assigned to the top-up's receiver at the time the top-up transaction was made. |
| `operatorid` | `String` | Query, Optional | Indicates the operator identification number assigned to the top-up transaction at the time it was made. |
| `operatorName` | `String` | Query, Optional | Indicates the operator name assigned to the top-up transaction at the time it was made. |
| `customIdentifier` | `String` | Query, Optional | Indicates the unique reference assigned to the top-up transaction at the time it was made. |
| `startDate` | `String` | Query, Optional | Indicates the beginning of the timeframe range for the transactions to be retrieved. |
| `endDate` | `String` | Query, Optional | String  Indicates the end of the timeframe range for the transactions to be retrieved. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
Integer size = 10;
Integer page = 1;
String operatorid = "341";
String operatorName = "MTN Nigeria";
String customIdentifier = "april-top-up";
String startDate = "2021-04-30 00:00:00";
String endDate = "2021-07-30 00:00:00";

airtimeTransactionsController.reloadlyAirtimeTransactionsAsync(accept, authorization, size, page, null, operatorid, operatorName, customIdentifier, startDate, endDate).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "content": [
    {
      "transactionId": 4602843,
      "status": "SUCCESSFUL",
      "operatorTransactionId": "7297929551:OrderConfirmed",
      "customIdentifier": "This is example identifier 130",
      "recipientPhone": 447951631337,
      "recipientEmail": null,
      "senderPhone": 11231231231,
      "countryCode": "GB",
      "operatorId": 535,
      "operatorName": "EE PIN England",
      "discount": 63.37,
      "discountCurrencyCode": "NGN",
      "requestedAmount": 3168.4,
      "requestedAmountCurrencyCode": "NGN",
      "deliveredAmount": 4.9985,
      "deliveredAmountCurrencyCode": "GBP",
      "transactionDate": "2021-12-06 08:13:39",
      "pinDetail": {
        "serial": 558111,
        "info1": "DIAL *611",
        "info2": "DIAL *611",
        "info3": "DIAL *611",
        "value": null,
        "code": 773709733097662,
        "ivr": "1-888-888-8888",
        "validity": "30 days"
      },
      "balanceInfo": null
    },
    {},
    {}
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |


# Reloadly-Airtime-Transaction-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeTransactionByIdAsync(
    final String accept,
    final String authorization,
    final int transactionid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `transactionid` | `int` | Template, Required | This indicates the identification number of the transaction to be retrieved. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
int transactionid = 101;

airtimeTransactionsController.reloadlyAirtimeTransactionByIdAsync(accept, authorization, transactionid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "transactionId": 4602843,
  "status": "SUCCESSFUL",
  "operatorTransactionId": "7297929551:OrderConfirmed",
  "customIdentifier": "This is example identifier 130",
  "recipientPhone": 447951631337,
  "recipientEmail": null,
  "senderPhone": 11231231231,
  "countryCode": "GB",
  "operatorId": 535,
  "operatorName": "EE PIN England",
  "discount": 63.37,
  "discountCurrencyCode": "NGN",
  "requestedAmount": 3168.4,
  "requestedAmountCurrencyCode": "NGN",
  "deliveredAmount": 4.9985,
  "deliveredAmountCurrencyCode": "GBP",
  "transactionDate": "2021-12-06 08:13:39",
  "pinDetail": {
    "serial": 558111,
    "info1": "DIAL *611",
    "info2": "DIAL *611",
    "info3": "DIAL *611",
    "value": null,
    "code": 773709733097662,
    "ivr": "1-888-888-8888",
    "validity": "30 days"
  },
  "balanceInfo": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Airtime transaction not found | `ApiException` |

