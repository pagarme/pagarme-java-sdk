
# Update Charge Due Date Request

Request for updating a charge due date

## Structure

`UpdateChargeDueDateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueAt` | `LocalDateTime` | Optional | The charge's new due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.UpdateChargeDueDateRequest;

UpdateChargeDueDateRequest updateChargeDueDateRequest = new UpdateChargeDueDateRequest.Builder()
    .dueAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

