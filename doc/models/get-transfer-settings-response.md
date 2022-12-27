
# Get Transfer Settings Response

## Structure

`GetTransferSettingsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransferEnabled` | `Boolean` | Required | - | Boolean getTransferEnabled() | setTransferEnabled(Boolean transferEnabled) |
| `TransferInterval` | `String` | Required | - | String getTransferInterval() | setTransferInterval(String transferInterval) |
| `TransferDay` | `Integer` | Required | - | Integer getTransferDay() | setTransferDay(Integer transferDay) |

## Example (as JSON)

```json
{
  "transfer_enabled": false,
  "transfer_interval": "transfer_interval0",
  "transfer_day": 18
}
```

