
# Create Checkout Card Installment Option Request

Options for card installment

## Structure

`CreateCheckoutCardInstallmentOptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | Installment quantity | int getNumber() | setNumber(int number) |
| `Total` | `int` | Required | Total amount | int getTotal() | setTotal(int total) |

## Example

```java
import me.pagar.api.models.CreateCheckoutCardInstallmentOptionRequest;

CreateCheckoutCardInstallmentOptionRequest createCheckoutCardInstallmentOptionRequest = new CreateCheckoutCardInstallmentOptionRequest.Builder(
    68,
    176
)
.build();
```

