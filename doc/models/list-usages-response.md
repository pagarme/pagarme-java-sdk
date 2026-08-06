
# List Usages Response

Response model for listing the usages from a subscription item

## Structure

`ListUsagesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetUsageResponse>`](../../doc/models/get-usage-response.md) | Optional | The usage objects | List<GetUsageResponse> getData() | setData(List<GetUsageResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.ListUsagesResponse;

ListUsagesResponse listUsagesResponse = new ListUsagesResponse.Builder()
    .data(Arrays.asList(
        null
    ))
    .paging(null)
    .build();
```

