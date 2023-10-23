
# Update Recipient Request

Request for updating a Recipient

## Structure

`UpdateRecipientRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name | String getName() | setName(String name) |
| `Email` | `String` | Required | Email | String getEmail() | setEmail(String email) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "name": "name0",
  "email": "email6",
  "description": "description0",
  "type": "type0",
  "status": "status8",
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4"
  }
}
```

