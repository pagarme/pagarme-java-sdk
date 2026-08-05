
# Get Checkout Bank Transfer Payment Response

Bank transfer checkout response

## Structure

`GetCheckoutBankTransferPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `List<String>` | Optional | bank list response | List<String> getBank() | setBank(List<String> bank) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetCheckoutBankTransferPaymentResponse;

GetCheckoutBankTransferPaymentResponse getCheckoutBankTransferPaymentResponse = new GetCheckoutBankTransferPaymentResponse.Builder()
    .bank(Arrays.asList(
        "bank3",
        "bank4"
    ))
    .build();
```

