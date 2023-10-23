
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
      "name": "name8",
      "pricing_scheme": {
        "scheme_type": "scheme_type8",
        "price_brackets": [
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          },
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          },
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          }
        ],
        "price": 166,
        "minimum_price": 6,
        "percentage": 251.76
      },
      "id": "id8",
      "description": "description2",
      "cycles": 214,
      "quantity": 22
    }
  ],
  "shippable": false,
  "payment_methods": [
    "payment_methods5",
    "payment_methods4"
  ],
  "installments": [
    195,
    196
  ],
  "currency": "currency0",
  "interval": "interval8",
  "interval_count": 158,
  "billing_days": [
    159
  ],
  "billing_type": "billing_type4",
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      },
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      },
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      }
    ],
    "price": 166,
    "minimum_price": 6,
    "percentage": 251.76
  },
  "metadata": {
    "key0": "metadata7"
  },
  "minimum_price": 156,
  "cycles": 164,
  "quantity": 144,
  "trial_period_days": 130
}
```

