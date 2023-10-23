
# Get Checkout Payment Response

Resposta das configurações de pagamento do checkout

## Structure

`GetCheckoutPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Amount` | `Integer` | Optional | Valor em centavos | Integer getAmount() | setAmount(Integer amount) |
| `DefaultPaymentMethod` | `String` | Optional | Meio de pagamento padrão no checkout | String getDefaultPaymentMethod() | setDefaultPaymentMethod(String defaultPaymentMethod) |
| `SuccessUrl` | `String` | Optional | Url de redirecionamento de sucesso após o checkou | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `PaymentUrl` | `String` | Optional | Url para pagamento usando o checkout | String getPaymentUrl() | setPaymentUrl(String paymentUrl) |
| `GatewayAffiliationId` | `String` | Optional | Código da afiliação onde o pagamento será processado no gateway | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `AcceptedPaymentMethods` | `List<String>` | Optional | Meios de pagamento aceitos no checkout | List<String> getAcceptedPaymentMethods() | setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) |
| `Status` | `String` | Optional | Status do checkout | String getStatus() | setStatus(String status) |
| `SkipCheckoutSuccessPage` | `Boolean` | Optional | Pular tela de sucesso pós-pagamento? | Boolean getSkipCheckoutSuccessPage() | setSkipCheckoutSuccessPage(Boolean skipCheckoutSuccessPage) |
| `CreatedAt` | `LocalDateTime` | Optional | Data de criação | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Data de atualização | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `CanceledAt` | `LocalDateTime` | Optional | Data de cancelamento | LocalDateTime getCanceledAt() | setCanceledAt(LocalDateTime canceledAt) |
| `CustomerEditable` | `Boolean` | Optional | Torna o objeto customer editável | Boolean getCustomerEditable() | setCustomerEditable(Boolean customerEditable) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | Dados do comprador | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Billingaddress` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Optional | Dados do endereço de cobrança | GetAddressResponse getBillingaddress() | setBillingaddress(GetAddressResponse billingaddress) |
| `CreditCard` | [`GetCheckoutCreditCardPaymentResponse`](../../doc/models/get-checkout-credit-card-payment-response.md) | Optional | Configurações de cartão de crédito | GetCheckoutCreditCardPaymentResponse getCreditCard() | setCreditCard(GetCheckoutCreditCardPaymentResponse creditCard) |
| `Boleto` | [`GetCheckoutBoletoPaymentResponse`](../../doc/models/get-checkout-boleto-payment-response.md) | Optional | Configurações de boleto | GetCheckoutBoletoPaymentResponse getBoleto() | setBoleto(GetCheckoutBoletoPaymentResponse boleto) |
| `BillingAddressEditable` | `Boolean` | Optional | Indica se o billing address poderá ser editado | Boolean getBillingAddressEditable() | setBillingAddressEditable(Boolean billingAddressEditable) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Optional | Configurações  de entrega | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Shippable` | `Boolean` | Optional | Indica se possui entrega | Boolean getShippable() | setShippable(Boolean shippable) |
| `ClosedAt` | `LocalDateTime` | Optional | Data de fechamento | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `ExpiresAt` | `LocalDateTime` | Optional | Data de expiração | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `Currency` | `String` | Optional | Moeda | String getCurrency() | setCurrency(String currency) |
| `DebitCard` | [`GetCheckoutDebitCardPaymentResponse`](../../doc/models/get-checkout-debit-card-payment-response.md) | Optional | Configurações de cartão de débito | GetCheckoutDebitCardPaymentResponse getDebitCard() | setDebitCard(GetCheckoutDebitCardPaymentResponse debitCard) |
| `BankTransfer` | [`GetCheckoutBankTransferPaymentResponse`](../../doc/models/get-checkout-bank-transfer-payment-response.md) | Optional | Bank transfer payment response | GetCheckoutBankTransferPaymentResponse getBankTransfer() | setBankTransfer(GetCheckoutBankTransferPaymentResponse bankTransfer) |
| `AcceptedBrands` | `List<String>` | Optional | Accepted Brands | List<String> getAcceptedBrands() | setAcceptedBrands(List<String> acceptedBrands) |
| `Pix` | [`GetCheckoutPixPaymentResponse`](../../doc/models/get-checkout-pix-payment-response.md) | Optional | Pix payment response | GetCheckoutPixPaymentResponse getPix() | setPix(GetCheckoutPixPaymentResponse pix) |

## Example (as JSON)

```json
{
  "id": "id6",
  "amount": 148,
  "default_payment_method": "default_payment_method6",
  "success_url": "success_url8",
  "payment_url": "payment_url0"
}
```

