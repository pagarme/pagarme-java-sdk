
# List Increments Response

## Structure

`ListIncrementsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetIncrementResponse>`](../../doc/models/get-increment-response.md) | Optional | The Increments response | List<GetIncrementResponse> getData() | setData(List<GetIncrementResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetIncrementResponse;
import me.pagar.api.models.ListIncrementsResponse;

ListIncrementsResponse listIncrementsResponse = new ListIncrementsResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetIncrementResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

