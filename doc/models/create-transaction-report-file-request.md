
# Create Transaction Report File Request

## Structure

`CreateTransactionReportFileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `StartAt` | `LocalDateTime` | Optional | - | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `EndAt` | `String` | Optional | - | String getEndAt() | setEndAt(String endAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateTransactionReportFileRequest;

CreateTransactionReportFileRequest createTransactionReportFileRequest = new CreateTransactionReportFileRequest.Builder(
    "name2"
)
.startAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.endAt("end_at8")
.build();
```

