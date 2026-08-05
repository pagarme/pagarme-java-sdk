
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

## Example

```java
import me.pagar.api.models.CreateOrderItemRequest;

CreateOrderItemRequest createOrderItemRequest = new CreateOrderItemRequest.Builder(
    154,
    "description6",
    12,
    "category4"
)
.code("code4")
.build();
```

