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
GetPlanResponse getPlan(
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
GetPlanResponse updatePlan(
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
List<Integer> installments = new LinkedList<>();
installments.add(151);
installments.add(152);

request.setInstallments(installments);
request.setStatementDescriptor("statement_descriptor6");
request.setCurrency("currency6");
request.setInterval("interval4");
request.setIntervalCount(114);
List<String> paymentMethods = new LinkedList<>();
paymentMethods.add("payment_methods1");
paymentMethods.add("payment_methods0");
paymentMethods.add("payment_methods9");

request.setPaymentMethods(paymentMethods);
request.setBillingType("billing_type0");
request.setStatus("status8");
request.setShippable(false);
List<Integer> billingDays = new LinkedList<>();
billingDays.add(115);

request.setBillingDays(billingDays);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


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
GetPlanResponse updatePlanMetadata(
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
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


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
GetPlanItemResponse deletePlanItem(
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
ListPlansResponse getPlans(
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
GetPlanItemResponse getPlanItem(
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
GetPlanResponse deletePlan(
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
GetPlanItemResponse updatePlanItem(
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
GetPlanItemResponse createPlanItem(
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
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type2");

request.setPricingScheme(pricingScheme);
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
GetPlanResponse createPlan(
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
List<CreatePlanItemRequest> items = new LinkedList<>();
CreatePlanItemRequest items0 = new CreatePlanItemRequest();
items0.setName("name3");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type5");

items0.setPricingScheme(pricingScheme);
items0.setId("id3");
items0.setDescription("description3");

items.add(items0);
CreatePlanItemRequest items1 = new CreatePlanItemRequest();
items1.setName("name4");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type4");

items1.setPricingScheme(pricingScheme);
items1.setId("id4");
items1.setDescription("description4");

items.add(items1);
CreatePlanItemRequest items2 = new CreatePlanItemRequest();
items2.setName("name5");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type3");

items2.setPricingScheme(pricingScheme);
items2.setId("id5");
items2.setDescription("description5");

items.add(items2);

body.setItems(items);
body.setShippable(false);
List<String> paymentMethods = new LinkedList<>();
paymentMethods.add("payment_methods9");

body.setPaymentMethods(paymentMethods);
List<Integer> installments = new LinkedList<>();
installments.add(207);

body.setInstallments(installments);
body.setCurrency("currency6");
body.setInterval("interval6");
body.setIntervalCount(170);
List<Integer> billingDays = new LinkedList<>();
billingDays.add(201);
billingDays.add(200);

body.setBillingDays(billingDays);
body.setBillingType("billing_type0");
CreatePricingSchemeRequest pricingScheme = new CreatePricingSchemeRequest();
pricingScheme.setSchemeType("scheme_type2");

body.setPricingScheme(pricingScheme);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata8");

body.setMetadata(metadata);


try {
    GetPlanResponse response = plansController.createPlan(body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

