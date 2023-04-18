# Plans

```java
PlansController plansController = client.getPlansController();
```

## Class Name

`PlansController`

## Methods

* [Get Plan](../../doc/controllers/plans.md#get-plan)
* [Delete Plan](../../doc/controllers/plans.md#delete-plan)
* [Update Plan Metadata](../../doc/controllers/plans.md#update-plan-metadata)
* [Update Plan Item](../../doc/controllers/plans.md#update-plan-item)
* [Create Plan Item](../../doc/controllers/plans.md#create-plan-item)
* [Get Plan Item](../../doc/controllers/plans.md#get-plan-item)
* [Create Plan](../../doc/controllers/plans.md#create-plan)
* [Delete Plan Item](../../doc/controllers/plans.md#delete-plan-item)
* [Get Plans](../../doc/controllers/plans.md#get-plans)
* [Update Plan](../../doc/controllers/plans.md#update-plan)


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
    GetPlanResponse result = plansController.getPlan(planId);
    System.out.println(result);
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
    GetPlanResponse result = plansController.deletePlan(planId, null);
    System.out.println(result);
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
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


try {
    GetPlanResponse result = plansController.updatePlanMetadata(planId, request, null);
    System.out.println(result);
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
UpdatePlanItemRequest body = new UpdatePlanItemRequest.Builder(
    "name6",
    "description4",
    "status2",
    new UpdatePricingSchemeRequest.Builder(
        "scheme_type2",
        Arrays.asList(
            new UpdatePriceBracketRequest.Builder(
                31,
                225
            )
            .build(),
            new UpdatePriceBracketRequest.Builder(
                32,
                226
            )
            .build()
        )
    )
    .build()
)
.build();


try {
    GetPlanItemResponse result = plansController.updatePlanItem(planId, planItemId, body, null);
    System.out.println(result);
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
CreatePlanItemRequest request = new CreatePlanItemRequest.Builder(
    "name6",
    new CreatePricingSchemeRequest.Builder(
        "scheme_type2"
    )
    .build(),
    "id6",
    "description6"
)
.build();


try {
    GetPlanItemResponse result = plansController.createPlanItem(planId, request, null);
    System.out.println(result);
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
    GetPlanItemResponse result = plansController.getPlanItem(planId, planItemId);
    System.out.println(result);
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
CreatePlanRequest body = new CreatePlanRequest.Builder(
    "name6",
    "description4",
    "statement_descriptor6",
    Arrays.asList(
        new CreatePlanItemRequest.Builder(
            "name3",
            new CreatePricingSchemeRequest.Builder(
                "scheme_type5"
            )
            .build(),
            "id3",
            "description3"
        )
        .build(),
        new CreatePlanItemRequest.Builder(
            "name4",
            new CreatePricingSchemeRequest.Builder(
                "scheme_type4"
            )
            .build(),
            "id4",
            "description4"
        )
        .build(),
        new CreatePlanItemRequest.Builder(
            "name5",
            new CreatePricingSchemeRequest.Builder(
                "scheme_type3"
            )
            .build(),
            "id5",
            "description5"
        )
        .build()
    ),
    false,
    Arrays.asList(
        "payment_methods9"
    ),
    Arrays.asList(
        207
    ),
    "currency6",
    "interval6",
    170,
    Arrays.asList(
        201,
        200
    ),
    "billing_type0",
    new CreatePricingSchemeRequest.Builder(
        "scheme_type2"
    )
    .build(),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata7");
        put("key1", "metadata8");
    }}
)
.build();


try {
    GetPlanResponse result = plansController.createPlan(body, null);
    System.out.println(result);
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
    GetPlanItemResponse result = plansController.deletePlanItem(planId, planItemId, null);
    System.out.println(result);
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
    ListPlansResponse result = plansController.getPlans(null, null, null, null, null, null, null);
    System.out.println(result);
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
UpdatePlanRequest request = new UpdatePlanRequest.Builder(
    "name6",
    "description6",
    Arrays.asList(
        151,
        152
    ),
    "statement_descriptor6",
    "currency6",
    "interval4",
    114,
    Arrays.asList(
        "payment_methods1",
        "payment_methods0",
        "payment_methods9"
    ),
    "billing_type0",
    "status8",
    false,
    Arrays.asList(
        115
    ),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


try {
    GetPlanResponse result = plansController.updatePlan(planId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

