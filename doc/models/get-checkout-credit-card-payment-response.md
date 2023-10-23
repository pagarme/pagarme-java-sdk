
# Get Checkout Credit Card Payment Response

## Structure

`GetCheckoutCreditCardPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Descrição na fatura | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Installments` | [`List<GetCheckoutCardInstallmentOptionsResponse>`](../../doc/models/get-checkout-card-installment-options-response.md) | Optional | Parcelas | List<GetCheckoutCardInstallmentOptionsResponse> getInstallments() | setInstallments(List<GetCheckoutCardInstallmentOptionsResponse> installments) |
| `Authentication` | [`GetPaymentAuthenticationResponse`](../../doc/models/get-payment-authentication-response.md) | Optional | Payment Authentication response | GetPaymentAuthenticationResponse getAuthentication() | setAuthentication(GetPaymentAuthenticationResponse authentication) |

## Example (as JSON)

```json
{
  "statementDescriptor": "statementDescriptor8",
  "installments": [
    {
      "number": "number2",
      "total": 16
    }
  ],
  "authentication": {
    "type": "type2",
    "threed_secure": {
      "mpi": "mpi0",
      "eci": "eci2",
      "cavv": "cavv8",
      "transaction_Id": "transaction_Id2",
      "success_url": "success_url4"
    }
  }
}
```

