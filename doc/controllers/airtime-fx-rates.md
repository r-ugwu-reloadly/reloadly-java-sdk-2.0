# Airtime-FX Rates

```java
AirtimeFXRatesController airtimeFXRatesController = client.getAirtimeFXRatesController();
```

## Class Name

`AirtimeFXRatesController`


# Reloadly-Airtime-Fx-Rates

```java
CompletableFuture<DynamicResponse> reloadlyAirtimeFxRatesAsync(
    final String accept,
    final String authorization,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `body` | `Object` | Body, Required | Payload description |

## Server

`Server.AIRTIME`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.topups-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
Object body = com.reloadly.auth.ApiHelper.deserialize("{\"operatorId\":\"1\",\"amount\":\"1\"}");

airtimeFXRatesController.reloadlyAirtimeFxRatesAsync(accept, authorization, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": 174,
  "name": "Natcom Haiti",
  "fxRate": 465,
  "currencyCode": "HTG"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |
| 500 | Fx rate is currently not available for this operator, please try again later or contact support. | `ApiException` |

