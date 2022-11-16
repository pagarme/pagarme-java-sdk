# Subscriptions

```java
SubscriptionsController subscriptionsController = client.getSubscriptionsController();
```

## Class Name

`SubscriptionsController`

## Methods

* [Renew Subscription](../../doc/controllers/subscriptions.md#renew-subscription)
* [Update Subscription Card](../../doc/controllers/subscriptions.md#update-subscription-card)
* [Delete Usage](../../doc/controllers/subscriptions.md#delete-usage)
* [Create Discount](../../doc/controllers/subscriptions.md#create-discount)
* [Create an Usage](../../doc/controllers/subscriptions.md#create-an-usage)
* [Update Current Cycle Status](../../doc/controllers/subscriptions.md#update-current-cycle-status)
* [Delete Discount](../../doc/controllers/subscriptions.md#delete-discount)
* [Get Subscription Items](../../doc/controllers/subscriptions.md#get-subscription-items)
* [Update Subscription Payment Method](../../doc/controllers/subscriptions.md#update-subscription-payment-method)
* [Get Subscription Item](../../doc/controllers/subscriptions.md#get-subscription-item)
* [Get Subscriptions](../../doc/controllers/subscriptions.md#get-subscriptions)
* [Cancel Subscription](../../doc/controllers/subscriptions.md#cancel-subscription)
* [Create Increment](../../doc/controllers/subscriptions.md#create-increment)
* [Create Usage](../../doc/controllers/subscriptions.md#create-usage)
* [Get Discount by Id](../../doc/controllers/subscriptions.md#get-discount-by-id)
* [Create Subscription](../../doc/controllers/subscriptions.md#create-subscription)
* [Get Increment by Id](../../doc/controllers/subscriptions.md#get-increment-by-id)
* [Update Subscription Affiliation Id](../../doc/controllers/subscriptions.md#update-subscription-affiliation-id)
* [Update Subscription Metadata](../../doc/controllers/subscriptions.md#update-subscription-metadata)
* [Delete Increment](../../doc/controllers/subscriptions.md#delete-increment)
* [Get Subscription Cycles](../../doc/controllers/subscriptions.md#get-subscription-cycles)
* [Get Discounts](../../doc/controllers/subscriptions.md#get-discounts)
* [Update Subscription Billing Date](../../doc/controllers/subscriptions.md#update-subscription-billing-date)
* [Delete Subscription Item](../../doc/controllers/subscriptions.md#delete-subscription-item)
* [Get Increments](../../doc/controllers/subscriptions.md#get-increments)
* [Update Subscription Due Days](../../doc/controllers/subscriptions.md#update-subscription-due-days)
* [Update Subscription Start At](../../doc/controllers/subscriptions.md#update-subscription-start-at)
* [Update Subscription Item](../../doc/controllers/subscriptions.md#update-subscription-item)
* [Create Subscription Item](../../doc/controllers/subscriptions.md#create-subscription-item)
* [Get Subscription](../../doc/controllers/subscriptions.md#get-subscription)
* [Get Usages](../../doc/controllers/subscriptions.md#get-usages)
* [Update Latest Period End At](../../doc/controllers/subscriptions.md#update-latest-period-end-at)
* [Update Subscription Minium Price](../../doc/controllers/subscriptions.md#update-subscription-minium-price)
* [Get Subscription Cycle by Id](../../doc/controllers/subscriptions.md#get-subscription-cycle-by-id)
* [Get Usage Report](../../doc/controllers/subscriptions.md#get-usage-report)
* [Update Split Subscription](../../doc/controllers/subscriptions.md#update-split-subscription)


# Renew Subscription

```java
GetPeriodResponse renewSubscription(
    final String subscriptionId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPeriodResponse`](../../doc/models/get-period-response.md)

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
GetSubscriptionResponse updateSubscriptionCard(
    final String subscriptionId,
    final UpdateSubscriptionCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionCardRequest`](../../doc/models/update-subscription-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionCardRequest request = new UpdateSubscriptionCardRequest();
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
GetUsageResponse deleteUsage(
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

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

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
GetDiscountResponse createDiscount(
    final String subscriptionId,
    final CreateDiscountRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateDiscountRequest`](../../doc/models/create-discount-request.md) | Body, Required | Request for creating a discount |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

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
GetUsageResponse createAnUsage(
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

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

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
Void updateCurrentCycleStatus(
    final String subscriptionId,
    final UpdateCurrentCycleStatusRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateCurrentCycleStatusRequest`](../../doc/models/update-current-cycle-status-request.md) | Body, Required | Request for updating the end date of the subscription current status |
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
GetDiscountResponse deleteDiscount(
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

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

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
ListSubscriptionItemsResponse getSubscriptionItems(
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

[`ListSubscriptionItemsResponse`](../../doc/models/list-subscription-items-response.md)

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
GetSubscriptionResponse updateSubscriptionPaymentMethod(
    final String subscriptionId,
    final UpdateSubscriptionPaymentMethodRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionPaymentMethodRequest`](../../doc/models/update-subscription-payment-method-request.md) | Body, Required | Request for updating the paymentmethod from a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionPaymentMethodRequest request = new UpdateSubscriptionPaymentMethodRequest();
request.setPaymentMethod("payment_method4");
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
GetSubscriptionItemResponse getSubscriptionItem(
    final String subscriptionId,
    final String itemId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |

## Response Type

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

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
ListSubscriptionsResponse getSubscriptions(
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

[`ListSubscriptionsResponse`](../../doc/models/list-subscriptions-response.md)

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
GetSubscriptionResponse cancelSubscription(
    final String subscriptionId,
    final CreateCancelSubscriptionRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateCancelSubscriptionRequest`](../../doc/models/create-cancel-subscription-request.md) | Body, Optional | Request for cancelling a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetIncrementResponse createIncrement(
    final String subscriptionId,
    final CreateIncrementRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateIncrementRequest`](../../doc/models/create-increment-request.md) | Body, Required | Request for creating a increment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

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
GetUsageResponse createUsage(
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
| `body` | [`CreateUsageRequest`](../../doc/models/create-usage-request.md) | Body, Required | Request for creating a usage |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

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
GetDiscountResponse getDiscountById(
    final String subscriptionId,
    final String discountId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `discountId` | `String` | Template, Required | - |

## Response Type

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

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
GetSubscriptionResponse createSubscription(
    final CreateSubscriptionRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Body, Required | Request for creating a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
CreateSubscriptionRequest body = new CreateSubscriptionRequest();
CreateCustomerRequest customer = new CreateCustomerRequest();
customer.setName("{\\n    \"name\": \"Tony Stark\"\\n}");
customer.setEmail("email2");
customer.setDocument("document2");
customer.setType("type6");
CreateAddressRequest address = new CreateAddressRequest();
address.setStreet("street0");
address.setNumber("number8");
address.setZipCode("zip_code4");
address.setNeighborhood("neighborhood6");
address.setCity("city0");
address.setState("state6");
address.setCountry("country4");
address.setComplement("complement6");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata6");

address.setMetadata(metadata);
address.setLine1("line_16");
address.setLine2("line_28");

customer.setAddress(address);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata9");
metadata.put("key1", "metadata0");

customer.setMetadata(metadata);
CreatePhonesRequest phones = new CreatePhonesRequest();

customer.setPhones(phones);
customer.setCode("code2");

body.setCustomer(customer);
CreateCardRequest card = new CreateCardRequest();
card.setNumber("number2");
card.setHolderName("holder_name6");
card.setExpMonth(60);
card.setExpYear(236);
card.setCvv("cvv8");
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
metadata.put("key1", "metadata6");
metadata.put("key2", "metadata7");

billingAddress.setMetadata(metadata);
billingAddress.setLine1("line_18");
billingAddress.setLine2("line_26");

card.setBillingAddress(billingAddress);
card.setBrand("brand4");
card.setBillingAddressId("billing_address_id6");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");
metadata.put("key1", "metadata4");

card.setMetadata(metadata);
card.setType("credit");
CreateCardOptionsRequest options = new CreateCardOptionsRequest();
options.setVerifyCard(false);

card.setOptions(options);
card.setPrivateLabel(false);
card.setLabel("label0");

body.setCard(card);
body.setCode("code4");
body.setPaymentMethod("payment_method4");
body.setBillingType("billing_type0");
body.setStatementDescriptor("statement_descriptor6");
body.setDescription("description4");
body.setCurrency("currency6");
body.setInterval("interval6");
body.setIntervalCount(170);
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type2");
List<CreatePriceBracketRequest> priceBrackets = new LinkedList<>();
CreatePriceBracketRequest priceBrackets0 = new CreatePriceBracketRequest();
priceBrackets0.setStartQuantity(31);
priceBrackets0.setPrice(225);

priceBrackets.add(priceBrackets0);
CreatePriceBracketRequest priceBrackets1 = new CreatePriceBracketRequest();
priceBrackets1.setStartQuantity(32);
priceBrackets1.setPrice(226);

priceBrackets.add(priceBrackets1);

pricingScheme.setPriceBrackets(priceBrackets);

body.setPricingScheme(pricingScheme);
List<CreateSubscriptionItemRequest> items = new LinkedList<>();
CreateSubscriptionItemRequest items0 = new CreateSubscriptionItemRequest();
items0.setDescription("description3");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type5");
List<CreatePriceBracketRequest> priceBrackets = new LinkedList<>();
CreatePriceBracketRequest priceBrackets0 = new CreatePriceBracketRequest();
priceBrackets0.setStartQuantity(228);
priceBrackets0.setPrice(90);

priceBrackets.add(priceBrackets0);
CreatePriceBracketRequest priceBrackets1 = new CreatePriceBracketRequest();
priceBrackets1.setStartQuantity(229);
priceBrackets1.setPrice(89);

priceBrackets.add(priceBrackets1);

pricingScheme.setPriceBrackets(priceBrackets);

items0.setPricingScheme(pricingScheme);
items0.setId("id3");
items0.setPlanItemId("plan_item_id3");
List<CreateDiscountRequest> discounts = new LinkedList<>();
CreateDiscountRequest discounts0 = new CreateDiscountRequest();
discounts0.setValue(65.46);
discounts0.setDiscountType("discount_type2");
discounts0.setItemId("item_id4");

discounts.add(discounts0);

items0.setDiscounts(discounts);
items0.setName("name3");

items.add(items0);
CreateSubscriptionItemRequest items1 = new CreateSubscriptionItemRequest();
items1.setDescription("description4");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type4");
List<CreatePriceBracketRequest> priceBrackets = new LinkedList<>();
CreatePriceBracketRequest priceBrackets0 = new CreatePriceBracketRequest();
priceBrackets0.setStartQuantity(227);
priceBrackets0.setPrice(91);

priceBrackets.add(priceBrackets0);

pricingScheme.setPriceBrackets(priceBrackets);

items1.setPricingScheme(pricingScheme);
items1.setId("id4");
items1.setPlanItemId("plan_item_id4");
List<CreateDiscountRequest> discounts = new LinkedList<>();
CreateDiscountRequest discounts0 = new CreateDiscountRequest();
discounts0.setValue(65.47);
discounts0.setDiscountType("discount_type3");
discounts0.setItemId("item_id5");

discounts.add(discounts0);
CreateDiscountRequest discounts1 = new CreateDiscountRequest();
discounts1.setValue(65.48);
discounts1.setDiscountType("discount_type4");
discounts1.setItemId("item_id6");

discounts.add(discounts1);

items1.setDiscounts(discounts);
items1.setName("name4");

items.add(items1);
CreateSubscriptionItemRequest items2 = new CreateSubscriptionItemRequest();
items2.setDescription("description5");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type3");
List<CreatePriceBracketRequest> priceBrackets = new LinkedList<>();
CreatePriceBracketRequest priceBrackets0 = new CreatePriceBracketRequest();
priceBrackets0.setStartQuantity(226);
priceBrackets0.setPrice(92);

priceBrackets.add(priceBrackets0);
CreatePriceBracketRequest priceBrackets1 = new CreatePriceBracketRequest();
priceBrackets1.setStartQuantity(227);
priceBrackets1.setPrice(91);

priceBrackets.add(priceBrackets1);
CreatePriceBracketRequest priceBrackets2 = new CreatePriceBracketRequest();
priceBrackets2.setStartQuantity(228);
priceBrackets2.setPrice(90);

priceBrackets.add(priceBrackets2);

pricingScheme.setPriceBrackets(priceBrackets);

items2.setPricingScheme(pricingScheme);
items2.setId("id5");
items2.setPlanItemId("plan_item_id5");
List<CreateDiscountRequest> discounts = new LinkedList<>();
CreateDiscountRequest discounts0 = new CreateDiscountRequest();
discounts0.setValue(65.48);
discounts0.setDiscountType("discount_type4");
discounts0.setItemId("item_id6");

discounts.add(discounts0);
CreateDiscountRequest discounts1 = new CreateDiscountRequest();
discounts1.setValue(65.49);
discounts1.setDiscountType("discount_type5");
discounts1.setItemId("item_id7");

discounts.add(discounts1);
CreateDiscountRequest discounts2 = new CreateDiscountRequest();
discounts2.setValue(65.5);
discounts2.setDiscountType("discount_type6");
discounts2.setItemId("item_id8");

discounts.add(discounts2);

items2.setDiscounts(discounts);
items2.setName("name5");

items.add(items2);

body.setItems(items);
CreateShippingRequest shipping = new CreateShippingRequest();
shipping.setAmount(140);
shipping.setDescription("description0");
shipping.setRecipientName("recipient_name8");
shipping.setRecipientPhone("recipient_phone2");
shipping.setAddressId("address_id0");
CreateAddressRequest address = new CreateAddressRequest();
address.setStreet("street6");
address.setNumber("number4");
address.setZipCode("zip_code0");
address.setNeighborhood("neighborhood2");
address.setCity("city6");
address.setState("state2");
address.setCountry("country0");
address.setComplement("complement2");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");
metadata.put("key1", "metadata2");

address.setMetadata(metadata);
address.setLine1("line_10");
address.setLine2("line_24");

shipping.setAddress(address);
shipping.setType("type0");

body.setShipping(shipping);
List<CreateDiscountRequest> discounts = new LinkedList<>();
CreateDiscountRequest discounts0 = new CreateDiscountRequest();
discounts0.setValue(95.59);
discounts0.setDiscountType("discount_type5");
discounts0.setItemId("item_id7");

discounts.add(discounts0);

body.setDiscounts(discounts);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata8");

body.setMetadata(metadata);
CreateSetupRequest setup = new CreateSetupRequest();
setup.setAmount(150);
setup.setDescription("description0");
CreatePaymentRequest payment = new CreatePaymentRequest();
payment.setPaymentMethod("payment_method4");
CreatePrivateLabelPaymentRequest privateLabel = new CreatePrivateLabelPaymentRequest();

payment.setPrivateLabel(privateLabel);

setup.setPayment(payment);

body.setSetup(setup);
List<CreateIncrementRequest> increments = new LinkedList<>();
CreateIncrementRequest increments0 = new CreateIncrementRequest();
increments0.setValue(38.83);
increments0.setIncrementType("increment_type3");
increments0.setItemId("item_id9");

increments.add(increments0);
CreateIncrementRequest increments1 = new CreateIncrementRequest();
increments1.setValue(38.84);
increments1.setIncrementType("increment_type4");
increments1.setItemId("item_id8");

increments.add(increments1);
CreateIncrementRequest increments2 = new CreateIncrementRequest();
increments2.setValue(38.85);
increments2.setIncrementType("increment_type5");
increments2.setItemId("item_id7");

increments.add(increments2);

body.setIncrements(increments);


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
GetIncrementResponse getIncrementById(
    final String subscriptionId,
    final String incrementId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `incrementId` | `String` | Template, Required | The increment Id |

## Response Type

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

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
GetSubscriptionResponse updateSubscriptionAffiliationId(
    final String subscriptionId,
    final UpdateSubscriptionAffiliationIdRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateSubscriptionAffiliationIdRequest`](../../doc/models/update-subscription-affiliation-id-request.md) | Body, Required | Request for updating a subscription affiliation id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetSubscriptionResponse updateSubscriptionMetadata(
    final String subscriptionId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the subscrption metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest();
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


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
GetIncrementResponse deleteIncrement(
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

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

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
ListCyclesResponse getSubscriptionCycles(
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

[`ListCyclesResponse`](../../doc/models/list-cycles-response.md)

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
ListDiscountsResponse getDiscounts(
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

[`ListDiscountsResponse`](../../doc/models/list-discounts-response.md)

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
GetSubscriptionResponse updateSubscriptionBillingDate(
    final String subscriptionId,
    final UpdateSubscriptionBillingDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionBillingDateRequest`](../../doc/models/update-subscription-billing-date-request.md) | Body, Required | Request for updating the subscription billing date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetSubscriptionItemResponse deleteSubscriptionItem(
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

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

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
ListIncrementsResponse getIncrements(
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

[`ListIncrementsResponse`](../../doc/models/list-increments-response.md)

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
GetSubscriptionResponse updateSubscriptionDueDays(
    final String subscriptionId,
    final UpdateSubscriptionDueDaysRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionDueDaysRequest`](../../doc/models/update-subscription-due-days-request.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetSubscriptionResponse updateSubscriptionStartAt(
    final String subscriptionId,
    final UpdateSubscriptionStartAtRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionStartAtRequest`](../../doc/models/update-subscription-start-at-request.md) | Body, Required | Request for updating the subscription start date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetSubscriptionItemResponse updateSubscriptionItem(
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
| `body` | [`UpdateSubscriptionItemRequest`](../../doc/models/update-subscription-item-request.md) | Body, Required | Request for updating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest();
body.setDescription("description4");
body.setStatus("status2");
UpdatePricingSchemeRequest pricingScheme = new UpdatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type2");
List<UpdatePriceBracketRequest> priceBrackets = new LinkedList<>();
UpdatePriceBracketRequest priceBrackets0 = new UpdatePriceBracketRequest();
priceBrackets0.setStartQuantity(31);
priceBrackets0.setPrice(225);

priceBrackets.add(priceBrackets0);
UpdatePriceBracketRequest priceBrackets1 = new UpdatePriceBracketRequest();
priceBrackets1.setStartQuantity(32);
priceBrackets1.setPrice(226);

priceBrackets.add(priceBrackets1);

pricingScheme.setPriceBrackets(priceBrackets);

body.setPricingScheme(pricingScheme);
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
GetSubscriptionItemResponse createSubscriptionItem(
    final String subscriptionId,
    final CreateSubscriptionItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateSubscriptionItemRequest`](../../doc/models/create-subscription-item-request.md) | Body, Required | Request for creating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateSubscriptionItemRequest request = new CreateSubscriptionItemRequest();
request.setDescription("description6");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type2");
List<CreatePriceBracketRequest> priceBrackets = new LinkedList<>();
CreatePriceBracketRequest priceBrackets0 = new CreatePriceBracketRequest();
priceBrackets0.setStartQuantity(87);
priceBrackets0.setPrice(231);

priceBrackets.add(priceBrackets0);

pricingScheme.setPriceBrackets(priceBrackets);

request.setPricingScheme(pricingScheme);
request.setId("id6");
request.setPlanItemId("plan_item_id6");
List<CreateDiscountRequest> discounts = new LinkedList<>();
CreateDiscountRequest discounts0 = new CreateDiscountRequest();
discounts0.setValue(199.99);
discounts0.setDiscountType("discount_type5");
discounts0.setItemId("item_id7");

discounts.add(discounts0);
CreateDiscountRequest discounts1 = new CreateDiscountRequest();
discounts1.setValue(200);
discounts1.setDiscountType("discount_type6");
discounts1.setItemId("item_id8");

discounts.add(discounts1);

request.setDiscounts(discounts);
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
GetSubscriptionResponse getSubscription(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
ListUsagesResponse getUsages(
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

[`ListUsagesResponse`](../../doc/models/list-usages-response.md)

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
GetSubscriptionResponse updateLatestPeriodEndAt(
    final String subscriptionId,
    final UpdateCurrentCycleEndDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateCurrentCycleEndDateRequest`](../../doc/models/update-current-cycle-end-date-request.md) | Body, Required | Request for updating the end date of the current signature cycle |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetSubscriptionResponse updateSubscriptionMiniumPrice(
    final String subscriptionId,
    final UpdateSubscriptionMinimumPriceRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionMinimumPriceRequest`](../../doc/models/update-subscription-minimum-price-request.md) | Body, Required | Request da requisição com o valor mínimo que será configurado |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

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
GetPeriodResponse getSubscriptionCycleById(
    final String subscriptionId,
    final String cycleId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `cycleId` | `String` | Template, Required | - |

## Response Type

[`GetPeriodResponse`](../../doc/models/get-period-response.md)

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
GetUsageReportResponse getUsageReport(
    final String subscriptionId,
    final String periodId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `periodId` | `String` | Template, Required | The period Id |

## Response Type

[`GetUsageReportResponse`](../../doc/models/get-usage-report-response.md)

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
GetSubscriptionResponse updateSplitSubscription(
    final String id,
    final UpdateSubscriptionSplitRequest request)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Subscription's id |
| `request` | [`UpdateSubscriptionSplitRequest`](../../doc/models/update-subscription-split-request.md) | Body, Required | - |

## Response Type

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String id = "id0";
UpdateSubscriptionSplitRequest request = new UpdateSubscriptionSplitRequest();
request.setEnabled(false);
List<CreateSplitRequest> rules = new LinkedList<>();
CreateSplitRequest rules0 = new CreateSplitRequest();
rules0.setType("type6");
rules0.setAmount(222);
rules0.setRecipientId("recipient_id6");

rules.add(rules0);
CreateSplitRequest rules1 = new CreateSplitRequest();
rules1.setType("type5");
rules1.setAmount(223);
rules1.setRecipientId("recipient_id5");

rules.add(rules1);
CreateSplitRequest rules2 = new CreateSplitRequest();
rules2.setType("type4");
rules2.setAmount(224);
rules2.setRecipientId("recipient_id4");

rules.add(rules2);

request.setRules(rules);

try {
    GetSubscriptionResponse response = subscriptionsController.updateSplitSubscription(id, request);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

