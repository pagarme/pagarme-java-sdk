/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreatePricingSchemeRequest type.
 */
public class CreatePricingSchemeRequest {
    private String schemeType;
    private List<CreatePriceBracketRequest> priceBrackets;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer price;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer minimumPrice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double percentage;

    /**
     * Default constructor.
     */
    public CreatePricingSchemeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  schemeType  String value for schemeType.
     * @param  priceBrackets  List of CreatePriceBracketRequest value for priceBrackets.
     * @param  price  Integer value for price.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  percentage  Double value for percentage.
     */
    public CreatePricingSchemeRequest(
            String schemeType,
            List<CreatePriceBracketRequest> priceBrackets,
            Integer price,
            Integer minimumPrice,
            Double percentage) {
        this.schemeType = schemeType;
        this.priceBrackets = priceBrackets;
        this.price = price;
        this.minimumPrice = minimumPrice;
        this.percentage = percentage;
    }

    /**
     * Getter for SchemeType.
     * Scheme type
     * @return Returns the String
     */
    @JsonGetter("scheme_type")
    public String getSchemeType() {
        return schemeType;
    }

    /**
     * Setter for SchemeType.
     * Scheme type
     * @param schemeType Value for String
     */
    @JsonSetter("scheme_type")
    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    /**
     * Getter for PriceBrackets.
     * Price brackets
     * @return Returns the List of CreatePriceBracketRequest
     */
    @JsonGetter("price_brackets")
    public List<CreatePriceBracketRequest> getPriceBrackets() {
        return priceBrackets;
    }

    /**
     * Setter for PriceBrackets.
     * Price brackets
     * @param priceBrackets Value for List of CreatePriceBracketRequest
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets(List<CreatePriceBracketRequest> priceBrackets) {
        this.priceBrackets = priceBrackets;
    }

    /**
     * Getter for Price.
     * Price
     * @return Returns the Integer
     */
    @JsonGetter("price")
    public Integer getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * Price
     * @param price Value for Integer
     */
    @JsonSetter("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter for MinimumPrice.
     * Minimum price
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * Minimum price
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * Getter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @return Returns the Double
     */
    @JsonGetter("percentage")
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Setter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @param percentage Value for Double
     */
    @JsonSetter("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * Converts this CreatePricingSchemeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePricingSchemeRequest [" + "schemeType=" + schemeType + ", priceBrackets="
                + priceBrackets + ", price=" + price + ", minimumPrice=" + minimumPrice
                + ", percentage=" + percentage + "]";
    }

    /**
     * Builds a new {@link CreatePricingSchemeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePricingSchemeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(schemeType, priceBrackets)
                .price(getPrice())
                .minimumPrice(getMinimumPrice())
                .percentage(getPercentage());
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePricingSchemeRequest}.
     */
    public static class Builder {
        private String schemeType;
        private List<CreatePriceBracketRequest> priceBrackets;
        private Integer price;
        private Integer minimumPrice;
        private Double percentage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  schemeType  String value for schemeType.
         * @param  priceBrackets  List of CreatePriceBracketRequest value for priceBrackets.
         */
        public Builder(String schemeType, List<CreatePriceBracketRequest> priceBrackets) {
            this.schemeType = schemeType;
            this.priceBrackets = priceBrackets;
        }

        /**
         * Setter for schemeType.
         * @param  schemeType  String value for schemeType.
         * @return Builder
         */
        public Builder schemeType(String schemeType) {
            this.schemeType = schemeType;
            return this;
        }

        /**
         * Setter for priceBrackets.
         * @param  priceBrackets  List of CreatePriceBracketRequest value for priceBrackets.
         * @return Builder
         */
        public Builder priceBrackets(List<CreatePriceBracketRequest> priceBrackets) {
            this.priceBrackets = priceBrackets;
            return this;
        }

        /**
         * Setter for price.
         * @param  price  Integer value for price.
         * @return Builder
         */
        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        /**
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = minimumPrice;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  Double value for percentage.
         * @return Builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * Builds a new {@link CreatePricingSchemeRequest} object using the set fields.
         * @return {@link CreatePricingSchemeRequest}
         */
        public CreatePricingSchemeRequest build() {
            return new CreatePricingSchemeRequest(schemeType, priceBrackets, price, minimumPrice,
                    percentage);
        }
    }
}
