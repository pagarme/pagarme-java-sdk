
# Get Customer Response

Response object for getting a customer

## Structure

`GetCustomerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Delinquent` | `Boolean` | Required | - | Boolean getDelinquent() | setDelinquent(Boolean delinquent) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Document` | `String` | Required | - | String getDocument() | setDocument(String document) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `FbAccessToken` | `String` | Required | - | String getFbAccessToken() | setFbAccessToken(String fbAccessToken) |
| `Address` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Required | - | GetAddressResponse getAddress() | setAddress(GetAddressResponse address) |
| `Metadata` | `Map<String, String>` | Required | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Phones` | [`GetPhonesResponse`](../../doc/models/get-phones-response.md) | Required | - | GetPhonesResponse getPhones() | setPhones(GetPhonesResponse phones) |
| `FbId` | `Long` | Optional | - | Long getFbId() | setFbId(Long fbId) |
| `Code` | `String` | Required | Código de referência do cliente no sistema da loja. Max: 52 caracteres | String getCode() | setCode(String code) |
| `DocumentType` | `String` | Required | - | String getDocumentType() | setDocumentType(String documentType) |

## Example (as JSON)

```json
{
  "id": "id0",
  "name": "name0",
  "email": "email6",
  "delinquent": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "document": "document6",
  "type": "type0",
  "fb_access_token": "fb_access_token4",
  "address": {
    "id": "id6",
    "street": "street6",
    "number": "number4",
    "complement": "complement2",
    "zip_code": "zip_code0",
    "neighborhood": "neighborhood2",
    "city": "city6",
    "state": "state2",
    "country": "country0",
    "status": "status8",
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "customer": null,
    "metadata": {
      "key0": "metadata3",
      "key1": "metadata2",
      "key2": "metadata1"
    },
    "line_1": "line_10",
    "line_2": "line_24",
    "deleted_at": null
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "phones": {
    "home_phone": {
      "country_code": null,
      "number": null,
      "area_code": null
    },
    "mobile_phone": {
      "country_code": null,
      "number": null,
      "area_code": null
    }
  },
  "fb_id": null,
  "code": "code8",
  "document_type": "document_type8"
}
```

