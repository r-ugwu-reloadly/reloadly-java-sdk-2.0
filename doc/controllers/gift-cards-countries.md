# Gift Cards-Countries

```java
GiftCardsCountriesController giftCardsCountriesController = client.getGiftCardsCountriesController();
```

## Class Name

`GiftCardsCountriesController`

## Methods

* [Reloadly-Gift-Cards-Countries](../../doc/controllers/gift-cards-countries.md#reloadly-gift-cards-countries)
* [Reloadly-Gift-Cards-Country-by-Iso](../../doc/controllers/gift-cards-countries.md#reloadly-gift-cards-country-by-iso)


# Reloadly-Gift-Cards-Countries

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsCountriesAsync(
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

giftCardsCountriesController.reloadlyGiftCardsCountriesAsync(accept, authorization).thenAccept(result -> {
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
    "isoName": "AF",
    "name": "Afghanistan",
    "continent": "Asia",
    "currencyCode": "AFN",
    "currencyName": "Afghan Afghani",
    "currencySymbol": "؋",
    "flag": "https://s3.amazonaws.com/rld-flags/af.svg",
    "callingCodes": [
      "+93"
    ]
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


# Reloadly-Gift-Cards-Country-by-Iso

```java
CompletableFuture<DynamicResponse> reloadlyGiftCardsCountryByIsoAsync(
    final String accept,
    final String authorization,
    final String countrycode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `countrycode` | `String` | Template, Required | - |

## Server

`Server.GIFT_CARDS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.giftcards-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String countrycode = "PK";

giftCardsCountriesController.reloadlyGiftCardsCountryByIsoAsync(accept, authorization, countrycode).thenAccept(result -> {
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
    "isoName": "AG",
    "name": "Antigua and Barbuda",
    "continent": "North America",
    "currencyCode": "XCD",
    "currencyName": "East Caribbean Dollar",
    "currencySymbol": "XCD",
    "flag": "https://s3.amazonaws.com/rld-flags/ag.svg",
    "callingCodes": [
      "+1268"
    ]
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Country not found and/or not currently supported | `ApiException` |

