
# Create Voucher Payment Request

The settings for creating a voucher payment

## Structure

`CreateVoucherPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | The text that will be shown on the voucher's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `CardId` | `String` | Optional | Card id | String getCardId() | setCardId(String cardId) |
| `CardToken` | `String` | Optional | Card token | String getCardToken() | setCardToken(String cardToken) |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Optional | Card info | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `RecurrencyCycle` | `String` | Optional | Defines whether the card has been used one or more times. | String getRecurrencyCycle() | setRecurrencyCycle(String recurrencyCycle) |

## Example (as JSON)

```json
{
  "recurrency_cycle": "\"first\" or \"subsequent\""
}
```

