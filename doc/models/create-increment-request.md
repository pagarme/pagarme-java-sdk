
# Create Increment Request

Request for creating a new increment

## Structure

`CreateIncrementRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `double` | Required | The increment value | double getValue() | setValue(double value) |
| `IncrementType` | `String` | Required | Increment type. Can be either flat or percentage. | String getIncrementType() | setIncrementType(String incrementType) |
| `ItemId` | `String` | Required | The item where the increment will be applied | String getItemId() | setItemId(String itemId) |
| `Cycles` | `Integer` | Optional | Number of cycles that the increment will be applied | Integer getCycles() | setCycles(Integer cycles) |
| `Description` | `String` | Optional | Description | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "value": 251.52,
  "increment_type": "increment_type8",
  "item_id": "item_id0",
  "cycles": 168,
  "description": "description0"
}
```

