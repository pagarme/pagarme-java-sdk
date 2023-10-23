
# Create Checkout Card Installment Option Request

Options for card installment

## Structure

`CreateCheckoutCardInstallmentOptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | Installment quantity | int getNumber() | setNumber(int number) |
| `Total` | `int` | Required | Total amount | int getTotal() | setTotal(int total) |

## Example (as JSON)

```json
{
  "number": 154,
  "total": 46
}
```

