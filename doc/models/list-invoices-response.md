
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
      "id": "id0",
      "code": "code8",
      "url": "url4",
      "amount": 236,
      "status": "status2"
    },
    {
      "id": "id0",
      "code": "code8",
      "url": "url4",
      "amount": 236,
      "status": "status2"
    },
    {
      "id": "id0",
      "code": "code8",
      "url": "url4",
      "amount": 236,
      "status": "status2"
    }
  ],
  "paging": {
    "total": 6,
    "previous": "previous2",
    "next": "next8"
  }
}
```

