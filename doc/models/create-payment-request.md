
# Create Payment Request

Payment data

## Structure

`CreatePaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentMethod` | `String` | Required | Payment method | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `CreditCard` | [`CreateCreditCardPaymentRequest`](../../doc/models/create-credit-card-payment-request.md) | Optional | Settings for credit card payment | CreateCreditCardPaymentRequest getCreditCard() | setCreditCard(CreateCreditCardPaymentRequest creditCard) |
| `DebitCard` | [`CreateDebitCardPaymentRequest`](../../doc/models/create-debit-card-payment-request.md) | Optional | Settings for debit card payment | CreateDebitCardPaymentRequest getDebitCard() | setDebitCard(CreateDebitCardPaymentRequest debitCard) |
| `Boleto` | [`CreateBoletoPaymentRequest`](../../doc/models/create-boleto-payment-request.md) | Optional | Settings for boleto payment | CreateBoletoPaymentRequest getBoleto() | setBoleto(CreateBoletoPaymentRequest boleto) |
| `Currency` | `String` | Optional | Currency. Must be informed using 3 characters | String getCurrency() | setCurrency(String currency) |
| `Voucher` | [`CreateVoucherPaymentRequest`](../../doc/models/create-voucher-payment-request.md) | Optional | Settings for voucher payment | CreateVoucherPaymentRequest getVoucher() | setVoucher(CreateVoucherPaymentRequest voucher) |
| `Split` | [`List<CreateSplitRequest>`](../../doc/models/create-split-request.md) | Optional | Splits | List<CreateSplitRequest> getSplit() | setSplit(List<CreateSplitRequest> split) |
| `BankTransfer` | [`CreateBankTransferPaymentRequest`](../../doc/models/create-bank-transfer-payment-request.md) | Optional | Settings for bank transfer payment | CreateBankTransferPaymentRequest getBankTransfer() | setBankTransfer(CreateBankTransferPaymentRequest bankTransfer) |
| `GatewayAffiliationId` | `String` | Optional | Gateway affiliation code | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `Amount` | `Integer` | Optional | The amount of the payment, in cents | Integer getAmount() | setAmount(Integer amount) |
| `Checkout` | [`CreateCheckoutPaymentRequest`](../../doc/models/create-checkout-payment-request.md) | Optional | Settings for checkout payment | CreateCheckoutPaymentRequest getCheckout() | setCheckout(CreateCheckoutPaymentRequest checkout) |
| `CustomerId` | `String` | Optional | Customer Id | String getCustomerId() | setCustomerId(String customerId) |
| `Customer` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Optional | Customer | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Cash` | [`CreateCashPaymentRequest`](../../doc/models/create-cash-payment-request.md) | Optional | Settings for cash payment | CreateCashPaymentRequest getCash() | setCash(CreateCashPaymentRequest cash) |
| `PrivateLabel` | [`CreatePrivateLabelPaymentRequest`](../../doc/models/create-private-label-payment-request.md) | Required | Settings for private label payment | CreatePrivateLabelPaymentRequest getPrivateLabel() | setPrivateLabel(CreatePrivateLabelPaymentRequest privateLabel) |
| `Pix` | [`CreatePixPaymentRequest`](../../doc/models/create-pix-payment-request.md) | Optional | Settings for pix payment | CreatePixPaymentRequest getPix() | setPix(CreatePixPaymentRequest pix) |

## Example (as JSON)

```json
{
  "payment_method": "payment_method0",
  "credit_card": null,
  "debit_card": null,
  "boleto": null,
  "currency": null,
  "voucher": null,
  "split": null,
  "bank_transfer": null,
  "gateway_affiliation_id": null,
  "amount": null,
  "checkout": null,
  "customer_id": null,
  "customer": null,
  "metadata": null,
  "cash": null,
  "private_label": {
    "installments": null,
    "statement_descriptor": null,
    "card": null,
    "card_id": null,
    "card_token": null,
    "recurrence": null,
    "capture": null,
    "extended_limit_enabled": null,
    "extended_limit_code": null
  },
  "pix": null
}
```

