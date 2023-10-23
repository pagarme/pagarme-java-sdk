
# Create Cancel Charge Split Rules Request

Creates a refund with split rules

## Structure

`CreateCancelChargeSplitRulesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The split rule gateway id | String getId() | setId(String id) |
| `Amount` | `int` | Required | The split rule amount | int getAmount() | setAmount(int amount) |
| `Type` | `String` | Required | The amount type (flat ou percentage) | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "id": "id6",
  "Amount": 222,
  "type": "type6"
}
```

