
# Get Movement Object Fee Collection Response

Generic response object for getting a MovementObjectFeeCollection.

## Structure

`GetMovementObjectFeeCollectionResponse`

## Inherits From

[`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `PaymentDate` | `String` | Optional | - | String getPaymentDate() | setPaymentDate(String paymentDate) |
| `RecipientId` | `String` | Optional | - | String getRecipientId() | setRecipientId(String recipientId) |

## Example

```java
import me.pagar.api.models.GetMovementObjectFeeCollectionResponse;

GetMovementObjectFeeCollectionResponse getMovementObjectFeeCollectionResponse = new GetMovementObjectFeeCollectionResponse.Builder()
    .description("description0")
    .paymentDate("payment_date8")
    .recipientId("recipient_id0")
    .id("id2")
    .status("status4")
    .amount("amount4")
    .createdAt("created_at0")
    .build();
```

