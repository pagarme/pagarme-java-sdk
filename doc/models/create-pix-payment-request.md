
# Create Pix Payment Request

Contains information to create a pix payment

## Structure

`CreatePixPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresAt` | `LocalDateTime` | Optional | Datetime when pix payment will expire | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `ExpiresIn` | `Integer` | Optional | Seconds until pix payment expires | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |
| `AdditionalInformation` | [`List<PixAdditionalInformation>`](../../doc/models/pix-additional-information.md) | Optional | Pix additional information | List<PixAdditionalInformation> getAdditionalInformation() | setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreatePixPaymentRequest;
import me.pagar.api.models.PixAdditionalInformation;

CreatePixPaymentRequest createPixPaymentRequest = new CreatePixPaymentRequest.Builder()
    .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .expiresIn(54)
    .additionalInformation(Arrays.asList(
        null,
        new PixAdditionalInformation.Builder()
            .build(),
        new PixAdditionalInformation.Builder()
            .build()
    ))
    .build();
```

