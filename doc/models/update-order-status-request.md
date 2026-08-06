
# Update Order Status Request

## Structure

`UpdateOrderStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Required | Order status | String getStatus() | setStatus(String status) |

## Example

```java
import me.pagar.api.models.UpdateOrderStatusRequest;

UpdateOrderStatusRequest updateOrderStatusRequest = new UpdateOrderStatusRequest.Builder(
    "status8"
)
.build();
```

