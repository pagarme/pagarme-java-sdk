
# List Transactions Files Response

Response object for listing of transactions files

## Structure

`ListTransactionsFilesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetTransactionReportFileResponse>`](../../doc/models/get-transaction-report-file-response.md) | Optional | - | List<GetTransactionReportFileResponse> getData() | setData(List<GetTransactionReportFileResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": null,
  "paging": null
}
```

