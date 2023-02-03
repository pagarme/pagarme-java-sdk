
# Get Checkout Boleto Payment Response

## Structure

`GetCheckoutBoletoPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueAt` | `LocalDateTime` | Optional | Data de vencimento do boleto | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `Instructions` | `String` | Optional | Instruções do boleto | String getInstructions() | setInstructions(String instructions) |

## Example (as JSON)

```json
{
  "due_at": null,
  "instructions": null
}
```

