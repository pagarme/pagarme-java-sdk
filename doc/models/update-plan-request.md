
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

## Example

```java
import java.util.Arrays;
import java.util.LinkedHashMap;
import me.pagar.api.models.UpdatePlanRequest;

UpdatePlanRequest updatePlanRequest = new UpdatePlanRequest.Builder(
    "name8",
    "description8",
    Arrays.asList(
        139,
        140,
        141
    ),
    "statement_descriptor8",
    "currency8",
    "interval6",
    102,
    Arrays.asList(
        "payment_methods3",
        "payment_methods2"
    ),
    "billing_type8",
    "status0",
    false,
    Arrays.asList(
        103,
        104
    ),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata5");
        put("key1", "metadata6");
        put("key2", "metadata7");
    }}
)
.minimumPrice(156)
.trialPeriodDays(74)
.build();
```

