
# Get Transaction Response

Generic response object for getting a transaction.

## Structure

`GetTransactionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GatewayId` | `String` | Optional | Gateway transaction id | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `Integer` | Optional | Amount in cents | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | Transaction status | String getStatus() | setStatus(String status) |
| `Success` | `Boolean` | Optional | Indicates if the transaction ocurred successfuly | Boolean getSuccess() | setSuccess(Boolean success) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AttemptCount` | `Integer` | Optional | Number of attempts tried | Integer getAttemptCount() | setAttemptCount(Integer attemptCount) |
| `MaxAttempts` | `Integer` | Optional | Max attempts | Integer getMaxAttempts() | setMaxAttempts(Integer maxAttempts) |
| `Splits` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Optional | Splits | List<GetSplitResponse> getSplits() | setSplits(List<GetSplitResponse> splits) |
| `NextAttempt` | `LocalDateTime` | Optional | Date and time of the next attempt | LocalDateTime getNextAttempt() | setNextAttempt(LocalDateTime nextAttempt) |
| `TransactionType` | `String` | Optional | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Id` | `String` | Optional | Código da transação | String getId() | setId(String id) |
| `GatewayResponse` | [`GetGatewayResponseResponse`](../../doc/models/get-gateway-response-response.md) | Optional | The Gateway Response | GetGatewayResponseResponse getGatewayResponse() | setGatewayResponse(GetGatewayResponseResponse gatewayResponse) |
| `AntifraudResponse` | [`GetAntifraudResponse`](../../doc/models/get-antifraud-response.md) | Optional | - | GetAntifraudResponse getAntifraudResponse() | setAntifraudResponse(GetAntifraudResponse antifraudResponse) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Split` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Optional | - | List<GetSplitResponse> getSplit() | setSplit(List<GetSplitResponse> split) |
| `Interest` | [`GetInterestResponse`](../../doc/models/get-interest-response.md) | Optional | - | GetInterestResponse getInterest() | setInterest(GetInterestResponse interest) |
| `Fine` | [`GetFineResponse`](../../doc/models/get-fine-response.md) | Optional | - | GetFineResponse getFine() | setFine(GetFineResponse fine) |
| `MaxDaysToPayPastDue` | `Integer` | Optional | - | Integer getMaxDaysToPayPastDue() | setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) |

## Example (as JSON)

```json
{
  "gateway_id": null,
  "amount": null,
  "status": null,
  "success": null,
  "created_at": null,
  "updated_at": null,
  "attempt_count": null,
  "max_attempts": null,
  "splits": null,
  "next_attempt": null,
  "transaction_type": "transaction",
  "id": null,
  "gateway_response": null,
  "antifraud_response": null,
  "metadata": null,
  "split": null,
  "interest": null,
  "fine": null,
  "max_days_to_pay_past_due": null
}
```

