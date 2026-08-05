
# Update Subscription Minimum Price Request

Atualização do valor mínimo da assinatura

## Structure

`UpdateSubscriptionMinimumPriceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MinimumPrice` | `Integer` | Optional | Valor mínimo da assinatura | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |

## Example

```java
import me.pagar.api.models.UpdateSubscriptionMinimumPriceRequest;

UpdateSubscriptionMinimumPriceRequest updateSubscriptionMinimumPriceRequest = new UpdateSubscriptionMinimumPriceRequest.Builder()
    .minimumPrice(134)
    .build();
```

