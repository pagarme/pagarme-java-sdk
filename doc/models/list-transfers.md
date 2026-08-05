
# List Transfers

## Structure

`ListTransfers`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetTransfer>`](../../doc/models/get-transfer.md) | Required | The Increments response | List<GetTransfer> getData() | setData(List<GetTransfer> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Required | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.ListTransfers;

ListTransfers listTransfers = new ListTransfers.Builder(
    Arrays.asList(
        null
    ),
    null
)
.build();
```

