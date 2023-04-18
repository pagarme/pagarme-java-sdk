
# Create Confirm Payment Request

## Structure

`CreateConfirmPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |
| `Code` | `String` | Required | Code reference | String getCode() | setCode(String code) |

## Example (as JSON)

```json
{
  "description": "description0",
  "Amount": 156,
  "Code": "Code0"
}
```

