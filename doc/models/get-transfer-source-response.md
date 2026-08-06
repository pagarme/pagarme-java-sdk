
# Get Transfer Source Response

## Structure

`GetTransferSourceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceId` | `String` | Optional | - | String getSourceId() | setSourceId(String sourceId) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.GetTransferSourceResponse;

GetTransferSourceResponse getTransferSourceResponse = new GetTransferSourceResponse.Builder()
    .sourceId("source_id8")
    .type("type4")
    .build();
```

