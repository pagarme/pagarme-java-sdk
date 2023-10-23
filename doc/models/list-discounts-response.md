
# List Discounts Response

## Structure

`ListDiscountsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetDiscountResponse>`](../../doc/models/get-discount-response.md) | Optional | The Discounts response | List<GetDiscountResponse> getData() | setData(List<GetDiscountResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "value": 95.62,
      "discount_type": "discount_type8",
      "status": "status2",
      "created_at": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": "id0",
      "value": 95.62,
      "discount_type": "discount_type8",
      "status": "status2",
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

