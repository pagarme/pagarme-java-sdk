
# Create Charge Request

Request for creating a new charge

## Structure

`CreateChargeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Code | String getCode() | setCode(String code) |
| `Amount` | `int` | Required | The amount of the charge, in cents | int getAmount() | setAmount(int amount) |
| `CustomerId` | `String` | Optional | The customer's id | String getCustomerId() | setCustomerId(String customerId) |
| `Customer` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Optional | Customer data | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Payment` | [`CreatePaymentRequest`](../../doc/models/create-payment-request.md) | Required | Payment data | CreatePaymentRequest getPayment() | setPayment(CreatePaymentRequest payment) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `DueAt` | `LocalDateTime` | Optional | The charge due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `Antifraud` | [`CreateAntifraudRequest`](../../doc/models/create-antifraud-request.md) | Optional | - | CreateAntifraudRequest getAntifraud() | setAntifraud(CreateAntifraudRequest antifraud) |
| `OrderId` | `String` | Required | Order Id | String getOrderId() | setOrderId(String orderId) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateChargeRequest;

CreateChargeRequest createChargeRequest = new CreateChargeRequest.Builder(
    160,
    null,
    "order_id8"
)
.code("code2")
.customerId("customer_id2")
.customer(null)
.metadata(new LinkedHashMap<String, String>() {{
        put("key0", "metadata1");
        put("key1", "metadata0");
        put("key2", "metadata9");
    }})
.dueAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.build();
```

