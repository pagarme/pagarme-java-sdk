
# List Addresses Response

Response object for listing addresses

## Structure

`ListAddressesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetAddressResponse>`](../../doc/models/get-address-response.md) | Optional | The address objects | List<GetAddressResponse> getData() | setData(List<GetAddressResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetAddressResponse;
import me.pagar.api.models.ListAddressesResponse;

ListAddressesResponse listAddressesResponse = new ListAddressesResponse.Builder()
    .data(Arrays.asList(
        null,
        new GetAddressResponse.Builder()
            .build()
    ))
    .paging(null)
    .build();
```

