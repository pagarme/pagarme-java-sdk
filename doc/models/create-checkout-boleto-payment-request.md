
# Create Checkout Boleto Payment Request

## Structure

`CreateCheckoutBoletoPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `String` | Required | Bank identifier | String getBank() | setBank(String bank) |
| `Instructions` | `String` | Required | Instructions | String getInstructions() | setInstructions(String instructions) |
| `DueAt` | `LocalDateTime` | Required | Due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |

## Example (as JSON)

```json
{
  "bank": "bank4",
  "instructions": "instructions4",
  "due_at": "2016-03-13T12:52:32.123Z"
}
```

