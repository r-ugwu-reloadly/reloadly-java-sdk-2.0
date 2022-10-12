# Airtime-Promotions

```java
AirtimePromotionsController airtimePromotionsController = client.getAirtimePromotionsController();
```

## Class Name

`AirtimePromotionsController`

## Methods

* [Reloadly-Airtime-Promotions](../../doc/controllers/airtime-promotions.md#reloadly-airtime-promotions)
* [Reloadly-Airtime-Promotion-by-Id](../../doc/controllers/airtime-promotions.md#reloadly-airtime-promotion-by-id)
* [Reloadly-Airtime-Promotion-by-Iso](../../doc/controllers/airtime-promotions.md#reloadly-airtime-promotion-by-iso)
* [Reloadly-Airtime-Promotion-by-Operator-Id](../../doc/controllers/airtime-promotions.md#reloadly-airtime-promotion-by-operator-id)


# Reloadly-Airtime-Promotions

```java
CompletableFuture<DynamicResponse> reloadlyAirtimePromotionsAsync(
    final String accept,
    final String authorization,
    final Integer size,
    final Integer page,
    final Integer languageCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `size` | `Integer` | Query, Optional | This indicates the number of promotions to be retrieved on a page. Default value is 200. |
| `page` | `Integer` | Query, Optional | This indicates the page of the promotions list being retrieved. Default value is 1. |
| `languageCode` | `Integer` | Query, Optional | This indicates the language you want the promotion information to be displayed in. The language code is to be specified in the ISO 639-1 format. Choices are 'EN', 'ES', 'FR', 'IT', 'PT', 'ZH', 'AR', 'HI', 'HT', 'JA' and 'DE'. Default is 'EN'. This is a case-insensitive field. The promotion information is returned in your requested language irrespective of the original language in which the promotion was launched. |

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

airtimePromotionsController.reloadlyAirtimePromotionsAsync(accept, authorization, size, page, null).thenAccept(result -> {
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
      "promotionId": 1,
      "operatorId": 129,
      "title": "Tigo El Salvador From 25 Jun 2018 00:00 To 25 July...",
      "title2": "Get 500 MB and 150 minutes for USA or Canada",
      "description": "For top ups of $10 or more, customer...",
      "startDate": "Mon, 25 Jun 2018 06:00:00 +0000",
      "endDate": "Tue, 26 Jun 2018 05:59:00 +0000",
      "denominations": "USD 10 and up",
      "localDenominations": null
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


# Reloadly-Airtime-Promotion-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyAirtimePromotionByIdAsync(
    final String accept,
    final String authorization,
    final String promotionid,
    final String languageCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `promotionid` | `String` | Template, Required | The promotion's identification number. |
| `languageCode` | `String` | Query, Optional | This indicates the language you want the promotion information to be displayed in. The language code is to be specified in the ISO 639-1 format. Choices are 'EN', 'ES', 'FR', 'IT', 'PT', 'ZH', 'AR', 'HI', 'HT', 'JA' and 'DE'. Default is 'EN'. This is a case-insensitive field. The promotion information is returned in your requested language irrespective of the original language in which the promotion was launched. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String promotionid = "5583";
String languageCode = "EN";

airtimePromotionsController.reloadlyAirtimePromotionByIdAsync(accept, authorization, promotionid, languageCode).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "content": {
    "promotionId": 1,
    "operatorId": 129,
    "title": "Tigo El Salvador From 25 Jun 2018 00:00 To 25 July...",
    "title2": "Get 500 MB and 150 minutes for USA or Canada",
    "description": "For top ups of $10 or more, customer...",
    "startDate": "Mon, 25 Jun 2018 06:00:00 +0000",
    "endDate": "Tue, 26 Jun 2018 05:59:00 +0000",
    "denominations": "USD 10 and up",
    "localDenominations": null
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Promotion not found | `ApiException` |


# Reloadly-Airtime-Promotion-by-Iso

```java
CompletableFuture<DynamicResponse> reloadlyAirtimePromotionByIsoAsync(
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

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String countrycode = "US";

airtimePromotionsController.reloadlyAirtimePromotionByIsoAsync(accept, authorization, countrycode).thenAccept(result -> {
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
      "promotionId": 1,
      "operatorId": 129,
      "title": "Tigo El Salvador From 25 Jun 2018 00:00 To 25 July...",
      "title2": "Get 500 MB and 150 minutes for USA or Canada",
      "description": "For top ups of $10 or more, customer...",
      "startDate": "Mon, 25 Jun 2018 06:00:00 +0000",
      "endDate": "Tue, 26 Jun 2018 05:59:00 +0000",
      "denominations": "USD 10 and up",
      "localDenominations": null
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


# Reloadly-Airtime-Promotion-by-Operator-Id

```java
CompletableFuture<DynamicResponse> reloadlyAirtimePromotionByOperatorIdAsync(
    final String accept,
    final String authorization,
    final String operatorid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Template, Required | - |
| `operatorid` | `String` | Template, Required | - |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String operatorid = "129";

airtimePromotionsController.reloadlyAirtimePromotionByOperatorIdAsync(accept, authorization, operatorid).thenAccept(result -> {
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
      "promotionId": 1,
      "operatorId": 129,
      "title": "Tigo El Salvador From 25 Jun 2018 00:00 To 25 July...",
      "title2": "Get 500 MB and 150 minutes for USA or Canada",
      "description": "For top ups of $10 or more, customer...",
      "startDate": "Mon, 25 Jun 2018 06:00:00 +0000",
      "endDate": "Tue, 26 Jun 2018 05:59:00 +0000",
      "denominations": "USD 10 and up",
      "localDenominations": null
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

