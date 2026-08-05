
# List Cards Response

Response object for listing cards

## Structure

`ListCardsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetCardResponse>`](../../doc/models/get-card-response.md) | Optional | The card objects | List<GetCardResponse> getData() | setData(List<GetCardResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetCardResponse;
import me.pagar.api.models.ListCardsResponse;

ListCardsResponse listCardsResponse = new ListCardsResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetCardResponse.Builder()
            .build(),
        new GetCardResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

