
# Get Token Response

Token data

## Structure

`GetTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `ExpiresAt` | `String` | Optional | - | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `Card` | [`GetCardTokenResponse`](../../doc/models/get-card-token-response.md) | Optional | - | GetCardTokenResponse getCard() | setCard(GetCardTokenResponse card) |

## Example (as JSON)

```json
{
  "id": null,
  "type": null,
  "created_at": null,
  "expires_at": null,
  "card": null
}
```

