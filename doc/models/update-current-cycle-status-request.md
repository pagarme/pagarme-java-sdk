
# Update Current Cycle Status Request

## Structure

`UpdateCurrentCycleStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |

## Example

```java
import me.pagar.api.models.UpdateCurrentCycleStatusRequest;

UpdateCurrentCycleStatusRequest updateCurrentCycleStatusRequest = new UpdateCurrentCycleStatusRequest.Builder(
    "status0"
)
.build();
```

