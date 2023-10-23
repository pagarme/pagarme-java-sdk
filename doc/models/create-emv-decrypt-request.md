
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

## Example (as JSON)

```json
{
  "icc_data": "icc_data4",
  "card_sequence_number": "card_sequence_number2",
  "data": {
    "cipher": "cipher4",
    "tags": [
      {
        "tag": "tag4",
        "lenght": "lenght2",
        "value": "value2"
      }
    ],
    "dukpt": {
      "ksn": "ksn0"
    }
  },
  "poi": {
    "system_name": "system_name4",
    "model": "model2",
    "provider": "provider4",
    "serial_number": "serial_number2",
    "version_number": "version_number6"
  }
}
```

