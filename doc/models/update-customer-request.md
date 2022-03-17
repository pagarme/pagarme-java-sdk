
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
  "name": null,
  "email": null,
  "document": null,
  "type": null,
  "address": null,
  "metadata": null,
  "phones": null,
  "code": null,
  "gender": null,
  "document_type": null
}
```

