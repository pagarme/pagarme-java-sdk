
# List Order Response

Response object for listing order objects

## Structure

`ListOrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetOrderResponse>`](../../doc/models/get-order-response.md) | Optional | The order object | List<GetOrderResponse> getData() | setData(List<GetOrderResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "code": "code8",
      "amount": 236,
      "currency": "currency0",
      "closed": false
    },
    {
      "id": "id0",
      "code": "code8",
      "amount": 236,
      "currency": "currency0",
      "closed": false
    },
    {
      "id": "id0",
      "code": "code8",
      "amount": 236,
      "currency": "currency0",
      "closed": false
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

