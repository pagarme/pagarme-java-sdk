
# Update Current Cycle End Date Request

Request to update the end date of the current subscription cycle

## Structure

`UpdateCurrentCycleEndDateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EndAt` | `LocalDateTime` | Optional | Current cycle end date | LocalDateTime getEndAt() | setEndAt(LocalDateTime endAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.UpdateCurrentCycleEndDateRequest;

UpdateCurrentCycleEndDateRequest updateCurrentCycleEndDateRequest = new UpdateCurrentCycleEndDateRequest.Builder()
    .endAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

