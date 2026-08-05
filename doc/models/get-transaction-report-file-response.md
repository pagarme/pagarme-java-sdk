
# Get Transaction Report File Response

## Structure

`GetTransactionReportFileResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Date` | `LocalDateTime` | Optional | - | LocalDateTime getDate() | setDate(LocalDateTime date) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetTransactionReportFileResponse;

GetTransactionReportFileResponse getTransactionReportFileResponse = new GetTransactionReportFileResponse.Builder()
    .name("name0")
    .date(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

