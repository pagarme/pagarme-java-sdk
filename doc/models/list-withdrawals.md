
# List Withdrawals

## Structure

`ListWithdrawals`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetWithdrawResponse>`](../../doc/models/get-withdraw-response.md) | Required | The Increments response | List<GetWithdrawResponse> getData() | setData(List<GetWithdrawResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Required | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "gateway_id": "gateway_id5",
      "amount": 121,
      "status": "status7",
      "created_at": "2016-03-13T12:52:32.123Z"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

