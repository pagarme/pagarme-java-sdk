/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for CreateAnticipationRequest type.
 */
public class CreateAnticipationRequest {
    private int amount;
    private String timeframe;
    private LocalDateTime paymentDate;

    /**
     * Default constructor.
     */
    public CreateAnticipationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  int value for amount.
     * @param  timeframe  String value for timeframe.
     * @param  paymentDate  LocalDateTime value for paymentDate.
     */
    public CreateAnticipationRequest(
            int amount,
            String timeframe,
            LocalDateTime paymentDate) {
        this.amount = amount;
        this.timeframe = timeframe;
        this.paymentDate = paymentDate;
    }

    /**
     * Getter for Amount.
     * Amount requested for the anticipation
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount requested for the anticipation
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Timeframe.
     * Timeframe
     * @return Returns the String
     */
    @JsonGetter("timeframe")
    public String getTimeframe() {
        return timeframe;
    }

    /**
     * Setter for Timeframe.
     * Timeframe
     * @param timeframe Value for String
     */
    @JsonSetter("timeframe")
    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    /**
     * Getter for PaymentDate.
     * Payment date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("payment_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    /**
     * Setter for PaymentDate.
     * Payment date
     * @param paymentDate Value for LocalDateTime
     */
    @JsonSetter("payment_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Converts this CreateAnticipationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateAnticipationRequest [" + "amount=" + amount + ", timeframe=" + timeframe
                + ", paymentDate=" + paymentDate + "]";
    }

    /**
     * Builds a new {@link CreateAnticipationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateAnticipationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, timeframe, paymentDate);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateAnticipationRequest}.
     */
    public static class Builder {
        private int amount;
        private String timeframe;
        private LocalDateTime paymentDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  int value for amount.
         * @param  timeframe  String value for timeframe.
         * @param  paymentDate  LocalDateTime value for paymentDate.
         */
        public Builder(int amount, String timeframe, LocalDateTime paymentDate) {
            this.amount = amount;
            this.timeframe = timeframe;
            this.paymentDate = paymentDate;
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
         * Setter for timeframe.
         * @param  timeframe  String value for timeframe.
         * @return Builder
         */
        public Builder timeframe(String timeframe) {
            this.timeframe = timeframe;
            return this;
        }

        /**
         * Setter for paymentDate.
         * @param  paymentDate  LocalDateTime value for paymentDate.
         * @return Builder
         */
        public Builder paymentDate(LocalDateTime paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        /**
         * Builds a new {@link CreateAnticipationRequest} object using the set fields.
         * @return {@link CreateAnticipationRequest}
         */
        public CreateAnticipationRequest build() {
            return new CreateAnticipationRequest(amount, timeframe, paymentDate);
        }
    }
}
