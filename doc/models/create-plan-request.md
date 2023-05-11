
# Create Plan Request

Request for creating a plan

## Structure

`CreatePlanRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Plan's name | String getName() | setName(String name) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `StatementDescriptor` | `String` | Required | Text that will be printed on the credit card's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Items` | [`List<CreatePlanItemRequest>`](../../doc/models/create-plan-item-request.md) | Required | Plan items | List<CreatePlanItemRequest> getItems() | setItems(List<CreatePlanItemRequest> items) |
| `Shippable` | `boolean` | Required | Indicates if the plan is shippable | boolean getShippable() | setShippable(boolean shippable) |
| `PaymentMethods` | `List<String>` | Required | Allowed payment methods for the plan | List<String> getPaymentMethods() | setPaymentMethods(List<String> paymentMethods) |
| `Installments` | `List<Integer>` | Required | Number of installments | List<Integer> getInstallments() | setInstallments(List<Integer> installments) |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `Interval` | `String` | Required | Interval | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `int` | Required | Interval counts between two charges. For instance, if the interval is 'month' and count is 2, the customer will be charged once every two months. | int getIntervalCount() | setIntervalCount(int intervalCount) |
| `BillingDays` | `List<Integer>` | Required | Allowed billings days for the subscription, in case the plan type is 'exact_day' | List<Integer> getBillingDays() | setBillingDays(List<Integer> billingDays) |
| `BillingType` | `String` | Required | Billing type | String getBillingType() | setBillingType(String billingType) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Plan's pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MinimumPrice` | `Integer` | Optional | Minimum price that will be charged | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Cycles` | `Integer` | Optional | Number of cycles | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `TrialPeriodDays` | `Integer` | Optional | Trial period, where the customer will not be charged. | Integer getTrialPeriodDays() | setTrialPeriodDays(Integer trialPeriodDays) |

## Example (as JSON)

```json
{
  "name": "name0",
  "description": "description0",
  "statement_descriptor": "statement_descriptor0",
  "items": [
    {
      "name": "name7",
      "pricing_scheme": {
        "scheme_type": "scheme_type1",
        "price_brackets": [
          {
            "start_quantity": 60,
            "price": 2,
            "end_quantity": 68,
            "overage_price": 82
          },
          {
            "start_quantity": 61,
            "price": 1,
            "end_quantity": 69,
            "overage_price": 83
          },
          {
            "start_quantity": 62,
            "price": 0,
            "end_quantity": 70,
            "overage_price": 84
          }
        ],
        "price": 149,
        "minimum_price": 53,
        "percentage": 25.89
      },
      "id": "id7",
      "description": "description7",
      "cycles": 109,
      "quantity": 127
    }
  ],
  "shippable": false,
  "payment_methods": [
    "payment_methods5",
    "payment_methods6"
  ],
  "installments": [
    119,
    120,
    121
  ],
  "currency": "currency0",
  "interval": "interval2",
  "interval_count": 82,
  "billing_days": [
    143,
    144,
    145
  ],
  "billing_type": "billing_type6",
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 119,
        "price": 57,
        "end_quantity": 127,
        "overage_price": 141
      },
      {
        "start_quantity": 120,
        "price": 58,
        "end_quantity": 128,
        "overage_price": 142
      },
      {
        "start_quantity": 121,
        "price": 59,
        "end_quantity": 129,
        "overage_price": 143
      }
    ],
    "price": 166,
    "minimum_price": 6,
    "percentage": 251.76
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "minimum_price": 176,
  "cycles": 168,
  "quantity": 68,
  "trial_period_days": 54
}
```

