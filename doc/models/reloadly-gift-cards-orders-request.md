
# Reloadly Gift Cards Orders Request

## Structure

`ReloadlyGiftCardsOrdersRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `int` | Required | - | int getProductId() | setProductId(int productId) |
| `CountryCode` | `String` | Required | - | String getCountryCode() | setCountryCode(String countryCode) |
| `Quantity` | `int` | Required | - | int getQuantity() | setQuantity(int quantity) |
| `UnitPrice` | `int` | Required | - | int getUnitPrice() | setUnitPrice(int unitPrice) |
| `CustomIdentifier` | `String` | Required | - | String getCustomIdentifier() | setCustomIdentifier(String customIdentifier) |
| `SenderName` | `String` | Required | - | String getSenderName() | setSenderName(String senderName) |
| `RecipientEmail` | `String` | Required | - | String getRecipientEmail() | setRecipientEmail(String recipientEmail) |
| `RecipientPhoneDetails` | [`RecipientPhoneDetails`](../../doc/models/recipient-phone-details.md) | Required | - | RecipientPhoneDetails getRecipientPhoneDetails() | setRecipientPhoneDetails(RecipientPhoneDetails recipientPhoneDetails) |

## Example (as JSON)

```json
{
  "productId": 120,
  "countryCode": "US",
  "quantity": 1,
  "unitPrice": 1,
  "customIdentifier": "obucks10",
  "senderName": "John Doe",
  "recipientEmail": "anyone@email.com",
  "recipientPhoneDetails": {
    "countryCode": "ES",
    "phoneNumber": "657228901"
  }
}
```

