
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
      "id": "id5",
      "status": "status7",
      "balance_amount": "balance_amount5",
      "balance_old_amount": "balance_old_amount3",
      "type": "type5"
    },
    {
      "id": "id6",
      "status": "status8",
      "balance_amount": "balance_amount6",
      "balance_old_amount": "balance_old_amount4",
      "type": "type6"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

