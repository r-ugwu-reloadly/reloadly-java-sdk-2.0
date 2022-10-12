# Utility Payments-Pay Bill

```java
UtilityPaymentsPayBillController utilityPaymentsPayBillController = client.getUtilityPaymentsPayBillController();
```

## Class Name

`UtilityPaymentsPayBillController`


# Reloadly-Utility-Payments-Pay-Bill

```java
CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsPayBillAsync(
    final String accept,
    final String authorization,
    final ReloadlyUtilityPaymentsPayBillRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `body` | [`ReloadlyUtilityPaymentsPayBillRequest`](../../doc/models/reloadly-utility-payments-pay-bill-request.md) | Body, Required | Request Payload |

## Server

`Server.UTILITY_PAYMENTS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.utilities-v1+json";
String authorization = "Bearer <YOUR_TOKEN_HERE>";
ReloadlyUtilityPaymentsPayBillRequest body = new ReloadlyUtilityPaymentsPayBillRequest();
body.setSubscriberAccountNumber("04223568280");
body.setAmount(1000);
body.setBillerId(5);
body.setUseLocalAmount(false);

utilityPaymentsPayBillController.reloadlyUtilityPaymentsPayBillAsync(accept, authorization, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "id": 36,
  "status": "PROCESSING",
  "referenceId": "4a391847-n193-22k8-wqkl-9h3s7428m036",
  "code": "PAYMENT_PROCESSING_IN_PROGRESS",
  "message": "The payment is being processed, status will be updated when biller processes the payment.",
  "submittedAt": "2022-05-18 09:13:53",
  "finalStatusAvailabilityAt": "2022-05-19 09:13:52"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Full authentication is required to access this resource | `ApiException` |
| 404 | Not Found | `ApiException` |

