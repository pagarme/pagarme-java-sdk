
# Get Invoice Response

Response object for getting an invoice

## Structure

`GetInvoiceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Items` | [`List<GetInvoiceItemResponse>`](../../doc/models/get-invoice-item-response.md) | Optional | - | List<GetInvoiceItemResponse> getItems() | setItems(List<GetInvoiceItemResponse> items) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Charge` | [`GetChargeResponse`](../../doc/models/get-charge-response.md) | Optional | - | GetChargeResponse getCharge() | setCharge(GetChargeResponse charge) |
| `Installments` | `Integer` | Optional | - | Integer getInstallments() | setInstallments(Integer installments) |
| `BillingAddress` | [`GetBillingAddressResponse`](../../doc/models/get-billing-address-response.md) | Optional | - | GetBillingAddressResponse getBillingAddress() | setBillingAddress(GetBillingAddressResponse billingAddress) |
| `Subscription` | [`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md) | Optional | - | GetSubscriptionResponse getSubscription() | setSubscription(GetSubscriptionResponse subscription) |
| `Cycle` | [`GetPeriodResponse`](../../doc/models/get-period-response.md) | Optional | - | GetPeriodResponse getCycle() | setCycle(GetPeriodResponse cycle) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Optional | - | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `DueAt` | `LocalDateTime` | Optional | - | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `CanceledAt` | `LocalDateTime` | Optional | - | LocalDateTime getCanceledAt() | setCanceledAt(LocalDateTime canceledAt) |
| `BillingAt` | `LocalDateTime` | Optional | - | LocalDateTime getBillingAt() | setBillingAt(LocalDateTime billingAt) |
| `SeenAt` | `LocalDateTime` | Optional | - | LocalDateTime getSeenAt() | setSeenAt(LocalDateTime seenAt) |
| `TotalDiscount` | `Integer` | Optional | Total discounted value | Integer getTotalDiscount() | setTotalDiscount(Integer totalDiscount) |
| `TotalIncrement` | `Integer` | Optional | Total discounted value | Integer getTotalIncrement() | setTotalIncrement(Integer totalIncrement) |
| `SubscriptionId` | `String` | Optional | Subscription Id | String getSubscriptionId() | setSubscriptionId(String subscriptionId) |

## Example (as JSON)

```json
{
  "id": "id0",
  "code": "code8",
  "url": "url4",
  "amount": 46,
  "status": "status8"
}
```

