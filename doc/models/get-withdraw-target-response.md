
# Get Withdraw Target Response

## Structure

`GetWithdrawTargetResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TargetId` | `String` | Optional | - | String getTargetId() | setTargetId(String targetId) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.GetWithdrawTargetResponse;

GetWithdrawTargetResponse getWithdrawTargetResponse = new GetWithdrawTargetResponse.Builder()
    .targetId("target_id8")
    .type("type8")
    .build();
```

