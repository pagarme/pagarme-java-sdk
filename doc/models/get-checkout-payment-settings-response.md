
# Get Checkout Payment Settings Response

Checkout Payment Settings Response

## Structure

`GetCheckoutPaymentSettingsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SuccessUrl` | `String` | Optional | Success Url | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `PaymentUrl` | `String` | Optional | Payment Url | String getPaymentUrl() | setPaymentUrl(String paymentUrl) |
| `AcceptedPaymentMethods` | `List<String>` | Optional | Accepted Payment Methods | List<String> getAcceptedPaymentMethods() | setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) |
| `Status` | `String` | Optional | Status | String getStatus() | setStatus(String status) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | Customer | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Amount` | `Integer` | Optional | Payment amount | Integer getAmount() | setAmount(Integer amount) |
| `DefaultPaymentMethod` | `String` | Optional | Default Payment Method | String getDefaultPaymentMethod() | setDefaultPaymentMethod(String defaultPaymentMethod) |
| `GatewayAffiliationId` | `String` | Optional | Gateway Affiliation Id | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |

## Example (as JSON)

```json
{
  "success_url": null,
  "payment_url": null,
  "accepted_payment_methods": null,
  "status": null,
  "customer": null,
  "amount": null,
  "default_payment_method": null,
  "gateway_affiliation_id": null
}
```

