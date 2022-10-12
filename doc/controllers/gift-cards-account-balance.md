# Gift Cards-Account Balance

```java
GiftCardsAccountBalanceController giftCardsAccountBalanceController = client.getGiftCardsAccountBalanceController();
```

## Class Name

`GiftCardsAccountBalanceController`


# Reloadly-Gift-Cards-Account-Balance

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsAccountBalanceAsync(
    final String accept,
    final String authorization)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";

giftCardsAccountBalanceController.reloadlyGiftCardsAccountBalanceAsync(accept, authorization).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "balance": 6000,
  "currencyCode": "USD",
  "currencyName": "US Dollar",
  "updatedAt": "2022-02-04 17:45:51"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |

