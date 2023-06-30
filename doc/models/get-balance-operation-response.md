
# Get Balance Operation Response

Generic response object for getting a BalanceOperation.

## Structure

`GetBalanceOperationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `BalanceAmount` | `String` | Optional | - | String getBalanceAmount() | setBalanceAmount(String balanceAmount) |
| `BalanceOldAmount` | `String` | Optional | - | String getBalanceOldAmount() | setBalanceOldAmount(String balanceOldAmount) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |
| `Fee` | `String` | Optional | - | String getFee() | setFee(String fee) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `MovementObject` | [`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md) | Optional | - | GetMovementObjectBaseResponse getMovementObject() | setMovementObject(GetMovementObjectBaseResponse movementObject) |

## Example (as JSON)

```json
{
  "id": "id0",
  "status": "status8",
  "balance_amount": "balance_amount0",
  "balance_old_amount": "balance_old_amount2",
  "type": "type0"
}
```

