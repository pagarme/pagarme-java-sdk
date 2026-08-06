
# List Cycles Response

Response object for listing subscription cycles

## Structure

`ListCyclesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetPeriodResponse>`](../../doc/models/get-period-response.md) | Optional | The subscription cycles objects | List<GetPeriodResponse> getData() | setData(List<GetPeriodResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetPeriodResponse;
import me.pagar.api.models.ListCyclesResponse;

ListCyclesResponse listCyclesResponse = new ListCyclesResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetPeriodResponse.Builder()
            .build(),
        new GetPeriodResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

