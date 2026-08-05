
# Create Payment Authentication Request

The payment authentication request

## Structure

`CreatePaymentAuthenticationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The Authentication type | String getType() | setType(String type) |
| `ThreedSecure` | [`CreateThreeDSecureRequest`](../../doc/models/create-three-d-secure-request.md) | Required | The 3D-S authentication object | CreateThreeDSecureRequest getThreedSecure() | setThreedSecure(CreateThreeDSecureRequest threedSecure) |

## Example

```java
import me.pagar.api.models.CreatePaymentAuthenticationRequest;

CreatePaymentAuthenticationRequest createPaymentAuthenticationRequest = new CreatePaymentAuthenticationRequest.Builder(
    "type6",
    null
)
.build();
```

