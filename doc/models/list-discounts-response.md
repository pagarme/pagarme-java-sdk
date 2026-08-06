
# List Discounts Response

## Structure

`ListDiscountsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetDiscountResponse>`](../../doc/models/get-discount-response.md) | Optional | The Discounts response | List<GetDiscountResponse> getData() | setData(List<GetDiscountResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetDiscountResponse;
import me.pagar.api.models.ListDiscountsResponse;

ListDiscountsResponse listDiscountsResponse = new ListDiscountsResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetDiscountResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

