
# List Invoices Response

Response object for listing invoices

## Structure

`ListInvoicesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetInvoiceResponse>`](../../doc/models/get-invoice-response.md) | Optional | The Invoice objects | List<GetInvoiceResponse> getData() | setData(List<GetInvoiceResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": [
    {
      "id": "id5",
      "code": "code3",
      "url": "url9",
      "amount": 121,
      "status": "status7"
    },
    {
      "id": "id6",
      "code": "code4",
      "url": "url0",
      "amount": 122,
      "status": "status8"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

