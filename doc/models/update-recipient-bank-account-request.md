
# Update Recipient Bank Account Request

Updates the default bank account for a recipient

## Structure

`UpdateRecipientBankAccountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankAccount` | [`CreateBankAccountRequest`](../../doc/models/create-bank-account-request.md) | Required | Bank account | CreateBankAccountRequest getBankAccount() | setBankAccount(CreateBankAccountRequest bankAccount) |
| `PaymentMode` | `String` | Required | Payment mode<br><br>**Default**: `"bank_transfer"` | String getPaymentMode() | setPaymentMode(String paymentMode) |

## Example

```java
import me.pagar.api.models.UpdateRecipientBankAccountRequest;

UpdateRecipientBankAccountRequest updateRecipientBankAccountRequest = new UpdateRecipientBankAccountRequest.Builder(
    null,
    "bank_transfer"
)
.build();
```

