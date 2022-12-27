
# Get Setup Response

Response object for getting the setup from a subscription

## Structure

`GetSetupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Amount` | `Integer` | Required | - | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "id": "id0",
  "description": "description0",
  "amount": 46,
  "status": "status8"
}
```

