
# Create Cash Payment Request

## Structure

`CreateCashPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Confirm` | `boolean` | Required | Indicates whether cash collection will be confirmed in the act of creation | boolean getConfirm() | setConfirm(boolean confirm) |

## Example (as JSON)

```json
{
  "description": "description8",
  "confirm": false
}
```

