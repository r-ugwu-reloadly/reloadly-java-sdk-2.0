
# Reloadly Airtime Async Topup Request

## Structure

`ReloadlyAirtimeAsyncTopupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OperatorId` | `String` | Required | - | String getOperatorId() | setOperatorId(String operatorId) |
| `Amount` | `String` | Required | - | String getAmount() | setAmount(String amount) |
| `UseLocalAmount` | `boolean` | Required | - | boolean getUseLocalAmount() | setUseLocalAmount(boolean useLocalAmount) |
| `CustomIdentifier` | `String` | Required | - | String getCustomIdentifier() | setCustomIdentifier(String customIdentifier) |
| `RecipientPhone` | [`RecipientPhone`](../../doc/models/recipient-phone.md) | Required | - | RecipientPhone getRecipientPhone() | setRecipientPhone(RecipientPhone recipientPhone) |
| `SenderPhone` | [`SenderPhone`](../../doc/models/sender-phone.md) | Required | - | SenderPhone getSenderPhone() | setSenderPhone(SenderPhone senderPhone) |

## Example (as JSON)

```json
{
  "operatorId": "444",
  "amount": "1",
  "useLocalAmount": false,
  "customIdentifier": "This is example identifier",
  "recipientPhone": {
    "countryCode": "ES",
    "number": "657228901"
  },
  "senderPhone": {
    "countryCode": "CA",
    "number": "1231231231"
  }
}
```

