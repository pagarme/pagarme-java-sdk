
# List Cards Response

Response object for listing cards

## Structure

`ListCardsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetCardResponse>`](../../doc/models/get-card-response.md) | Optional | The card objects | List<GetCardResponse> getData() | setData(List<GetCardResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "last_four_digits": "last_four_digits1",
      "brand": "brand9",
      "holder_name": "holder_name1",
      "exp_month": 125
    },
    {
      "id": "id6",
      "last_four_digits": "last_four_digits2",
      "brand": "brand0",
      "holder_name": "holder_name2",
      "exp_month": 126
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

