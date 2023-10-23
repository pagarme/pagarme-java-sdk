
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
      "id": "id0",
      "name": "name0",
      "description": "description0",
      "url": "url4",
      "statement_descriptor": "statement_descriptor0"
    },
    {
      "id": "id0",
      "name": "name0",
      "description": "description0",
      "url": "url4",
      "statement_descriptor": "statement_descriptor0"
    },
    {
      "id": "id0",
      "name": "name0",
      "description": "description0",
      "url": "url4",
      "statement_descriptor": "statement_descriptor0"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

