
# Create Phones Request

## Structure

`CreatePhonesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HomePhone` | [`CreatePhoneRequest`](../../doc/models/create-phone-request.md) | Optional | - | CreatePhoneRequest getHomePhone() | setHomePhone(CreatePhoneRequest homePhone) |
| `MobilePhone` | [`CreatePhoneRequest`](../../doc/models/create-phone-request.md) | Optional | - | CreatePhoneRequest getMobilePhone() | setMobilePhone(CreatePhoneRequest mobilePhone) |

## Example (as JSON)

```json
{
  "home_phone": {
    "country_code": "country_code0",
    "number": "number2",
    "area_code": "area_code0",
    "Type": "Type0"
  },
  "mobile_phone": {
    "country_code": "country_code0",
    "number": "number8",
    "area_code": "area_code0",
    "Type": "Type0"
  }
}
```

