
# Create Withdraw Request

## Structure

`CreateWithdrawRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "amount": 204,
  "metadata": {
    "key0": "metadata7",
    "key1": "metadata6"
  }
}
```

