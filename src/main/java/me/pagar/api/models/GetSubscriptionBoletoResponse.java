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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for GetSubscriptionBoletoResponse type.
 */
public class GetSubscriptionBoletoResponse {
    private OptionalNullable<GetInterestResponse> interest;
    private OptionalNullable<GetFineResponse> fine;
    private OptionalNullable<Integer> maxDaysToPayPastDue;

    /**
     * Default constructor.
     */
    public GetSubscriptionBoletoResponse() {
    }

    /**
     * Initialization constructor.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public GetSubscriptionBoletoResponse(
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue) {
        this.interest = OptionalNullable.of(interest);
        this.fine = OptionalNullable.of(fine);
        this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetSubscriptionBoletoResponse(OptionalNullable<GetInterestResponse> interest,
            OptionalNullable<GetFineResponse> fine,
            OptionalNullable<Integer> maxDaysToPayPastDue) {
        this.interest = interest;
        this.fine = fine;
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Internal Getter for Interest.
     * Interest
     * @return Returns the Internal GetInterestResponse
     */
    @JsonGetter("interest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetInterestResponse> internalGetInterest() {
        return this.interest;
    }

    /**
     * Getter for Interest.
     * Interest
     * @return Returns the GetInterestResponse
     */
    public GetInterestResponse getInterest() {
        return OptionalNullable.getFrom(interest);
    }

    /**
     * Setter for Interest.
     * Interest
     * @param interest Value for GetInterestResponse
     */
    @JsonSetter("interest")
    public void setInterest(GetInterestResponse interest) {
        this.interest = OptionalNullable.of(interest);
    }

    /**
     * UnSetter for Interest.
     * Interest
     */
    public void unsetInterest() {
        interest = null;
    }

    /**
     * Internal Getter for Fine.
     * Fine
     * @return Returns the Internal GetFineResponse
     */
    @JsonGetter("fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetFineResponse> internalGetFine() {
        return this.fine;
    }

    /**
     * Getter for Fine.
     * Fine
     * @return Returns the GetFineResponse
     */
    public GetFineResponse getFine() {
        return OptionalNullable.getFrom(fine);
    }

    /**
     * Setter for Fine.
     * Fine
     * @param fine Value for GetFineResponse
     */
    @JsonSetter("fine")
    public void setFine(GetFineResponse fine) {
        this.fine = OptionalNullable.of(fine);
    }

    /**
     * UnSetter for Fine.
     * Fine
     */
    public void unsetFine() {
        fine = null;
    }

    /**
     * Internal Getter for MaxDaysToPayPastDue.
     * @return Returns the Internal Integer
     */
    @JsonGetter("max_days_to_pay_past_due")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMaxDaysToPayPastDue() {
        return this.maxDaysToPayPastDue;
    }

    /**
     * Getter for MaxDaysToPayPastDue.
     * @return Returns the Integer
     */
    public Integer getMaxDaysToPayPastDue() {
        return OptionalNullable.getFrom(maxDaysToPayPastDue);
    }

    /**
     * Setter for MaxDaysToPayPastDue.
     * @param maxDaysToPayPastDue Value for Integer
     */
    @JsonSetter("max_days_to_pay_past_due")
    public void setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
        this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
    }

    /**
     * UnSetter for MaxDaysToPayPastDue.
     */
    public void unsetMaxDaysToPayPastDue() {
        maxDaysToPayPastDue = null;
    }

    /**
     * Converts this GetSubscriptionBoletoResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSubscriptionBoletoResponse [" + "interest=" + interest + ", fine=" + fine
                + ", maxDaysToPayPastDue=" + maxDaysToPayPastDue + "]";
    }

    /**
     * Builds a new {@link GetSubscriptionBoletoResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSubscriptionBoletoResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.interest = internalGetInterest();
        builder.fine = internalGetFine();
        builder.maxDaysToPayPastDue = internalGetMaxDaysToPayPastDue();
        return builder;
    }

    /**
     * Class to build instances of {@link GetSubscriptionBoletoResponse}.
     */
    public static class Builder {
        private OptionalNullable<GetInterestResponse> interest;
        private OptionalNullable<GetFineResponse> fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;



        /**
         * Setter for interest.
         * @param  interest  GetInterestResponse value for interest.
         * @return Builder
         */
        public Builder interest(GetInterestResponse interest) {
            this.interest = OptionalNullable.of(interest);
            return this;
        }

        /**
         * UnSetter for interest.
         * @return Builder
         */
        public Builder unsetInterest() {
            interest = null;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  GetFineResponse value for fine.
         * @return Builder
         */
        public Builder fine(GetFineResponse fine) {
            this.fine = OptionalNullable.of(fine);
            return this;
        }

        /**
         * UnSetter for fine.
         * @return Builder
         */
        public Builder unsetFine() {
            fine = null;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
            return this;
        }

        /**
         * UnSetter for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder unsetMaxDaysToPayPastDue() {
            maxDaysToPayPastDue = null;
            return this;
        }

        /**
         * Builds a new {@link GetSubscriptionBoletoResponse} object using the set fields.
         * @return {@link GetSubscriptionBoletoResponse}
         */
        public GetSubscriptionBoletoResponse build() {
            return new GetSubscriptionBoletoResponse(interest, fine, maxDaysToPayPastDue);
        }
    }
}
