
# Create Order Item Request

Request for creating an order item

## Structure

`CreateOrderItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Quantity` | `int` | Required | Quantity | int getQuantity() | setQuantity(int quantity) |
| `Category` | `String` | Required | Category | String getCategory() | setCategory(String category) |
| `Code` | `String` | Optional | The item code passed by the client | String getCode() | setCode(String code) |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "quantity": 68,
  "category": "category2",
  "code": null
}
```

