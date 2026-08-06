
# Create Period Request

## Structure

`CreatePeriodRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EndAt` | `LocalDateTime` | Optional | - | LocalDateTime getEndAt() | setEndAt(LocalDateTime endAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreatePeriodRequest;

CreatePeriodRequest createPeriodRequest = new CreatePeriodRequest.Builder()
    .endAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

