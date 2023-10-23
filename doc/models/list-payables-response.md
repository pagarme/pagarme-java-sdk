
# List Payables Response

Response object for listing payable objects

## Structure

`ListPayablesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetPayableResponse>`](../../doc/models/get-payable-response.md) | Optional | The payable object | List<GetPayableResponse> getData() | setData(List<GetPayableResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": 138,
      "status": "status2",
      "amount": 236,
      "fee": 194,
      "anticipation_fee": 142
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

