
# List Withdrawals

## Structure

`ListWithdrawals`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetWithdrawResponse>`](../../doc/models/get-withdraw-response.md) | Required | The Increments response | List<GetWithdrawResponse> getData() | setData(List<GetWithdrawResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Required | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.ListWithdrawals;

ListWithdrawals listWithdrawals = new ListWithdrawals.Builder(
    Arrays.asList(
        null
    ),
    null
)
.build();
```

