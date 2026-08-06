
# List Subscription Items Response

Response model for listing subscription items

## Structure

`ListSubscriptionItemsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetSubscriptionItemResponse>`](../../doc/models/get-subscription-item-response.md) | Optional | The subscription items | List<GetSubscriptionItemResponse> getData() | setData(List<GetSubscriptionItemResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetSubscriptionItemResponse;
import me.pagar.api.models.ListSubscriptionItemsResponse;

ListSubscriptionItemsResponse listSubscriptionItemsResponse = new ListSubscriptionItemsResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetSubscriptionItemResponse.Builder()
            .build(),
        new GetSubscriptionItemResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

