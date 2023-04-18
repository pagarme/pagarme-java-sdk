
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
  "update_subscription": null,
  "payment_method": null,
  "credit_card": {
    "installments": 1,
    "capture": true,
    "recurrency_cycle": "\"first\" or \"subsequent\""
  },
  "debit_card": null,
  "boleto": null,
  "voucher": {
    "recurrency_cycle": "\"first\" or \"subsequent\""
  },
  "cash": null,
  "bank_transfer": null,
  "private_label": {
    "installments": 1,
    "capture": true,
    "recurrency_cycle": "\"first\" or \"subsequent\""
  }
}
```

