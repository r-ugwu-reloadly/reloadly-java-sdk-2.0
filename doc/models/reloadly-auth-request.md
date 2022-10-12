
# Reloadly Auth Request

## Structure

`ReloadlyAuthRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ClientId` | `String` | Required | - | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | - | String getClientSecret() | setClientSecret(String clientSecret) |
| `GrantType` | `String` | Required | - | String getGrantType() | setGrantType(String grantType) |
| `Audience` | `String` | Required | - | String getAudience() | setAudience(String audience) |

## Example (as JSON)

```json
{
  "client_id": "CLIENT_ID_GOES_HERE",
  "client_secret": "CLIENT_SECRET_GOES_HERE",
  "grant_type": "client_credentials",
  "audience": "https://topups.reloadly.com"
}
```

