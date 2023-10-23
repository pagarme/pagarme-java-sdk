
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
  "gateway_id": "gateway_id8",
  "amount": 40,
  "status": "status6",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "qr_code": "qr_code0",
  "qr_code_url": "qr_code_url6",
  "expires_at": "2016-03-13T12:52:32.123Z",
  "additional_information": [
    {
      "Name": "Name0",
      "Value": "Value2"
    },
    {
      "Name": "Name0",
      "Value": "Value2"
    }
  ],
  "end_to_end_id": "end_to_end_id6"
}
```

