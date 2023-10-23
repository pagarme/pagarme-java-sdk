
# List Increments Response

## Structure

`ListIncrementsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetIncrementResponse>`](../../doc/models/get-increment-response.md) | Optional | The Increments response | List<GetIncrementResponse> getData() | setData(List<GetIncrementResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id0",
      "value": 95.62,
      "increment_type": "increment_type2",
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

