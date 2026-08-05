
# Get Balance Response

Balance

## Structure

`GetBalanceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | Currency (official ISO 4217 currency names) | String getCurrency() | setCurrency(String currency) |
| `AvailableAmount` | `Long` | Optional | Amount available for transferring in cents | Long getAvailableAmount() | setAvailableAmount(Long availableAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `TransferredAmount` | `Long` | Optional | Amount transfered in cents | Long getTransferredAmount() | setTransferredAmount(Long transferredAmount) |
| `WaitingFundsAmount` | `Long` | Optional | Amount waiting in cents | Long getWaitingFundsAmount() | setWaitingFundsAmount(Long waitingFundsAmount) |
| `PaymentProfileId` | `String` | Required | Operational id of merchant in payments operations (new) | String getPaymentProfileId() | setPaymentProfileId(String paymentProfileId) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetBalanceResponse;
import me.pagar.api.models.GetRecipientResponse;

GetBalanceResponse getBalanceResponse = new GetBalanceResponse.Builder(
    "pp_abcdefghoj20klmn09k"
)
.currency("BRL")
.availableAmount(4996L)
.recipient(new GetRecipientResponse.Builder()
        .id("re_abcdefghoj20klmn09k")
        .name("Lojista Recebedor LTDA")
        .email("email@stone.com.br")
        .document("01032644222100")
        .description(null)
        .type(null)
        .status("active")
        .createdAt(DateTimeHelper.fromRfc8601DateTime("2026-06-22T19:13:52Z"))
        .updatedAt(null)
        .deletedAt(null)
        .code(null)
        .paymentMode(null)
        .build())
.transferredAmount(null)
.waitingFundsAmount(0L)
.build();
```

