
# Create Bank Transfer Payment Request

Request for creating a bank transfer payment

## Structure

`CreateBankTransferPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `String` | Required | Bank | String getBank() | setBank(String bank) |
| `Retries` | `int` | Required | Number of retries | int getRetries() | setRetries(int retries) |

## Example

```java
import me.pagar.api.models.CreateBankTransferPaymentRequest;

CreateBankTransferPaymentRequest createBankTransferPaymentRequest = new CreateBankTransferPaymentRequest.Builder(
    "bank6",
    20
)
.build();
```

