# Plans

```java
PlansController plansController = client.getPlansController();
```

## Class Name

`PlansController`

## Methods

* [Get Plan](../../doc/controllers/plans.md#get-plan)
* [Update Plan](../../doc/controllers/plans.md#update-plan)
* [Update Plan Metadata](../../doc/controllers/plans.md#update-plan-metadata)
* [Delete Plan Item](../../doc/controllers/plans.md#delete-plan-item)
* [Get Plans](../../doc/controllers/plans.md#get-plans)
* [Get Plan Item](../../doc/controllers/plans.md#get-plan-item)
* [Delete Plan](../../doc/controllers/plans.md#delete-plan)
* [Update Plan Item](../../doc/controllers/plans.md#update-plan-item)
* [Create Plan Item](../../doc/controllers/plans.md#create-plan-item)
* [Create Plan](../../doc/controllers/plans.md#create-plan)


# Get Plan

Gets a plan

```java
CompletableFuture<GetPlanResponse> getPlan(
    final String planId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |

## Response Type

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";

try {
    GetPlanResponse response = plansController.getPlan(planId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Plan

Updates a plan

```java
CompletableFuture<GetPlanResponse> updatePlan(
    final String planId,
    final UpdatePlanRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `request` | [`UpdatePlanRequest`](../../doc/models/update-plan-request.md) | Body, Required | Request for updating a plan |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";
UpdatePlanRequest request = new UpdatePlanRequest();
request.setName("name6");
request.setDescription("description6");
request.setInstallments(new LinkedList<>());
request.getInstallments().add(151);
request.getInstallments().add(152);
request.setStatementDescriptor("statement_descriptor6");
request.setCurrency("currency6");
request.setInterval("interval4");
request.setIntervalCount(114);
request.setPaymentMethods(new LinkedList<>());
request.getPaymentMethods().add("payment_methods1");
request.getPaymentMethods().add("payment_methods0");
request.getPaymentMethods().add("payment_methods9");
request.setBillingType("billing_type0");
request.setStatus("status8");
request.setShippable(false);
request.setBillingDays(new LinkedList<>());
request.getBillingDays().add(115);
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

try {
    GetPlanResponse response = plansController.updatePlan(planId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Plan Metadata

Updates the metadata from a plan

```java
CompletableFuture<GetPlanResponse> updatePlanMetadata(
    final String planId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | The plan id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the plan metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest();
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

try {
    GetPlanResponse response = plansController.updatePlanMetadata(planId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Plan Item

Removes an item from a plan

```java
CompletableFuture<GetPlanItemResponse> deletePlanItem(
    final String planId,
    final String planItemId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";

try {
    GetPlanItemResponse response = plansController.deletePlanItem(planId, planItemId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Plans

Gets all plans

```java
CompletableFuture<ListPlansResponse> getPlans(
    final Integer page,
    final Integer size,
    final String name,
    final String status,
    final String billingType,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `name` | `String` | Query, Optional | Filter for Plan's name |
| `status` | `String` | Query, Optional | Filter for Plan's status |
| `billingType` | `String` | Query, Optional | Filter for plan's billing type |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for plan's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for plan's creation date end range |

## Response Type

[`ListPlansResponse`](../../doc/models/list-plans-response.md)

## Example Usage

```java
try {
    ListPlansResponse response = plansController.getPlans(null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Plan Item

Gets a plan item

```java
CompletableFuture<GetPlanItemResponse> getPlanItem(
    final String planId,
    final String planItemId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |

## Response Type

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";

try {
    GetPlanItemResponse response = plansController.getPlanItem(planId, planItemId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Plan

Deletes a plan

```java
CompletableFuture<GetPlanResponse> deletePlan(
    final String planId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";

try {
    GetPlanResponse response = plansController.deletePlan(planId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Plan Item

Updates a plan item

```java
CompletableFuture<GetPlanItemResponse> updatePlanItem(
    final String planId,
    final String planItemId,
    final UpdatePlanItemRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |
| `body` | [`UpdatePlanItemRequest`](../../doc/models/update-plan-item-request.md) | Body, Required | Request for updating the plan item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";
UpdatePlanItemRequest body = new UpdatePlanItemRequest();
body.setName("name6");
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


try {
    GetPlanItemResponse response = plansController.updatePlanItem(planId, planItemId, body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Plan Item

Adds a new item to a plan

```java
CompletableFuture<GetPlanItemResponse> createPlanItem(
    final String planId,
    final CreatePlanItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `request` | [`CreatePlanItemRequest`](../../doc/models/create-plan-item-request.md) | Body, Required | Request for creating a plan item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
CreatePlanItemRequest request = new CreatePlanItemRequest();
request.setName("name6");
request.setPricingScheme(new CreatePricingSchemeRequest());
request.getPricingScheme().setSchemeType("scheme_type2");
request.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest requestPricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
requestPricingSchemePriceBrackets0.setStartQuantity(87);
requestPricingSchemePriceBrackets0.setPrice(231);
request.getPricingScheme().getPriceBrackets().add(requestPricingSchemePriceBrackets0);

request.setId("id6");
request.setDescription("description6");

try {
    GetPlanItemResponse response = plansController.createPlanItem(planId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Plan

Creates a new plan

```java
CompletableFuture<GetPlanResponse> createPlan(
    final CreatePlanRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreatePlanRequest`](../../doc/models/create-plan-request.md) | Body, Required | Request for creating a plan |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
CreatePlanRequest body = new CreatePlanRequest();
body.setName("name6");
body.setDescription("description4");
body.setStatementDescriptor("statement_descriptor6");
body.setItems(new LinkedList<>());

CreatePlanItemRequest bodyItems0 = new CreatePlanItemRequest();
bodyItems0.setName("name3");
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
bodyItems0.setDescription("description3");
body.getItems().add(bodyItems0);

CreatePlanItemRequest bodyItems1 = new CreatePlanItemRequest();
bodyItems1.setName("name4");
bodyItems1.setPricingScheme(new CreatePricingSchemeRequest());
bodyItems1.getPricingScheme().setSchemeType("scheme_type4");
bodyItems1.getPricingScheme().setPriceBrackets(new LinkedList<>());

CreatePriceBracketRequest bodyItems1PricingSchemePriceBrackets0 = new CreatePriceBracketRequest();
bodyItems1PricingSchemePriceBrackets0.setStartQuantity(227);
bodyItems1PricingSchemePriceBrackets0.setPrice(91);
bodyItems1.getPricingScheme().getPriceBrackets().add(bodyItems1PricingSchemePriceBrackets0);

bodyItems1.setId("id4");
bodyItems1.setDescription("description4");
body.getItems().add(bodyItems1);

CreatePlanItemRequest bodyItems2 = new CreatePlanItemRequest();
bodyItems2.setName("name5");
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
bodyItems2.setDescription("description5");
body.getItems().add(bodyItems2);

body.setShippable(false);
body.setPaymentMethods(new LinkedList<>());
body.getPaymentMethods().add("payment_methods9");
body.setInstallments(new LinkedList<>());
body.getInstallments().add(207);
body.setCurrency("currency6");
body.setInterval("interval6");
body.setIntervalCount(170);
body.setBillingDays(new LinkedList<>());
body.getBillingDays().add(201);
body.getBillingDays().add(200);
body.setBillingType("billing_type0");
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

body.setMetadata(new LinkedHashMap<>());
body.getMetadata().put("key0", "metadata7");
body.getMetadata().put("key1", "metadata8");

try {
    GetPlanResponse response = plansController.createPlan(body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

