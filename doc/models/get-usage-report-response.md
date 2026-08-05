
# Get Usage Report Response

## Structure

`GetUsageReportResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `UsageReportUrl` | `String` | Optional | - | String getUsageReportUrl() | setUsageReportUrl(String usageReportUrl) |
| `GroupedReportUrl` | `String` | Optional | - | String getGroupedReportUrl() | setGroupedReportUrl(String groupedReportUrl) |

## Example

```java
import me.pagar.api.models.GetUsageReportResponse;

GetUsageReportResponse getUsageReportResponse = new GetUsageReportResponse.Builder()
    .url("url2")
    .usageReportUrl("usage_report_url0")
    .groupedReportUrl("grouped_report_url0")
    .build();
```

