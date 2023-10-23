
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

## Example (as JSON)

```json
{
  "gateway_id": "gateway_id8",
  "amount": 40,
  "status": "status6",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "qr_code": "qr_code0",
  "qr_code_url": "qr_code_url6",
  "expires_at": "2016-03-13T12:52:32.123Z",
  "additional_information": [
    {
      "Name": "Name0",
      "Value": "Value2"
    },
    {
      "Name": "Name0",
      "Value": "Value2"
    }
  ],
  "end_to_end_id": "end_to_end_id6"
}
```

