
# Create Cancel Charge Request

Request for canceling a charge.

## Structure

`CreateCancelChargeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | The amount that will be canceled. | Integer getAmount() | setAmount(Integer amount) |
| `SplitRules` | [`List<CreateCancelChargeSplitRulesRequest>`](../../doc/models/create-cancel-charge-split-rules-request.md) | Optional | The split rules request | List<CreateCancelChargeSplitRulesRequest> getSplitRules() | setSplitRules(List<CreateCancelChargeSplitRulesRequest> splitRules) |
| `Split` | [`List<CreateSplitRequest>`](../../doc/models/create-split-request.md) | Optional | Splits | List<CreateSplitRequest> getSplit() | setSplit(List<CreateSplitRequest> split) |
| `OperationReference` | `String` | Required | - | String getOperationReference() | setOperationReference(String operationReference) |
| `BankAccount` | [`CreateBankAccountRefundingDTO`](../../doc/models/create-bank-account-refunding-dto.md) | Optional | - | CreateBankAccountRefundingDTO getBankAccount() | setBankAccount(CreateBankAccountRefundingDTO bankAccount) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateCancelChargeRequest;
import me.pagar.api.models.CreateCancelChargeSplitRulesRequest;
import me.pagar.api.models.CreateSplitRequest;

CreateCancelChargeRequest createCancelChargeRequest = new CreateCancelChargeRequest.Builder(
    "operation_reference0"
)
.amount(222)
.splitRules(Arrays.asList(
        null,
        new CreateCancelChargeSplitRulesRequest.Builder(
            null,
            0,
            null
        )
        .build(),
        new CreateCancelChargeSplitRulesRequest.Builder(
            null,
            0,
            null
        )
        .build()
    ))
.split(Arrays.asList(
        null,
        new CreateSplitRequest.Builder(
            null,
            0,
            null
        )
        .build(),
        new CreateSplitRequest.Builder(
            null,
            0,
            null
        )
        .build()
    ))
.bankAccount(null)
.build();
```

