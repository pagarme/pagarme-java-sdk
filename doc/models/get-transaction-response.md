
# Get Transaction Response

Generic response object for getting a transaction.

## Structure

`GetTransactionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GatewayId` | `String` | Required | Gateway transaction id | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `int` | Required | Amount in cents | int getAmount() | setAmount(int amount) |
| `Status` | `String` | Required | Transaction status | String getStatus() | setStatus(String status) |
| `Success` | `boolean` | Required | Indicates if the transaction ocurred successfuly | boolean getSuccess() | setSuccess(boolean success) |
| `CreatedAt` | `LocalDateTime` | Required | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AttemptCount` | `int` | Required | Number of attempts tried | int getAttemptCount() | setAttemptCount(int attemptCount) |
| `MaxAttempts` | `int` | Required | Max attempts | int getMaxAttempts() | setMaxAttempts(int maxAttempts) |
| `Splits` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Required | Splits | List<GetSplitResponse> getSplits() | setSplits(List<GetSplitResponse> splits) |
| `NextAttempt` | `LocalDateTime` | Optional | Date and time of the next attempt | LocalDateTime getNextAttempt() | setNextAttempt(LocalDateTime nextAttempt) |
| `TransactionType` | `String` | Optional | - | String getTransactionType() | setTransactionType(String transactionType) |
| `Id` | `String` | Required | Código da transação | String getId() | setId(String id) |
| `GatewayResponse` | [`GetGatewayResponseResponse`](../../doc/models/get-gateway-response-response.md) | Required | The Gateway Response | GetGatewayResponseResponse getGatewayResponse() | setGatewayResponse(GetGatewayResponseResponse gatewayResponse) |
| `AntifraudResponse` | [`GetAntifraudResponse`](../../doc/models/get-antifraud-response.md) | Required | - | GetAntifraudResponse getAntifraudResponse() | setAntifraudResponse(GetAntifraudResponse antifraudResponse) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Split` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Required | - | List<GetSplitResponse> getSplit() | setSplit(List<GetSplitResponse> split) |

## Example (as JSON)

```json
{
  "gateway_id": "gateway_id0",
  "amount": 46,
  "status": "status8",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "attempt_count": 70,
  "max_attempts": 174,
  "splits": [
    {
      "type": "type4",
      "amount": 62,
      "recipient": null,
      "gateway_id": "gateway_id4",
      "options": null,
      "id": "id6"
    },
    {
      "type": "type3",
      "amount": 63,
      "recipient": null,
      "gateway_id": "gateway_id3",
      "options": null,
      "id": "id7"
    }
  ],
  "next_attempt": null,
  "transaction_type": null,
  "id": "id0",
  "gateway_response": {
    "code": "code6",
    "errors": [
      {
        "message": "message3"
      },
      {
        "message": "message4"
      },
      {
        "message": "message5"
      }
    ]
  },
  "antifraud_response": {
    "status": "status0",
    "return_code": "return_code8",
    "return_message": "return_message4",
    "provider_name": "provider_name4",
    "score": "score8"
  },
  "metadata": null,
  "split": [
    {
      "type": "type6",
      "amount": 28,
      "recipient": null,
      "gateway_id": "gateway_id6",
      "options": null,
      "id": "id4"
    },
    {
      "type": "type5",
      "amount": 27,
      "recipient": null,
      "gateway_id": "gateway_id5",
      "options": null,
      "id": "id5"
    },
    {
      "type": "type4",
      "amount": 26,
      "recipient": null,
      "gateway_id": "gateway_id4",
      "options": null,
      "id": "id6"
    }
  ]
}
```

