
# Get Address Response

Response object for getting an Address

## Structure

`GetAddressResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Street` | `String` | Required | - | String getStreet() | setStreet(String street) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Complement` | `String` | Required | - | String getComplement() | setComplement(String complement) |
| `ZipCode` | `String` | Required | - | String getZipCode() | setZipCode(String zipCode) |
| `Neighborhood` | `String` | Required | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Country` | `String` | Required | - | String getCountry() | setCountry(String country) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Metadata` | `Map<String, String>` | Required | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Line1` | `String` | Required | Line 1 for address | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Required | Line 2 for address | String getLine2() | setLine2(String line2) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": "id0",
  "street": "street0",
  "number": "number2",
  "complement": "complement4",
  "zip_code": "zip_code4",
  "neighborhood": "neighborhood6",
  "city": "city0",
  "state": "state4",
  "country": "country4",
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "customer": null,
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "line_1": "line_16",
  "line_2": "line_28",
  "deleted_at": null
}
```

