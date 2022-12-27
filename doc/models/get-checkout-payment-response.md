
# Get Checkout Payment Response

Resposta das configurações de pagamento do checkout

## Structure

`GetCheckoutPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Amount` | `Integer` | Optional | Valor em centavos | Integer getAmount() | setAmount(Integer amount) |
| `DefaultPaymentMethod` | `String` | Required | Meio de pagamento padrão no checkout | String getDefaultPaymentMethod() | setDefaultPaymentMethod(String defaultPaymentMethod) |
| `SuccessUrl` | `String` | Required | Url de redirecionamento de sucesso após o checkou | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `PaymentUrl` | `String` | Required | Url para pagamento usando o checkout | String getPaymentUrl() | setPaymentUrl(String paymentUrl) |
| `GatewayAffiliationId` | `String` | Required | Código da afiliação onde o pagamento será processado no gateway | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `AcceptedPaymentMethods` | `List<String>` | Required | Meios de pagamento aceitos no checkout | List<String> getAcceptedPaymentMethods() | setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) |
| `Status` | `String` | Required | Status do checkout | String getStatus() | setStatus(String status) |
| `SkipCheckoutSuccessPage` | `Boolean` | Required | Pular tela de sucesso pós-pagamento? | Boolean getSkipCheckoutSuccessPage() | setSkipCheckoutSuccessPage(Boolean skipCheckoutSuccessPage) |
| `CreatedAt` | `LocalDateTime` | Required | Data de criação | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | Data de atualização | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `CanceledAt` | `LocalDateTime` | Optional | Data de cancelamento | LocalDateTime getCanceledAt() | setCanceledAt(LocalDateTime canceledAt) |
| `CustomerEditable` | `Boolean` | Required | Torna o objeto customer editável | Boolean getCustomerEditable() | setCustomerEditable(Boolean customerEditable) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | Dados do comprador | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Billingaddress` | [`GetAddressResponse`](../../doc/models/get-address-response.md) | Required | Dados do endereço de cobrança | GetAddressResponse getBillingaddress() | setBillingaddress(GetAddressResponse billingaddress) |
| `CreditCard` | [`GetCheckoutCreditCardPaymentResponse`](../../doc/models/get-checkout-credit-card-payment-response.md) | Required | Configurações de cartão de crédito | GetCheckoutCreditCardPaymentResponse getCreditCard() | setCreditCard(GetCheckoutCreditCardPaymentResponse creditCard) |
| `Boleto` | [`GetCheckoutBoletoPaymentResponse`](../../doc/models/get-checkout-boleto-payment-response.md) | Required | Configurações de boleto | GetCheckoutBoletoPaymentResponse getBoleto() | setBoleto(GetCheckoutBoletoPaymentResponse boleto) |
| `BillingAddressEditable` | `Boolean` | Required | Indica se o billing address poderá ser editado | Boolean getBillingAddressEditable() | setBillingAddressEditable(Boolean billingAddressEditable) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Required | Configurações  de entrega | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Shippable` | `Boolean` | Required | Indica se possui entrega | Boolean getShippable() | setShippable(Boolean shippable) |
| `ClosedAt` | `LocalDateTime` | Optional | Data de fechamento | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `ExpiresAt` | `LocalDateTime` | Optional | Data de expiração | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `Currency` | `String` | Required | Moeda | String getCurrency() | setCurrency(String currency) |
| `DebitCard` | [`GetCheckoutDebitCardPaymentResponse`](../../doc/models/get-checkout-debit-card-payment-response.md) | Optional | Configurações de cartão de débito | GetCheckoutDebitCardPaymentResponse getDebitCard() | setDebitCard(GetCheckoutDebitCardPaymentResponse debitCard) |
| `BankTransfer` | [`GetCheckoutBankTransferPaymentResponse`](../../doc/models/get-checkout-bank-transfer-payment-response.md) | Optional | Bank transfer payment response | GetCheckoutBankTransferPaymentResponse getBankTransfer() | setBankTransfer(GetCheckoutBankTransferPaymentResponse bankTransfer) |
| `AcceptedBrands` | `List<String>` | Required | Accepted Brands | List<String> getAcceptedBrands() | setAcceptedBrands(List<String> acceptedBrands) |
| `Pix` | [`GetCheckoutPixPaymentResponse`](../../doc/models/get-checkout-pix-payment-response.md) | Optional | Pix payment response | GetCheckoutPixPaymentResponse getPix() | setPix(GetCheckoutPixPaymentResponse pix) |

## Example (as JSON)

```json
{
  "id": "id0",
  "amount": null,
  "default_payment_method": "default_payment_method0",
  "success_url": "success_url2",
  "payment_url": "payment_url6",
  "gateway_affiliation_id": "gateway_affiliation_id4",
  "accepted_payment_methods": [
    "accepted_payment_methods3",
    "accepted_payment_methods4",
    "accepted_payment_methods5"
  ],
  "status": "status8",
  "skip_checkout_success_page": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "canceled_at": null,
  "customer_editable": false,
  "customer": null,
  "billingaddress": {
    "id": "id8",
    "street": "street8",
    "number": "number6",
    "complement": "complement4",
    "zip_code": "zip_code2",
    "neighborhood": "neighborhood4",
    "city": "city8",
    "state": "state4",
    "country": "country2",
    "status": "status0",
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "customer": null,
    "metadata": {
      "key0": "metadata5"
    },
    "line_1": "line_18",
    "line_2": "line_26",
    "deleted_at": null
  },
  "credit_card": {
    "statementDescriptor": "statementDescriptor4",
    "installments": [
      {
        "number": "number1",
        "total": 167
      }
    ],
    "authentication": {
      "type": "type0",
      "threed_secure": {
        "mpi": "mpi0",
        "eci": "eci2",
        "cavv": "cavv8",
        "transaction_Id": "transaction_Id2",
        "success_url": "success_url4"
      }
    }
  },
  "boleto": {
    "due_at": "2016-03-13T12:52:32.123Z",
    "instructions": "instructions2"
  },
  "billing_address_editable": false,
  "shipping": {
    "amount": 52,
    "description": "description6",
    "recipient_name": "recipient_name2",
    "recipient_phone": "recipient_phone6",
    "address": {
      "id": "id0",
      "street": "street0",
      "number": "number8",
      "complement": "complement6",
      "zip_code": "zip_code4",
      "neighborhood": "neighborhood6",
      "city": "city0",
      "state": "state6",
      "country": "country4",
      "status": "status2",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "customer": null,
      "metadata": {
        "key0": "metadata7"
      },
      "line_1": "line_14",
      "line_2": "line_28",
      "deleted_at": null
    },
    "max_delivery_date": null,
    "estimated_delivery_date": null,
    "type": "type6"
  },
  "shippable": false,
  "closed_at": null,
  "expires_at": null,
  "currency": "currency0",
  "debit_card": null,
  "bank_transfer": null,
  "accepted_brands": [
    "accepted_brands8",
    "accepted_brands9"
  ],
  "pix": null
}
```

