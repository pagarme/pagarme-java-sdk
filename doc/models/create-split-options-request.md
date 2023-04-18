
# Create Split Options Request

The Split Options Request

## Structure

`CreateSplitOptionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Liable` | `Boolean` | Optional | Liable options | Boolean getLiable() | setLiable(Boolean liable) |
| `ChargeProcessingFee` | `Boolean` | Optional | Charge processing fee | Boolean getChargeProcessingFee() | setChargeProcessingFee(Boolean chargeProcessingFee) |
| `ChargeRemainderFee` | `Boolean` | Optional | - | Boolean getChargeRemainderFee() | setChargeRemainderFee(Boolean chargeRemainderFee) |

## Example (as JSON)

```json
{
  "liable": false,
  "charge_processing_fee": false,
  "charge_remainder_fee": false
}
```

