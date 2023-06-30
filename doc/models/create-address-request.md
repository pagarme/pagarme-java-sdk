
# Create Address Request

Request for creating a new Address

## Structure

`CreateAddressRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Required | Street | String getStreet() | setStreet(String street) |
| `Number` | `String` | Required | Number | String getNumber() | setNumber(String number) |
| `ZipCode` | `String` | Required | The zip code containing only numbers. No special characters or spaces. | String getZipCode() | setZipCode(String zipCode) |
| `Neighborhood` | `String` | Required | Neighborhood | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Required | City | String getCity() | setCity(String city) |
| `State` | `String` | Required | State | String getState() | setState(String state) |
| `Country` | `String` | Required | Country. Must be entered using ISO 3166-1 alpha-2 format. See https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2 | String getCountry() | setCountry(String country) |
| `Complement` | `String` | Required | Complement | String getComplement() | setComplement(String complement) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Line1` | `String` | Required | Line 1 for address | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Required | Line 2 for address | String getLine2() | setLine2(String line2) |

## Example (as JSON)

```json
{
  "street": "street0",
  "number": "number2",
  "zip_code": "zip_code4",
  "neighborhood": "neighborhood6",
  "city": "city0",
  "state": "state4",
  "country": "country4",
  "complement": "complement4",
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "line_1": "line_16",
  "line_2": "line_28"
}
```

