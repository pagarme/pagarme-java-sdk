
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

## Example

```java
import me.pagar.api.models.CreateCardRequest;
import me.pagar.api.models.CreateCreditCardPaymentRequest;
import me.pagar.api.models.CreatePrivateLabelPaymentRequest;
import me.pagar.api.models.CreateVoucherPaymentRequest;
import me.pagar.api.models.UpdateChargePaymentMethodRequest;

UpdateChargePaymentMethodRequest updateChargePaymentMethodRequest = new UpdateChargePaymentMethodRequest.Builder(
    false,
    null,
    new CreateCreditCardPaymentRequest.Builder()
        .installments(1)
        .statementDescriptor("statement_descriptor8")
        .card(null)
        .cardId("card_id4")
        .cardToken("card_token2")
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    null,
    null,
    new CreateVoucherPaymentRequest.Builder()
        .statementDescriptor("statement_descriptor2")
        .cardId("card_id8")
        .cardToken("card_token8")
        .card(null)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    null,
    null,
    new CreatePrivateLabelPaymentRequest.Builder()
        .installments(1)
        .statementDescriptor("statement_descriptor0")
        .card(new CreateCardRequest.Builder()
            .build())
        .cardId("card_id6")
        .cardToken("card_token0")
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build()
)
.build();
```

