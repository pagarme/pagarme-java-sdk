
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

## Example (as JSON)

```json
{
  "amount": null,
  "split_rules": null,
  "split": null,
  "operation_reference": "operation_reference0"
}
```

