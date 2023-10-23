
# Create Transaction Report File Request

## Structure

`CreateTransactionReportFileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `StartAt` | `LocalDateTime` | Optional | - | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `EndAt` | `String` | Optional | - | String getEndAt() | setEndAt(String endAt) |

## Example (as JSON)

```json
{
  "name": "name6",
  "start_at": "2016-03-13T12:52:32.123Z",
  "end_at": "end_at6"
}
```

