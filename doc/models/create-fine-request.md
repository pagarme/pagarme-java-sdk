
# Create Fine Request

Fine Request

## Structure

`CreateFineRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Days` | `int` | Required | Days | int getDays() | setDays(int days) |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |

## Example (as JSON)

```json
{
  "days": 218,
  "type": "\"percentage\" or \"flat\"",
  "amount": 220
}
```

