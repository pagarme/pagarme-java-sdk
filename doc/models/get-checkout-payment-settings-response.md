
# Get Checkout Payment Settings Response

Checkout Payment Settings Response

## Structure

`GetCheckoutPaymentSettingsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SuccessUrl` | `String` | Required | Success Url | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `PaymentUrl` | `String` | Required | Payment Url | String getPaymentUrl() | setPaymentUrl(String paymentUrl) |
| `AcceptedPaymentMethods` | `List<String>` | Required | Accepted Payment Methods | List<String> getAcceptedPaymentMethods() | setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | Customer | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Amount` | `Integer` | Optional | Payment amount | Integer getAmount() | setAmount(Integer amount) |
| `DefaultPaymentMethod` | `String` | Optional | Default Payment Method | String getDefaultPaymentMethod() | setDefaultPaymentMethod(String defaultPaymentMethod) |
| `GatewayAffiliationId` | `String` | Optional | Gateway Affiliation Id | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |

## Example (as JSON)

```json
{
  "success_url": "success_url2",
  "payment_url": "payment_url6",
  "accepted_payment_methods": [
    "accepted_payment_methods3",
    "accepted_payment_methods4",
    "accepted_payment_methods5"
  ],
  "status": "status8",
  "customer": null,
  "amount": null,
  "default_payment_method": null,
  "gateway_affiliation_id": null
}
```

