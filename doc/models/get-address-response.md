
# Get Address Response

Response object for getting an Address

## Structure

`GetAddressResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `Complement` | `String` | Optional | - | String getComplement() | setComplement(String complement) |
| `ZipCode` | `String` | Optional | - | String getZipCode() | setZipCode(String zipCode) |
| `Neighborhood` | `String` | Optional | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Line1` | `String` | Optional | Line 1 for address | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Line 2 for address | String getLine2() | setLine2(String line2) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": null,
  "street": null,
  "number": null,
  "complement": null,
  "zip_code": null,
  "neighborhood": null,
  "city": null,
  "state": null,
  "country": null,
  "status": null,
  "created_at": null,
  "updated_at": null,
  "customer": null,
  "metadata": null,
  "line_1": null,
  "line_2": null,
  "deleted_at": null
}
```

