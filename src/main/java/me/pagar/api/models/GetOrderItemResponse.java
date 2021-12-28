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
 * This is a model class for GetOrderItemResponse type.
 */
public class GetOrderItemResponse {
    private String id;
    private int amount;
    private String description;
    private int quantity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private GetSellerResponse getSellerResponse;
    private String category;
    private String code;

    /**
     * Default constructor.
     */
    public GetOrderItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  amount  int value for amount.
     * @param  description  String value for description.
     * @param  quantity  int value for quantity.
     * @param  category  String value for category.
     * @param  code  String value for code.
     * @param  getSellerResponse  GetSellerResponse value for getSellerResponse.
     */
    public GetOrderItemResponse(
            String id,
            int amount,
            String description,
            int quantity,
            String category,
            String code,
            GetSellerResponse getSellerResponse) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.quantity = quantity;
        this.getSellerResponse = getSellerResponse;
        this.category = category;
        this.code = code;
    }

    /**
     * Getter for Id.
     * Id
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Quantity.
     * @return Returns the int
     */
    @JsonGetter("quantity")
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for int
     */
    @JsonSetter("quantity")
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for GetSellerResponse.
     * Seller data
     * @return Returns the GetSellerResponse
     */
    @JsonGetter("GetSellerResponse")
    public GetSellerResponse getGetSellerResponse() {
        return getSellerResponse;
    }

    /**
     * Setter for GetSellerResponse.
     * Seller data
     * @param getSellerResponse Value for GetSellerResponse
     */
    @JsonSetter("GetSellerResponse")
    public void setGetSellerResponse(GetSellerResponse getSellerResponse) {
        this.getSellerResponse = getSellerResponse;
    }

    /**
     * Getter for Category.
     * Category
     * @return Returns the String
     */
    @JsonGetter("category")
    public String getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * Category
     * @param category Value for String
     */
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter for Code.
     * Code
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Converts this GetOrderItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetOrderItemResponse [" + "id=" + id + ", amount=" + amount + ", description="
                + description + ", quantity=" + quantity + ", category=" + category + ", code="
                + code + ", getSellerResponse=" + getSellerResponse + "]";
    }

    /**
     * Builds a new {@link GetOrderItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetOrderItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, amount, description, quantity, category, code)
                .getSellerResponse(getGetSellerResponse());
        return builder;
    }

    /**
     * Class to build instances of {@link GetOrderItemResponse}.
     */
    public static class Builder {
        private String id;
        private int amount;
        private String description;
        private int quantity;
        private String category;
        private String code;
        private GetSellerResponse getSellerResponse;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  amount  int value for amount.
         * @param  description  String value for description.
         * @param  quantity  int value for quantity.
         * @param  category  String value for category.
         * @param  code  String value for code.
         */
        public Builder(String id, int amount, String description, int quantity, String category,
                String code) {
            this.id = id;
            this.amount = amount;
            this.description = description;
            this.quantity = quantity;
            this.category = category;
            this.code = code;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
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
         * Setter for quantity.
         * @param  quantity  int value for quantity.
         * @return Builder
         */
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for category.
         * @param  category  String value for category.
         * @return Builder
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for getSellerResponse.
         * @param  getSellerResponse  GetSellerResponse value for getSellerResponse.
         * @return Builder
         */
        public Builder getSellerResponse(GetSellerResponse getSellerResponse) {
            this.getSellerResponse = getSellerResponse;
            return this;
        }

        /**
         * Builds a new {@link GetOrderItemResponse} object using the set fields.
         * @return {@link GetOrderItemResponse}
         */
        public GetOrderItemResponse build() {
            return new GetOrderItemResponse(id, amount, description, quantity, category, code,
                    getSellerResponse);
        }
    }
}
