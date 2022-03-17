
# List Recipient Response

Response for the listing recipient method

## Structure

`ListRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetRecipientResponse>`](../../doc/models/get-recipient-response.md) | Required | Recipients | List<GetRecipientResponse> getData() | setData(List<GetRecipientResponse> data) |
| `Paging` | [`PagingResponse`](../../doc/models/paging-response.md) | Required | Paging | PagingResponse getPaging() | setPaging(PagingResponse paging) |

## Example (as JSON)

```json
{
  "data": {
    "id": null,
    "name": null,
    "email": null,
    "document": null,
    "description": null,
    "type": null,
    "status": null,
    "created_at": null,
    "updated_at": null,
    "deleted_at": null,
    "default_bank_account": null,
    "gateway_recipients": null,
    "metadata": null,
    "code": null,
    "payment_mode": "bank_transfer"
  },
  "paging": null
}
```

