# Gift Cards-Orders

```java
GiftCardsOrdersController giftCardsOrdersController = client.getGiftCardsOrdersController();
```

## Class Name

`GiftCardsOrdersController`

## Methods

* [Reloadly-Gift-Cards-Redeem-Codes](../../doc/controllers/gift-cards-orders.md#reloadly-gift-cards-redeem-codes)
* [Reloadly-Gift-Cards-Orders](../../doc/controllers/gift-cards-orders.md#reloadly-gift-cards-orders)


# Reloadly-Gift-Cards-Redeem-Codes

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsRedeemCodesAsync(
    final String accept,
    final String authorization,
    final int transactionid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `transactionid` | `int` | Template, Required | Indicates the transaction identification number of the gift card's redeem code to be retrieved. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
int transactionid = 2;

giftCardsOrdersController.reloadlyGiftCardsRedeemCodesAsync(accept, authorization, transactionid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "cardNumber": 6120200345149064,
  "pinCode": 5821
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Invalid transaction ID | `ApiException` |


# Reloadly-Gift-Cards-Orders

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsOrdersAsync(
    final String accept,
    final String authorization,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `body` | `Object` | Body, Required | Request Payload |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
Object body = com.reloadly.auth.ApiHelper.deserialize("{\"productId\":120,\"countryCode\":\"US\",\"quantity\":1,\"unitPrice\":1,\"customIdentifier\":\"obucks10\",\"senderName\":\"John Doe\",\"recipientEmail\":\"anyone@email.com\",\"recipientPhoneDetails\":{\"countryCode\":\"ES\",\"phoneNumber\":\"657228901\"}}");

giftCardsOrdersController.reloadlyGiftCardsOrdersAsync(accept, authorization, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "transactionId": 1,
  "amount": 34536.21,
  "discount": 1709.72,
  "currencyCode": "NGN",
  "fee": 285,
  "recipientEmail": "anyone@email.com",
  "customIdentifier": "obucks1dime0",
  "status": "SUCCESSFUL",
  "product": {
    "productId": 1,
    "productName": "1-800-PetSupplies",
    "countryCode": "PS",
    "quantity": 1,
    "unitPrice": 59.99,
    "totalPrice": 59.99,
    "currencyCode": "USD",
    "brand": {
      "brandId": 6,
      "brandName": "1-800-PetSupplies"
    }
  },
  "smsFee": 56.91,
  "recipientPhone": 34657829900,
  "transactionCreatedTime": "2022-02-28 13:46:00"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid price, please ensure you selected the right price | `ApiException` |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not found | `ApiException` |

