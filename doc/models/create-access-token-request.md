
# Create Access Token Request

Request for creating a new Access Token

## Structure

`CreateAccessTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresIn` | `Integer` | Optional | Minutes to expire the token | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |

## Example (as JSON)

```json
{
  "expires_in": 86
}
```

