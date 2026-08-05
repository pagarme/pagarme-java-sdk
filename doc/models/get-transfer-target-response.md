
# Get Transfer Target Response

## Structure

`GetTransferTargetResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TargetId` | `String` | Optional | - | String getTargetId() | setTargetId(String targetId) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.GetTransferTargetResponse;

GetTransferTargetResponse getTransferTargetResponse = new GetTransferTargetResponse.Builder()
    .targetId("target_id4")
    .type("type6")
    .build();
```

