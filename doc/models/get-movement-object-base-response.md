
# Get Movement Object Base Response

Generic response object for getting a MovementObjectBase.

## Structure

`GetMovementObjectBaseResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `ChargeId` | `String` | Optional | - | String getChargeId() | setChargeId(String chargeId) |
| `GatewayId` | `String` | Optional | - | String getGatewayId() | setGatewayId(String gatewayId) |

## Example (as JSON)

```json
{
  "object": "MovementObject",
  "id": "id0",
  "status": "status8",
  "amount": "amount8",
  "created_at": "created_at2"
}
```

