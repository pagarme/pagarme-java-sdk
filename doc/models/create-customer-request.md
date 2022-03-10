
# Create Customer Request

Request for creating a new customer

## Structure

`CreateCustomerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name | String getName() | setName(String name) |
| `Email` | `String` | Required | Email | String getEmail() | setEmail(String email) |
| `Document` | `String` | Required | Document number. Only numbers, no special characters. | String getDocument() | setDocument(String document) |
| `Type` | `String` | Required | Person type. Can be either 'individual' or 'company' | String getType() | setType(String type) |
| `Address` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | The customer's address | CreateAddressRequest getAddress() | setAddress(CreateAddressRequest address) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Phones` | [`CreatePhonesRequest`](../../doc/models/create-phones-request.md) | Required | - | CreatePhonesRequest getPhones() | setPhones(CreatePhonesRequest phones) |
| `Code` | `String` | Required | Customer code | String getCode() | setCode(String code) |
| `Gender` | `String` | Optional | Customer Gender | String getGender() | setGender(String gender) |
| `DocumentType` | `String` | Optional | - | String getDocumentType() | setDocumentType(String documentType) |

## Example (as JSON)

```json
{
  "name": "{\n    \"name\": \"Tony Stark\"\n}",
  "email": null,
  "document": null,
  "type": null,
  "address": null,
  "metadata": null,
  "phones": null,
  "code": null
}
```

