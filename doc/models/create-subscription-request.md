
# Create Subscription Request

Request for creating a subcription

## Structure

`CreateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CreateCustomerRequest`](/doc/models/create-customer-request.md) | Required | Customer | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Card` | [`CreateCardRequest`](/doc/models/create-card-request.md) | Required | Card | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `Code` | `String` | Required | Subscription code | String getCode() | setCode(String code) |
| `PaymentMethod` | `String` | Required | Payment method | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `BillingType` | `String` | Required | Billing type | String getBillingType() | setBillingType(String billingType) |
| `StatementDescriptor` | `String` | Required | Statement descriptor for credit card subscriptions | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Description` | `String` | Required | Subscription description | String getDescription() | setDescription(String description) |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `Interval` | `String` | Required | Interval | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `int` | Required | Interval count | int getIntervalCount() | setIntervalCount(int intervalCount) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](/doc/models/create-pricing-scheme-request.md) | Required | Subscription pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Items` | [`List<CreateSubscriptionItemRequest>`](/doc/models/create-subscription-item-request.md) | Required | Subscription items | List<CreateSubscriptionItemRequest> getItems() | setItems(List<CreateSubscriptionItemRequest> items) |
| `Shipping` | [`CreateShippingRequest`](/doc/models/create-shipping-request.md) | Required | Shipping | CreateShippingRequest getShipping() | setShipping(CreateShippingRequest shipping) |
| `Discounts` | [`List<CreateDiscountRequest>`](/doc/models/create-discount-request.md) | Required | Discounts | List<CreateDiscountRequest> getDiscounts() | setDiscounts(List<CreateDiscountRequest> discounts) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Setup` | [`CreateSetupRequest`](/doc/models/create-setup-request.md) | Required | Setup data | CreateSetupRequest getSetup() | setSetup(CreateSetupRequest setup) |
| `PlanId` | `String` | Optional | Plan id | String getPlanId() | setPlanId(String planId) |
| `CustomerId` | `String` | Optional | Customer id | String getCustomerId() | setCustomerId(String customerId) |
| `CardId` | `String` | Optional | Card id | String getCardId() | setCardId(String cardId) |
| `BillingDay` | `Integer` | Optional | Billing day | Integer getBillingDay() | setBillingDay(Integer billingDay) |
| `Installments` | `Integer` | Optional | Number of installments | Integer getInstallments() | setInstallments(Integer installments) |
| `StartAt` | `LocalDateTime` | Optional | Subscription start date | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `MinimumPrice` | `Integer` | Optional | Subscription minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Cycles` | `Integer` | Optional | Number of cycles | Integer getCycles() | setCycles(Integer cycles) |
| `CardToken` | `String` | Optional | Card token | String getCardToken() | setCardToken(String cardToken) |
| `GatewayAffiliationId` | `String` | Optional | Gateway Affiliation code | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `BoletoDueDays` | `Integer` | Optional | Days until boleto expires | Integer getBoletoDueDays() | setBoletoDueDays(Integer boletoDueDays) |
| `Increments` | [`List<CreateIncrementRequest>`](/doc/models/create-increment-request.md) | Required | Increments | List<CreateIncrementRequest> getIncrements() | setIncrements(List<CreateIncrementRequest> increments) |
| `Period` | [`CreatePeriodRequest`](/doc/models/create-period-request.md) | Optional | - | CreatePeriodRequest getPeriod() | setPeriod(CreatePeriodRequest period) |
| `Submerchant` | [`CreateSubMerchantRequest`](/doc/models/create-sub-merchant-request.md) | Optional | SubMerchant | CreateSubMerchantRequest getSubmerchant() | setSubmerchant(CreateSubMerchantRequest submerchant) |
| `Split` | [`CreateSubscriptionSplitRequest`](/doc/models/create-subscription-split-request.md) | Optional | Subscription's split | CreateSubscriptionSplitRequest getSplit() | setSplit(CreateSubscriptionSplitRequest split) |

## Example (as JSON)

```json
{
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
  "card": {
    "number": null,
    "holder_name": null,
    "exp_month": null,
    "exp_year": null,
    "cvv": null,
    "billing_address": null,
    "brand": null,
    "billing_address_id": null,
    "metadata": null,
    "type": "credit",
    "options": null,
    "private_label": null,
    "label": null
  },
  "code": null,
  "payment_method": null,
  "billing_type": null,
  "statement_descriptor": null,
  "description": null,
  "currency": null,
  "interval": null,
  "interval_count": null,
  "pricing_scheme": null,
  "items": null,
  "shipping": null,
  "discounts": null,
  "metadata": null,
  "setup": null,
  "increments": null
}
```

