# Utility Payments-Transactions

```java
UtilityPaymentsTransactionsController utilityPaymentsTransactionsController = client.getUtilityPaymentsTransactionsController();
```

## Class Name

`UtilityPaymentsTransactionsController`

## Methods

* [Reloadly-Utility-Payments-Transactions](../../doc/controllers/utility-payments-transactions.md#reloadly-utility-payments-transactions)
* [Reloadly-Utility-Payments-Transaction-by-Id](../../doc/controllers/utility-payments-transactions.md#reloadly-utility-payments-transaction-by-id)


# Reloadly-Utility-Payments-Transactions

```java
CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsTransactionsAsync(
    final String accept,
    final String authorization,
    final String referenceId,
    final Integer page,
    final Integer size,
    final String startDate,
    final String endDate,
    final String status,
    final String serviceType,
    final String billerType,
    final String billerCountryCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `referenceId` | `String` | Query, Optional | The reference ID you may have specified while placing the transaction. |
| `page` | `Integer` | Query, Optional | The page to be retrieved from the transaction list. |
| `size` | `Integer` | Query, Optional | Number of items to include in a single page. |
| `startDate` | `String` | Query, Optional | Indicates the start date for the range of transactions to be retrieved. |
| `endDate` | `String` | Query, Optional | Indicates the end date for the range of transactions to be retrieved. |
| `status` | `String` | Query, Optional | The transaction's status. Can be either PROCESSING, SUCCESSFUL, FAILED, or REFUNDED. |
| `serviceType` | `String` | Query, Optional | The biller's service type. Can be either PREPAID or POSTPAID. |
| `billerType` | `String` | Query, Optional | The biller's type. Can be either ELECTRICITY_BILL_PAYMENT, WATER_BILL_PAYMENT, TV_BILL_PAYMENT, or INTERNET_BILL_PAYMENT |
| `billerCountryCode` | `String` | Query, Optional | Indicates the ISO code of the country where the biller is located. |

## Server

`Server.UTILITY_PAYMENTS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.utilities-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String referenceId = "april-electricity-bill";
Integer page = 10;
Integer size = 1;
String startDate = "2021-06-01 00:00:00";
String endDate = "2022-06-01 10:00:00";
String status = "PROCESSING";
String serviceType = "PREPAID";
String billerType = "ELECTRICITY_BILL_PAYMENT";
String billerCountryCode = "NG";

utilityPaymentsTransactionsController.reloadlyUtilityPaymentsTransactionsAsync(accept, authorization, referenceId, page, size, startDate, endDate, status, serviceType, billerType, billerCountryCode).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
[
  {
    "code": "PAYMENT_PROCESSED_SUCCESSFULLY",
    "message": "The payment was processed successfully",
    "transaction": {
      "id": 13,
      "status": "SUCCESSFUL",
      "referenceId": "april-electricity-bill",
      "amount": 1000,
      "amountCurrencyCode": "NGN",
      "deliveryAmount": 1000,
      "deliveryAmountCurrencyCode": "NGN",
      "fee": 0.25,
      "feeCurrencyCode": "USD",
      "discount": 0,
      "discountCurrencyCode": "USD",
      "submittedAt": "2022-03-29 07:04:21",
      "balanceInfo": {
        "oldBalance": 9997.34912,
        "newBalance": 9994.69824,
        "cost": 2.65088,
        "currencyCode": "USD",
        "curencyName": "US Dollar",
        "updatedAt": "2022-03-29 11:04:21"
      },
      "billDetails": {
        "type": "ELECTRICITY_BILL_PAYMENT",
        "billerId": 2,
        "billerName": "Abuja Electricity Postpaid",
        "billerCountryCode": "NG",
        "serviceType": "POSTPAID",
        "completedAt": "2022-03-29 07:04:25",
        "subscriberDetails": {
          "accountNumber": 4223568280
        }
      }
    }
  },
  {},
  {}
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |


# Reloadly-Utility-Payments-Transaction-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsTransactionByIdAsync(
    final String accept,
    final String authorization,
    final int id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `id` | `int` | Template, Required | The utility payment's identification number. |

## Server

`Server.UTILITY_PAYMENTS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.utilities-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
int id = 10;

utilityPaymentsTransactionsController.reloadlyUtilityPaymentsTransactionByIdAsync(accept, authorization, id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
[
  {
    "code": "PAYMENT_PROCESSED_SUCCESSFULLY",
    "message": "The payment was processed successfully",
    "transaction": {
      "id": 13,
      "status": "SUCCESSFUL",
      "referenceId": "april-electricity-bill",
      "amount": 1000,
      "amountCurrencyCode": "NGN",
      "deliveryAmount": 1000,
      "deliveryAmountCurrencyCode": "NGN",
      "fee": 0.25,
      "feeCurrencyCode": "USD",
      "discount": 0,
      "discountCurrencyCode": "USD",
      "submittedAt": "2022-03-29 07:04:21",
      "balanceInfo": {
        "oldBalance": 9997.34912,
        "newBalance": 9994.69824,
        "cost": 2.65088,
        "currencyCode": "USD",
        "curencyName": "US Dollar",
        "updatedAt": "2022-03-29 11:04:21"
      },
      "billDetails": {
        "type": "ELECTRICITY_BILL_PAYMENT",
        "billerId": 2,
        "billerName": "Abuja Electricity Postpaid",
        "billerCountryCode": "NG",
        "serviceType": "POSTPAID",
        "completedAt": "2022-03-29 07:04:25",
        "subscriberDetails": {
          "accountNumber": 4223568280
        }
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not found | `ApiException` |

