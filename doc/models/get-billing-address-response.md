
# Get Billing Address Response

Response object for getting a billing address

## Structure

`GetBillingAddressResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `ZipCode` | `String` | Optional | - | String getZipCode() | setZipCode(String zipCode) |
| `Neighborhood` | `String` | Optional | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `Country` | `String` | Optional | - | String getCountry() | setCountry(String country) |
| `Complement` | `String` | Optional | - | String getComplement() | setComplement(String complement) |
| `Line1` | `String` | Optional | Line 1 for address | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Line 2 for address | String getLine2() | setLine2(String line2) |

## Example (as JSON)

```json
{
  "street": "street4",
  "number": "number2",
  "zip_code": "zip_code8",
  "neighborhood": "neighborhood0",
  "city": "city4"
}
```

