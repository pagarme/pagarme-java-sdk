# Charges

```java
ChargesController chargesController = client.getChargesController();
```

## Class Name

`ChargesController`

## Methods

* [Update Charge Metadata](../../doc/controllers/charges.md#update-charge-metadata)
* [Update Charge Payment Method](../../doc/controllers/charges.md#update-charge-payment-method)
* [Update Charge Card](../../doc/controllers/charges.md#update-charge-card)
* [Get Charges Summary](../../doc/controllers/charges.md#get-charges-summary)
* [Create Charge](../../doc/controllers/charges.md#create-charge)
* [Get Charge Transactions](../../doc/controllers/charges.md#get-charge-transactions)
* [Capture Charge](../../doc/controllers/charges.md#capture-charge)
* [Get Charge](../../doc/controllers/charges.md#get-charge)
* [Cancel Charge](../../doc/controllers/charges.md#cancel-charge)
* [Get Charges](../../doc/controllers/charges.md#get-charges)
* [Confirm Payment](../../doc/controllers/charges.md#confirm-payment)
* [Update Charge Due Date](../../doc/controllers/charges.md#update-charge-due-date)
* [Retry Charge](../../doc/controllers/charges.md#retry-charge)


# Update Charge Metadata

Updates the metadata from a charge

```java
GetChargeResponse updateChargeMetadata(
    final String chargeId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | The charge id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the charge metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest();
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


try {
    GetChargeResponse response = chargesController.updateChargeMetadata(chargeId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Payment Method

Updates a charge's payment method

```java
GetChargeResponse updateChargePaymentMethod(
    final String chargeId,
    final UpdateChargePaymentMethodRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargePaymentMethodRequest`](../../doc/models/update-charge-payment-method-request.md) | Body, Required | Request for updating the payment method from a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargePaymentMethodRequest request = new UpdateChargePaymentMethodRequest();
request.setUpdateSubscription(false);
request.setPaymentMethod("payment_method4");
CreateCreditCardPaymentRequest creditCard = new CreateCreditCardPaymentRequest();

request.setCreditCard(creditCard);
CreateDebitCardPaymentRequest debitCard = new CreateDebitCardPaymentRequest();

request.setDebitCard(debitCard);
CreateBoletoPaymentRequest boleto = new CreateBoletoPaymentRequest();
boleto.setRetries(10);
boleto.setBank("bank4");
boleto.setInstructions("instructions4");
CreateAddressRequest billingAddress = new CreateAddressRequest();
billingAddress.setStreet("street8");
billingAddress.setNumber("number4");
billingAddress.setZipCode("zip_code2");
billingAddress.setNeighborhood("neighborhood4");
billingAddress.setCity("city2");
billingAddress.setState("state6");
billingAddress.setCountry("country2");
billingAddress.setComplement("complement6");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata5");

billingAddress.setMetadata(metadata);
billingAddress.setLine1("line_18");
billingAddress.setLine2("line_26");

boleto.setBillingAddress(billingAddress);
boleto.setBillingAddressId("billing_address_id2");
boleto.setDocumentNumber("document_number0");
boleto.setStatementDescriptor("statement_descriptor6");

request.setBoleto(boleto);
CreateVoucherPaymentRequest voucher = new CreateVoucherPaymentRequest();

request.setVoucher(voucher);
CreateCashPaymentRequest cash = new CreateCashPaymentRequest();
cash.setDescription("description6");
cash.setConfirm(false);

request.setCash(cash);
CreateBankTransferPaymentRequest bankTransfer = new CreateBankTransferPaymentRequest();
bankTransfer.setBank("bank4");
bankTransfer.setRetries(204);

request.setBankTransfer(bankTransfer);
CreatePrivateLabelPaymentRequest privateLabel = new CreatePrivateLabelPaymentRequest();

request.setPrivateLabel(privateLabel);


try {
    GetChargeResponse response = chargesController.updateChargePaymentMethod(chargeId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Card

Updates the card from a charge

```java
GetChargeResponse updateChargeCard(
    final String chargeId,
    final UpdateChargeCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargeCardRequest`](../../doc/models/update-charge-card-request.md) | Body, Required | Request for updating a charge's card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeCardRequest request = new UpdateChargeCardRequest();
request.setUpdateSubscription(false);
request.setCardId("card_id2");
CreateCardRequest card = new CreateCardRequest();
card.setNumber("number2");
card.setHolderName("holder_name6");
card.setExpMonth(80);
card.setExpYear(216);
card.setCvv("cvv8");
CreateAddressRequest billingAddress = new CreateAddressRequest();
billingAddress.setStreet("street2");
billingAddress.setNumber("number0");
billingAddress.setZipCode("zip_code6");
billingAddress.setNeighborhood("neighborhood8");
billingAddress.setCity("city8");
billingAddress.setState("state2");
billingAddress.setCountry("country6");
billingAddress.setComplement("complement2");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata1");

billingAddress.setMetadata(metadata);
billingAddress.setLine1("line_14");
billingAddress.setLine2("line_20");

card.setBillingAddress(billingAddress);
card.setBrand("brand4");
card.setBillingAddressId("billing_address_id6");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");
metadata.put("key1", "metadata4");
metadata.put("key2", "metadata5");

card.setMetadata(metadata);
card.setType("credit");
CreateCardOptionsRequest options = new CreateCardOptionsRequest();
options.setVerifyCard(false);

card.setOptions(options);
card.setPrivateLabel(false);
card.setLabel("label0");

request.setCard(card);
request.setRecurrence(false);


try {
    GetChargeResponse response = chargesController.updateChargeCard(chargeId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charges Summary

```java
GetChargesSummaryResponse getChargesSummary(
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | `String` | Query, Required | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

[`GetChargesSummaryResponse`](../../doc/models/get-charges-summary-response.md)

## Example Usage

```java
String status = "status8";

try {
    GetChargesSummaryResponse response = chargesController.getChargesSummary(status, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Charge

Creates a new charge

```java
GetChargeResponse createCharge(
    final CreateChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateChargeRequest`](../../doc/models/create-charge-request.md) | Body, Required | Request for creating a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
CreateChargeRequest request = new CreateChargeRequest();
request.setCode("code4");
request.setAmount(242);
request.setCustomerId("customer_id4");
CreateCustomerRequest customer = new CreateCustomerRequest();
customer.setName("{\\n    \"name\": \"Tony Stark\"\\n}");
customer.setEmail("email0");
customer.setDocument("document0");
customer.setType("type4");
CreateAddressRequest address = new CreateAddressRequest();
address.setStreet("street2");
address.setNumber("number0");
address.setZipCode("zip_code6");
address.setNeighborhood("neighborhood8");
address.setCity("city2");
address.setState("state8");
address.setCountry("country6");
address.setComplement("complement8");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata6");

address.setMetadata(metadata);
address.setLine1("line_16");
address.setLine2("line_20");

customer.setAddress(address);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");
metadata.put("key1", "metadata2");
metadata.put("key2", "metadata1");

customer.setMetadata(metadata);
CreatePhonesRequest phones = new CreatePhonesRequest();

customer.setPhones(phones);
customer.setCode("code4");

request.setCustomer(customer);
CreatePaymentRequest payment = new CreatePaymentRequest();
payment.setPaymentMethod("payment_method2");

request.setPayment(payment);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);
CreateAntifraudRequest antifraud = new CreateAntifraudRequest();
antifraud.setType("type0");
CreateClearSaleRequest clearsale = new CreateClearSaleRequest();
clearsale.setCustomSla(52);

antifraud.setClearsale(clearsale);

request.setAntifraud(antifraud);
request.setOrderId("order_id0");


try {
    GetChargeResponse response = chargesController.createCharge(request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charge Transactions

```java
ListChargeTransactionsResponse getChargeTransactions(
    final String chargeId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListChargeTransactionsResponse`](../../doc/models/list-charge-transactions-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    ListChargeTransactionsResponse response = chargesController.getChargeTransactions(chargeId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Capture Charge

Captures a charge

```java
GetChargeResponse captureCharge(
    final String chargeId,
    final CreateCaptureChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCaptureChargeRequest`](../../doc/models/create-capture-charge-request.md) | Body, Optional | Request for capturing a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse response = chargesController.captureCharge(chargeId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charge

Get a charge from its id

```java
GetChargeResponse getCharge(
    final String chargeId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse response = chargesController.getCharge(chargeId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Cancel Charge

Cancel a charge

```java
GetChargeResponse cancelCharge(
    final String chargeId,
    final CreateCancelChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCancelChargeRequest`](../../doc/models/create-cancel-charge-request.md) | Body, Optional | Request for cancelling a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse response = chargesController.cancelCharge(chargeId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charges

Lists all charges

```java
ListChargesResponse getCharges(
    final Integer page,
    final Integer size,
    final String code,
    final String status,
    final String paymentMethod,
    final String customerId,
    final String orderId,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for charge's code |
| `status` | `String` | Query, Optional | Filter for charge's status |
| `paymentMethod` | `String` | Query, Optional | Filter for charge's payment method |
| `customerId` | `String` | Query, Optional | Filter for charge's customer id |
| `orderId` | `String` | Query, Optional | Filter for charge's order id |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for the beginning of the range for charge's creation |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for the end of the range for charge's creation |

## Response Type

[`ListChargesResponse`](../../doc/models/list-charges-response.md)

## Example Usage

```java
try {
    ListChargesResponse response = chargesController.getCharges(null, null, null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Confirm Payment

```java
GetChargeResponse confirmPayment(
    final String chargeId,
    final CreateConfirmPaymentRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | - |
| `request` | [`CreateConfirmPaymentRequest`](../../doc/models/create-confirm-payment-request.md) | Body, Optional | Request for confirm payment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse response = chargesController.confirmPayment(chargeId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Due Date

Updates the due date from a charge

```java
GetChargeResponse updateChargeDueDate(
    final String chargeId,
    final UpdateChargeDueDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `request` | [`UpdateChargeDueDateRequest`](../../doc/models/update-charge-due-date-request.md) | Body, Required | Request for updating the due date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeDueDateRequest request = new UpdateChargeDueDateRequest();


try {
    GetChargeResponse response = chargesController.updateChargeDueDate(chargeId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Retry Charge

Retries a charge

```java
GetChargeResponse retryCharge(
    final String chargeId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse response = chargesController.retryCharge(chargeId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

