
# List Cycles Response

Response object for listing subscription cycles

## Structure

`ListCyclesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetPeriodResponse>`](../../doc/models/get-period-response.md) | Optional | The subscription cycles objects | List<GetPeriodResponse> getData() | setData(List<GetPeriodResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": null,
  "paging": null
}
```

