# Airtime-Operators

```java
AirtimeOperatorsController airtimeOperatorsController = client.getAirtimeOperatorsController();
```

## Class Name

`AirtimeOperatorsController`

## Methods

* [Reloadly-Airtime-Operators](../../doc/controllers/airtime-operators.md#reloadly-airtime-operators)
* [Reloadly-Airtime-Operator-Autodetect](../../doc/controllers/airtime-operators.md#reloadly-airtime-operator-autodetect)
* [Reloadly-Airtime-Operator-by-Id](../../doc/controllers/airtime-operators.md#reloadly-airtime-operator-by-id)
* [Reloadly-Airtime-Operator-by-Iso](../../doc/controllers/airtime-operators.md#reloadly-airtime-operator-by-iso)


# Reloadly-Airtime-Operators

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeOperatorsAsync(
    final String accept,
    final String authorization,
    final String includeBundles,
    final String includeData,
    final String suggestedAmountsMap,
    final String size,
    final String page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `includeBundles` | `String` | Query, Optional | Indicates if any airtime and data bundles being offered by the operator should be included in the API response. Default value is true. |
| `includeData` | `String` | Query, Optional | Indicates if any airtime or data plans being offered by the operator should be included in the API response. Default value is true. |
| `suggestedAmountsMap` | `String` | Query, Optional | Indicates if this field should be returned as a response. Default value is false. |
| `size` | `String` | Query, Optional | This indicates the number of operators to be retrieved on a page. Default value is 200. |
| `page` | `String` | Query, Optional | This indicates the page of the operator list being retrieved. Default value is 1. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String includeBundles = "true";
String includeData = "true";
String suggestedAmountsMap = "false";
String size = "10";
String page = "2";

airtimeOperatorsController.reloadlyAirtimeOperatorsAsync(accept, authorization, includeBundles, includeData, suggestedAmountsMap, size, page).thenAccept(result -> {
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
      "id": 88,
      "operatorId": 88,
      "name": "Movistar Colombia",
      "bundle": false,
      "data": false,
      "pin": false,
      "supportsLocalAmounts": false,
      "denominationType": "RANGE",
      "senderCurrencyCode": "USD",
      "senderCurrencySymbol": "$",
      "destinationCurrencyCode": "COP",
      "destinationCurrencySymbol": "$",
      "commission": 4.42,
      "internationalDiscount": 4.42,
      "localDiscount": 0,
      "mostPopularAmount": null,
      "minAmount": 5,
      "maxAmount": 5,
      "localMinAmount": null,
      "localMaxAmount": null,
      "country": {
        "isoName": "CO",
        "name": "Colombia"
      },
      "fx": {
        "rate": 2192.1867,
        "currencyCode": "COP"
      },
      "logoUrls": [
        "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-1.png",
        "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-2.png",
        "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-3.png"
      ],
      "fixedAmounts": [],
      "fixedAmountsDescriptions": [],
      "localFixedAmounts": [],
      "localFixedAmountsDescriptions": [],
      "suggestedAmounts": [
        7,
        10,
        15
      ],
      "suggestedAmountsMap": {
        "7": 19482.51,
        "10": 27832.16,
        "15": 41748.23
      },
      "promotions": []
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


# Reloadly-Airtime-Operator-Autodetect

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeOperatorAutodetectAsync(
    final String accept,
    final String authorization,
    final String phone,
    final String countryisocode,
    final String countrycode,
    final Boolean suggestedAmounts,
    final Boolean suggestedAmountsMap)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `phone` | `String` | Template, Required | The mobile number whose details are to be retrieved. |
| `countryisocode` | `String` | Template, Required | The ISO code of the country where the mobile number is registered. |
| `countrycode` | `String` | Template, Required | - |
| `suggestedAmounts` | `Boolean` | Query, Optional | Indicates if this field should be returned as a response. Default value is false. |
| `suggestedAmountsMap` | `Boolean` | Query, Optional | Indicates if this field should be returned as a response. Default value is false. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String phone = "8147658721";
String countryisocode = "US";
String countrycode = "countrycode6";
Boolean suggestedAmounts = false;
Boolean suggestedAmountsMap = true;

airtimeOperatorsController.reloadlyAirtimeOperatorAutodetectAsync(accept, authorization, phone, countryisocode, countrycode, suggestedAmounts, suggestedAmountsMap).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": 88,
  "operatorId": 88,
  "name": "Movistar Colombia",
  "bundle": false,
  "data": false,
  "pin": false,
  "supportsLocalAmounts": false,
  "denominationType": "RANGE",
  "senderCurrencyCode": "USD",
  "senderCurrencySymbol": "$",
  "destinationCurrencyCode": "COP",
  "destinationCurrencySymbol": "$",
  "commission": 4.42,
  "internationalDiscount": 4.42,
  "localDiscount": 0,
  "mostPopularAmount": null,
  "minAmount": 5,
  "maxAmount": 5,
  "localMinAmount": null,
  "localMaxAmount": null,
  "country": {
    "isoName": "CO",
    "name": "Colombia"
  },
  "fx": {
    "rate": 2192.1867,
    "currencyCode": "COP"
  },
  "logoUrls": [
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-1.png",
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-2.png",
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-3.png"
  ],
  "fixedAmounts": [],
  "fixedAmountsDescriptions": [],
  "localFixedAmounts": [],
  "localFixedAmountsDescriptions": [],
  "suggestedAmounts": [
    7,
    10,
    15
  ],
  "suggestedAmountsMap": {
    "7": 19482.51,
    "10": 27832.16,
    "15": 41748.23
  },
  "promotions": []
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Country code must be 2 characters ISO-Alpha-2 country code. See https://www.iban.com/country-codes | `ApiException` |


# Reloadly-Airtime-Operator-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeOperatorByIdAsync(
    final String accept,
    final String authorization,
    final String operatorid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `operatorid` | `String` | Template, Required | The operator's identification number. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String operatorid = "88";

airtimeOperatorsController.reloadlyAirtimeOperatorByIdAsync(accept, authorization, operatorid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": 88,
  "operatorId": 88,
  "name": "Movistar Colombia",
  "bundle": false,
  "data": false,
  "pin": false,
  "supportsLocalAmounts": false,
  "denominationType": "RANGE",
  "senderCurrencyCode": "USD",
  "senderCurrencySymbol": "$",
  "destinationCurrencyCode": "COP",
  "destinationCurrencySymbol": "$",
  "commission": 4.42,
  "internationalDiscount": 4.42,
  "localDiscount": 0,
  "mostPopularAmount": null,
  "minAmount": 5,
  "maxAmount": 5,
  "localMinAmount": null,
  "localMaxAmount": null,
  "country": {
    "isoName": "CO",
    "name": "Colombia"
  },
  "fx": {
    "rate": 2192.1867,
    "currencyCode": "COP"
  },
  "logoUrls": [
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-1.png",
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-2.png",
    "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-3.png"
  ],
  "fixedAmounts": [],
  "fixedAmountsDescriptions": [],
  "localFixedAmounts": [],
  "localFixedAmountsDescriptions": [],
  "suggestedAmounts": [
    7,
    10,
    15
  ],
  "suggestedAmountsMap": {
    "7": 19482.51,
    "10": 27832.16,
    "15": 41748.23
  },
  "promotions": []
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Operator not found for given id | `ApiException` |


# Reloadly-Airtime-Operator-by-Iso

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeOperatorByIsoAsync(
    final String accept,
    final String authorization,
    final String countrycode,
    final boolean includeBundles,
    final Boolean suggestedAmountsMap,
    final String suggestedAmounts,
    final Boolean includePin,
    final Boolean includeData)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Query, Required | - |
| `countrycode` | `String` | Template, Required | The ISO code of the country where the operator is registered. |
| `includeBundles` | `boolean` | Query, Required | Indicates if any airtime and data bundles being offered by the operator should be returned as a response. Default value is true. |
| `suggestedAmountsMap` | `Boolean` | Query, Optional | Indicates if this field should be returned as a response. Default value is false. |
| `suggestedAmounts` | `String` | Query, Optional | Indicates if this field should be returned as a response. Default value is false. |
| `includePin` | `Boolean` | Query, Optional | Indicates if PIN details if applicable to the operator, should be returned as a response. Default value is true. |
| `includeData` | `Boolean` | Query, Optional | Indicates if any data plans being offered by the operator should be returned as a response. Default value is true. |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String countrycode = "US";
boolean includeBundles = false;
Boolean suggestedAmountsMap = false;
String suggestedAmounts = "false";
Boolean includePin = false;
Boolean includeData = false;

airtimeOperatorsController.reloadlyAirtimeOperatorByIsoAsync(accept, authorization, countrycode, includeBundles, suggestedAmountsMap, suggestedAmounts, includePin, includeData).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "example": {
    "id": 88,
    "operatorId": 88,
    "name": "Movistar Colombia",
    "bundle": false,
    "data": false,
    "pin": false,
    "supportsLocalAmounts": false,
    "denominationType": "RANGE",
    "senderCurrencyCode": "USD",
    "senderCurrencySymbol": "$",
    "destinationCurrencyCode": "COP",
    "destinationCurrencySymbol": "$",
    "commission": 4.42,
    "internationalDiscount": 4.42,
    "localDiscount": 0,
    "mostPopularAmount": null,
    "minAmount": 5,
    "maxAmount": 5,
    "localMinAmount": null,
    "localMaxAmount": null,
    "country": {
      "isoName": "CO",
      "name": "Colombia"
    },
    "fx": {
      "rate": 2192.1867,
      "currencyCode": "COP"
    },
    "logoUrls": [
      "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-1.png",
      "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-2.png",
      "https://s3.amazonaws.com/rld-operator/3f4a8bcd3268-size-3.png"
    ],
    "fixedAmounts": [],
    "fixedAmountsDescriptions": [],
    "localFixedAmounts": [],
    "localFixedAmountsDescriptions": [],
    "suggestedAmounts": [
      7,
      10,
      15
    ],
    "suggestedAmountsMap": {
      "7": 19482.51,
      "10": 27832.16,
      "15": 41748.23
    },
    "promotions": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Country not found and/or not currently supported | `ApiException` |

