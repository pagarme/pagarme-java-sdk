
# Create Checkout Pix Payment Request

Checkout pix payment request

## Structure

`CreateCheckoutPixPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresAt` | `LocalDateTime` | Optional | Expires at | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `ExpiresIn` | `Integer` | Optional | Expires in | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |
| `AdditionalInformation` | [`List<PixAdditionalInformation>`](../../doc/models/pix-additional-information.md) | Optional | Additional information | List<PixAdditionalInformation> getAdditionalInformation() | setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateCheckoutPixPaymentRequest;
import me.pagar.api.models.PixAdditionalInformation;

CreateCheckoutPixPaymentRequest createCheckoutPixPaymentRequest = new CreateCheckoutPixPaymentRequest.Builder()
    .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .expiresIn(68)
    .additionalInformation(Arrays.asList(
        null,
        new PixAdditionalInformation.Builder()
            .build()
    ))
    .build();
```

