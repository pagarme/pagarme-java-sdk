
# Get Plan Response

Response object for getting a plan

## Structure

`GetPlanResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `StatementDescriptor` | `String` | Optional | - | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Interval` | `String` | Optional | - | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `Integer` | Optional | - | Integer getIntervalCount() | setIntervalCount(Integer intervalCount) |
| `BillingType` | `String` | Optional | - | String getBillingType() | setBillingType(String billingType) |
| `PaymentMethods` | `List<String>` | Optional | - | List<String> getPaymentMethods() | setPaymentMethods(List<String> paymentMethods) |
| `Installments` | `List<Integer>` | Optional | - | List<Integer> getInstallments() | setInstallments(List<Integer> installments) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Items` | [`List<GetPlanItemResponse>`](../../doc/models/get-plan-item-response.md) | Optional | - | List<GetPlanItemResponse> getItems() | setItems(List<GetPlanItemResponse> items) |
| `BillingDays` | `List<Integer>` | Optional | - | List<Integer> getBillingDays() | setBillingDays(List<Integer> billingDays) |
| `Shippable` | `Boolean` | Optional | - | Boolean getShippable() | setShippable(Boolean shippable) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `TrialPeriodDays` | `Integer` | Optional | - | Integer getTrialPeriodDays() | setTrialPeriodDays(Integer trialPeriodDays) |
| `MinimumPrice` | `Integer` | Optional | - | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": "name0",
  "description": "description0",
  "url": "url4",
  "statement_descriptor": "statement_descriptor0"
}
```

