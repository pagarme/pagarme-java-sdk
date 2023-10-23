
# Get Subscription Response

## Structure

`GetSubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `StartAt` | `LocalDateTime` | Optional | - | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `Interval` | `String` | Optional | - | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `Integer` | Optional | - | Integer getIntervalCount() | setIntervalCount(Integer intervalCount) |
| `BillingType` | `String` | Optional | - | String getBillingType() | setBillingType(String billingType) |
| `CurrentCycle` | [`GetPeriodResponse`](../../doc/models/get-period-response.md) | Optional | - | GetPeriodResponse getCurrentCycle() | setCurrentCycle(GetPeriodResponse currentCycle) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Installments` | `Integer` | Optional | - | Integer getInstallments() | setInstallments(Integer installments) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Card` | [`GetCardResponse`](../../doc/models/get-card-response.md) | Optional | - | GetCardResponse getCard() | setCard(GetCardResponse card) |
| `Items` | [`List<GetSubscriptionItemResponse>`](../../doc/models/get-subscription-item-response.md) | Optional | - | List<GetSubscriptionItemResponse> getItems() | setItems(List<GetSubscriptionItemResponse> items) |
| `StatementDescriptor` | `String` | Optional | - | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Setup` | [`GetSetupResponse`](../../doc/models/get-setup-response.md) | Optional | - | GetSetupResponse getSetup() | setSetup(GetSetupResponse setup) |
| `GatewayAffiliationId` | `String` | Optional | Affiliation Code | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `NextBillingAt` | `LocalDateTime` | Optional | - | LocalDateTime getNextBillingAt() | setNextBillingAt(LocalDateTime nextBillingAt) |
| `BillingDay` | `Integer` | Optional | - | Integer getBillingDay() | setBillingDay(Integer billingDay) |
| `MinimumPrice` | `Integer` | Optional | - | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `CanceledAt` | `LocalDateTime` | Optional | - | LocalDateTime getCanceledAt() | setCanceledAt(LocalDateTime canceledAt) |
| `Discounts` | [`List<GetDiscountResponse>`](../../doc/models/get-discount-response.md) | Optional | Subscription discounts | List<GetDiscountResponse> getDiscounts() | setDiscounts(List<GetDiscountResponse> discounts) |
| `Increments` | [`List<GetIncrementResponse>`](../../doc/models/get-increment-response.md) | Optional | Subscription increments | List<GetIncrementResponse> getIncrements() | setIncrements(List<GetIncrementResponse> increments) |
| `BoletoDueDays` | `Integer` | Optional | Days until boleto expires | Integer getBoletoDueDays() | setBoletoDueDays(Integer boletoDueDays) |
| `Split` | [`GetSubscriptionSplitResponse`](../../doc/models/get-subscription-split-response.md) | Optional | Subscription's split response | GetSubscriptionSplitResponse getSplit() | setSplit(GetSubscriptionSplitResponse split) |
| `Boleto` | [`GetSubscriptionBoletoResponse`](../../doc/models/get-subscription-boleto-response.md) | Optional | - | GetSubscriptionBoletoResponse getBoleto() | setBoleto(GetSubscriptionBoletoResponse boleto) |
| `ManualBilling` | `Boolean` | Optional | - | Boolean getManualBilling() | setManualBilling(Boolean manualBilling) |

## Example (as JSON)

```json
{
  "boleto": {
    "interest": {
      "days": 2,
      "type": "percentage",
      "amount": 20
    },
    "fine": {
      "days": 2,
      "type": "flat",
      "amount": 10
    },
    "max_days_to_pay_past_due": 2
  },
  "id": "id4",
  "code": "code2",
  "start_at": "2016-03-13T12:52:32.123Z",
  "interval": "interval2",
  "interval_count": 224
}
```

