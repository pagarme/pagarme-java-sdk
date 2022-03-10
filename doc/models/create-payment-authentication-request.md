
# Create Payment Authentication Request

The payment authentication request

## Structure

`CreatePaymentAuthenticationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The Authentication type | String getType() | setType(String type) |
| `ThreedSecure` | [`CreateThreeDSecureRequest`](../../doc/models/create-three-d-secure-request.md) | Required | The 3D-S authentication object | CreateThreeDSecureRequest getThreedSecure() | setThreedSecure(CreateThreeDSecureRequest threedSecure) |

## Example (as JSON)

```json
{
  "type": "type0",
  "threed_secure": {
    "mpi": "mpi0",
    "cavv": null,
    "eci": null,
    "transaction_id": null,
    "success_url": null,
    "ds_transaction_id": null,
    "version": null
  }
}
```

