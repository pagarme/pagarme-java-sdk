
# List Anticipation Response

Anticipations

## Structure

`ListAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetAnticipationResponse>`](../../doc/models/get-anticipation-response.md) | Optional | Anticipations | List<GetAnticipationResponse> getData() | setData(List<GetAnticipationResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetAnticipationResponse;
import me.pagar.api.models.ListAnticipationResponse;

ListAnticipationResponse listAnticipationResponse = new ListAnticipationResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetAnticipationResponse.Builder()
            .build(),
        new GetAnticipationResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

