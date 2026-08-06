
# Create Access Token Request

Request for creating a new Access Token

## Structure

`CreateAccessTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresIn` | `Integer` | Optional | Minutes to expire the token | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |

## Example

```java
import me.pagar.api.models.CreateAccessTokenRequest;

CreateAccessTokenRequest createAccessTokenRequest = new CreateAccessTokenRequest.Builder()
    .expiresIn(204)
    .build();
```

