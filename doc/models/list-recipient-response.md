
# List Recipient Response

Response for the listing recipient method

## Structure

`ListRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetRecipientResponse>`](../../doc/models/get-recipient-response.md) | Optional | Recipients | List<GetRecipientResponse> getData() | setData(List<GetRecipientResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "name": "name5",
      "email": "email9",
      "document": "document9",
      "description": "description5"
    },
    {
      "id": "id6",
      "name": "name6",
      "email": "email0",
      "document": "document0",
      "description": "description6"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

