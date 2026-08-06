
# Create Google Pay Header Request

The GooglePay header request

## Structure

`CreateGooglePayHeaderRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EphemeralPublicKey` | `String` | Required | X.509 encoded key bytes, Base64 encoded as a string | String getEphemeralPublicKey() | setEphemeralPublicKey(String ephemeralPublicKey) |

## Example

```java
import me.pagar.api.models.CreateGooglePayHeaderRequest;

CreateGooglePayHeaderRequest createGooglePayHeaderRequest = new CreateGooglePayHeaderRequest.Builder(
    "ephemeral_public_key2"
)
.build();
```

