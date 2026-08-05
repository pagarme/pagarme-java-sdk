
# List Order Response

Response object for listing order objects

## Structure

`ListOrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetOrderResponse>`](../../doc/models/get-order-response.md) | Optional | The order object | List<GetOrderResponse> getData() | setData(List<GetOrderResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetOrderResponse;
import me.pagar.api.models.ListOrderResponse;

ListOrderResponse listOrderResponse = new ListOrderResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetOrderResponse.Builder()
            .build(),
        new GetOrderResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

