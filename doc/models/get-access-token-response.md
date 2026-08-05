
# Get Access Token Response

Response object for getting a access token

## Structure

`GetAccessTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetAccessTokenResponse;

GetAccessTokenResponse getAccessTokenResponse = new GetAccessTokenResponse.Builder()
    .id("id2")
    .code("code0")
    .status("status6")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .customer(null)
    .build();
```

