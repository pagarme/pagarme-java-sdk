
# Get Subscription Boleto Response

Response object for getting a boleto

## Structure

`GetSubscriptionBoletoResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Interest` | [`GetInterestResponse`](../../doc/models/get-interest-response.md) | Optional | Interest | GetInterestResponse getInterest() | setInterest(GetInterestResponse interest) |
| `Fine` | [`GetFineResponse`](../../doc/models/get-fine-response.md) | Optional | Fine | GetFineResponse getFine() | setFine(GetFineResponse fine) |
| `MaxDaysToPayPastDue` | `Integer` | Optional | - | Integer getMaxDaysToPayPastDue() | setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) |

## Example (as JSON)

```json
{
  "interest": {
    "days": 2,
    "type": "percentage",
    "amount": 20
  },
  "fine": {
    "days": 2,
    "type": "flat",
    "amount": 10
  },
  "max_days_to_pay_past_due": 2
}
```

