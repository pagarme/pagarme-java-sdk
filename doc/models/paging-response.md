
# Paging Response

Object used for returning lists of objects with pagination

## Structure

`PagingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Total` | `Integer` | Optional | Total number of pages | Integer getTotal() | setTotal(Integer total) |
| `Previous` | `String` | Optional | Previous page | String getPrevious() | setPrevious(String previous) |
| `Next` | `String` | Optional | Next page | String getNext() | setNext(String next) |

## Example (as JSON)

```json
{
  "total": null,
  "previous": null,
  "next": null
}
```

