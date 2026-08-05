
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

## Example

```java
import me.pagar.api.models.CreateTransferSettingsRequest;

CreateTransferSettingsRequest createTransferSettingsRequest = new CreateTransferSettingsRequest.Builder(
    false,
    "transfer_interval2",
    128
)
.build();
```

