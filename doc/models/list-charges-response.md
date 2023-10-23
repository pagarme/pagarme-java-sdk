
# List Charges Response

Response object for listing charges

## Structure

`ListChargesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetChargeResponse>`](../../doc/models/get-charge-response.md) | Optional | The charge objects | List<GetChargeResponse> getData() | setData(List<GetChargeResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "code": "code8",
      "gateway_id": "gateway_id0",
      "amount": 236,
      "status": "status2"
    },
    {
      "id": "id0",
      "code": "code8",
      "gateway_id": "gateway_id0",
      "amount": 236,
      "status": "status2"
    },
    {
      "id": "id0",
      "code": "code8",
      "gateway_id": "gateway_id0",
      "amount": 236,
      "status": "status2"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

