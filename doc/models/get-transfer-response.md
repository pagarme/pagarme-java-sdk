
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

## Example (as JSON)

```json
{
  "id": "id0",
  "amount": 46,
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

