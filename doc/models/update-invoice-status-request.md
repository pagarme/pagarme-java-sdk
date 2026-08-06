
# Update Invoice Status Request

Invoice Update Status Request

## Structure

`UpdateInvoiceStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |

## Example

```java
import me.pagar.api.models.UpdateInvoiceStatusRequest;

UpdateInvoiceStatusRequest updateInvoiceStatusRequest = new UpdateInvoiceStatusRequest.Builder(
    "status2"
)
.build();
```

