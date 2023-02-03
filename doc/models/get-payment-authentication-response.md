
# Get Payment Authentication Response

Payment Authentication response

## Structure

`GetPaymentAuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `ThreedSecure` | [`GetThreeDSecureResponse`](../../doc/models/get-three-d-secure-response.md) | Optional | 3D-S payment authentication response | GetThreeDSecureResponse getThreedSecure() | setThreedSecure(GetThreeDSecureResponse threedSecure) |

## Example (as JSON)

```json
{
  "type": null,
  "threed_secure": null
}
```

