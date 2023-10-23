
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

## Example (as JSON)

```json
{
  "expires_at": "2016-03-13T12:52:32.123Z",
  "expires_in": 216,
  "additional_information": [
    {
      "Name": "Name0",
      "Value": "Value2"
    },
    {
      "Name": "Name0",
      "Value": "Value2"
    }
  ]
}
```

