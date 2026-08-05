
# Create Token Request

Token data

## Structure

`CreateTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Token type<br><br>**Default**: `"card"` | String getType() | setType(String type) |
| `Card` | [`CreateCardTokenRequest`](../../doc/models/create-card-token-request.md) | Required | Card data | CreateCardTokenRequest getCard() | setCard(CreateCardTokenRequest card) |

## Example

```java
import me.pagar.api.models.CreateTokenRequest;

CreateTokenRequest createTokenRequest = new CreateTokenRequest.Builder(
    "card",
    null
)
.build();
```

