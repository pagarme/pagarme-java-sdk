
# Get Phone Response

## Structure

`GetPhoneResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryCode` | `String` | Optional | - | String getCountryCode() | setCountryCode(String countryCode) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `AreaCode` | `String` | Optional | - | String getAreaCode() | setAreaCode(String areaCode) |

## Example

```java
import me.pagar.api.models.GetPhoneResponse;

GetPhoneResponse getPhoneResponse = new GetPhoneResponse.Builder()
    .countryCode("country_code2")
    .number("number0")
    .areaCode("area_code2")
    .build();
```

