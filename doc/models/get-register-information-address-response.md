
# Get Register Information Address Response

Response object for getting an RegisterInformationAddress

## Structure

`GetRegisterInformationAddressResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Optional | - | String getStreet() | setStreet(String street) |
| `Complementary` | `String` | Optional | - | String getComplementary() | setComplementary(String complementary) |
| `StreetNumber` | `String` | Optional | - | String getStreetNumber() | setStreetNumber(String streetNumber) |
| `Neighborhood` | `String` | Optional | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `ZipCode` | `String` | Optional | - | String getZipCode() | setZipCode(String zipCode) |
| `ReferencePoint` | `String` | Optional | - | String getReferencePoint() | setReferencePoint(String referencePoint) |

## Example

```java
import me.pagar.api.models.GetRegisterInformationAddressResponse;

GetRegisterInformationAddressResponse getRegisterInformationAddressResponse = new GetRegisterInformationAddressResponse.Builder()
    .street("street4")
    .complementary("complementary6")
    .streetNumber("street_number4")
    .neighborhood("neighborhood0")
    .city("city4")
    .build();
```

