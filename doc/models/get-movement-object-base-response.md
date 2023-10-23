
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
  "id": "id2",
  "status": "status4",
  "amount": "amount4",
  "created_at": "created_at0",
  "source_type": "source_type6",
  "source_id": "source_id0",
  "target_type": "target_type8",
  "target_id": "target_id4",
  "fee": "fee8"
}
```

