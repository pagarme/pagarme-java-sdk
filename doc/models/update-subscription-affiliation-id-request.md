
# Update Subscription Affiliation Id Request

Request for updating a Subscription Affiliation Id

## Structure

`UpdateSubscriptionAffiliationIdRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GatewayAffiliationId` | `String` | Required | - | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |

## Example

```java
import me.pagar.api.models.UpdateSubscriptionAffiliationIdRequest;

UpdateSubscriptionAffiliationIdRequest updateSubscriptionAffiliationIdRequest = new UpdateSubscriptionAffiliationIdRequest.Builder(
    "gateway_affiliation_id6"
)
.build();
```

