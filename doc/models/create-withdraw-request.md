
# Create Withdraw Request

## Structure

`CreateWithdrawRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.CreateWithdrawRequest;

CreateWithdrawRequest createWithdrawRequest = new CreateWithdrawRequest.Builder(
    46
)
.metadata(new LinkedHashMap<String, String>() {{
        put("key0", "metadata5");
        put("key1", "metadata6");
    }})
.build();
```

