
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

## Example

```java
import me.pagar.api.models.GetFineResponse;
import me.pagar.api.models.GetInterestResponse;
import me.pagar.api.models.GetSubscriptionBoletoResponse;

GetSubscriptionBoletoResponse getSubscriptionBoletoResponse = new GetSubscriptionBoletoResponse.Builder()
    .interest(new GetInterestResponse.Builder()
        .days(2)
        .type("percentage")
        .amount(20)
        .build())
    .fine(new GetFineResponse.Builder()
        .days(2)
        .type("flat")
        .amount(10)
        .build())
    .maxDaysToPayPastDue(2)
    .build();
```

