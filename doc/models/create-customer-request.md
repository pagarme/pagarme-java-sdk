
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
  "email": "email6",
  "document": "document6",
  "type": "type0",
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
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "phones": {
    "home_phone": {
      "country_code": "country_code8",
      "number": "number0",
      "area_code": "area_code2"
    },
    "mobile_phone": {
      "country_code": "country_code8",
      "number": "number4",
      "area_code": "area_code8"
    }
  },
  "code": "code8",
  "gender": "gender6",
  "document_type": "document_type8"
}
```

