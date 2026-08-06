
# Create Checkout Bank Transfer Request

Checkout bank transfer payment request

## Structure

`CreateCheckoutBankTransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `List<String>` | Required | Bank | List<String> getBank() | setBank(List<String> bank) |
| `Retries` | `int` | Required | Number of retries for processing | int getRetries() | setRetries(int retries) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateCheckoutBankTransferRequest;

CreateCheckoutBankTransferRequest createCheckoutBankTransferRequest = new CreateCheckoutBankTransferRequest.Builder(
    Arrays.asList(
        "bank1",
        "bank2",
        "bank3"
    ),
    56
)
.build();
```

