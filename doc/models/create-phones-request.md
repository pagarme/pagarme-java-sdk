
# Create Phones Request

## Structure

`CreatePhonesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HomePhone` | [`CreatePhoneRequest`](../../doc/models/create-phone-request.md) | Optional | - | CreatePhoneRequest getHomePhone() | setHomePhone(CreatePhoneRequest homePhone) |
| `MobilePhone` | [`CreatePhoneRequest`](../../doc/models/create-phone-request.md) | Optional | - | CreatePhoneRequest getMobilePhone() | setMobilePhone(CreatePhoneRequest mobilePhone) |

## Example

```java
import me.pagar.api.models.CreatePhonesRequest;

CreatePhonesRequest createPhonesRequest = new CreatePhonesRequest.Builder()
    .homePhone(null)
    .mobilePhone(null)
    .build();
```

