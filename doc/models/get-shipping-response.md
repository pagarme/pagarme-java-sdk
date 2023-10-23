
# Get Shipping Response

Response object for getting the shipping data

## Structure

`GetShippingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `RecipientName` | `String` | Optional | - | String getRecipientName() | setRecipientName(String recipientName) |
| `RecipientPhone` | `String` | Optional | - | String getRecipientPhone() | setRecipientPhone(String recipientPhone) |
| `Address` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Optional | - | GetAddressResponse getAddress() | setAddress(GetAddressResponse address) |
| `MaxDeliveryDate` | `LocalDateTime` | Optional | Data máxima de entrega | LocalDateTime getMaxDeliveryDate() | setMaxDeliveryDate(LocalDateTime maxDeliveryDate) |
| `EstimatedDeliveryDate` | `LocalDateTime` | Optional | Prazo estimado de entrega | LocalDateTime getEstimatedDeliveryDate() | setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) |
| `Type` | `String` | Optional | Shipping Type | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "amount": 214,
  "description": "description8",
  "recipient_name": "recipient_name6",
  "recipient_phone": "recipient_phone0",
  "address": {
    "id": "id6",
    "street": "street6",
    "number": "number4",
    "complement": "complement2",
    "zip_code": "zip_code0"
  }
}
```

