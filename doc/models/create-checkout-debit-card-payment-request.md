
# Create Checkout Debit Card Payment Request

Checkout credit card payment request

## Structure

`CreateCheckoutDebitCardPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Card invoice text descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Authentication` | [`CreatePaymentAuthenticationRequest`](../../doc/models/create-payment-authentication-request.md) | Required | Creates payment authentication | CreatePaymentAuthenticationRequest getAuthentication() | setAuthentication(CreatePaymentAuthenticationRequest authentication) |

## Example (as JSON)

```json
{
  "statement_descriptor": null,
  "authentication": {
    "type": "type2",
    "threed_secure": {
      "mpi": "mpi6",
      "cavv": null,
      "eci": null,
      "transaction_id": null,
      "success_url": null,
      "ds_transaction_id": null,
      "version": null
    }
  }
}
```

