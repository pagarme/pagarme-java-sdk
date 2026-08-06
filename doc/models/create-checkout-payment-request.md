
# Create Checkout Payment Request

Checkout payment request

## Structure

`CreateCheckoutPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AcceptedPaymentMethods` | `List<String>` | Required | Accepted Payment Methods | List<String> getAcceptedPaymentMethods() | setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) |
| `AcceptedMultiPaymentMethods` | `List<Object>` | Required | Accepted Multi Payment Methods | List<Object> getAcceptedMultiPaymentMethods() | setAcceptedMultiPaymentMethods(List<Object> acceptedMultiPaymentMethods) |
| `SuccessUrl` | `String` | Required | Success url | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `DefaultPaymentMethod` | `String` | Optional | Default payment method | String getDefaultPaymentMethod() | setDefaultPaymentMethod(String defaultPaymentMethod) |
| `GatewayAffiliationId` | `String` | Optional | Gateway Affiliation Id | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `CreditCard` | [`CreateCheckoutCreditCardPaymentRequest`](../../doc/models/create-checkout-credit-card-payment-request.md) | Optional | Credit Card payment request | CreateCheckoutCreditCardPaymentRequest getCreditCard() | setCreditCard(CreateCheckoutCreditCardPaymentRequest creditCard) |
| `DebitCard` | [`CreateCheckoutDebitCardPaymentRequest`](../../doc/models/create-checkout-debit-card-payment-request.md) | Optional | Debit Card payment request | CreateCheckoutDebitCardPaymentRequest getDebitCard() | setDebitCard(CreateCheckoutDebitCardPaymentRequest debitCard) |
| `Boleto` | [`CreateCheckoutBoletoPaymentRequest`](../../doc/models/create-checkout-boleto-payment-request.md) | Optional | Boleto payment request | CreateCheckoutBoletoPaymentRequest getBoleto() | setBoleto(CreateCheckoutBoletoPaymentRequest boleto) |
| `CustomerEditable` | `Boolean` | Optional | Customer is editable? | Boolean getCustomerEditable() | setCustomerEditable(Boolean customerEditable) |
| `ExpiresIn` | `Integer` | Optional | Time in minutes for expiration | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |
| `SkipCheckoutSuccessPage` | `boolean` | Required | Skip postpay success screen? | boolean getSkipCheckoutSuccessPage() | setSkipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) |
| `BillingAddressEditable` | `boolean` | Required | Billing Address is editable? | boolean getBillingAddressEditable() | setBillingAddressEditable(boolean billingAddressEditable) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Billing Address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `BankTransfer` | [`CreateCheckoutBankTransferRequest`](../../doc/models/create-checkout-bank-transfer-request.md) | Optional | Bank Transfer payment request | CreateCheckoutBankTransferRequest getBankTransfer() | setBankTransfer(CreateCheckoutBankTransferRequest bankTransfer) |
| `AcceptedBrands` | `List<String>` | Required | Accepted Brands | List<String> getAcceptedBrands() | setAcceptedBrands(List<String> acceptedBrands) |
| `Pix` | [`CreateCheckoutPixPaymentRequest`](../../doc/models/create-checkout-pix-payment-request.md) | Optional | Pix payment request | CreateCheckoutPixPaymentRequest getPix() | setPix(CreateCheckoutPixPaymentRequest pix) |

## Example

```java
import java.io.IOException;
import java.util.Arrays;
import me.pagar.api.ApiHelper;
import me.pagar.api.models.CreateCheckoutPaymentRequest;

CreateCheckoutPaymentRequest createCheckoutPaymentRequest = new CreateCheckoutPaymentRequest.Builder(
    Arrays.asList(
        "accepted_payment_methods1"
    ),
    Arrays.asList(
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}")
    ),
    "success_url0",
    false,
    false,
    null,
    Arrays.asList(
        "accepted_brands6"
    )
)
.defaultPaymentMethod("default_payment_method8")
.gatewayAffiliationId("gateway_affiliation_id4")
.creditCard(null)
.debitCard(null)
.boleto(null)
.build();
```

