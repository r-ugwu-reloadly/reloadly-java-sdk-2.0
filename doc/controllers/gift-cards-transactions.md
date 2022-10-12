# Gift Cards-Transactions

```java
GiftCardsTransactionsController giftCardsTransactionsController = client.getGiftCardsTransactionsController();
```

## Class Name

`GiftCardsTransactionsController`

## Methods

* [Reloadly-Gift-Cards-Transactions](../../doc/controllers/gift-cards-transactions.md#reloadly-gift-cards-transactions)
* [Reloadly-Gift-Cards-Transaction-by-Id](../../doc/controllers/gift-cards-transactions.md#reloadly-gift-cards-transaction-by-id)


# Reloadly-Gift-Cards-Transactions

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsTransactionsAsync(
    final String accept,
    final String authorization,
    final String size,
    final String page,
    final String startDate,
    final String endDate)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `size` | `String` | Query, Optional | This indicates the number of transactions to be retrieved on a page. |
| `page` | `String` | Query, Optional | This indicates the page of the transactions list being retrieved. |
| `startDate` | `String` | Query, Optional | Indicates the start date for the range of transactions to be retrieved. |
| `endDate` | `String` | Query, Optional | Indicates the end date for the range of transactions to be retrieved. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String size = "10";
String page = "1";
String startDate = "2021-06-01 10:00:00";
String endDate = "2021-07-20 19:17:02";

giftCardsTransactionsController.reloadlyGiftCardsTransactionsAsync(accept, authorization, size, page, startDate, endDate).thenAccept(result -> {
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
    "transactionId": 1,
    "amount": 60553.3575,
    "discount": 0,
    "currencyCode": "NGN",
    "fee": 198.35026,
    "customIdentifier": "obucks3",
    "status": "SUCCESSFUL",
    "product": {
      "productId": 4,
      "productName": "Amazon Spain",
      "countryCode": "ES",
      "quantity": 5,
      "unitPrice": 25,
      "totalPrice": 125,
      "currencyCode": "EUR",
      "brand": {
        "brandId": 2,
        "brandName": "Amazon"
      }
    },
    "smsFee": 56.91,
    "receipientPhone": 34657829900,
    "transactionCreatedTime": "2022-02-28 13:46:00"
  },
  {},
  {}
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Could not retrieve/update resources at the moment, please try again later | `ApiException` |


# Reloadly-Gift-Cards-Transaction-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsTransactionByIdAsync(
    final String accept,
    final String authorization,
    final String transactionid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `transactionid` | `String` | Template, Required | Indicates the identification number of the transaction to be retrieved. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String transactionid = "2";

giftCardsTransactionsController.reloadlyGiftCardsTransactionByIdAsync(accept, authorization, transactionid).thenAccept(result -> {
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
    "transactionId": 1,
    "amount": 60553.3575,
    "discount": 0,
    "currencyCode": "NGN",
    "fee": 198.35026,
    "customIdentifier": "obucks3",
    "status": "SUCCESSFUL",
    "product": {
      "productId": 4,
      "productName": "Amazon Spain",
      "countryCode": "ES",
      "quantity": 5,
      "unitPrice": 25,
      "totalPrice": 125,
      "currencyCode": "EUR",
      "brand": {
        "brandId": 2,
        "brandName": "Amazon"
      }
    },
    "smsFee": 56.91,
    "receipientPhone": 34657829900,
    "transactionCreatedTime": "2022-02-28 13:46:00"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Indicates the identification number of the transaction to be retrieved. | `ApiException` |
| 404 | Could not retrieve/update resources at the moment, please try again later | `ApiException` |

