# Airtime-Commissions

```java
AirtimeCommissionsController airtimeCommissionsController = client.getAirtimeCommissionsController();
```

## Class Name

`AirtimeCommissionsController`

## Methods

* [Reloadly-Airtime-Commissions](../../doc/controllers/airtime-commissions.md#reloadly-airtime-commissions)
* [Reloadly-Airtime-Commission-by-Id](../../doc/controllers/airtime-commissions.md#reloadly-airtime-commission-by-id)


# Reloadly-Airtime-Commissions

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeCommissionsAsync(
    final String accept,
    final String authorization,
    final Integer size,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `size` | `Integer` | Query, Optional | This indicates the number of operators offering discounts to be retrieved on a page. Default value is 200. |
| `page` | `Integer` | Query, Optional | This indicates the page of the discounts list being retrieved. Default value is 1. |

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

airtimeCommissionsController.reloadlyAirtimeCommissionsAsync(accept, authorization, size, page).thenAccept(result -> {
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
      "operator": {
        "operatorId": 1,
        "name": "Afghan Wireless Afghanistan",
        "countryCode": "AF",
        "status": true,
        "bundle": false
      },
      "percentage": 10,
      "internationalPercentage": 10,
      "localPercentage": 0,
      "updatedAt": "2021-06-26 03:36:16"
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


# Reloadly-Airtime-Commission-by-Id

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeCommissionByIdAsync(
    final String accept,
    final String authorization,
    final String operatorid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `operatorid` | `String` | Template, Required | - |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
String operatorid = "341";

airtimeCommissionsController.reloadlyAirtimeCommissionByIdAsync(accept, authorization, operatorid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "operator": {
    "operatorId": 1,
    "name": "Afghan Wireless Afghanistan",
    "countryCode": "AF",
    "status": true,
    "bundle": false
  },
  "percentage": 10,
  "internationalPercentage": 10,
  "localPercentage": 0,
  "updatedAt": "2021-06-26 03:36:16"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Operator not found for given ID | `ApiException` |

