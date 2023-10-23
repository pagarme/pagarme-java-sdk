
# Create Bank Transfer Payment Request

Request for creating a bank transfer payment

## Structure

`CreateBankTransferPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `String` | Required | Bank | String getBank() | setBank(String bank) |
| `Retries` | `int` | Required | Number of retries | int getRetries() | setRetries(int retries) |

## Example (as JSON)

```json
{
  "bank": "bank4",
  "retries": 188
}
```

