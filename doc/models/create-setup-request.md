
# Create Setup Request

Request for creating a Setup for a subscription. The setup is an order that will be created at the subscription creation.

## Structure

`CreateSetupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Setup amount | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Payment` | [`CreatePaymentRequest`](../../doc/models/create-payment-request.md) | Required | Payment data | CreatePaymentRequest getPayment() | setPayment(CreatePaymentRequest payment) |

## Example

```java
import me.pagar.api.models.CreateSetupRequest;

CreateSetupRequest createSetupRequest = new CreateSetupRequest.Builder(
    222,
    "description6",
    null
)
.build();
```

