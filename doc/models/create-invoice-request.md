
# Create Invoice Request

Request for creating a new Invoice

## Structure

`CreateInvoiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.CreateInvoiceRequest;

CreateInvoiceRequest createInvoiceRequest = new CreateInvoiceRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata9");
        put("key1", "metadata8");
        put("key2", "metadata7");
    }}
)
.build();
```

