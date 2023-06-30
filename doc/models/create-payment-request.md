
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
| `PrivateLabel` | [`CreatePrivateLabelPaymentRequest`](../../doc/models/create-private-label-payment-request.md) | Optional | Settings for private label payment | CreatePrivateLabelPaymentRequest getPrivateLabel() | setPrivateLabel(CreatePrivateLabelPaymentRequest privateLabel) |
| `Pix` | [`CreatePixPaymentRequest`](../../doc/models/create-pix-payment-request.md) | Optional | Settings for pix payment | CreatePixPaymentRequest getPix() | setPix(CreatePixPaymentRequest pix) |

## Example (as JSON)

```json
{
  "payment_method": "payment_method0",
  "credit_card": {
    "installments": 52,
    "statement_descriptor": "statement_descriptor8",
    "card": {
      "number": "number0",
      "holder_name": "holder_name8",
      "exp_month": 54,
      "exp_year": 242,
      "cvv": "cvv0"
    },
    "card_id": "card_id4",
    "card_token": "card_token2"
  },
  "debit_card": {
    "statement_descriptor": "statement_descriptor4",
    "card": {
      "number": "number0",
      "holder_name": "holder_name8",
      "exp_month": 104,
      "exp_year": 192,
      "cvv": "cvv0"
    },
    "card_id": "card_id0",
    "card_token": "card_token6",
    "recurrence": false
  },
  "boleto": {
    "retries": 226,
    "bank": "bank8",
    "instructions": "instructions2",
    "due_at": "2016-03-13T12:52:32.123Z",
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
    "nosso_numero": "nosso_numero0",
    "document_number": "document_number6",
    "statement_descriptor": "statement_descriptor0",
    "interest": {
      "days": 160,
      "type": "type0",
      "amount": 234
    }
  },
  "currency": "currency0",
  "voucher": {
    "statement_descriptor": "statement_descriptor2",
    "card_id": "card_id8",
    "card_token": "card_token8",
    "Card": {
      "number": "number0",
      "holder_name": "holder_name8",
      "exp_month": 198,
      "exp_year": 238,
      "cvv": "cvv0"
    },
    "recurrency_cycle": "recurrency_cycle6"
  }
}
```

