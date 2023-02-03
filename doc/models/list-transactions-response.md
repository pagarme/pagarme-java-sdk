
# List Transactions Response

Response object for listing transactions

## Structure

`ListTransactionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetTransactionResponse>`](../../doc/models/get-transaction-response.md) | Optional | The transaction objects | List<GetTransactionResponse> getData() | setData(List<GetTransactionResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Optional | Paging object | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": null,
  "paging": null
}
```

