
# Create Sub Merchant Request

SubMerchant

## Structure

`CreateSubMerchantRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentFacilitatorCode` | `String` | Required | Payment Facilitator Code | String getPaymentFacilitatorCode() | setPaymentFacilitatorCode(String paymentFacilitatorCode) |
| `Code` | `String` | Required | Code | String getCode() | setCode(String code) |
| `Name` | `String` | Required | Name | String getName() | setName(String name) |
| `MerchantCategoryCode` | `String` | Required | Merchant Category Code | String getMerchantCategoryCode() | setMerchantCategoryCode(String merchantCategoryCode) |
| `Document` | `String` | Required | Document number. Only numbers, no special characters. | String getDocument() | setDocument(String document) |
| `Type` | `String` | Required | Document type. Can be either 'individual' or 'company' | String getType() | setType(String type) |
| `Phone` | [`CreatePhoneRequest`](../../doc/models/create-phone-request.md) | Required | Phone | CreatePhoneRequest getPhone() | setPhone(CreatePhoneRequest phone) |
| `Address` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Address | CreateAddressRequest getAddress() | setAddress(CreateAddressRequest address) |
| `LegalName` | `String` | Required | Legal name | String getLegalName() | setLegalName(String legalName) |
| `SiteUrl` | `String` | Required | Site Url | String getSiteUrl() | setSiteUrl(String siteUrl) |

## Example

```java
import me.pagar.api.models.CreateSubMerchantRequest;

CreateSubMerchantRequest createSubMerchantRequest = new CreateSubMerchantRequest.Builder(
    "payment_facilitator_code2",
    "code2",
    "name4",
    "merchant_category_code4",
    "document2",
    "type6",
    null,
    null,
    "legal_name2",
    "site_url6"
)
.build();
```

