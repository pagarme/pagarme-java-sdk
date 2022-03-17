
# Get Shipping Response

Response object for getting the shipping data

## Structure

`GetShippingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `RecipientName` | `String` | Required | - | String getRecipientName() | setRecipientName(String recipientName) |
| `RecipientPhone` | `String` | Required | - | String getRecipientPhone() | setRecipientPhone(String recipientPhone) |
| `Address` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Required | - | GetAddressResponse getAddress() | setAddress(GetAddressResponse address) |
| `MaxDeliveryDate` | `LocalDateTime` | Optional | Data máxima de entrega | LocalDateTime getMaxDeliveryDate() | setMaxDeliveryDate(LocalDateTime maxDeliveryDate) |
| `EstimatedDeliveryDate` | `LocalDateTime` | Optional | Prazo estimado de entrega | LocalDateTime getEstimatedDeliveryDate() | setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) |
| `Type` | `String` | Required | Shipping Type | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "recipient_name": "recipient_name8",
  "recipient_phone": "recipient_phone2",
  "address": {
    "id": "id6",
    "street": "street6",
    "number": "number4",
    "complement": "complement2",
    "zip_code": "zip_code0",
    "neighborhood": "neighborhood2",
    "city": "city6",
    "state": "state2",
    "country": "country0",
    "status": "status8",
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "customer": null,
    "metadata": {
      "key0": "metadata3",
      "key1": "metadata2",
      "key2": "metadata1"
    },
    "line_1": "line_10",
    "line_2": "line_24",
    "deleted_at": null
  },
  "max_delivery_date": null,
  "estimated_delivery_date": null,
  "type": "type0"
}
```

