
# Get Transfer Response

Transfer response

## Structure

`GetTransferResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `Amount` | `Integer` | Optional | Transfer amount | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | Transfer status | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | Transfer creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Transfer last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `BankAccount` | [`GetBankAccountResponse`](../../doc/models/get-bank-account-response.md) | Optional | Bank account | GetBankAccountResponse getBankAccount() | setBankAccount(GetBankAccountResponse bankAccount) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetTransferResponse;

GetTransferResponse getTransferResponse = new GetTransferResponse.Builder()
    .id("id8")
    .amount(244)
    .status("status0")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .updatedAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

