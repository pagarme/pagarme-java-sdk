
# Get Checkout Credit Card Payment Response

## Structure

`GetCheckoutCreditCardPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Required | Descrição na fatura | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Installments` | [`List<GetCheckoutCardInstallmentOptionsResponse>`](../../doc/models/get-checkout-card-installment-options-response.md) | Required | Parcelas | List<GetCheckoutCardInstallmentOptionsResponse> getInstallments() | setInstallments(List<GetCheckoutCardInstallmentOptionsResponse> installments) |
| `Authentication` | [`GetPaymentAuthenticationResponse`](../../doc/models/get-payment-authentication-response.md) | Required | Payment Authentication response | GetPaymentAuthenticationResponse getAuthentication() | setAuthentication(GetPaymentAuthenticationResponse authentication) |

## Example (as JSON)

```json
{
  "statementDescriptor": "statementDescriptor6",
  "installments": [
    {
      "number": "number3",
      "total": 109
    },
    {
      "number": "number4",
      "total": 110
    },
    {
      "number": "number5",
      "total": 111
    }
  ],
  "authentication": {
    "type": "type2",
    "threed_secure": {
      "mpi": "mpi6",
      "eci": "eci6",
      "cavv": "cavv2",
      "transaction_Id": "transaction_Id8",
      "success_url": "success_url8"
    }
  }
}
```

