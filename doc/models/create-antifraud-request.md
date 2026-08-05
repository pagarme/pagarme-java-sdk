
# Create Antifraud Request

## Structure

`CreateAntifraudRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Clearsale` | [`CreateClearSaleRequest`](../../doc/models/create-clear-sale-request.md) | Required | - | CreateClearSaleRequest getClearsale() | setClearsale(CreateClearSaleRequest clearsale) |

## Example

```java
import me.pagar.api.models.CreateAntifraudRequest;

CreateAntifraudRequest createAntifraudRequest = new CreateAntifraudRequest.Builder(
    "type0",
    null
)
.build();
```

