
# List Plans Response

Response object for listing plans

## Structure

`ListPlansResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetPlanResponse>`](../../doc/models/get-plan-response.md) | Optional | The plan objects | List<GetPlanResponse> getData() | setData(List<GetPlanResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "name": "name5",
      "description": "description5",
      "url": "url9",
      "statement_descriptor": "statement_descriptor5"
    },
    {
      "id": "id6",
      "name": "name6",
      "description": "description6",
      "url": "url0",
      "statement_descriptor": "statement_descriptor6"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

