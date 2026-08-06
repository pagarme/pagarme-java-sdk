
# Get Gateway Recipient Response

Information about the recipient on the gateway

## Structure

`GetGatewayRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Gateway` | `String` | Optional | Gateway name | String getGateway() | setGateway(String gateway) |
| `Status` | `String` | Optional | Status of the recipient on the gateway | String getStatus() | setStatus(String status) |
| `Pgid` | `String` | Optional | Recipient id on the gateway | String getPgid() | setPgid(String pgid) |
| `CreatedAt` | `String` | Optional | Creation date | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | Last update date | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example

```java
import me.pagar.api.models.GetGatewayRecipientResponse;

GetGatewayRecipientResponse getGatewayRecipientResponse = new GetGatewayRecipientResponse.Builder()
    .gateway("gateway0")
    .status("status2")
    .pgid("pgid6")
    .createdAt("created_at8")
    .updatedAt("updated_at6")
    .build();
```

