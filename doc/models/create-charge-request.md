
# Create Charge Request

Request for creating a new charge

## Structure

`CreateChargeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Code | String getCode() | setCode(String code) |
| `Amount` | `int` | Required | The amount of the charge, in cents | int getAmount() | setAmount(int amount) |
| `CustomerId` | `String` | Required | The customer's id | String getCustomerId() | setCustomerId(String customerId) |
| `Customer` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Required | Customer data | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Payment` | [`CreatePaymentRequest`](../../doc/models/create-payment-request.md) | Required | Payment data | CreatePaymentRequest getPayment() | setPayment(CreatePaymentRequest payment) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `DueAt` | `LocalDateTime` | Optional | The charge due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `Antifraud` | [`CreateAntifraudRequest`](../../doc/models/create-antifraud-request.md) | Required | - | CreateAntifraudRequest getAntifraud() | setAntifraud(CreateAntifraudRequest antifraud) |
| `OrderId` | `String` | Required | Order Id | String getOrderId() | setOrderId(String orderId) |

## Example (as JSON)

```json
{
  "code": null,
  "amount": null,
  "customer_id": null,
  "customer": {
    "name": "{\n    \"name\": \"Tony Stark\"\n}",
    "email": null,
    "document": null,
    "type": null,
    "address": null,
    "metadata": null,
    "phones": null,
    "code": null
  },
  "payment": null,
  "metadata": null,
  "antifraud": null,
  "order_id": null
}
```

