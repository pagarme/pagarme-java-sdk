
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
      "id": "id5",
      "code": "code3",
      "gateway_id": "gateway_id5",
      "amount": 121,
      "status": "status7"
    },
    {
      "id": "id6",
      "code": "code4",
      "gateway_id": "gateway_id6",
      "amount": 122,
      "status": "status8"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

