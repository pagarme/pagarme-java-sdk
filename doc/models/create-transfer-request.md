
# Create Transfer Request

Request for creating a transfer

## Structure

`CreateTransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Transfer amount | int getAmount() | setAmount(int amount) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "amount": 148,
  "metadata": {
    "key0": "metadata7",
    "key1": "metadata8",
    "key2": "metadata9"
  }
}
```

