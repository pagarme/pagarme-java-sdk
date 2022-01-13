# Subscriptions

```java
SubscriptionsController subscriptionsController = client.getSubscriptionsController();
```

## Class Name

`SubscriptionsController`

## Methods

* [Renew Subscription](/doc/controllers/subscriptions.md#renew-subscription)
* [Update Subscription Card](/doc/controllers/subscriptions.md#update-subscription-card)
* [Delete Usage](/doc/controllers/subscriptions.md#delete-usage)
* [Create Discount](/doc/controllers/subscriptions.md#create-discount)
* [Create an Usage](/doc/controllers/subscriptions.md#create-an-usage)
* [Update Current Cycle Status](/doc/controllers/subscriptions.md#update-current-cycle-status)
* [Delete Discount](/doc/controllers/subscriptions.md#delete-discount)
* [Get Subscription Items](/doc/controllers/subscriptions.md#get-subscription-items)
* [Update Subscription Payment Method](/doc/controllers/subscriptions.md#update-subscription-payment-method)
* [Get Subscription Item](/doc/controllers/subscriptions.md#get-subscription-item)
* [Get Subscriptions](/doc/controllers/subscriptions.md#get-subscriptions)
* [Cancel Subscription](/doc/controllers/subscriptions.md#cancel-subscription)
* [Create Increment](/doc/controllers/subscriptions.md#create-increment)
* [Create Usage](/doc/controllers/subscriptions.md#create-usage)
* [Get Discount by Id](/doc/controllers/subscriptions.md#get-discount-by-id)
* [Create Subscription](/doc/controllers/subscriptions.md#create-subscription)
* [Get Increment by Id](/doc/controllers/subscriptions.md#get-increment-by-id)
* [Update Subscription Affiliation Id](/doc/controllers/subscriptions.md#update-subscription-affiliation-id)
* [Update Subscription Metadata](/doc/controllers/subscriptions.md#update-subscription-metadata)
* [Delete Increment](/doc/controllers/subscriptions.md#delete-increment)
* [Get Subscription Cycles](/doc/controllers/subscriptions.md#get-subscription-cycles)
* [Get Discounts](/doc/controllers/subscriptions.md#get-discounts)
* [Update Subscription Billing Date](/doc/controllers/subscriptions.md#update-subscription-billing-date)
* [Delete Subscription Item](/doc/controllers/subscriptions.md#delete-subscription-item)
* [Get Increments](/doc/controllers/subscriptions.md#get-increments)
* [Update Subscription Due Days](/doc/controllers/subscriptions.md#update-subscription-due-days)
* [Update Subscription Start At](/doc/controllers/subscriptions.md#update-subscription-start-at)
* [Update Subscription Item](/doc/controllers/subscriptions.md#update-subscription-item)
* [Create Subscription Item](/doc/controllers/subscriptions.md#create-subscription-item)
* [Get Subscription](/doc/controllers/subscriptions.md#get-subscription)
* [Get Usages](/doc/controllers/subscriptions.md#get-usages)
* [Update Latest Period End At](/doc/controllers/subscriptions.md#update-latest-period-end-at)
* [Update Subscription Minium Price](/doc/controllers/subscriptions.md#update-subscription-minium-price)
* [Get Subscription Cycle by Id](/doc/controllers/subscriptions.md#get-subscription-cycle-by-id)
* [Get Usage Report](/doc/controllers/subscriptions.md#get-usage-report)
* [Update Split Subscription](/doc/controllers/subscriptions.md#update-split-subscription)


# Renew Subscription

```java
CompletableFuture<GetPeriodResponse> renewSubscription(
    final String subscriptionId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPeriodResponse`](/doc/models/get-period-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    GetPeriodResponse response = subscriptionsController.renewSubscription(subscriptionId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Card

Updates the credit card from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionCard(
    final String subscriptionId,
    final UpdateSubscriptionCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionCardRequest`](/doc/models/update-subscription-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionCardRequest request = new UpdateSubscriptionCardRequest();
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
request.setCardId("card_id2");

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionCard(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Usage

Deletes a usage

```java
CompletableFuture<GetUsageResponse> deleteUsage(
    final String subscriptionId,
    final String itemId,
    final String usageId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `itemId` | `String` | Template, Required | The subscription item id |
| `usageId` | `String` | Template, Required | The usage id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetUsageResponse`](/doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
String usageId = "usage_id0";

try {
    GetUsageResponse response = subscriptionsController.deleteUsage(subscriptionId, itemId, usageId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Discount

Creates a discount

```java
CompletableFuture<GetDiscountResponse> createDiscount(
    final String subscriptionId,
    final CreateDiscountRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateDiscountRequest`](/doc/models/create-discount-request.md) | Body, Required | Request for creating a discount |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetDiscountResponse`](/doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateDiscountRequest request = new CreateDiscountRequest();
request.setValue(185.28);
request.setDiscountType("discount_type4");
request.setItemId("item_id6");

try {
    GetDiscountResponse response = subscriptionsController.createDiscount(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create an Usage

Create Usage

```java
CompletableFuture<GetUsageResponse> createAnUsage(
    final String subscriptionId,
    final String itemId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `itemId` | `String` | Template, Required | Item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetUsageResponse`](/doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

try {
    GetUsageResponse response = subscriptionsController.createAnUsage(subscriptionId, itemId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Current Cycle Status

```java
CompletableFuture<Void> updateCurrentCycleStatus(
    final String subscriptionId,
    final UpdateCurrentCycleStatusRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateCurrentCycleStatusRequest`](/doc/models/update-current-cycle-status-request.md) | Body, Required | Request for updating the end date of the subscription current status |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

`void`

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateCurrentCycleStatusRequest request = new UpdateCurrentCycleStatusRequest();
request.setStatus("status8");

try {
    Void response = subscriptionsController.updateCurrentCycleStatus(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Discount

Deletes a discount

```java
CompletableFuture<GetDiscountResponse> deleteDiscount(
    final String subscriptionId,
    final String discountId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `discountId` | `String` | Template, Required | Discount Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetDiscountResponse`](/doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String discountId = "discount_id8";

try {
    GetDiscountResponse response = subscriptionsController.deleteDiscount(subscriptionId, discountId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscription Items

Get Subscription Items

```java
CompletableFuture<ListSubscriptionItemsResponse> getSubscriptionItems(
    final String subscriptionId,
    final Integer page,
    final Integer size,
    final String name,
    final String code,
    final String status,
    final String description,
    final String createdSince,
    final String createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `name` | `String` | Query, Optional | The item name |
| `code` | `String` | Query, Optional | Identification code in the client system |
| `status` | `String` | Query, Optional | The item statis |
| `description` | `String` | Query, Optional | The item description |
| `createdSince` | `String` | Query, Optional | Filter for item's creation date start range |
| `createdUntil` | `String` | Query, Optional | Filter for item's creation date end range |

## Response Type

[`ListSubscriptionItemsResponse`](/doc/models/list-subscription-items-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    ListSubscriptionItemsResponse response = subscriptionsController.getSubscriptionItems(subscriptionId, null, null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Payment Method

Updates the payment method from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionPaymentMethod(
    final String subscriptionId,
    final UpdateSubscriptionPaymentMethodRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionPaymentMethodRequest`](/doc/models/update-subscription-payment-method-request.md) | Body, Required | Request for updating the paymentmethod from a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionPaymentMethodRequest request = new UpdateSubscriptionPaymentMethodRequest();
request.setPaymentMethod("payment_method4");
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

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionPaymentMethod(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscription Item

Get Subscription Item

```java
CompletableFuture<GetSubscriptionItemResponse> getSubscriptionItem(
    final String subscriptionId,
    final String itemId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |

## Response Type

[`GetSubscriptionItemResponse`](/doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

try {
    GetSubscriptionItemResponse response = subscriptionsController.getSubscriptionItem(subscriptionId, itemId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscriptions

Gets all subscriptions

```java
CompletableFuture<ListSubscriptionsResponse> getSubscriptions(
    final Integer page,
    final Integer size,
    final String code,
    final String billingType,
    final String customerId,
    final String planId,
    final String cardId,
    final String status,
    final LocalDateTime nextBillingSince,
    final LocalDateTime nextBillingUntil,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for subscription's code |
| `billingType` | `String` | Query, Optional | Filter for subscription's billing type |
| `customerId` | `String` | Query, Optional | Filter for subscription's customer id |
| `planId` | `String` | Query, Optional | Filter for subscription's plan id |
| `cardId` | `String` | Query, Optional | Filter for subscription's card id |
| `status` | `String` | Query, Optional | Filter for subscription's status |
| `nextBillingSince` | `LocalDateTime` | Query, Optional | Filter for subscription's next billing date start range |
| `nextBillingUntil` | `LocalDateTime` | Query, Optional | Filter for subscription's next billing date end range |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for subscription's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for subscriptions creation date end range |

## Response Type

[`ListSubscriptionsResponse`](/doc/models/list-subscriptions-response.md)

## Example Usage

```java
try {
    ListSubscriptionsResponse response = subscriptionsController.getSubscriptions(null, null, null, null, null, null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Cancel Subscription

Cancels a subscription

```java
CompletableFuture<GetSubscriptionResponse> cancelSubscription(
    final String subscriptionId,
    final CreateCancelSubscriptionRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateCancelSubscriptionRequest`](/doc/models/create-cancel-subscription-request.md) | Body, Optional | Request for cancelling a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateCancelSubscriptionRequest request = new CreateCancelSubscriptionRequest();
request.setCancelPendingInvoices(true);

try {
    GetSubscriptionResponse response = subscriptionsController.cancelSubscription(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Increment

Creates a increment

```java
CompletableFuture<GetIncrementResponse> createIncrement(
    final String subscriptionId,
    final CreateIncrementRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateIncrementRequest`](/doc/models/create-increment-request.md) | Body, Required | Request for creating a increment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetIncrementResponse`](/doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateIncrementRequest request = new CreateIncrementRequest();
request.setValue(185.28);
request.setIncrementType("increment_type8");
request.setItemId("item_id6");

try {
    GetIncrementResponse response = subscriptionsController.createIncrement(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Usage

Creates a usage

```java
CompletableFuture<GetUsageResponse> createUsage(
    final String subscriptionId,
    final String itemId,
    final CreateUsageRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |
| `body` | [`CreateUsageRequest`](/doc/models/create-usage-request.md) | Body, Required | Request for creating a usage |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetUsageResponse`](/doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
CreateUsageRequest body = new CreateUsageRequest();
body.setQuantity(156);
body.setDescription("description4");
body.setUsedAt(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

try {
    GetUsageResponse response = subscriptionsController.createUsage(subscriptionId, itemId, body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Discount by Id

```java
CompletableFuture<GetDiscountResponse> getDiscountById(
    final String subscriptionId,
    final String discountId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `discountId` | `String` | Template, Required | - |

## Response Type

[`GetDiscountResponse`](/doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String discountId = "discountId0";

try {
    GetDiscountResponse response = subscriptionsController.getDiscountById(subscriptionId, discountId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Subscription

Creates a new subscription

```java
CompletableFuture<GetSubscriptionResponse> createSubscription(
    final CreateSubscriptionRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateSubscriptionRequest`](/doc/models/create-subscription-request.md) | Body, Required | Request for creating a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
CreateSubscriptionRequest body = new CreateSubscriptionRequest();
body.setCustomer(new CreateCustomerRequest());
body.getCustomer().setName("{\\n    \"name\": \"Tony Stark\"\\n}");
body.getCustomer().setEmail("email2");
body.getCustomer().setDocument("document2");
body.getCustomer().setType("type6");
body.getCustomer().setAddress(new CreateAddressRequest());
body.getCustomer().getAddress().setStreet("street0");
body.getCustomer().getAddress().setNumber("number8");
body.getCustomer().getAddress().setZipCode("zip_code4");
body.getCustomer().getAddress().setNeighborhood("neighborhood6");
body.getCustomer().getAddress().setCity("city0");
body.getCustomer().getAddress().setState("state6");
body.getCustomer().getAddress().setCountry("country4");
body.getCustomer().getAddress().setComplement("complement6");
body.getCustomer().getAddress().setMetadata(new LinkedHashMap<>());
body.getCustomer().getAddress().getMetadata().put("key0", "metadata7");
body.getCustomer().getAddress().getMetadata().put("key1", "metadata6");
body.getCustomer().getAddress().setLine1("line_16");
body.getCustomer().getAddress().setLine2("line_28");
body.getCustomer().setMetadata(new LinkedHashMap<>());
body.getCustomer().getMetadata().put("key0", "metadata9");
body.getCustomer().getMetadata().put("key1", "metadata0");
body.getCustomer().setPhones(new CreatePhonesRequest());
body.getCustomer().setCode("code2");
body.setCard(new CreateCardRequest());
body.getCard().setNumber("number2");
body.getCard().setHolderName("holder_name6");
body.getCard().setExpMonth(60);
body.getCard().setExpYear(236);
body.getCard().setCvv("cvv8");
body.getCard().setBillingAddress(new CreateAddressRequest());
body.getCard().getBillingAddress().setStreet("street8");
body.getCard().getBillingAddress().setNumber("number4");
body.getCard().getBillingAddress().setZipCode("zip_code2");
body.getCard().getBillingAddress().setNeighborhood("neighborhood4");
body.getCard().getBillingAddress().setCity("city2");
body.getCard().getBillingAddress().setState("state6");
body.getCard().getBillingAddress().setCountry("country2");
body.getCard().getBillingAddress().setComplement("complement6");
body.getCard().getBillingAddress().setMetadata(new LinkedHashMap<>());
body.getCard().getBillingAddress().getMetadata().put("key0", "metadata5");
body.getCard().getBillingAddress().getMetadata().put("key1", "metadata6");
body.getCard().getBillingAddress().getMetadata().put("key2", "metadata7");
body.getCard().getBillingAddress().setLine1("line_18");
body.getCard().getBillingAddress().setLine2("line_26");
body.getCard().setBrand("brand4");
body.getCard().setBillingAddressId("billing_address_id6");
body.getCard().setMetadata(new LinkedHashMap<>());
body.getCard().getMetadata().put("key0", "metadata3");
body.getCard().getMetadata().put("key1", "metadata4");
body.getCard().setType("credit");
body.getCard().setOptions(new CreateCardOptionsRequest());
body.getCard().getOptions().setVerifyCard(false);
body.getCard().setPrivateLabel(false);
body.getCard().setLabel("label0");
body.setCode("code4");
body.setPaymentMethod("payment_method4");
body.setBillingType("billing_type0");
body.setStatementDescriptor("statement_descriptor6");
body.setDescription("description4");
body.setCurrency("currency6");
body.setInterval("interval6");
body.setIntervalCount(170);
body.setPricingScheme(new CreatePricingSchemeRequest());
body.getPricingScheme().setSchemeType("scheme_type2");
body.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest bodyPricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
bodyPricingSchemePriceBrackets0.setStartQuantity(31);
bodyPricingSchemePriceBrackets0.setPrice(225);
body.getPricingScheme().getPriceBrackets().add(bodyPricingSchemePriceBrackets0);

CreatePriceBracketRequest bodyPricingSchemePriceBrackets1 = new CreatePriceBracketRequest();
bodyPricingSchemePriceBrackets1.setStartQuantity(32);
bodyPricingSchemePriceBrackets1.setPrice(226);
body.getPricingScheme().getPriceBrackets().add(bodyPricingSchemePriceBrackets1);

body.setItems(new LinkedList<>());

CreateSubscriptionItemRequest bodyItems0 = new CreateSubscriptionItemRequest();
bodyItems0.setDescription("description3");
bodyItems0.setPricingScheme(new CreatePricingSchemeRequest());
bodyItems0.getPricingScheme().setSchemeType("scheme_type5");
bodyItems0.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest bodyItems0PricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
bodyItems0PricingSchemePriceBrackets0.setStartQuantity(228);
bodyItems0PricingSchemePriceBrackets0.setPrice(90);
bodyItems0.getPricingScheme().getPriceBrackets().add(bodyItems0PricingSchemePriceBrackets0);

CreatePriceBracketRequest bodyItems0PricingSchemePriceBrackets1 = new CreatePriceBracketRequest();
bodyItems0PricingSchemePriceBrackets1.setStartQuantity(229);
bodyItems0PricingSchemePriceBrackets1.setPrice(89);
bodyItems0.getPricingScheme().getPriceBrackets().add(bodyItems0PricingSchemePriceBrackets1);

bodyItems0.setId("id3");
bodyItems0.setPlanItemId("plan_item_id3");
bodyItems0.setDiscounts(new LinkedList<>());

CreateDiscountRequest bodyItems0Discounts0 = new CreateDiscountRequest();
bodyItems0Discounts0.setValue(65.46);
bodyItems0Discounts0.setDiscountType("discount_type2");
bodyItems0Discounts0.setItemId("item_id4");
bodyItems0.getDiscounts().add(bodyItems0Discounts0);

bodyItems0.setName("name3");
body.getItems().add(bodyItems0);

CreateSubscriptionItemRequest bodyItems1 = new CreateSubscriptionItemRequest();
bodyItems1.setDescription("description4");
bodyItems1.setPricingScheme(new CreatePricingSchemeRequest());
bodyItems1.getPricingScheme().setSchemeType("scheme_type4");
bodyItems1.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest bodyItems1PricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
bodyItems1PricingSchemePriceBrackets0.setStartQuantity(227);
bodyItems1PricingSchemePriceBrackets0.setPrice(91);
bodyItems1.getPricingScheme().getPriceBrackets().add(bodyItems1PricingSchemePriceBrackets0);

bodyItems1.setId("id4");
bodyItems1.setPlanItemId("plan_item_id4");
bodyItems1.setDiscounts(new LinkedList<>());

CreateDiscountRequest bodyItems1Discounts0 = new CreateDiscountRequest();
bodyItems1Discounts0.setValue(65.47);
bodyItems1Discounts0.setDiscountType("discount_type3");
bodyItems1Discounts0.setItemId("item_id5");
bodyItems1.getDiscounts().add(bodyItems1Discounts0);

CreateDiscountRequest bodyItems1Discounts1 = new CreateDiscountRequest();
bodyItems1Discounts1.setValue(65.48);
bodyItems1Discounts1.setDiscountType("discount_type4");
bodyItems1Discounts1.setItemId("item_id6");
bodyItems1.getDiscounts().add(bodyItems1Discounts1);

bodyItems1.setName("name4");
body.getItems().add(bodyItems1);

CreateSubscriptionItemRequest bodyItems2 = new CreateSubscriptionItemRequest();
bodyItems2.setDescription("description5");
bodyItems2.setPricingScheme(new CreatePricingSchemeRequest());
bodyItems2.getPricingScheme().setSchemeType("scheme_type3");
bodyItems2.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest bodyItems2PricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
bodyItems2PricingSchemePriceBrackets0.setStartQuantity(226);
bodyItems2PricingSchemePriceBrackets0.setPrice(92);
bodyItems2.getPricingScheme().getPriceBrackets().add(bodyItems2PricingSchemePriceBrackets0);

CreatePriceBracketRequest bodyItems2PricingSchemePriceBrackets1 = new CreatePriceBracketRequest();
bodyItems2PricingSchemePriceBrackets1.setStartQuantity(227);
bodyItems2PricingSchemePriceBrackets1.setPrice(91);
bodyItems2.getPricingScheme().getPriceBrackets().add(bodyItems2PricingSchemePriceBrackets1);

CreatePriceBracketRequest bodyItems2PricingSchemePriceBrackets2 = new CreatePriceBracketRequest();
bodyItems2PricingSchemePriceBrackets2.setStartQuantity(228);
bodyItems2PricingSchemePriceBrackets2.setPrice(90);
bodyItems2.getPricingScheme().getPriceBrackets().add(bodyItems2PricingSchemePriceBrackets2);

bodyItems2.setId("id5");
bodyItems2.setPlanItemId("plan_item_id5");
bodyItems2.setDiscounts(new LinkedList<>());

CreateDiscountRequest bodyItems2Discounts0 = new CreateDiscountRequest();
bodyItems2Discounts0.setValue(65.48);
bodyItems2Discounts0.setDiscountType("discount_type4");
bodyItems2Discounts0.setItemId("item_id6");
bodyItems2.getDiscounts().add(bodyItems2Discounts0);

CreateDiscountRequest bodyItems2Discounts1 = new CreateDiscountRequest();
bodyItems2Discounts1.setValue(65.49);
bodyItems2Discounts1.setDiscountType("discount_type5");
bodyItems2Discounts1.setItemId("item_id7");
bodyItems2.getDiscounts().add(bodyItems2Discounts1);

CreateDiscountRequest bodyItems2Discounts2 = new CreateDiscountRequest();
bodyItems2Discounts2.setValue(65.5);
bodyItems2Discounts2.setDiscountType("discount_type6");
bodyItems2Discounts2.setItemId("item_id8");
bodyItems2.getDiscounts().add(bodyItems2Discounts2);

bodyItems2.setName("name5");
body.getItems().add(bodyItems2);

body.setShipping(new CreateShippingRequest());
body.getShipping().setAmount(140);
body.getShipping().setDescription("description0");
body.getShipping().setRecipientName("recipient_name8");
body.getShipping().setRecipientPhone("recipient_phone2");
body.getShipping().setAddressId("address_id0");
body.getShipping().setAddress(new CreateAddressRequest());
body.getShipping().getAddress().setStreet("street6");
body.getShipping().getAddress().setNumber("number4");
body.getShipping().getAddress().setZipCode("zip_code0");
body.getShipping().getAddress().setNeighborhood("neighborhood2");
body.getShipping().getAddress().setCity("city6");
body.getShipping().getAddress().setState("state2");
body.getShipping().getAddress().setCountry("country0");
body.getShipping().getAddress().setComplement("complement2");
body.getShipping().getAddress().setMetadata(new LinkedHashMap<>());
body.getShipping().getAddress().getMetadata().put("key0", "metadata3");
body.getShipping().getAddress().getMetadata().put("key1", "metadata2");
body.getShipping().getAddress().setLine1("line_10");
body.getShipping().getAddress().setLine2("line_24");
body.getShipping().setType("type0");
body.setDiscounts(new LinkedList<>());

CreateDiscountRequest bodyDiscounts0 = new CreateDiscountRequest();
bodyDiscounts0.setValue(95.59);
bodyDiscounts0.setDiscountType("discount_type5");
bodyDiscounts0.setItemId("item_id7");
body.getDiscounts().add(bodyDiscounts0);

body.setMetadata(new LinkedHashMap<>());
body.getMetadata().put("key0", "metadata7");
body.getMetadata().put("key1", "metadata8");
body.setSetup(new CreateSetupRequest());
body.getSetup().setAmount(150);
body.getSetup().setDescription("description0");
body.getSetup().setPayment(new CreatePaymentRequest());
body.getSetup().getPayment().setPaymentMethod("payment_method4");
body.getSetup().getPayment().setPrivateLabel(new CreatePrivateLabelPaymentRequest());
body.setIncrements(new LinkedList<>());

CreateIncrementRequest bodyIncrements0 = new CreateIncrementRequest();
bodyIncrements0.setValue(38.83);
bodyIncrements0.setIncrementType("increment_type3");
bodyIncrements0.setItemId("item_id9");
body.getIncrements().add(bodyIncrements0);

CreateIncrementRequest bodyIncrements1 = new CreateIncrementRequest();
bodyIncrements1.setValue(38.84);
bodyIncrements1.setIncrementType("increment_type4");
bodyIncrements1.setItemId("item_id8");
body.getIncrements().add(bodyIncrements1);

CreateIncrementRequest bodyIncrements2 = new CreateIncrementRequest();
bodyIncrements2.setValue(38.85);
bodyIncrements2.setIncrementType("increment_type5");
bodyIncrements2.setItemId("item_id7");
body.getIncrements().add(bodyIncrements2);


try {
    GetSubscriptionResponse response = subscriptionsController.createSubscription(body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Increment by Id

```java
CompletableFuture<GetIncrementResponse> getIncrementById(
    final String subscriptionId,
    final String incrementId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `incrementId` | `String` | Template, Required | The increment Id |

## Response Type

[`GetIncrementResponse`](/doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String incrementId = "increment_id8";

try {
    GetIncrementResponse response = subscriptionsController.getIncrementById(subscriptionId, incrementId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Affiliation Id

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionAffiliationId(
    final String subscriptionId,
    final UpdateSubscriptionAffiliationIdRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateSubscriptionAffiliationIdRequest`](/doc/models/update-subscription-affiliation-id-request.md) | Body, Required | Request for updating a subscription affiliation id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionAffiliationIdRequest request = new UpdateSubscriptionAffiliationIdRequest();
request.setGatewayAffiliationId("gateway_affiliation_id2");

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionAffiliationId(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Metadata

Updates the metadata from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionMetadata(
    final String subscriptionId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateMetadataRequest`](/doc/models/update-metadata-request.md) | Body, Required | Request for updating the subscrption metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest();
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionMetadata(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Increment

Deletes a increment

```java
CompletableFuture<GetIncrementResponse> deleteIncrement(
    final String subscriptionId,
    final String incrementId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `incrementId` | `String` | Template, Required | Increment id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetIncrementResponse`](/doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String incrementId = "increment_id8";

try {
    GetIncrementResponse response = subscriptionsController.deleteIncrement(subscriptionId, incrementId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscription Cycles

```java
CompletableFuture<ListCyclesResponse> getSubscriptionCycles(
    final String subscriptionId,
    final String page,
    final String size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `page` | `String` | Query, Required | Page number |
| `size` | `String` | Query, Required | Page size |

## Response Type

[`ListCyclesResponse`](/doc/models/list-cycles-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String page = "page8";
String size = "size0";

try {
    ListCyclesResponse response = subscriptionsController.getSubscriptionCycles(subscriptionId, page, size);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Discounts

```java
CompletableFuture<ListDiscountsResponse> getDiscounts(
    final String subscriptionId,
    final int page,
    final int size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `int` | Query, Required | Page number |
| `size` | `int` | Query, Required | Page size |

## Response Type

[`ListDiscountsResponse`](/doc/models/list-discounts-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
int page = 30;
int size = 18;

try {
    ListDiscountsResponse response = subscriptionsController.getDiscounts(subscriptionId, page, size);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Billing Date

Updates the billing date from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionBillingDate(
    final String subscriptionId,
    final UpdateSubscriptionBillingDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionBillingDateRequest`](/doc/models/update-subscription-billing-date-request.md) | Body, Required | Request for updating the subscription billing date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionBillingDateRequest request = new UpdateSubscriptionBillingDateRequest();
request.setNextBillingAt(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionBillingDate(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Subscription Item

Deletes a subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> deleteSubscriptionItem(
    final String subscriptionId,
    final String subscriptionItemId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `subscriptionItemId` | `String` | Template, Required | Subscription item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionItemResponse`](/doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String subscriptionItemId = "subscription_item_id4";

try {
    GetSubscriptionItemResponse response = subscriptionsController.deleteSubscriptionItem(subscriptionId, subscriptionItemId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Increments

```java
CompletableFuture<ListIncrementsResponse> getIncrements(
    final String subscriptionId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListIncrementsResponse`](/doc/models/list-increments-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    ListIncrementsResponse response = subscriptionsController.getIncrements(subscriptionId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Due Days

Updates the boleto due days from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionDueDays(
    final String subscriptionId,
    final UpdateSubscriptionDueDaysRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionDueDaysRequest`](/doc/models/update-subscription-due-days-request.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionDueDaysRequest request = new UpdateSubscriptionDueDaysRequest();
request.setBoletoDueDays(226);

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionDueDays(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Start At

Updates the start at date from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionStartAt(
    final String subscriptionId,
    final UpdateSubscriptionStartAtRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionStartAtRequest`](/doc/models/update-subscription-start-at-request.md) | Body, Required | Request for updating the subscription start date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionStartAtRequest request = new UpdateSubscriptionStartAtRequest();
request.setStartAt(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionStartAt(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Item

Updates a subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> updateSubscriptionItem(
    final String subscriptionId,
    final String itemId,
    final UpdateSubscriptionItemRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |
| `body` | [`UpdateSubscriptionItemRequest`](/doc/models/update-subscription-item-request.md) | Body, Required | Request for updating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionItemResponse`](/doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest();
body.setDescription("description4");
body.setStatus("status2");
body.setPricingScheme(new UpdatePricingSchemeRequest());
body.getPricingScheme().setSchemeType("scheme_type2");
body.getPricingScheme().setPriceBrackets(new LinkedList<>());

UpdatePriceBracketRequest bodyPricingSchemePriceBrackets0 = new UpdatePriceBracketRequest();
bodyPricingSchemePriceBrackets0.setStartQuantity(31);
bodyPricingSchemePriceBrackets0.setPrice(225);
body.getPricingScheme().getPriceBrackets().add(bodyPricingSchemePriceBrackets0);

UpdatePriceBracketRequest bodyPricingSchemePriceBrackets1 = new UpdatePriceBracketRequest();
bodyPricingSchemePriceBrackets1.setStartQuantity(32);
bodyPricingSchemePriceBrackets1.setPrice(226);
body.getPricingScheme().getPriceBrackets().add(bodyPricingSchemePriceBrackets1);

body.setName("name6");

try {
    GetSubscriptionItemResponse response = subscriptionsController.updateSubscriptionItem(subscriptionId, itemId, body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Subscription Item

Creates a new Subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> createSubscriptionItem(
    final String subscriptionId,
    final CreateSubscriptionItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateSubscriptionItemRequest`](/doc/models/create-subscription-item-request.md) | Body, Required | Request for creating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionItemResponse`](/doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateSubscriptionItemRequest request = new CreateSubscriptionItemRequest();
request.setDescription("description6");
request.setPricingScheme(new CreatePricingSchemeRequest());
request.getPricingScheme().setSchemeType("scheme_type2");
request.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest requestPricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
requestPricingSchemePriceBrackets0.setStartQuantity(87);
requestPricingSchemePriceBrackets0.setPrice(231);
request.getPricingScheme().getPriceBrackets().add(requestPricingSchemePriceBrackets0);

request.setId("id6");
request.setPlanItemId("plan_item_id6");
request.setDiscounts(new LinkedList<>());

CreateDiscountRequest requestDiscounts0 = new CreateDiscountRequest();
requestDiscounts0.setValue(199.99);
requestDiscounts0.setDiscountType("discount_type5");
requestDiscounts0.setItemId("item_id7");
request.getDiscounts().add(requestDiscounts0);

CreateDiscountRequest requestDiscounts1 = new CreateDiscountRequest();
requestDiscounts1.setValue(200);
requestDiscounts1.setDiscountType("discount_type6");
requestDiscounts1.setItemId("item_id8");
request.getDiscounts().add(requestDiscounts1);

request.setName("name6");

try {
    GetSubscriptionItemResponse response = subscriptionsController.createSubscriptionItem(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscription

Gets a subscription

```java
CompletableFuture<GetSubscriptionResponse> getSubscription(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    GetSubscriptionResponse response = subscriptionsController.getSubscription(subscriptionId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Usages

Lists all usages from a subscription item

```java
CompletableFuture<ListUsagesResponse> getUsages(
    final String subscriptionId,
    final String itemId,
    final Integer page,
    final Integer size,
    final String code,
    final String group,
    final LocalDateTime usedSince,
    final LocalDateTime usedUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `itemId` | `String` | Template, Required | The subscription item id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Identification code in the client system |
| `group` | `String` | Query, Optional | Identification group in the client system |
| `usedSince` | `LocalDateTime` | Query, Optional | - |
| `usedUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

[`ListUsagesResponse`](/doc/models/list-usages-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

try {
    ListUsagesResponse response = subscriptionsController.getUsages(subscriptionId, itemId, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Latest Period End At

```java
CompletableFuture<GetSubscriptionResponse> updateLatestPeriodEndAt(
    final String subscriptionId,
    final UpdateCurrentCycleEndDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateCurrentCycleEndDateRequest`](/doc/models/update-current-cycle-end-date-request.md) | Body, Required | Request for updating the end date of the current signature cycle |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateCurrentCycleEndDateRequest request = new UpdateCurrentCycleEndDateRequest();

try {
    GetSubscriptionResponse response = subscriptionsController.updateLatestPeriodEndAt(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Subscription Minium Price

Atualização do valor mínimo da assinatura

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionMiniumPrice(
    final String subscriptionId,
    final UpdateSubscriptionMinimumPriceRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionMinimumPriceRequest`](/doc/models/update-subscription-minimum-price-request.md) | Body, Required | Request da requisição com o valor mínimo que será configurado |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionMinimumPriceRequest request = new UpdateSubscriptionMinimumPriceRequest();

try {
    GetSubscriptionResponse response = subscriptionsController.updateSubscriptionMiniumPrice(subscriptionId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Subscription Cycle by Id

```java
CompletableFuture<GetPeriodResponse> getSubscriptionCycleById(
    final String subscriptionId,
    final String cycleId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `cycleId` | `String` | Template, Required | - |

## Response Type

[`GetPeriodResponse`](/doc/models/get-period-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String cycleId = "cycleId0";

try {
    GetPeriodResponse response = subscriptionsController.getSubscriptionCycleById(subscriptionId, cycleId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Usage Report

```java
CompletableFuture<GetUsageReportResponse> getUsageReport(
    final String subscriptionId,
    final String periodId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `periodId` | `String` | Template, Required | The period Id |

## Response Type

[`GetUsageReportResponse`](/doc/models/get-usage-report-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String periodId = "period_id0";

try {
    GetUsageReportResponse response = subscriptionsController.getUsageReport(subscriptionId, periodId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Split Subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSplitSubscription(
    final String id,
    final UpdateSubscriptionSplitRequest request)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Subscription's id |
| `request` | [`UpdateSubscriptionSplitRequest`](/doc/models/update-subscription-split-request.md) | Body, Required | - |

## Response Type

[`GetSubscriptionResponse`](/doc/models/get-subscription-response.md)

## Example Usage

```java
String id = "id0";
UpdateSubscriptionSplitRequest request = new UpdateSubscriptionSplitRequest();
request.setEnabled(false);
request.setRules(new LinkedList<>());

CreateSplitRequest requestRules0 = new CreateSplitRequest();
requestRules0.setType("type6");
requestRules0.setAmount(222);
requestRules0.setRecipientId("recipient_id6");
request.getRules().add(requestRules0);

CreateSplitRequest requestRules1 = new CreateSplitRequest();
requestRules1.setType("type5");
requestRules1.setAmount(223);
requestRules1.setRecipientId("recipient_id5");
request.getRules().add(requestRules1);

CreateSplitRequest requestRules2 = new CreateSplitRequest();
requestRules2.setType("type4");
requestRules2.setAmount(224);
requestRules2.setRecipientId("recipient_id4");
request.getRules().add(requestRules2);


try {
    GetSubscriptionResponse response = subscriptionsController.updateSplitSubscription(id, request);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

