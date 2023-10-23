
# Create Checkout Bank Transfer Request

Checkout bank transfer payment request

## Structure

`CreateCheckoutBankTransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `List<String>` | Required | Bank | List<String> getBank() | setBank(List<String> bank) |
| `Retries` | `int` | Required | Number of retries for processing | int getRetries() | setRetries(int retries) |

## Example (as JSON)

```json
{
  "bank": [
    "bank7",
    "bank8",
    "bank9"
  ],
  "retries": 56
}
```

