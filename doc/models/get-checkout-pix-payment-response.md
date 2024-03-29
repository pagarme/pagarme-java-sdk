
# Get Checkout Pix Payment Response

Checkout pix payment response

## Structure

`GetCheckoutPixPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpiresAt` | `LocalDateTime` | Optional | Expires at | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `AdditionalInformation` | [`List<PixAdditionalInformation>`](../../doc/models/pix-additional-information.md) | Optional | Additional information | List<PixAdditionalInformation> getAdditionalInformation() | setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) |

## Example (as JSON)

```json
{
  "expires_at": "2016-03-13T12:52:32.123Z",
  "additional_information": [
    {
      "Name": "Name0",
      "Value": "Value2"
    },
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

