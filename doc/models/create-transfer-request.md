
# Create Transfer Request

Request for creating a transfer

## Structure

`CreateTransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Transfer amount | int getAmount() | setAmount(int amount) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.CreateTransferRequest;

CreateTransferRequest createTransferRequest = new CreateTransferRequest.Builder(
    192,
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
        put("key1", "metadata2");
    }}
)
.build();
```

