
# Create Capture Charge Request

Request for capturing a charge

## Structure

`CreateCaptureChargeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Code for the charge. Sending this field will update the code send on the charge and order creation. | String getCode() | setCode(String code) |
| `Amount` | `Integer` | Optional | The amount that will be captured | Integer getAmount() | setAmount(Integer amount) |
| `Split` | [`List<CreateSplitRequest>`](../../doc/models/create-split-request.md) | Optional | Splits | List<CreateSplitRequest> getSplit() | setSplit(List<CreateSplitRequest> split) |
| `OperationReference` | `String` | Required | - | String getOperationReference() | setOperationReference(String operationReference) |

## Example (as JSON)

```json
{
  "code": "code8",
  "amount": null,
  "split": null,
  "operation_reference": "operation_reference0"
}
```

