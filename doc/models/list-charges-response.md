
# List Charges Response

Response object for listing charges

## Structure

`ListChargesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetChargeResponse>`](../../doc/models/get-charge-response.md) | Optional | The charge objects | List<GetChargeResponse> getData() | setData(List<GetChargeResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.ListChargesResponse;

ListChargesResponse listChargesResponse = new ListChargesResponse.Builder()
    .data(Arrays.asList(
        null
    ))
    .paging(null)
    .build();
```

