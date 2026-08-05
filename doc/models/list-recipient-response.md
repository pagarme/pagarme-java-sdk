
# List Recipient Response

Response for the listing recipient method

## Structure

`ListRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetRecipientResponse>`](../../doc/models/get-recipient-response.md) | Optional | Recipients | List<GetRecipientResponse> getData() | setData(List<GetRecipientResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetRecipientResponse;
import me.pagar.api.models.ListRecipientResponse;

ListRecipientResponse listRecipientResponse = new ListRecipientResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetRecipientResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

