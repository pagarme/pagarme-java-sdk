
# Create Register Information Corporation Request

## Structure

`CreateRegisterInformationCorporationRequest`

## Inherits From

[`CreateRegisterInformationBaseRequest`](../../doc/models/create-register-information-base-request.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompanyName` | `String` | Required | - | String getCompanyName() | setCompanyName(String companyName) |
| `TradingName` | `String` | Required | - | String getTradingName() | setTradingName(String tradingName) |
| `AnnualRevenue` | `long` | Required | - | long getAnnualRevenue() | setAnnualRevenue(long annualRevenue) |
| `CorporationType` | `String` | Optional | - | String getCorporationType() | setCorporationType(String corporationType) |
| `FoundingDate` | `String` | Optional | - | String getFoundingDate() | setFoundingDate(String foundingDate) |
| `Cnae` | `String` | Optional | - | String getCnae() | setCnae(String cnae) |
| `ManagingPartners` | [`List<CreateManagingPartnerRequest>`](../../doc/models/create-managing-partner-request.md) | Required | - | List<CreateManagingPartnerRequest> getManagingPartners() | setManagingPartners(List<CreateManagingPartnerRequest> managingPartners) |
| `MainAddress` | [`CreateRegisterInformationAddressRequest`](../../doc/models/create-register-information-address-request.md) | Required | - | CreateRegisterInformationAddressRequest getMainAddress() | setMainAddress(CreateRegisterInformationAddressRequest mainAddress) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateManagingPartnerRequest;
import me.pagar.api.models.CreateRegisterInformationCorporationRequest;

CreateRegisterInformationCorporationRequest createRegisterInformationCorporationRequest = new CreateRegisterInformationCorporationRequest.Builder(
    null,
    null,
    null,
    Arrays.asList(
        null
    ),
    null,
    null,
    0L,
    Arrays.asList(
        new CreateManagingPartnerRequest.Builder(
            null,
            null,
            null,
            null,
            0L,
            null,
            false,
            null,
            Arrays.asList(
                null
            )
        )
        .motherName("mother_name0")
        .build()
    ),
    null
)
.corporationType("corporation_type0")
.foundingDate("founding_date0")
.cnae("cnae0")
.siteUrl("site_url4")
.build();
```

