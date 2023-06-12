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
    GetPeriodResponse result = subscriptionsController.renewSubscription(subscriptionId, null);
    System.out.println(result);
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
UpdateSubscriptionCardRequest request = new UpdateSubscriptionCardRequest.Builder(
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    "card_id2"
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionCard(subscriptionId, request, null);
    System.out.println(result);
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
    GetUsageResponse result = subscriptionsController.deleteUsage(subscriptionId, itemId, usageId, null);
    System.out.println(result);
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
CreateDiscountRequest request = new CreateDiscountRequest.Builder(
    185.28,
    "discount_type4",
    "item_id6"
)
.build();


try {
    GetDiscountResponse result = subscriptionsController.createDiscount(subscriptionId, request, null);
    System.out.println(result);
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
    GetUsageResponse result = subscriptionsController.createAnUsage(subscriptionId, itemId, null);
    System.out.println(result);
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
UpdateCurrentCycleStatusRequest request = new UpdateCurrentCycleStatusRequest.Builder(
    "status8"
)
.build();


try {
    subscriptionsController.updateCurrentCycleStatus(subscriptionId, request, null);
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
    GetDiscountResponse result = subscriptionsController.deleteDiscount(subscriptionId, discountId, null);
    System.out.println(result);
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
    ListSubscriptionItemsResponse result = subscriptionsController.getSubscriptionItems(subscriptionId, null, null, null, null, null, null, null, null);
    System.out.println(result);
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
UpdateSubscriptionPaymentMethodRequest request = new UpdateSubscriptionPaymentMethodRequest.Builder(
    "payment_method4",
    "card_id2",
    new CreateCardRequest.Builder()
        .type("credit")
        .build()
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionPaymentMethod(subscriptionId, request, null);
    System.out.println(result);
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
    GetSubscriptionItemResponse result = subscriptionsController.getSubscriptionItem(subscriptionId, itemId);
    System.out.println(result);
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
    ListSubscriptionsResponse result = subscriptionsController.getSubscriptions(null, null, null, null, null, null, null, null, null, null, null, null);
    System.out.println(result);
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
CreateCancelSubscriptionRequest request = new CreateCancelSubscriptionRequest.Builder(
    true
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.cancelSubscription(subscriptionId, request, null);
    System.out.println(result);
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
CreateIncrementRequest request = new CreateIncrementRequest.Builder(
    185.28,
    "increment_type8",
    "item_id6"
)
.build();


try {
    GetIncrementResponse result = subscriptionsController.createIncrement(subscriptionId, request, null);
    System.out.println(result);
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
CreateUsageRequest body = new CreateUsageRequest.Builder(
    156,
    "description4",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


try {
    GetUsageResponse result = subscriptionsController.createUsage(subscriptionId, itemId, body, null);
    System.out.println(result);
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
    GetDiscountResponse result = subscriptionsController.getDiscountById(subscriptionId, discountId);
    System.out.println(result);
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
CreateSubscriptionRequest body = new CreateSubscriptionRequest.Builder(
    new CreateCustomerRequest.Builder(
        "{\\n    \"name\": \"Tony Stark\"\\n}",
        "email2",
        "document2",
        "type6",
        new CreateAddressRequest.Builder(
            "street0",
            "number8",
            "zip_code4",
            "neighborhood6",
            "city0",
            "state6",
            "country4",
            "complement6",
            new LinkedHashMap<String, String>() {{
                put("key0", "metadata7");
                put("key1", "metadata6");
            }},
            "line_16",
            "line_28"
        )
        .build(),
        new LinkedHashMap<String, String>() {{
            put("key0", "metadata9");
            put("key1", "metadata0");
        }},
        new CreatePhonesRequest.Builder()
            .build(),
        "code2"
    )
    .build(),
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    "code4",
    "payment_method4",
    "billing_type0",
    "statement_descriptor6",
    "description4",
    "currency6",
    "interval6",
    170,
    new CreatePricingSchemeRequest.Builder(
        "scheme_type2"
    )
    .build(),
    Arrays.asList(
        new CreateSubscriptionItemRequest.Builder(
            "description3",
            new CreatePricingSchemeRequest.Builder(
                "scheme_type5"
            )
            .build(),
            "id3",
            "plan_item_id3",
            Arrays.asList(
                new CreateDiscountRequest.Builder(
                    65.46,
                    "discount_type2",
                    "item_id4"
                )
                .build()
            ),
            "name3"
        )
        .build()
    ),
    new CreateShippingRequest.Builder(
        140,
        "description0",
        "recipient_name8",
        "recipient_phone2",
        "address_id0",
        new CreateAddressRequest.Builder(
            "street6",
            "number4",
            "zip_code0",
            "neighborhood2",
            "city6",
            "state2",
            "country0",
            "complement2",
            new LinkedHashMap<String, String>() {{
                put("key0", "metadata3");
                put("key1", "metadata2");
            }},
            "line_10",
            "line_24"
        )
        .build(),
        "type0"
    )
    .build(),
    Arrays.asList(
        new CreateDiscountRequest.Builder(
            95.59,
            "discount_type5",
            "item_id7"
        )
        .build()
    ),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata7");
        put("key1", "metadata8");
    }},
    Arrays.asList(
        new CreateIncrementRequest.Builder(
            38.83,
            "increment_type3",
            "item_id9"
        )
        .build()
    )
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.createSubscription(body, null);
    System.out.println(result);
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
    GetIncrementResponse result = subscriptionsController.getIncrementById(subscriptionId, incrementId);
    System.out.println(result);
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
UpdateSubscriptionAffiliationIdRequest request = new UpdateSubscriptionAffiliationIdRequest.Builder(
    "gateway_affiliation_id2"
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionAffiliationId(subscriptionId, request, null);
    System.out.println(result);
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
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionMetadata(subscriptionId, request, null);
    System.out.println(result);
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
    GetIncrementResponse result = subscriptionsController.deleteIncrement(subscriptionId, incrementId, null);
    System.out.println(result);
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
    ListCyclesResponse result = subscriptionsController.getSubscriptionCycles(subscriptionId, page, size);
    System.out.println(result);
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
    ListDiscountsResponse result = subscriptionsController.getDiscounts(subscriptionId, page, size);
    System.out.println(result);
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
UpdateSubscriptionBillingDateRequest request = new UpdateSubscriptionBillingDateRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionBillingDate(subscriptionId, request, null);
    System.out.println(result);
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
    GetSubscriptionItemResponse result = subscriptionsController.deleteSubscriptionItem(subscriptionId, subscriptionItemId, null);
    System.out.println(result);
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
    ListIncrementsResponse result = subscriptionsController.getIncrements(subscriptionId, null, null);
    System.out.println(result);
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
UpdateSubscriptionDueDaysRequest request = new UpdateSubscriptionDueDaysRequest.Builder(
    226
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionDueDays(subscriptionId, request, null);
    System.out.println(result);
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
UpdateSubscriptionStartAtRequest request = new UpdateSubscriptionStartAtRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionStartAt(subscriptionId, request, null);
    System.out.println(result);
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
UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest.Builder(
    "description4",
    "status2",
    new UpdatePricingSchemeRequest.Builder(
        "scheme_type2",
        Arrays.asList(
            new UpdatePriceBracketRequest.Builder(
                31,
                225
            )
            .build()
        )
    )
    .build(),
    "name6"
)
.build();


try {
    GetSubscriptionItemResponse result = subscriptionsController.updateSubscriptionItem(subscriptionId, itemId, body, null);
    System.out.println(result);
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
CreateSubscriptionItemRequest request = new CreateSubscriptionItemRequest.Builder(
    "description6",
    new CreatePricingSchemeRequest.Builder(
        "scheme_type2"
    )
    .build(),
    "id6",
    "plan_item_id6",
    Arrays.asList(
        new CreateDiscountRequest.Builder(
            199.99,
            "discount_type5",
            "item_id7"
        )
        .build()
    ),
    "name6"
)
.build();


try {
    GetSubscriptionItemResponse result = subscriptionsController.createSubscriptionItem(subscriptionId, request, null);
    System.out.println(result);
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
    GetSubscriptionResponse result = subscriptionsController.getSubscription(subscriptionId);
    System.out.println(result);
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
    ListUsagesResponse result = subscriptionsController.getUsages(subscriptionId, itemId, null, null, null, null, null, null);
    System.out.println(result);
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
UpdateCurrentCycleEndDateRequest request = new UpdateCurrentCycleEndDateRequest.Builder()
    .build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateLatestPeriodEndAt(subscriptionId, request, null);
    System.out.println(result);
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
UpdateSubscriptionMinimumPriceRequest request = new UpdateSubscriptionMinimumPriceRequest.Builder()
    .build();


try {
    GetSubscriptionResponse result = subscriptionsController.updateSubscriptionMiniumPrice(subscriptionId, request, null);
    System.out.println(result);
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
    GetPeriodResponse result = subscriptionsController.getSubscriptionCycleById(subscriptionId, cycleId);
    System.out.println(result);
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
    GetUsageReportResponse result = subscriptionsController.getUsageReport(subscriptionId, periodId);
    System.out.println(result);
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
UpdateSubscriptionSplitRequest request = new UpdateSubscriptionSplitRequest.Builder(
    false,
    Arrays.asList(
        new CreateSplitRequest.Builder(
            "type6",
            222,
            "recipient_id6"
        )
        .build()
    )
)
.build();

try {
    GetSubscriptionResponse result = subscriptionsController.updateSplitSubscription(id, request);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

