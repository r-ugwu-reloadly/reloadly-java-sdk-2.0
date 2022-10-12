# Utility Payments-Utility Billers

```java
UtilityPaymentsUtilityBillersController utilityPaymentsUtilityBillersController = client.getUtilityPaymentsUtilityBillersController();
```

## Class Name

`UtilityPaymentsUtilityBillersController`


# Reloadly-Utility-Payments-Billers

```java
CompletableFuture<DynamicResponse> reloadlyUtilityPaymentsBillersAsync(
    final String accept,
    final String authorization,
    final Integer id,
    final String name,
    final String type,
    final String serviceType,
    final String countryISOCode,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accept` | `String` | Header, Required | - |
| `authorization` | `String` | Header, Required | - |
| `id` | `Integer` | Query, Optional | This is the unique identification number of each biller. It uniquely identifies the biller servicing the utility. |
| `name` | `String` | Query, Optional | This indicates the biller's name. In situations where the biller's name is exceptionally long, partial names are used. |
| `type` | `String` | Query, Optional | This indicates the type of utility payment handled by the biller. Values included are ELECTRICITY_BILL_PAYMENT, WATER_BILL_PAYMENT, TV_BILL_PAYMENT and INTERNET_BILL_PAYMENT. |
| `serviceType` | `String` | Query, Optional | This indicates the payment service type being rendered by the utility biller service. Examples are PREPAID and POSTPAID. |
| `countryISOCode` | `String` | Query, Optional | This indicates the ISO code of the country where the utility biller is operating in. |
| `page` | `Integer` | Query, Optional | This indicates the page of the billers list being retrieved. Default value is 1. |
| `size` | `Integer` | Query, Optional | This indicates the number of billers to be retrieved on a page. Default value is 200. |

## Server

`Server.UTILITY_PAYMENTS`

## Response Type

`DynamicResponse`

## Example Usage

```java
String accept = "application/com.reloadly.utilities-v1+json";
String authorization = "Bearer <YOUR TOKEN HERE>";
Integer id = 12;
String name = "Eko Electricity";
String type = "ELECTRICITY_BILL_PAYMENT";
String serviceType = "PREPAID";
String countryISOCode = "KE";
Integer page = 1;
Integer size = 10;

utilityPaymentsUtilityBillersController.reloadlyUtilityPaymentsBillersAsync(accept, authorization, id, name, type, serviceType, countryISOCode, page, size).thenAccept(result -> {
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
      "id": 1,
      "name": "Ikeja Electricity Postpaid",
      "countryIsoCode": "NG",
      "type": "ELECTRICITY_BILL_PAYMENT",
      "serviceType": "POSTPAID",
      "localAmountSupported": true,
      "localTransactionCurrencyCode": "NGN",
      "minLocalTransactionAmount": 1000,
      "maxLocalTransactionAmount": 300000,
      "localTransactionFee": 227.83997,
      "localTransactionFeeCurrencyCode": "NGN",
      "localDiscountPercentage": 0,
      "internatonalAmountSupported": true,
      "internationalTransactionCurrencyCode": "INR",
      "minInternationalTransactionAmount": 194.73483,
      "maxInternationalTransactionAmount": 45567.996,
      "internationalTransactionFee": 227.83997,
      "internationalTransactionFeeCurrencyCode": "INR",
      "internationalDiscountPercentage": 0,
      "fx": [
        {
          "rate": 5.20265
        },
        {
          "curencyCode": "INR"
        }
      ]
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

