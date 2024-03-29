
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

## Example (as JSON)

```json
{
  "id": "id0",
  "code": "code8",
  "status": "status2",
  "created_at": "2016-03-13T12:52:32.123Z",
  "customer": {
    "id": "id0",
    "name": "name0",
    "email": "email6",
    "delinquent": false,
    "created_at": "2016-03-13T12:52:32.123Z"
  }
}
```

