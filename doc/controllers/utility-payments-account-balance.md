# Utility Payments-Account Balance

```java
UtilityPaymentsAccountBalanceController utilityPaymentsAccountBalanceController = client.getUtilityPaymentsAccountBalanceController();
```

## Class Name

`UtilityPaymentsAccountBalanceController`


# Reloadly-Utility-Payments-Account-Balance

```java
CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsAccountBalanceAsync(
    final String accept,
    final String authorization)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |

## Server

`Server.UTILITY_PAYMENTS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.utilities-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";

utilityPaymentsAccountBalanceController.reloadlyUtilityPaymentsAccountBalanceAsync(accept, authorization).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "balance": 5000,
  "currencyCode": "USD",
  "currencyName": "US Dollar",
  "updatedAt": "2021-12-04 08:45:51"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |

