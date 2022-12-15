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
 * This is a model class for CreateSubscriptionBoletoRequest type.
 */
public class CreateSubscriptionBoletoRequest {
    private CreateInterestRequest interest;
    private CreateFineRequest fine;
    private OptionalNullable<Integer> maxDaysToPayPastDue;

    /**
     * Default constructor.
     */
    public CreateSubscriptionBoletoRequest() {
    }

    /**
     * Initialization constructor.
     * @param  interest  CreateInterestRequest value for interest.
     * @param  fine  CreateFineRequest value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public CreateSubscriptionBoletoRequest(
            CreateInterestRequest interest,
            CreateFineRequest fine,
            Integer maxDaysToPayPastDue) {
        this.interest = interest;
        this.fine = fine;
        this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
    }

    /**
     * Internal initialization constructor.
     */
    protected CreateSubscriptionBoletoRequest(CreateInterestRequest interest,
            CreateFineRequest fine, OptionalNullable<Integer> maxDaysToPayPastDue) {
        this.interest = interest;
        this.fine = fine;
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Getter for Interest.
     * @return Returns the CreateInterestRequest
     */
    @JsonGetter("interest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInterestRequest getInterest() {
        return interest;
    }

    /**
     * Setter for Interest.
     * @param interest Value for CreateInterestRequest
     */
    @JsonSetter("interest")
    public void setInterest(CreateInterestRequest interest) {
        this.interest = interest;
    }

    /**
     * Getter for Fine.
     * @return Returns the CreateFineRequest
     */
    @JsonGetter("fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateFineRequest getFine() {
        return fine;
    }

    /**
     * Setter for Fine.
     * @param fine Value for CreateFineRequest
     */
    @JsonSetter("fine")
    public void setFine(CreateFineRequest fine) {
        this.fine = fine;
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
     * Converts this CreateSubscriptionBoletoRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionBoletoRequest [" + "interest=" + interest + ", fine=" + fine
                + ", maxDaysToPayPastDue=" + maxDaysToPayPastDue + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionBoletoRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionBoletoRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .interest(getInterest())
                .fine(getFine());
        builder.maxDaysToPayPastDue = internalGetMaxDaysToPayPastDue();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionBoletoRequest}.
     */
    public static class Builder {
        private CreateInterestRequest interest;
        private CreateFineRequest fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;



        /**
         * Setter for interest.
         * @param  interest  CreateInterestRequest value for interest.
         * @return Builder
         */
        public Builder interest(CreateInterestRequest interest) {
            this.interest = interest;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  CreateFineRequest value for fine.
         * @return Builder
         */
        public Builder fine(CreateFineRequest fine) {
            this.fine = fine;
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
         * Builds a new {@link CreateSubscriptionBoletoRequest} object using the set fields.
         * @return {@link CreateSubscriptionBoletoRequest}
         */
        public CreateSubscriptionBoletoRequest build() {
            return new CreateSubscriptionBoletoRequest(interest, fine, maxDaysToPayPastDue);
        }
    }
}
