
# Get Customer Response

Response object for getting a customer

## Structure

`GetCustomerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Delinquent` | `Boolean` | Optional | - | Boolean getDelinquent() | setDelinquent(Boolean delinquent) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Document` | `String` | Optional | - | String getDocument() | setDocument(String document) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `FbAccessToken` | `String` | Optional | - | String getFbAccessToken() | setFbAccessToken(String fbAccessToken) |
| `Address` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Optional | - | GetAddressResponse getAddress() | setAddress(GetAddressResponse address) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Phones` | [`GetPhonesResponse`](../../doc/models/get-phones-response.md) | Optional | - | GetPhonesResponse getPhones() | setPhones(GetPhonesResponse phones) |
| `FbId` | `Long` | Optional | - | Long getFbId() | setFbId(Long fbId) |
| `Code` | `String` | Optional | Código de referência do cliente no sistema da loja. Max: 52 caracteres | String getCode() | setCode(String code) |
| `DocumentType` | `String` | Optional | - | String getDocumentType() | setDocumentType(String documentType) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": "name0",
  "email": "email6",
  "delinquent": false,
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

