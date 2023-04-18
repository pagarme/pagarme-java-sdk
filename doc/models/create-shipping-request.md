
# Create Shipping Request

Shipping data

## Structure

`CreateShippingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Shipping amount | int getAmount() | setAmount(int amount) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `RecipientName` | `String` | Required | Recipient name | String getRecipientName() | setRecipientName(String recipientName) |
| `RecipientPhone` | `String` | Required | Recipient phone number | String getRecipientPhone() | setRecipientPhone(String recipientPhone) |
| `AddressId` | `String` | Required | The id of the address that will be used for shipping | String getAddressId() | setAddressId(String addressId) |
| `Address` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Address data | CreateAddressRequest getAddress() | setAddress(CreateAddressRequest address) |
| `MaxDeliveryDate` | `LocalDateTime` | Optional | Data máxima de entrega | LocalDateTime getMaxDeliveryDate() | setMaxDeliveryDate(LocalDateTime maxDeliveryDate) |
| `EstimatedDeliveryDate` | `LocalDateTime` | Optional | Prazo estimado de entrega | LocalDateTime getEstimatedDeliveryDate() | setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) |
| `Type` | `String` | Required | Shipping type | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "recipient_name": "recipient_name8",
  "recipient_phone": "recipient_phone2",
  "address_id": "address_id0",
  "address": {
    "street": "street6",
    "number": "number4",
    "zip_code": "zip_code0",
    "neighborhood": "neighborhood2",
    "city": "city6",
    "state": "state2",
    "country": "country0",
    "complement": "complement2",
    "metadata": {
      "key0": "metadata3",
      "key1": "metadata2",
      "key2": "metadata1"
    },
    "line_1": "line_10",
    "line_2": "line_24"
  },
  "max_delivery_date": "2016-03-13T12:52:32.123Z",
  "estimated_delivery_date": "2016-03-13T12:52:32.123Z",
  "type": "type0"
}
```

