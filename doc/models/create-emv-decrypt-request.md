
# Create Emv Decrypt Request

## Structure

`CreateEmvDecryptRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IccData` | `String` | Required | - | String getIccData() | setIccData(String iccData) |
| `CardSequenceNumber` | `String` | Required | - | String getCardSequenceNumber() | setCardSequenceNumber(String cardSequenceNumber) |
| `Data` | [`CreateEmvDataDecryptRequest`](../../doc/models/create-emv-data-decrypt-request.md) | Required | - | CreateEmvDataDecryptRequest getData() | setData(CreateEmvDataDecryptRequest data) |
| `Poi` | [`CreateCardPaymentContactlessPOIRequest`](../../doc/models/create-card-payment-contactless-poi-request.md) | Optional | - | CreateCardPaymentContactlessPOIRequest getPoi() | setPoi(CreateCardPaymentContactlessPOIRequest poi) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateEmvDataDecryptRequest;
import me.pagar.api.models.CreateEmvDecryptRequest;

CreateEmvDecryptRequest createEmvDecryptRequest = new CreateEmvDecryptRequest.Builder(
    null,
    null,
    new CreateEmvDataDecryptRequest.Builder(
        null,
        Arrays.asList(
            null
        )
    )
    .dukpt(null)
    .build()
)
.poi(null)
.build();
```

