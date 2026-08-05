
# Get Withdraw Source Response

## Structure

`GetWithdrawSourceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceId` | `String` | Optional | - | String getSourceId() | setSourceId(String sourceId) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.GetWithdrawSourceResponse;

GetWithdrawSourceResponse getWithdrawSourceResponse = new GetWithdrawSourceResponse.Builder()
    .sourceId("source_id6")
    .type("type8")
    .build();
```

