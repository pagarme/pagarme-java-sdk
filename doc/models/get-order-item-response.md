
# Get Order Item Response

Response object for getting an order item

## Structure

`GetOrderItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `Category` | `String` | Optional | Category | String getCategory() | setCategory(String category) |
| `Code` | `String` | Optional | Code | String getCode() | setCode(String code) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "id": "id8",
  "type": "type8",
  "description": "description8",
  "amount": 224,
  "quantity": 82
}
```

