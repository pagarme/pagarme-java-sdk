
# Get Phones Response

## Structure

`GetPhonesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HomePhone` | [`GetPhoneResponse`](../../doc/models/get-phone-response.md) | Optional | - | GetPhoneResponse getHomePhone() | setHomePhone(GetPhoneResponse homePhone) |
| `MobilePhone` | [`GetPhoneResponse`](../../doc/models/get-phone-response.md) | Optional | - | GetPhoneResponse getMobilePhone() | setMobilePhone(GetPhoneResponse mobilePhone) |

## Example (as JSON)

```json
{
  "home_phone": {
    "country_code": "country_code0",
    "number": "number2",
    "area_code": "area_code0"
  },
  "mobile_phone": {
    "country_code": "country_code0",
    "number": "number8",
    "area_code": "area_code0"
  }
}
```

