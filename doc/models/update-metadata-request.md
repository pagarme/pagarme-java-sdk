
# Update Metadata Request

Request for updating an metadata

## Structure

`UpdateMetadataRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.UpdateMetadataRequest;

UpdateMetadataRequest updateMetadataRequest = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata5");
        put("key1", "metadata6");
        put("key2", "metadata7");
    }}
)
.build();
```

