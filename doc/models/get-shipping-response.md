
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
  "amount": null,
  "description": null,
  "recipient_name": null,
  "recipient_phone": null,
  "address": null,
  "max_delivery_date": null,
  "estimated_delivery_date": null,
  "type": null
}
```

