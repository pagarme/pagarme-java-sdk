
# Create Transfer

## Structure

`CreateTransfer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `SourceId` | `String` | Required | - | String getSourceId() | setSourceId(String sourceId) |
| `TargetId` | `String` | Required | - | String getTargetId() | setTargetId(String targetId) |
| `Metadata` | `List<String>` | Optional | - | List<String> getMetadata() | setMetadata(List<String> metadata) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateTransfer;

CreateTransfer createTransfer = new CreateTransfer.Builder(
    130,
    "source_id6",
    "target_id8"
)
.metadata(Arrays.asList(
        "metadata1"
    ))
.build();
```

