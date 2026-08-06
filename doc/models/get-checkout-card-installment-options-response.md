
# Get Checkout Card Installment Options Response

## Structure

`GetCheckoutCardInstallmentOptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `Long` | Required | Número de parcelas | Long getNumber() | setNumber(Long number) |
| `Total` | `Integer` | Required | Valor total da compra | Integer getTotal() | setTotal(Integer total) |

## Example

```java
import me.pagar.api.models.GetCheckoutCardInstallmentOptionsResponse;

GetCheckoutCardInstallmentOptionsResponse getCheckoutCardInstallmentOptionsResponse = new GetCheckoutCardInstallmentOptionsResponse.Builder(
    40L,
    188
)
.build();
```

