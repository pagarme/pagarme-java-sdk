
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

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.UpdateRecipientRequest;

UpdateRecipientRequest updateRecipientRequest = new UpdateRecipientRequest.Builder(
    "name4",
    "email2",
    "description4",
    "type4",
    "status6",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata1");
        put("key1", "metadata0");
    }}
)
.build();
```

