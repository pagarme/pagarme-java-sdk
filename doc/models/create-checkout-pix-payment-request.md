
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

## Example (as JSON)

```json
{
  "expires_at": null,
  "expires_in": null,
  "additional_information": null
}
```

