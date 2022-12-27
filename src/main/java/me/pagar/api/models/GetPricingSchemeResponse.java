/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for GetPricingSchemeResponse type.
 */
public class GetPricingSchemeResponse {
    private Integer price;
    private String schemeType;
    private List<GetPriceBracketResponse> priceBrackets;
    private OptionalNullable<Integer> minimumPrice;
    private OptionalNullable<Double> percentage;

    /**
     * Default constructor.
     */
    public GetPricingSchemeResponse() {
    }

    /**
     * Initialization constructor.
     * @param  price  Integer value for price.
     * @param  schemeType  String value for schemeType.
     * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  percentage  Double value for percentage.
     */
    public GetPricingSchemeResponse(
            Integer price,
            String schemeType,
            List<GetPriceBracketResponse> priceBrackets,
            Integer minimumPrice,
            Double percentage) {
        this.price = price;
        this.schemeType = schemeType;
        this.priceBrackets = priceBrackets;
        this.minimumPrice = OptionalNullable.of(minimumPrice);
        this.percentage = OptionalNullable.of(percentage);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetPricingSchemeResponse(Integer price, String schemeType,
            List<GetPriceBracketResponse> priceBrackets, OptionalNullable<Integer> minimumPrice,
            OptionalNullable<Double> percentage) {
        this.price = price;
        this.schemeType = schemeType;
        this.priceBrackets = priceBrackets;
        this.minimumPrice = minimumPrice;
        this.percentage = percentage;
    }

    /**
     * Getter for Price.
     * @return Returns the Integer
     */
    @JsonGetter("price")
    public Integer getPrice() {
        return price;
    }

    /**
     * Setter for Price.
     * @param price Value for Integer
     */
    @JsonSetter("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * Getter for SchemeType.
     * @return Returns the String
     */
    @JsonGetter("scheme_type")
    public String getSchemeType() {
        return schemeType;
    }

    /**
     * Setter for SchemeType.
     * @param schemeType Value for String
     */
    @JsonSetter("scheme_type")
    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }

    /**
     * Getter for PriceBrackets.
     * @return Returns the List of GetPriceBracketResponse
     */
    @JsonGetter("price_brackets")
    public List<GetPriceBracketResponse> getPriceBrackets() {
        return priceBrackets;
    }

    /**
     * Setter for PriceBrackets.
     * @param priceBrackets Value for List of GetPriceBracketResponse
     */
    @JsonSetter("price_brackets")
    public void setPriceBrackets(List<GetPriceBracketResponse> priceBrackets) {
        this.priceBrackets = priceBrackets;
    }

    /**
     * Internal Getter for MinimumPrice.
     * @return Returns the Internal Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMinimumPrice() {
        return this.minimumPrice;
    }

    /**
     * Getter for MinimumPrice.
     * @return Returns the Integer
     */
    public Integer getMinimumPrice() {
        return OptionalNullable.getFrom(minimumPrice);
    }

    /**
     * Setter for MinimumPrice.
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = OptionalNullable.of(minimumPrice);
    }

    /**
     * UnSetter for MinimumPrice.
     */
    public void unsetMinimumPrice() {
        minimumPrice = null;
    }

    /**
     * Internal Getter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @return Returns the Internal Double
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetPercentage() {
        return this.percentage;
    }

    /**
     * Getter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @return Returns the Double
     */
    public Double getPercentage() {
        return OptionalNullable.getFrom(percentage);
    }

    /**
     * Setter for Percentage.
     * percentual value used in pricing_scheme Percent
     * @param percentage Value for Double
     */
    @JsonSetter("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = OptionalNullable.of(percentage);
    }

    /**
     * UnSetter for Percentage.
     * percentual value used in pricing_scheme Percent
     */
    public void unsetPercentage() {
        percentage = null;
    }

    /**
     * Converts this GetPricingSchemeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPricingSchemeResponse [" + "price=" + price + ", schemeType=" + schemeType
                + ", priceBrackets=" + priceBrackets + ", minimumPrice=" + minimumPrice
                + ", percentage=" + percentage + "]";
    }

    /**
     * Builds a new {@link GetPricingSchemeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPricingSchemeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(price, schemeType, priceBrackets);
        builder.minimumPrice = internalGetMinimumPrice();
        builder.percentage = internalGetPercentage();
        return builder;
    }

    /**
     * Class to build instances of {@link GetPricingSchemeResponse}.
     */
    public static class Builder {
        private Integer price;
        private String schemeType;
        private List<GetPriceBracketResponse> priceBrackets;
        private OptionalNullable<Integer> minimumPrice;
        private OptionalNullable<Double> percentage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  price  Integer value for price.
         * @param  schemeType  String value for schemeType.
         * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
         */
        public Builder(Integer price, String schemeType,
                List<GetPriceBracketResponse> priceBrackets) {
            this.price = price;
            this.schemeType = schemeType;
            this.priceBrackets = priceBrackets;
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
         * @param  priceBrackets  List of GetPriceBracketResponse value for priceBrackets.
         * @return Builder
         */
        public Builder priceBrackets(List<GetPriceBracketResponse> priceBrackets) {
            this.priceBrackets = priceBrackets;
            return this;
        }

        /**
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = OptionalNullable.of(minimumPrice);
            return this;
        }

        /**
         * UnSetter for minimumPrice.
         * @return Builder
         */
        public Builder unsetMinimumPrice() {
            minimumPrice = null;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  Double value for percentage.
         * @return Builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = OptionalNullable.of(percentage);
            return this;
        }

        /**
         * UnSetter for percentage.
         * @return Builder
         */
        public Builder unsetPercentage() {
            percentage = null;
            return this;
        }

        /**
         * Builds a new {@link GetPricingSchemeResponse} object using the set fields.
         * @return {@link GetPricingSchemeResponse}
         */
        public GetPricingSchemeResponse build() {
            return new GetPricingSchemeResponse(price, schemeType, priceBrackets, minimumPrice,
                    percentage);
        }
    }
}
