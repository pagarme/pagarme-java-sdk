
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
  "statement_descriptor": null,
  "authentication": null
}
```

