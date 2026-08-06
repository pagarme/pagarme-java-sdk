
# Create Clear Sale Request

## Structure

`CreateClearSaleRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomSla` | `int` | Required | - | int getCustomSla() | setCustomSla(int customSla) |

## Example

```java
import me.pagar.api.models.CreateClearSaleRequest;

CreateClearSaleRequest createClearSaleRequest = new CreateClearSaleRequest.Builder(
    156
)
.build();
```

