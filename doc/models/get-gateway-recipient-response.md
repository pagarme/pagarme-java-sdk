
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

## Example (as JSON)

```json
{
  "gateway": "gateway2",
  "status": "status4",
  "pgid": "pgid8",
  "created_at": "created_at0",
  "updated_at": "updated_at8"
}
```

