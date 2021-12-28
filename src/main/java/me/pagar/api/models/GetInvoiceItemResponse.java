/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetInvoiceItemResponse type.
 */
public class GetInvoiceItemResponse {
    private int amount;
    private String description;
    private GetPricingSchemeResponse pricingScheme;
    private GetPriceBracketResponse priceBracket;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer quantity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    private String subscriptionItemId;

    /**
     * Default constructor.
     */
    public GetInvoiceItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  description  String value for description.
     * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
     * @param  priceBracket  GetPriceBracketResponse value for priceBracket.
     * @param  subscriptionItemId  String value for subscriptionItemId.
     * @param  quantity  Integer value for quantity.
     * @param  name  String value for name.
     */
    public GetInvoiceItemResponse(
            int amount,
            String description,
            GetPricingSchemeResponse pricingScheme,
            GetPriceBracketResponse priceBracket,
            String subscriptionItemId,
            Integer quantity,
            String name) {
        this.amount = amount;
        this.description = description;
        this.pricingScheme = pricingScheme;
        this.priceBracket = priceBracket;
        this.quantity = quantity;
        this.name = name;
        this.subscriptionItemId = subscriptionItemId;
    }

    /**
     * Getter for Amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the GetPricingSchemeResponse
     */
    @JsonGetter("pricing_scheme")
    public GetPricingSchemeResponse getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for GetPricingSchemeResponse
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(GetPricingSchemeResponse pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for PriceBracket.
     * @return Returns the GetPriceBracketResponse
     */
    @JsonGetter("price_bracket")
    public GetPriceBracketResponse getPriceBracket() {
        return priceBracket;
    }

    /**
     * Setter for PriceBracket.
     * @param priceBracket Value for GetPriceBracketResponse
     */
    @JsonSetter("price_bracket")
    public void setPriceBracket(GetPriceBracketResponse priceBracket) {
        this.priceBracket = priceBracket;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for SubscriptionItemId.
     * Subscription Item Id
     * @return Returns the String
     */
    @JsonGetter("subscription_item_id")
    public String getSubscriptionItemId() {
        return subscriptionItemId;
    }

    /**
     * Setter for SubscriptionItemId.
     * Subscription Item Id
     * @param subscriptionItemId Value for String
     */
    @JsonSetter("subscription_item_id")
    public void setSubscriptionItemId(String subscriptionItemId) {
        this.subscriptionItemId = subscriptionItemId;
    }

    /**
     * Converts this GetInvoiceItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetInvoiceItemResponse [" + "amount=" + amount + ", description=" + description
                + ", pricingScheme=" + pricingScheme + ", priceBracket=" + priceBracket
                + ", subscriptionItemId=" + subscriptionItemId + ", quantity=" + quantity
                + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link GetInvoiceItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetInvoiceItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, description, pricingScheme, priceBracket,
                subscriptionItemId)
                .quantity(getQuantity())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link GetInvoiceItemResponse}.
     */
    public static class Builder {
        private int amount;
        private String description;
        private GetPricingSchemeResponse pricingScheme;
        private GetPriceBracketResponse priceBracket;
        private String subscriptionItemId;
        private Integer quantity;
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  description  String value for description.
         * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
         * @param  priceBracket  GetPriceBracketResponse value for priceBracket.
         * @param  subscriptionItemId  String value for subscriptionItemId.
         */
        public Builder(int amount, String description, GetPricingSchemeResponse pricingScheme,
                GetPriceBracketResponse priceBracket, String subscriptionItemId) {
            this.amount = amount;
            this.description = description;
            this.pricingScheme = pricingScheme;
            this.priceBracket = priceBracket;
            this.subscriptionItemId = subscriptionItemId;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(GetPricingSchemeResponse pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for priceBracket.
         * @param  priceBracket  GetPriceBracketResponse value for priceBracket.
         * @return Builder
         */
        public Builder priceBracket(GetPriceBracketResponse priceBracket) {
            this.priceBracket = priceBracket;
            return this;
        }

        /**
         * Setter for subscriptionItemId.
         * @param  subscriptionItemId  String value for subscriptionItemId.
         * @return Builder
         */
        public Builder subscriptionItemId(String subscriptionItemId) {
            this.subscriptionItemId = subscriptionItemId;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link GetInvoiceItemResponse} object using the set fields.
         * @return {@link GetInvoiceItemResponse}
         */
        public GetInvoiceItemResponse build() {
            return new GetInvoiceItemResponse(amount, description, pricingScheme, priceBracket,
                    subscriptionItemId, quantity, name);
        }
    }
}
