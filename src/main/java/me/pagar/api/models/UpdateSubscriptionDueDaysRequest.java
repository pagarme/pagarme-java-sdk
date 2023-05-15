/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSubscriptionDueDaysRequest type.
 */
public class UpdateSubscriptionDueDaysRequest {
    private int boletoDueDays;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionDueDaysRequest() {
    }

    /**
     * Initialization constructor.
     * @param  boletoDueDays  int value for boletoDueDays.
     */
    public UpdateSubscriptionDueDaysRequest(
            int boletoDueDays) {
        this.boletoDueDays = boletoDueDays;
    }

    /**
     * Getter for BoletoDueDays.
     * @return Returns the int
     */
    @JsonGetter("boleto_due_days")
    public int getBoletoDueDays() {
        return boletoDueDays;
    }

    /**
     * Setter for BoletoDueDays.
     * @param boletoDueDays Value for int
     */
    @JsonSetter("boleto_due_days")
    public void setBoletoDueDays(int boletoDueDays) {
        this.boletoDueDays = boletoDueDays;
    }

    /**
     * Converts this UpdateSubscriptionDueDaysRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionDueDaysRequest [" + "boletoDueDays=" + boletoDueDays + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionDueDaysRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionDueDaysRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(boletoDueDays);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionDueDaysRequest}.
     */
    public static class Builder {
        private int boletoDueDays;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  boletoDueDays  int value for boletoDueDays.
         */
        public Builder(int boletoDueDays) {
            this.boletoDueDays = boletoDueDays;
        }

        /**
         * Setter for boletoDueDays.
         * @param  boletoDueDays  int value for boletoDueDays.
         * @return Builder
         */
        public Builder boletoDueDays(int boletoDueDays) {
            this.boletoDueDays = boletoDueDays;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionDueDaysRequest} object using the set fields.
         * @return {@link UpdateSubscriptionDueDaysRequest}
         */
        public UpdateSubscriptionDueDaysRequest build() {
            return new UpdateSubscriptionDueDaysRequest(boletoDueDays);
        }
    }
}
