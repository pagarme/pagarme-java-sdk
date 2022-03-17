
# Get Phones Response

## Structure

`GetPhonesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HomePhone` | [`GetPhoneResponse`](../../doc/models/get-phone-response.md) | Required | - | GetPhoneResponse getHomePhone() | setHomePhone(GetPhoneResponse homePhone) |
| `MobilePhone` | [`GetPhoneResponse`](../../doc/models/get-phone-response.md) | Required | - | GetPhoneResponse getMobilePhone() | setMobilePhone(GetPhoneResponse mobilePhone) |

## Example (as JSON)

```json
{
  "home_phone": {
    "country_code": null,
    "number": null,
    "area_code": null
  },
  "mobile_phone": {
    "country_code": null,
    "number": null,
    "area_code": null
  }
}
```

