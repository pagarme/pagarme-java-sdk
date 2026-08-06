
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

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateShippingRequest;

CreateShippingRequest createShippingRequest = new CreateShippingRequest.Builder(
    44,
    "description0",
    "recipient_name8",
    "recipient_phone2",
    "address_id0",
    null,
    "type0"
)
.maxDeliveryDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.estimatedDeliveryDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.build();
```

