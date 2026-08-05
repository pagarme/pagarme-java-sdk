
# Get Setup Response

Response object for getting the setup from a subscription

## Structure

`GetSetupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |

## Example

```java
import me.pagar.api.models.GetSetupResponse;

GetSetupResponse getSetupResponse = new GetSetupResponse.Builder()
    .id("id6")
    .description("description6")
    .amount(108)
    .status("status8")
    .build();
```

