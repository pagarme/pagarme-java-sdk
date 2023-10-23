
# Create Subscription Request

Request for creating a subcription

## Structure

`CreateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Required | Customer | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Required | Card | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `Code` | `String` | Required | Subscription code | String getCode() | setCode(String code) |
| `PaymentMethod` | `String` | Required | Payment method | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `BillingType` | `String` | Required | Billing type | String getBillingType() | setBillingType(String billingType) |
| `StatementDescriptor` | `String` | Required | Statement descriptor for credit card subscriptions | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Description` | `String` | Required | Subscription description | String getDescription() | setDescription(String description) |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `Interval` | `String` | Required | Interval | String getInterval() | setInterval(String interval) |
| `IntervalCount` | `int` | Required | Interval count | int getIntervalCount() | setIntervalCount(int intervalCount) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Subscription pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Items` | [`List<CreateSubscriptionItemRequest>`](../../doc/models/create-subscription-item-request.md) | Required | Subscription items | List<CreateSubscriptionItemRequest> getItems() | setItems(List<CreateSubscriptionItemRequest> items) |
| `Shipping` | [`CreateShippingRequest`](../../doc/models/create-shipping-request.md) | Required | Shipping | CreateShippingRequest getShipping() | setShipping(CreateShippingRequest shipping) |
| `Discounts` | [`List<CreateDiscountRequest>`](../../doc/models/create-discount-request.md) | Required | Discounts | List<CreateDiscountRequest> getDiscounts() | setDiscounts(List<CreateDiscountRequest> discounts) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Setup` | [`CreateSetupRequest`](../../doc/models/create-setup-request.md) | Optional | Setup data | CreateSetupRequest getSetup() | setSetup(CreateSetupRequest setup) |
| `PlanId` | `String` | Optional | Plan id | String getPlanId() | setPlanId(String planId) |
| `CustomerId` | `String` | Optional | Customer id | String getCustomerId() | setCustomerId(String customerId) |
| `CardId` | `String` | Optional | Card id | String getCardId() | setCardId(String cardId) |
| `BillingDay` | `Integer` | Optional | Billing day | Integer getBillingDay() | setBillingDay(Integer billingDay) |
| `Installments` | `Integer` | Optional | Number of installments | Integer getInstallments() | setInstallments(Integer installments) |
| `StartAt` | `LocalDateTime` | Optional | Subscription start date | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `MinimumPrice` | `Integer` | Optional | Subscription minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Cycles` | `Integer` | Optional | Number of cycles | Integer getCycles() | setCycles(Integer cycles) |
| `CardToken` | `String` | Optional | Card token | String getCardToken() | setCardToken(String cardToken) |
| `GatewayAffiliationId` | `String` | Optional | Gateway Affiliation code | String getGatewayAffiliationId() | setGatewayAffiliationId(String gatewayAffiliationId) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `BoletoDueDays` | `Integer` | Optional | Days until boleto expires | Integer getBoletoDueDays() | setBoletoDueDays(Integer boletoDueDays) |
| `Increments` | [`List<CreateIncrementRequest>`](../../doc/models/create-increment-request.md) | Required | Increments | List<CreateIncrementRequest> getIncrements() | setIncrements(List<CreateIncrementRequest> increments) |
| `Period` | [`CreatePeriodRequest`](../../doc/models/create-period-request.md) | Optional | - | CreatePeriodRequest getPeriod() | setPeriod(CreatePeriodRequest period) |
| `Submerchant` | [`CreateSubMerchantRequest`](../../doc/models/create-sub-merchant-request.md) | Optional | SubMerchant | CreateSubMerchantRequest getSubmerchant() | setSubmerchant(CreateSubMerchantRequest submerchant) |
| `Split` | [`CreateSubscriptionSplitRequest`](../../doc/models/create-subscription-split-request.md) | Optional | Subscription's split | CreateSubscriptionSplitRequest getSplit() | setSplit(CreateSubscriptionSplitRequest split) |
| `Boleto` | [`CreateSubscriptionBoletoRequest`](../../doc/models/create-subscription-boleto-request.md) | Optional | Information about fines and interest on the "boleto" used from payment | CreateSubscriptionBoletoRequest getBoleto() | setBoleto(CreateSubscriptionBoletoRequest boleto) |

## Example (as JSON)

```json
{
  "customer": {
    "name": "{\n    \"name\": \"Tony Stark\"\n}",
    "email": "email6",
    "document": "document6",
    "type": "type0",
    "address": {
      "street": "street6",
      "number": "number4",
      "zip_code": "zip_code0",
      "neighborhood": "neighborhood2",
      "city": "city6",
      "state": "state2",
      "country": "country0",
      "complement": "complement2",
      "metadata": {
        "key0": "metadata3",
        "key1": "metadata2",
        "key2": "metadata1"
      },
      "line_1": "line_10",
      "line_2": "line_24"
    },
    "metadata": {
      "key0": "metadata3"
    },
    "phones": {
      "home_phone": {
        "country_code": "country_code0",
        "number": "number2",
        "area_code": "area_code0",
        "Type": "Type0"
      },
      "mobile_phone": {
        "country_code": "country_code0",
        "number": "number8",
        "area_code": "area_code0",
        "Type": "Type0"
      }
    },
    "code": "code8",
    "gender": "gender6",
    "document_type": "document_type8"
  },
  "card": {
    "type": "credit",
    "number": "number6",
    "holder_name": "holder_name2",
    "exp_month": 228,
    "exp_year": 68,
    "cvv": "cvv4"
  },
  "code": "code0",
  "payment_method": "payment_method8",
  "billing_type": "billing_type4",
  "statement_descriptor": "statement_descriptor2",
  "description": "description8",
  "currency": "currency2",
  "interval": "interval0",
  "interval_count": 220,
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      },
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      },
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      }
    ],
    "price": 166,
    "minimum_price": 6,
    "percentage": 251.76
  },
  "items": [
    {
      "description": "description2",
      "pricing_scheme": {
        "scheme_type": "scheme_type8",
        "price_brackets": [
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          },
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          },
          {
            "start_quantity": 144,
            "price": 174,
            "end_quantity": 152,
            "overage_price": 166
          }
        ],
        "price": 166,
        "minimum_price": 6,
        "percentage": 251.76
      },
      "id": "id8",
      "plan_item_id": "plan_item_id8",
      "discounts": [
        {
          "value": 90.66,
          "discount_type": "discount_type2",
          "item_id": "item_id4",
          "cycles": 126,
          "description": "description4"
        }
      ],
      "name": "name8",
      "cycles": 214,
      "quantity": 22,
      "minimum_price": 222
    }
  ],
  "shipping": {
    "amount": 52,
    "description": "description6",
    "recipient_name": "recipient_name2",
    "recipient_phone": "recipient_phone6",
    "address_id": "address_id6",
    "address": {
      "street": "street6",
      "number": "number4",
      "zip_code": "zip_code0",
      "neighborhood": "neighborhood2",
      "city": "city6",
      "state": "state2",
      "country": "country0",
      "complement": "complement2",
      "metadata": {
        "key0": "metadata3",
        "key1": "metadata2",
        "key2": "metadata1"
      },
      "line_1": "line_10",
      "line_2": "line_24"
    },
    "max_delivery_date": "2016-03-13T12:52:32.123Z",
    "estimated_delivery_date": "2016-03-13T12:52:32.123Z",
    "type": "type6"
  },
  "discounts": [
    {
      "value": 90.66,
      "discount_type": "discount_type2",
      "item_id": "item_id4",
      "cycles": 126,
      "description": "description4"
    }
  ],
  "metadata": {
    "key0": "metadata1"
  },
  "increments": [
    {
      "value": 252.86,
      "increment_type": "increment_type6",
      "item_id": "item_id6",
      "cycles": 34,
      "description": "description4"
    }
  ],
  "setup": {
    "amount": 110,
    "description": "description4",
    "payment": {
      "payment_method": "payment_method4",
      "credit_card": {
        "installments": 52,
        "statement_descriptor": "statement_descriptor8",
        "card": {
          "number": "number6",
          "holder_name": "holder_name2",
          "exp_month": 228,
          "exp_year": 68,
          "cvv": "cvv4"
        },
        "card_id": "card_id4",
        "card_token": "card_token2"
      },
      "debit_card": {
        "statement_descriptor": "statement_descriptor4",
        "card": {
          "number": "number6",
          "holder_name": "holder_name2",
          "exp_month": 228,
          "exp_year": 68,
          "cvv": "cvv4"
        },
        "card_id": "card_id0",
        "card_token": "card_token6",
        "recurrence": false
      },
      "boleto": {
        "retries": 226,
        "bank": "bank8",
        "instructions": "instructions2",
        "due_at": "2016-03-13T12:52:32.123Z",
        "billing_address": {
          "street": "street8",
          "number": "number4",
          "zip_code": "zip_code2",
          "neighborhood": "neighborhood4",
          "city": "city2",
          "state": "state6",
          "country": "country2",
          "complement": "complement6",
          "metadata": {
            "key0": "metadata5",
            "key1": "metadata6"
          },
          "line_1": "line_18",
          "line_2": "line_26"
        },
        "billing_address_id": "billing_address_id6",
        "nosso_numero": "nosso_numero0",
        "document_number": "document_number6",
        "statement_descriptor": "statement_descriptor0",
        "interest": {
          "days": 156,
          "type": "type0",
          "amount": 230
        }
      },
      "currency": "currency6",
      "voucher": {
        "statement_descriptor": "statement_descriptor2",
        "card_id": "card_id8",
        "card_token": "card_token8",
        "Card": {
          "number": "number8",
          "holder_name": "holder_name6",
          "exp_month": 240,
          "exp_year": 56,
          "cvv": "cvv8"
        },
        "recurrency_cycle": "recurrency_cycle6"
      }
    }
  },
  "plan_id": "plan_id4",
  "customer_id": "customer_id0",
  "card_id": "card_id2",
  "billing_day": 152
}
```

