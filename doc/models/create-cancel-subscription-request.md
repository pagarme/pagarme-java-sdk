
# Create Cancel Subscription Request

Request for canceling a subscription

## Structure

`CreateCancelSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CancelPendingInvoices` | `boolean` | Required | Indicates if the pending invoices must also be canceled.<br><br>**Default**: `true` | boolean getCancelPendingInvoices() | setCancelPendingInvoices(boolean cancelPendingInvoices) |

## Example (as JSON)

```json
{
  "cancel_pending_invoices": true
}
```

