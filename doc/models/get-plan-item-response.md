
# Get Plan Item Response

Response object for getting a plan item

## Structure

`GetPlanItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `PricingScheme` | [`GetPricingSchemeResponse`](../../doc/models/get-pricing-scheme-response.md) | Optional | - | GetPricingSchemeResponse getPricingScheme() | setPricingScheme(GetPricingSchemeResponse pricingScheme) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Plan` | [`GetPlanResponse`](../../doc/models/get-plan-response.md) | Optional | - | GetPlanResponse getPlan() | setPlan(GetPlanResponse plan) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `Cycles` | `Integer` | Optional | - | Integer getCycles() | setCycles(Integer cycles) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": "id8",
  "name": "name8",
  "status": "status0",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

