
# List Payables Response

Response object for listing payable objects

## Structure

`ListPayablesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<GetPayableResponse>`](../../doc/models/get-payable-response.md) | Optional | The payable object | List<GetPayableResponse> getData() | setData(List<GetPayableResponse> data) |
| `Paging` | [`CursorPagingResponse`](../../doc/models/cursor-paging-response.md) | Required | Cursor paging response | CursorPagingResponse getPaging() | setPaging(CursorPagingResponse paging) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CursorPagingResponse;
import me.pagar.api.models.GetPayableResponse;
import me.pagar.api.models.ListPayablesResponse;

ListPayablesResponse listPayablesResponse = new ListPayablesResponse.Builder(
    new CursorPagingResponse.Builder(
        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYWxhcGlDdXJzb3IiOiJleUpoYkdjaU9pSklVekkxTmlJc0luUjVjQ0k2SWtwWFZDSjkuZXlKcFlYUWlPaUl4TnpnMU9UTXpNVGN6SWl3aVpYaHdJam94TnpnMU9UTTJOemN6TENKcFpDSTZJalF6TWpVeU1ETXhOREFpZlEuTmtrUk85Slg3eC1YMVFLZ0ZIYkw3VGw4ZVV0NkR1ZWVQVlk5a0pHNXhxNCIsImlhdCI6MTc4NTkzMzE3MywiZXhwIjoxNzg1OTM2NzczfQ.5qM-BQbArZKXbfen5NnEXq6gbhyP-DrgsG1SMrpF4Y4"
    )
    .build()
)
.data(Arrays.asList(
        new GetPayableResponse.Builder(
            "5b71f2a8b472ef521b224b75fd13c14e09d37822fd100f2cd425ef5aea02f5bf",
            "paid",
            1100,
            null,
            "ch_123",
            null,
            null,
            "re_cixm61j7e00doin6de8ocgttb",
            "ownership_assignment",
            null,
            DateTimeHelper.fromRfc8601DateTime("2025-08-21T03:00:00Z"),
            "credit_card",
            DateTimeHelper.fromRfc8601DateTime("2025-08-20T10:30:00Z"),
            "03002e00-edde-6d4c-dd9e-ffaaafac08de",
            "pp_03gd2e0o5kj37ujs38zgw9s9v"
        )
        .fee(0)
        .anticipationFee(0)
        .fraudCoverageFee(0)
        .installment(44)
        .anticipationId("anticipation_id0")
        .paymentDate(DateTimeHelper.fromRfc8601DateTime("2025-08-18T03:00:00Z"))
        .type("credit")
        .accrualAt(DateTimeHelper.fromRfc8601DateTime("2023-08-21T12:51:28Z"))
        .liquidationArrangementId(null)
        .build()
    ))
.build();
```

