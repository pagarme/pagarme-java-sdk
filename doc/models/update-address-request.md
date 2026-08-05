
# Update Address Request

Request for updating an address

## Structure

`UpdateAddressRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `String` | Required | Number | String getNumber() | setNumber(String number) |
| `Complement` | `String` | Required | Complement | String getComplement() | setComplement(String complement) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Line2` | `String` | Required | Line 2 for address | String getLine2() | setLine2(String line2) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.UpdateAddressRequest;

UpdateAddressRequest updateAddressRequest = new UpdateAddressRequest.Builder(
    "number8",
    "complement0",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata9");
    }},
    "line_22"
)
.build();
```

