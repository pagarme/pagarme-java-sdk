
# List Anticipation Response

Anticipations

## Structure

`ListAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetAnticipationResponse>`](../../doc/models/get-anticipation-response.md) | Optional | Anticipations | List<GetAnticipationResponse> getData() | setData(List<GetAnticipationResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "requested_amount": 16,
      "approved_amount": 70,
      "recipient": {
        "id": "id8",
        "name": "name8",
        "email": "email8",
        "document": "document8",
        "description": "description2"
      },
      "pgid": "pgid6"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

