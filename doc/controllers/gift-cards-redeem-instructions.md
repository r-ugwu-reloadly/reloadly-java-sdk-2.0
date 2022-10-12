# Gift Cards-Redeem Instructions

```java
GiftCardsRedeemInstructionsController giftCardsRedeemInstructionsController = client.getGiftCardsRedeemInstructionsController();
```

## Class Name

`GiftCardsRedeemInstructionsController`

## Methods

* [Reloadly-Gift-Cards-Redeem-Instructions](../../doc/controllers/gift-cards-redeem-instructions.md#reloadly-gift-cards-redeem-instructions)
* [Reloadly-Gift-Cards-Redeem-Instructions-by-Brand-Id](../../doc/controllers/gift-cards-redeem-instructions.md#reloadly-gift-cards-redeem-instructions-by-brand-id)


# Reloadly-Gift-Cards-Redeem-Instructions

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsRedeemInstructionsAsync(
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

giftCardsRedeemInstructionsController.reloadlyGiftCardsRedeemInstructionsAsync(accept, authorization).thenAccept(result -> {
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
    "brandId": 1,
    "brandName": "1-800-PetSupplies",
    "concise": "This card is redeemable for merchandise on www.1-800-petsupplies.com",
    "verbose": "Your acceptance of this eCertificate constitutes your agreement to these terms and conditions. This card is redeemable in U.S. only for merchandise on www.1-800-petsupplies.com . Only two eCertificates are redeemable per order. eCertificates cannot be redeemed for cash, except as required by law. Void if altered or reproduced. This gift card is issued in U.S. funds by Tabcom, LLC. When Redeeming online please be sure to enter the entire gift card number including preceding zeros. The maximum number of eCertificates that can be used for phone is nine. By accepting these Terms and Conditions through your use of this Site, you certify that you reside in the United States and are 18 years of age or older. If you are under the age of 18 but at least 14 years of age you may use this Site only under the supervision of a parent or legal guardian who agrees to be bound by these Terms and Conditions."
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


# Reloadly-Gift-Cards-Redeem-Instructions-by-Brand-Id

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsRedeemInstructionsByBrandIdAsync(
    final String accept,
    final String authorization,
    final String brandid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `brandid` | `String` | Template, Required | The gift card brand's identification number. |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String brandid = "4";

giftCardsRedeemInstructionsController.reloadlyGiftCardsRedeemInstructionsByBrandIdAsync(accept, authorization, brandid).thenAccept(result -> {
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
    "brandId": 1,
    "brandName": "1-800-PetSupplies",
    "concise": "This card is redeemable for merchandise on www.1-800-petsupplies.com",
    "verbose": "Your acceptance of this eCertificate constitutes your agreement to these terms and conditions. This card is redeemable in U.S. only for merchandise on www.1-800-petsupplies.com . Only two eCertificates are redeemable per order. eCertificates cannot be redeemed for cash, except as required by law. Void if altered or reproduced. This gift card is issued in U.S. funds by Tabcom, LLC. When Redeeming online please be sure to enter the entire gift card number including preceding zeros. The maximum number of eCertificates that can be used for phone is nine. By accepting these Terms and Conditions through your use of this Site, you certify that you reside in the United States and are 18 years of age or older. If you are under the age of 18 but at least 14 years of age you may use this Site only under the supervision of a parent or legal guardian who agrees to be bound by these Terms and Conditions."
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |

