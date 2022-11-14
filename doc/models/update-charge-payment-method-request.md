
# Update Charge Payment Method Request

Request for updating the payment method of a charge

## Structure

`UpdateChargePaymentMethodRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpdateSubscription` | `boolean` | Required | Indicates if the payment method from the subscription must also be updated | boolean getUpdateSubscription() | setUpdateSubscription(boolean updateSubscription) |
| `PaymentMethod` | `String` | Required | The new payment method | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `CreditCard` | [`CreateCreditCardPaymentRequest`](../../doc/models/create-credit-card-payment-request.md) | Required | Credit card data | CreateCreditCardPaymentRequest getCreditCard() | setCreditCard(CreateCreditCardPaymentRequest creditCard) |
| `DebitCard` | [`CreateDebitCardPaymentRequest`](../../doc/models/create-debit-card-payment-request.md) | Required | Debit card data | CreateDebitCardPaymentRequest getDebitCard() | setDebitCard(CreateDebitCardPaymentRequest debitCard) |
| `Boleto` | [`CreateBoletoPaymentRequest`](../../doc/models/create-boleto-payment-request.md) | Required | Boleto data | CreateBoletoPaymentRequest getBoleto() | setBoleto(CreateBoletoPaymentRequest boleto) |
| `Voucher` | [`CreateVoucherPaymentRequest`](../../doc/models/create-voucher-payment-request.md) | Required | Voucher data | CreateVoucherPaymentRequest getVoucher() | setVoucher(CreateVoucherPaymentRequest voucher) |
| `Cash` | [`CreateCashPaymentRequest`](../../doc/models/create-cash-payment-request.md) | Required | Cash data | CreateCashPaymentRequest getCash() | setCash(CreateCashPaymentRequest cash) |
| `BankTransfer` | [`CreateBankTransferPaymentRequest`](../../doc/models/create-bank-transfer-payment-request.md) | Required | Bank Transfer data | CreateBankTransferPaymentRequest getBankTransfer() | setBankTransfer(CreateBankTransferPaymentRequest bankTransfer) |
| `PrivateLabel` | [`CreatePrivateLabelPaymentRequest`](../../doc/models/create-private-label-payment-request.md) | Required | - | CreatePrivateLabelPaymentRequest getPrivateLabel() | setPrivateLabel(CreatePrivateLabelPaymentRequest privateLabel) |

## Example (as JSON)

```json
{
  "update_subscription": false,
  "payment_method": "payment_method0",
  "credit_card": {
    "installments": null,
    "statement_descriptor": null,
    "card": null,
    "card_id": null,
    "card_token": null,
    "recurrence": null,
    "capture": null,
    "extended_limit_enabled": null,
    "extended_limit_code": null,
    "merchant_category_code": null,
    "authentication": null,
    "contactless": null,
    "auto_recovery": null,
    "operation_type": null,
    "recurrency_cycle": null
  },
  "debit_card": {
    "statement_descriptor": null,
    "card": null,
    "card_id": null,
    "card_token": null,
    "recurrence": null,
    "authentication": null,
    "token": null
  },
  "boleto": {
    "retries": 226,
    "bank": "bank8",
    "instructions": "instructions2",
    "due_at": null,
    "billing_address": {
      "street": "street8",
      "number": "number4",
      "zip_code": "zip_code2",
      "neighborhood": "neighborhood4",
      "city": "city2",
      "state": "state6",
      "country": "country2",
      "complement": "complement6",
      "metadata": {
        "key0": "metadata5"
      },
      "line_1": "line_18",
      "line_2": "line_26"
    },
    "billing_address_id": "billing_address_id6",
    "nosso_numero": null,
    "document_number": "document_number6",
    "statement_descriptor": "statement_descriptor0",
    "interest": null,
    "fine": null,
    "max_days_to_pay_past_due": null
  },
  "voucher": {
    "statement_descriptor": null,
    "card_id": null,
    "card_token": null,
    "Card": null,
    "recurrency_cycle": null
  },
  "cash": {
    "description": "description0",
    "confirm": false
  },
  "bank_transfer": {
    "bank": "bank0",
    "retries": 236
  },
  "private_label": {
    "installments": null,
    "statement_descriptor": null,
    "card": null,
    "card_id": null,
    "card_token": null,
    "recurrence": null,
    "capture": null,
    "extended_limit_enabled": null,
    "extended_limit_code": null,
    "recurrency_cycle": null
  }
}
```

