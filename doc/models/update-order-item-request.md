
# Update Order Item Request

Update Order item Request

## Structure

`UpdateOrderItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Quantity` | `int` | Required | - | int getQuantity() | setQuantity(int quantity) |
| `Category` | `String` | Required | - | String getCategory() | setCategory(String category) |

## Example (as JSON)

```json
{
  "amount": 130,
  "description": "description4",
  "quantity": 244,
  "category": "category2"
}
```

