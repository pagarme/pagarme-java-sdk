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
CompletableFuture<GetChargeResponse> updateChargeMetadata(
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
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

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
CompletableFuture<GetChargeResponse> updateChargePaymentMethod(
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
request.setCreditCard(new CreateCreditCardPaymentRequest());
request.setDebitCard(new CreateDebitCardPaymentRequest());
request.setBoleto(new CreateBoletoPaymentRequest());
request.getBoleto().setRetries(10);
request.getBoleto().setBank("bank4");
request.getBoleto().setInstructions("instructions4");
request.getBoleto().setBillingAddress(new CreateAddressRequest());
request.getBoleto().getBillingAddress().setStreet("street8");
request.getBoleto().getBillingAddress().setNumber("number4");
request.getBoleto().getBillingAddress().setZipCode("zip_code2");
request.getBoleto().getBillingAddress().setNeighborhood("neighborhood4");
request.getBoleto().getBillingAddress().setCity("city2");
request.getBoleto().getBillingAddress().setState("state6");
request.getBoleto().getBillingAddress().setCountry("country2");
request.getBoleto().getBillingAddress().setComplement("complement6");
request.getBoleto().getBillingAddress().setMetadata(new LinkedHashMap<>());
request.getBoleto().getBillingAddress().getMetadata().put("key0", "metadata5");
request.getBoleto().getBillingAddress().setLine1("line_18");
request.getBoleto().getBillingAddress().setLine2("line_26");
request.getBoleto().setBillingAddressId("billing_address_id2");
request.getBoleto().setDocumentNumber("document_number0");
request.getBoleto().setStatementDescriptor("statement_descriptor6");
request.setVoucher(new CreateVoucherPaymentRequest());
request.setCash(new CreateCashPaymentRequest());
request.getCash().setDescription("description6");
request.getCash().setConfirm(false);
request.setBankTransfer(new CreateBankTransferPaymentRequest());
request.getBankTransfer().setBank("bank4");
request.getBankTransfer().setRetries(204);
request.setPrivateLabel(new CreatePrivateLabelPaymentRequest());

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
CompletableFuture<GetChargeResponse> updateChargeCard(
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
request.setCard(new CreateCardRequest());
request.getCard().setNumber("number2");
request.getCard().setHolderName("holder_name6");
request.getCard().setExpMonth(80);
request.getCard().setExpYear(216);
request.getCard().setCvv("cvv8");
request.getCard().setBillingAddress(new CreateAddressRequest());
request.getCard().getBillingAddress().setStreet("street2");
request.getCard().getBillingAddress().setNumber("number0");
request.getCard().getBillingAddress().setZipCode("zip_code6");
request.getCard().getBillingAddress().setNeighborhood("neighborhood8");
request.getCard().getBillingAddress().setCity("city8");
request.getCard().getBillingAddress().setState("state2");
request.getCard().getBillingAddress().setCountry("country6");
request.getCard().getBillingAddress().setComplement("complement2");
request.getCard().getBillingAddress().setMetadata(new LinkedHashMap<>());
request.getCard().getBillingAddress().getMetadata().put("key0", "metadata1");
request.getCard().getBillingAddress().setLine1("line_14");
request.getCard().getBillingAddress().setLine2("line_20");
request.getCard().setBrand("brand4");
request.getCard().setBillingAddressId("billing_address_id6");
request.getCard().setMetadata(new LinkedHashMap<>());
request.getCard().getMetadata().put("key0", "metadata3");
request.getCard().getMetadata().put("key1", "metadata4");
request.getCard().getMetadata().put("key2", "metadata5");
request.getCard().setType("credit");
request.getCard().setOptions(new CreateCardOptionsRequest());
request.getCard().getOptions().setVerifyCard(false);
request.getCard().setPrivateLabel(false);
request.getCard().setLabel("label0");
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
CompletableFuture<GetChargesSummaryResponse> getChargesSummary(
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
CompletableFuture<GetChargeResponse> createCharge(
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
request.setCustomer(new CreateCustomerRequest());
request.getCustomer().setName("{\\n    \"name\": \"Tony Stark\"\\n}");
request.getCustomer().setEmail("email0");
request.getCustomer().setDocument("document0");
request.getCustomer().setType("type4");
request.getCustomer().setAddress(new CreateAddressRequest());
request.getCustomer().getAddress().setStreet("street2");
request.getCustomer().getAddress().setNumber("number0");
request.getCustomer().getAddress().setZipCode("zip_code6");
request.getCustomer().getAddress().setNeighborhood("neighborhood8");
request.getCustomer().getAddress().setCity("city2");
request.getCustomer().getAddress().setState("state8");
request.getCustomer().getAddress().setCountry("country6");
request.getCustomer().getAddress().setComplement("complement8");
request.getCustomer().getAddress().setMetadata(new LinkedHashMap<>());
request.getCustomer().getAddress().getMetadata().put("key0", "metadata7");
request.getCustomer().getAddress().getMetadata().put("key1", "metadata6");
request.getCustomer().getAddress().setLine1("line_16");
request.getCustomer().getAddress().setLine2("line_20");
request.getCustomer().setMetadata(new LinkedHashMap<>());
request.getCustomer().getMetadata().put("key0", "metadata3");
request.getCustomer().getMetadata().put("key1", "metadata2");
request.getCustomer().getMetadata().put("key2", "metadata1");
request.getCustomer().setPhones(new CreatePhonesRequest());
request.getCustomer().setCode("code4");
request.setPayment(new CreatePaymentRequest());
request.getPayment().setPaymentMethod("payment_method2");
request.getPayment().setPrivateLabel(new CreatePrivateLabelPaymentRequest());
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setAntifraud(new CreateAntifraudRequest());
request.getAntifraud().setType("type0");
request.getAntifraud().setClearsale(new CreateClearSaleRequest());
request.getAntifraud().getClearsale().setCustomSla(52);
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
CompletableFuture<ListChargeTransactionsResponse> getChargeTransactions(
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
CompletableFuture<GetChargeResponse> captureCharge(
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
CompletableFuture<GetChargeResponse> getCharge(
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
CompletableFuture<GetChargeResponse> cancelCharge(
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
CompletableFuture<ListChargesResponse> getCharges(
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
CompletableFuture<GetChargeResponse> confirmPayment(
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
CompletableFuture<GetChargeResponse> updateChargeDueDate(
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
CompletableFuture<GetChargeResponse> retryCharge(
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

