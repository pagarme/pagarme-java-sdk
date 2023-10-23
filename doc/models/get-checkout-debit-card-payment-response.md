
# Get Checkout Debit Card Payment Response

## Structure

`GetCheckoutDebitCardPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Descrição na fatura | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Authentication` | [`GetPaymentAuthenticationResponse`](../../doc/models/get-payment-authentication-response.md) | Optional | Payment Authentication response object data | GetPaymentAuthenticationResponse getAuthentication() | setAuthentication(GetPaymentAuthenticationResponse authentication) |

## Example (as JSON)

```json
{
  "statement_descriptor": "statement_descriptor6",
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

