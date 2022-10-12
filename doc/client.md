
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
ReloadlySdkClient client = new ReloadlySdkClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.PRODUCTION)
    .build();
```

## reloadly-sdkClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAuthenticationController()` | Provides access to Authentication controller. | `AuthenticationController` |
| `getAirtimeAccountBalanceController()` | Provides access to AirtimeAccountBalance controller. | `AirtimeAccountBalanceController` |
| `getAirtimeCountriesController()` | Provides access to AirtimeCountries controller. | `AirtimeCountriesController` |
| `getAirtimeOperatorsController()` | Provides access to AirtimeOperators controller. | `AirtimeOperatorsController` |
| `getAirtimeFXRatesController()` | Provides access to AirtimeFXRates controller. | `AirtimeFXRatesController` |
| `getAirtimeCommissionsController()` | Provides access to AirtimeCommissions controller. | `AirtimeCommissionsController` |
| `getAirtimePromotionsController()` | Provides access to AirtimePromotions controller. | `AirtimePromotionsController` |
| `getAirtimeTopupsController()` | Provides access to AirtimeTopups controller. | `AirtimeTopupsController` |
| `getAirtimeTransactionsController()` | Provides access to AirtimeTransactions controller. | `AirtimeTransactionsController` |
| `getGiftCardsAccountBalanceController()` | Provides access to GiftCardsAccountBalance controller. | `GiftCardsAccountBalanceController` |
| `getGiftCardsCountriesController()` | Provides access to GiftCardsCountries controller. | `GiftCardsCountriesController` |
| `getGiftCardsProductsController()` | Provides access to GiftCardsProducts controller. | `GiftCardsProductsController` |
| `getGiftCardsRedeemInstructionsController()` | Provides access to GiftCardsRedeemInstructions controller. | `GiftCardsRedeemInstructionsController` |
| `getGiftCardsDiscountsController()` | Provides access to GiftCardsDiscounts controller. | `GiftCardsDiscountsController` |
| `getGiftCardsTransactionsController()` | Provides access to GiftCardsTransactions controller. | `GiftCardsTransactionsController` |
| `getGiftCardsOrdersController()` | Provides access to GiftCardsOrders controller. | `GiftCardsOrdersController` |
| `getAirtimeNumberLookupController()` | Provides access to AirtimeNumberLookup controller. | `AirtimeNumberLookupController` |
| `getUtilityPaymentsAccountBalanceController()` | Provides access to UtilityPaymentsAccountBalance controller. | `UtilityPaymentsAccountBalanceController` |
| `getUtilityPaymentsUtilityBillersController()` | Provides access to UtilityPaymentsUtilityBillers controller. | `UtilityPaymentsUtilityBillersController` |
| `getUtilityPaymentsPayBillController()` | Provides access to UtilityPaymentsPayBill controller. | `UtilityPaymentsPayBillController` |
| `getUtilityPaymentsTransactionsController()` | Provides access to UtilityPaymentsTransactions controller. | `UtilityPaymentsTransactionsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

