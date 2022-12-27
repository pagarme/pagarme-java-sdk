
# Get Split Options Response

## Structure

`GetSplitOptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Liable` | `Boolean` | Required | - | Boolean getLiable() | setLiable(Boolean liable) |
| `ChargeProcessingFee` | `Boolean` | Required | - | Boolean getChargeProcessingFee() | setChargeProcessingFee(Boolean chargeProcessingFee) |
| `ChargeRemainderFee` | `String` | Required | - | String getChargeRemainderFee() | setChargeRemainderFee(String chargeRemainderFee) |

## Example (as JSON)

```json
{
  "liable": false,
  "charge_processing_fee": false,
  "charge_remainder_fee": "charge_remainder_fee8"
}
```

