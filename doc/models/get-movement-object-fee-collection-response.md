
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

## Example (as JSON)

```json
{
  "id": "id2",
  "status": "status4",
  "amount": "amount4",
  "created_at": "created_at0",
  "description": "description4",
  "payment_date": "payment_date4",
  "recipient_id": "recipient_id6"
}
```

