
# Reloadly Utility Payments Pay Bill Request

## Structure

`ReloadlyUtilityPaymentsPayBillRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriberAccountNumber` | `String` | Required | - | String getSubscriberAccountNumber() | setSubscriberAccountNumber(String subscriberAccountNumber) |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `BillerId` | `int` | Required | - | int getBillerId() | setBillerId(int billerId) |
| `UseLocalAmount` | `boolean` | Required | - | boolean getUseLocalAmount() | setUseLocalAmount(boolean useLocalAmount) |

## Example (as JSON)

```json
{
  "subscriberAccountNumber": "04223568280",
  "amount": 1000,
  "billerId": 5,
  "useLocalAmount": false
}
```

