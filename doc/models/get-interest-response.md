
# Get Interest Response

Interest Response

## Structure

`GetInterestResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `Integer` | Optional | Days | Integer getDays() | setDays(Integer days) |
| `Type` | `String` | Optional | Type | String getType() | setType(String type) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |

## Example

```java
import me.pagar.api.models.GetInterestResponse;

GetInterestResponse getInterestResponse = new GetInterestResponse.Builder()
    .days(82)
    .type("\"percentage\" or \"flat\"")
    .amount(156)
    .build();
```

