
# Create KYC Link Response

KYC Link

## Structure

`CreateKYCLinkResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base64` | `String` | Optional | Base64 | String getBase64() | setBase64(String base64) |
| `Url` | `String` | Optional | URL | String getUrl() | setUrl(String url) |
| `ExpirationDate` | `String` | Optional | Expiration Date | String getExpirationDate() | setExpirationDate(String expirationDate) |

## Example

```java
import me.pagar.api.models.CreateKYCLinkResponse;

CreateKYCLinkResponse createKYCLinkResponse = new CreateKYCLinkResponse.Builder()
    .base64("base648")
    .url("url4")
    .expirationDate("expiration_date4")
    .build();
```

