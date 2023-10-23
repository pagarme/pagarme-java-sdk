
# Create Discount Request

Request for creating a new discount

## Structure

`CreateDiscountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `double` | Required | The discount value | double getValue() | setValue(double value) |
| `DiscountType` | `String` | Required | Discount type. Can be either flat or percentage. | String getDiscountType() | setDiscountType(String discountType) |
| `ItemId` | `String` | Required | The item where the discount will be applied | String getItemId() | setItemId(String itemId) |
| `Cycles` | `Integer` | Optional | Number of cycles that the discount will be applied | Integer getCycles() | setCycles(Integer cycles) |
| `Description` | `String` | Optional | Description | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "value": 146.6,
  "discount_type": "discount_type6",
  "item_id": "item_id2",
  "cycles": 164,
  "description": "description2"
}
```

