
# Create Confirm Payment Request

## Structure

`CreateConfirmPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |
| `Code` | `String` | Required | Code reference | String getCode() | setCode(String code) |

## Example

```java
import me.pagar.api.models.CreateConfirmPaymentRequest;

CreateConfirmPaymentRequest createConfirmPaymentRequest = new CreateConfirmPaymentRequest.Builder(
    "description8",
    "Code8"
)
.amount(222)
.build();
```

