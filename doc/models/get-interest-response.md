
# Get Interest Response

Interest Response

## Structure

`GetInterestResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `Integer` | Optional | Days | Integer getDays() | setDays(Integer days) |
| `Type` | `String` | Optional | Type | String getType() | setType(String type) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |

## Example (as JSON)

```json
{
  "type": "\"percentage\" or \"flat\"",
  "days": 114,
  "amount": 188
}
```

