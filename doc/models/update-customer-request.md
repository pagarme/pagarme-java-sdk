
# Update Customer Request

Request for updating a customer

## Structure

`UpdateCustomerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name | String getName() | setName(String name) |
| `Email` | `String` | Optional | Email | String getEmail() | setEmail(String email) |
| `Document` | `String` | Optional | Document number | String getDocument() | setDocument(String document) |
| `Type` | `String` | Optional | Person type | String getType() | setType(String type) |
| `Address` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Optional | Address | CreateAddressRequest getAddress() | setAddress(CreateAddressRequest address) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Phones` | [`CreatePhonesRequest`](../../doc/models/create-phones-request.md) | Optional | - | CreatePhonesRequest getPhones() | setPhones(CreatePhonesRequest phones) |
| `Code` | `String` | Optional | Código de referência do cliente no sistema da loja. Max: 52 caracteres | String getCode() | setCode(String code) |
| `Gender` | `String` | Optional | Gênero do cliente | String getGender() | setGender(String gender) |
| `DocumentType` | `String` | Optional | - | String getDocumentType() | setDocumentType(String documentType) |

## Example (as JSON)

```json
{
  "name": "name8",
  "email": "email8",
  "document": "document2",
  "type": "type2",
  "address": {
    "street": "street6",
    "number": "number4",
    "zip_code": "zip_code0",
    "neighborhood": "neighborhood2",
    "city": "city6",
    "state": "state2",
    "country": "country0",
    "complement": "complement2",
    "metadata": {
      "key0": "metadata3",
      "key1": "metadata2",
      "key2": "metadata1"
    },
    "line_1": "line_10",
    "line_2": "line_24"
  }
}
```

