
# Create Usage Request

Request for creating a usage

## Structure

`CreateUsageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quantity` | `int` | Required | - | int getQuantity() | setQuantity(int quantity) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `UsedAt` | `LocalDateTime` | Required | - | LocalDateTime getUsedAt() | setUsedAt(LocalDateTime usedAt) |
| `Code` | `String` | Optional | Identification code in the client system | String getCode() | setCode(String code) |
| `Group` | `String` | Optional | identification group in the client system | String getGroup() | setGroup(String group) |
| `Amount` | `Integer` | Optional | Field used in item scheme type 'Percent' | Integer getAmount() | setAmount(Integer amount) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateUsageRequest;

CreateUsageRequest createUsageRequest = new CreateUsageRequest.Builder(
    254,
    "description6",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.code("code4")
.group("group4")
.amount(140)
.build();
```

