
# Create Interest Request

Interest Request

## Structure

`CreateInterestRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `int` | Required | Days | int getDays() | setDays(int days) |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |

## Example (as JSON)

```json
{
  "days": null,
  "type": "\"percentage\" or \"flat\"",
  "amount": null
}
```

