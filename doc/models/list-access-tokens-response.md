
# List Access Tokens Response

Response object for listing access tokens

## Structure

`ListAccessTokensResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetAccessTokenResponse>`](../../doc/models/get-access-token-response.md) | Optional | The access token objects | List<GetAccessTokenResponse> getData() | setData(List<GetAccessTokenResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetAccessTokenResponse;
import me.pagar.api.models.ListAccessTokensResponse;

ListAccessTokensResponse listAccessTokensResponse = new ListAccessTokensResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetAccessTokenResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

