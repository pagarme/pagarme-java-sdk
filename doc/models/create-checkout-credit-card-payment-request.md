
# Create Checkout Credit Card Payment Request

Checkout card payment request

## Structure

`CreateCheckoutCreditCardPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Card invoice text descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Installments` | [`List<CreateCheckoutCardInstallmentOptionRequest>`](../../doc/models/create-checkout-card-installment-option-request.md) | Optional | Payment installment options | List<CreateCheckoutCardInstallmentOptionRequest> getInstallments() | setInstallments(List<CreateCheckoutCardInstallmentOptionRequest> installments) |
| `Authentication` | [`CreatePaymentAuthenticationRequest`](../../doc/models/create-payment-authentication-request.md) | Optional | Creates payment authentication | CreatePaymentAuthenticationRequest getAuthentication() | setAuthentication(CreatePaymentAuthenticationRequest authentication) |
| `Capture` | `Boolean` | Optional | Authorize and capture? | Boolean getCapture() | setCapture(Boolean capture) |

## Example (as JSON)

```json
{
  "statement_descriptor": "statement_descriptor0",
  "installments": [
    {
      "number": 217,
      "total": 109
    },
    {
      "number": 218,
      "total": 110
    },
    {
      "number": 219,
      "total": 111
    }
  ],
  "authentication": {
    "type": "type2",
    "threed_secure": {
      "mpi": "mpi6",
      "cavv": "cavv2",
      "eci": "eci6",
      "transaction_id": "transaction_id4",
      "success_url": "success_url8",
      "ds_transaction_id": "ds_transaction_id4"
    }
  },
  "capture": false
}
```

