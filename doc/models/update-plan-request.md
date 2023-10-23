
# Update Plan Request

Request for updating a plan

## Structure

`UpdatePlanRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Plan's name | String getName() | setName(String name) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Installments` | `List<Integer>` | Required | Number os installments | List<Integer> getInstallments() | setInstallments(List<Integer> installments) |
| `StatementDescriptor` | `String` | Required | Text that will be shown on the credit card's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `Interval` | `String` | Required | Interval | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `int` | Required | Interval count | int getIntervalCount() | setIntervalCount(int intervalCount) |
| `PaymentMethods` | `List<String>` | Required | Payment methods accepted by the plan | List<String> getPaymentMethods() | setPaymentMethods(List<String> paymentMethods) |
| `BillingType` | `String` | Required | Billing type | String getBillingType() | setBillingType(String billingType) |
| `Status` | `String` | Required | Plan status | String getStatus() | setStatus(String status) |
| `Shippable` | `boolean` | Required | Indicates if the plan is shippable | boolean getShippable() | setShippable(boolean shippable) |
| `BillingDays` | `List<Integer>` | Required | Billing days accepted by the plan | List<Integer> getBillingDays() | setBillingDays(List<Integer> billingDays) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `TrialPeriodDays` | `Integer` | Optional | Number of trial period in days, where the customer will not be charged | Integer getTrialPeriodDays() | setTrialPeriodDays(Integer trialPeriodDays) |

## Example (as JSON)

```json
{
  "name": "name0",
  "description": "description0",
  "installments": [
    121,
    122,
    123
  ],
  "statement_descriptor": "statement_descriptor0",
  "currency": "currency0",
  "interval": "interval8",
  "interval_count": 84,
  "payment_methods": [
    "payment_methods5",
    "payment_methods6"
  ],
  "billing_type": "billing_type6",
  "status": "status8",
  "shippable": false,
  "billing_days": [
    171,
    170
  ],
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "minimum_price": 174,
  "trial_period_days": 56
}
```

