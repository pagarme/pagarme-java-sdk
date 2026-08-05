
# List Transfer Response

List of paginated transfer objects

## Structure

`ListTransferResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetTransferResponse>`](../../doc/models/get-transfer-response.md) | Optional | Transfers | List<GetTransferResponse> getData() | setData(List<GetTransferResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.ListTransferResponse;

ListTransferResponse listTransferResponse = new ListTransferResponse.Builder()
    .data(Arrays.asList(
        null
    ))
    .paging(null)
    .build();
```

