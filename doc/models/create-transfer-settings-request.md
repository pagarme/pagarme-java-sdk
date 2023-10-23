
# Create Transfer Settings Request

Informações de transferência do recebedor

## Structure

`CreateTransferSettingsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransferEnabled` | `boolean` | Required | - | boolean getTransferEnabled() | setTransferEnabled(boolean transferEnabled) |
| `TransferInterval` | `String` | Required | - | String getTransferInterval() | setTransferInterval(String transferInterval) |
| `TransferDay` | `int` | Required | - | int getTransferDay() | setTransferDay(int transferDay) |

## Example (as JSON)

```json
{
  "transfer_enabled": false,
  "transfer_interval": "transfer_interval4",
  "transfer_day": 82
}
```

