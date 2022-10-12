# Gift Cards-Discounts

```java
GiftCardsDiscountsController giftCardsDiscountsController = client.getGiftCardsDiscountsController();
```

## Class Name

`GiftCardsDiscountsController`

## Methods

* [Reloadly-Gift-Cards-Discounts](../../doc/controllers/gift-cards-discounts.md#reloadly-gift-cards-discounts)
* [Reloadly-Gift-Cards-Discount-by-Product-Id](../../doc/controllers/gift-cards-discounts.md#reloadly-gift-cards-discount-by-product-id)


# Reloadly-Gift-Cards-Discounts

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsDiscountsAsync(
    final String accept,
    final String authorization,
    final String size,
    final String page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `size` | `String` | Template, Optional | Indicates the number of gift card products offering discounts to be retrieved on a page. |
| `page` | `String` | Template, Optional | Indicates the page of the list of gift card products offering discounts. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String size = "50";
String page = "2";

giftCardsDiscountsController.reloadlyGiftCardsDiscountsAsync(accept, authorization, size, page).thenAccept(result -> {
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
    "product": {
      "productId": 28,
      "productName": "Apple Music 12 month Canada",
      "countryCode": "CA",
      "global": false
    },
    "discountPercentage": 2
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


# Reloadly-Gift-Cards-Discount-by-Product-Id

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsDiscountByProductIdAsync(
    final String accept,
    final String authorization,
    final String productid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `productid` | `String` | Template, Required | The product's identification number. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String productid = "5";

giftCardsDiscountsController.reloadlyGiftCardsDiscountByProductIdAsync(accept, authorization, productid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "product": {
    "productId": 28,
    "productName": "Apple Music 12 month Canada",
    "countryCode": "CA",
    "global": false
  },
  "discountPercentage": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not found | `ApiException` |

