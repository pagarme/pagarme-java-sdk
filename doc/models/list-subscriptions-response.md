
# List Subscriptions Response

Response object for listing subscriptions

## Structure

`ListSubscriptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetSubscriptionResponse>`](../../doc/models/get-subscription-response.md) | Optional | The subscription objects | List<GetSubscriptionResponse> getData() | setData(List<GetSubscriptionResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetSubscriptionResponse;
import me.pagar.api.models.ListSubscriptionsResponse;

ListSubscriptionsResponse listSubscriptionsResponse = new ListSubscriptionsResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetSubscriptionResponse.Builder()
            .build(),
        new GetSubscriptionResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

