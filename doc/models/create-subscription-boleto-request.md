
# Create Subscription Boleto Request

Information about fines and interest on the "boleto" used from payment

## Structure

`CreateSubscriptionBoletoRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Interest` | [`CreateInterestRequest`](../../doc/models/create-interest-request.md) | Optional | - | CreateInterestRequest getInterest() | setInterest(CreateInterestRequest interest) |
| `Fine` | [`CreateFineRequest`](../../doc/models/create-fine-request.md) | Optional | - | CreateFineRequest getFine() | setFine(CreateFineRequest fine) |
| `MaxDaysToPayPastDue` | `Integer` | Optional | - | Integer getMaxDaysToPayPastDue() | setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) |

## Example (as JSON)

```json
{
  "interest": null,
  "fine": null,
  "max_days_to_pay_past_due": null
}
```

