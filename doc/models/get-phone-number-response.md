
# Get Phone Number Response

Response object for getting an PhoneNumberResponse

## Structure

`GetPhoneNumberResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ddd` | `String` | Optional | - | String getDdd() | setDdd(String ddd) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.GetPhoneNumberResponse;

GetPhoneNumberResponse getPhoneNumberResponse = new GetPhoneNumberResponse.Builder()
    .ddd("ddd4")
    .number("number8")
    .type("type0")
    .build();
```

