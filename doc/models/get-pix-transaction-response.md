
# Get Pix Transaction Response

Response object when getting a pix transaction

## Structure

`GetPixTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `QrCode` | `String` | Optional | - | String getQrCode() | setQrCode(String qrCode) |
| `QrCodeUrl` | `String` | Optional | - | String getQrCodeUrl() | setQrCodeUrl(String qrCodeUrl) |
| `ExpiresAt` | `LocalDateTime` | Optional | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `AdditionalInformation` | [`List<PixAdditionalInformation>`](../../doc/models/pix-additional-information.md) | Optional | - | List<PixAdditionalInformation> getAdditionalInformation() | setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) |
| `EndToEndId` | `String` | Optional | - | String getEndToEndId() | setEndToEndId(String endToEndId) |
| `Payer` | [`GetPixPayerResponse`](../../doc/models/get-pix-payer-response.md) | Optional | - | GetPixPayerResponse getPayer() | setPayer(GetPixPayerResponse payer) |
| `PixProviderTid` | `String` | Optional | Pix provider TID | String getPixProviderTid() | setPixProviderTid(String pixProviderTid) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetPixTransactionResponse;
import me.pagar.api.models.PixAdditionalInformation;

GetPixTransactionResponse getPixTransactionResponse = new GetPixTransactionResponse.Builder()
    .qrCode("qr_code6")
    .qrCodeUrl("qr_code_url2")
    .expiresAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .additionalInformation(Arrays.asList(
        null,
        new PixAdditionalInformation.Builder()
            .build()
    ))
    .endToEndId("end_to_end_id0")
    .gatewayId("gateway_id8")
    .amount(40)
    .status("status6")
    .success(false)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

