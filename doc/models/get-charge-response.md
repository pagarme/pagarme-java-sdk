
# Get Charge Response

Response object for getting a charge

## Structure

`GetChargeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `GatewayId` | `String` | Optional | - | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `DueAt` | `LocalDateTime` | Optional | - | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `LastTransaction` | [`GetTransactionResponse`](../../doc/models/get-transaction-response.md) | Optional | - | GetTransactionResponse getLastTransaction() | setLastTransaction(GetTransactionResponse lastTransaction) |
| `Invoice` | [`GetInvoiceResponse`](../../doc/models/get-invoice-response.md) | Optional | - | GetInvoiceResponse getInvoice() | setInvoice(GetInvoiceResponse invoice) |
| `Order` | [`GetOrderResponse`](../../doc/models/get-order-response.md) | Optional | - | GetOrderResponse getOrder() | setOrder(GetOrderResponse order) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `PaidAt` | `LocalDateTime` | Optional | - | LocalDateTime getPaidAt() | setPaidAt(LocalDateTime paidAt) |
| `CanceledAt` | `LocalDateTime` | Optional | - | LocalDateTime getCanceledAt() | setCanceledAt(LocalDateTime canceledAt) |
| `CanceledAmount` | `Integer` | Optional | Canceled Amount | Integer getCanceledAmount() | setCanceledAmount(Integer canceledAmount) |
| `PaidAmount` | `Integer` | Optional | Paid amount | Integer getPaidAmount() | setPaidAmount(Integer paidAmount) |
| `InterestAndFinePaid` | `Integer` | Optional | interest and fine paid | Integer getInterestAndFinePaid() | setInterestAndFinePaid(Integer interestAndFinePaid) |
| `RecurrencyCycle` | `String` | Optional | Defines whether the card has been used one or more times. | String getRecurrencyCycle() | setRecurrencyCycle(String recurrencyCycle) |

## Example (as JSON)

```json
{
  "id": null,
  "code": null,
  "gateway_id": null,
  "amount": null,
  "status": null,
  "currency": null,
  "payment_method": null,
  "due_at": null,
  "created_at": null,
  "updated_at": null,
  "last_transaction": null,
  "invoice": null,
  "order": null,
  "customer": null,
  "metadata": null,
  "paid_at": null,
  "canceled_at": null,
  "canceled_amount": null,
  "paid_amount": null,
  "interest_and_fine_paid": null,
  "recurrency_cycle": null
}
```

