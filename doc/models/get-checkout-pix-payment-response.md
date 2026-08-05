
# Get Checkout Pix Payment Response

Checkout pix payment response

## Structure

`GetCheckoutPixPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresAt` | `LocalDateTime` | Optional | Expires at | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `AdditionalInformation` | [`List<PixAdditionalInformation>`](../../doc/models/pix-additional-information.md) | Optional | Additional information | List<PixAdditionalInformation> getAdditionalInformation() | setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetCheckoutPixPaymentResponse;

GetCheckoutPixPaymentResponse getCheckoutPixPaymentResponse = new GetCheckoutPixPaymentResponse.Builder()
    .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .additionalInformation(Arrays.asList(
        null
    ))
    .build();
```

