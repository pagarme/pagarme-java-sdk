
# Create Card Token Request

Card token data

## Structure

`CreateCardTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `String` | Required | Credit card number | String getNumber() | setNumber(String number) |
| `HolderName` | `String` | Required | Holder name, as written on the card | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `int` | Required | The expiration month | int getExpMonth() | setExpMonth(int expMonth) |
| `ExpYear` | `int` | Required | The expiration year, that can be informed with 2 or 4 digits | int getExpYear() | setExpYear(int expYear) |
| `Cvv` | `String` | Required | The card's security code | String getCvv() | setCvv(String cvv) |
| `Brand` | `String` | Required | Card brand | String getBrand() | setBrand(String brand) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |

## Example (as JSON)

```json
{
  "number": "number8",
  "holder_name": "holder_name6",
  "exp_month": 168,
  "exp_year": 208,
  "cvv": "cvv8",
  "brand": "brand4",
  "label": "label0"
}
```

