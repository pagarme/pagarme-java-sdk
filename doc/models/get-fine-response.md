
# Get Fine Response

Fine Response

## Structure

`GetFineResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `Integer` | Optional | Days | Integer getDays() | setDays(Integer days) |
| `Type` | `String` | Optional | Type | String getType() | setType(String type) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |

## Example

```java
import me.pagar.api.models.GetFineResponse;

GetFineResponse getFineResponse = new GetFineResponse.Builder()
    .days(20)
    .type("\"percentage\" or \"flat\"")
    .amount(94)
    .build();
```

