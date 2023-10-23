
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
  "id": "id8",
  "type": "type2",
  "created_at": "2016-03-13T12:52:32.123Z",
  "expires_at": "expires_at2",
  "card": {
    "last_four_digits": "last_four_digits2",
    "holder_name": "holder_name2",
    "holder_document": "holder_document0",
    "exp_month": 228,
    "exp_year": 68
  }
}
```

