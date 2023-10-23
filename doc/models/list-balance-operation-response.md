
# List Balance Operation Response

Response object for listing BalanceOperation objects

## Structure

`ListBalanceOperationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetBalanceOperationResponse>`](../../doc/models/get-balance-operation-response.md) | Optional | The BalanceOperation object | List<GetBalanceOperationResponse> getData() | setData(List<GetBalanceOperationResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | - | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "status": "status2",
      "balance_amount": "balance_amount0",
      "balance_old_amount": "balance_old_amount8",
      "type": "type0"
    },
    {
      "id": "id0",
      "status": "status2",
      "balance_amount": "balance_amount0",
      "balance_old_amount": "balance_old_amount8",
      "type": "type0"
    },
    {
      "id": "id0",
      "status": "status2",
      "balance_amount": "balance_amount0",
      "balance_old_amount": "balance_old_amount8",
      "type": "type0"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

