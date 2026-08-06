
# Get Retry Transaction Information Response

Response object for getting an RetryTransactionInformation

## Structure

`GetRetryTransactionInformationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandFailureReturnCode` | `String` | Required | - | String getBrandFailureReturnCode() | setBrandFailureReturnCode(String brandFailureReturnCode) |
| `TransactionLimit` | `Integer` | Required | - | Integer getTransactionLimit() | setTransactionLimit(Integer transactionLimit) |
| `TransactionDateLimit` | `LocalDateTime` | Required | - | LocalDateTime getTransactionDateLimit() | setTransactionDateLimit(LocalDateTime transactionDateLimit) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetRetryTransactionInformationResponse;

GetRetryTransactionInformationResponse getRetryTransactionInformationResponse = new GetRetryTransactionInformationResponse.Builder(
    "brand_failure_return_code0",
    158,
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

