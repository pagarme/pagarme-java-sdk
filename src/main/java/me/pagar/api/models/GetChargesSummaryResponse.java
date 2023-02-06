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

/**
 * This is a model class for GetChargesSummaryResponse type.
 */
public class GetChargesSummaryResponse {
    private OptionalNullable<Integer> total;

    /**
     * Default constructor.
     */
    public GetChargesSummaryResponse() {
    }

    /**
     * Initialization constructor.
     * @param  total  Integer value for total.
     */
    public GetChargesSummaryResponse(
            Integer total) {
        this.total = OptionalNullable.of(total);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetChargesSummaryResponse(OptionalNullable<Integer> total) {
        this.total = total;
    }

    /**
     * Internal Getter for Total.
     * @return Returns the Internal Integer
     */
    @JsonGetter("total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTotal() {
        return this.total;
    }

    /**
     * Getter for Total.
     * @return Returns the Integer
     */
    public Integer getTotal() {
        return OptionalNullable.getFrom(total);
    }

    /**
     * Setter for Total.
     * @param total Value for Integer
     */
    @JsonSetter("total")
    public void setTotal(Integer total) {
        this.total = OptionalNullable.of(total);
    }

    /**
     * UnSetter for Total.
     */
    public void unsetTotal() {
        total = null;
    }

    /**
     * Converts this GetChargesSummaryResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetChargesSummaryResponse [" + "total=" + total + "]";
    }

    /**
     * Builds a new {@link GetChargesSummaryResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetChargesSummaryResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.total = internalGetTotal();
        return builder;
    }

    /**
     * Class to build instances of {@link GetChargesSummaryResponse}.
     */
    public static class Builder {
        private OptionalNullable<Integer> total;



        /**
         * Setter for total.
         * @param  total  Integer value for total.
         * @return Builder
         */
        public Builder total(Integer total) {
            this.total = OptionalNullable.of(total);
            return this;
        }

        /**
         * UnSetter for total.
         * @return Builder
         */
        public Builder unsetTotal() {
            total = null;
            return this;
        }

        /**
         * Builds a new {@link GetChargesSummaryResponse} object using the set fields.
         * @return {@link GetChargesSummaryResponse}
         */
        public GetChargesSummaryResponse build() {
            return new GetChargesSummaryResponse(total);
        }
    }
}
