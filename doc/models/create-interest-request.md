
# Create Interest Request

Interest Request

## Structure

`CreateInterestRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `int` | Required | Days | int getDays() | setDays(int days) |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |

## Example

```java
import me.pagar.api.models.CreateInterestRequest;

CreateInterestRequest createInterestRequest = new CreateInterestRequest.Builder(
    0,
    "\"percentage\" or \"flat\"",
    0
)
.build();
```

