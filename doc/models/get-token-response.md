
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

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetTokenResponse;

GetTokenResponse getTokenResponse = new GetTokenResponse.Builder()
    .id("id4")
    .type("type6")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .expiresAt("expires_at8")
    .card(null)
    .build();
```

