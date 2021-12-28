/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateTransferSettingsRequest type.
 */
public class CreateTransferSettingsRequest {
    private boolean transferEnabled;
    private String transferInterval;
    private int transferDay;

    /**
     * Default constructor.
     */
    public CreateTransferSettingsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  transferEnabled  boolean value for transferEnabled.
     * @param  transferInterval  String value for transferInterval.
     * @param  transferDay  int value for transferDay.
     */
    public CreateTransferSettingsRequest(
            boolean transferEnabled,
            String transferInterval,
            int transferDay) {
        this.transferEnabled = transferEnabled;
        this.transferInterval = transferInterval;
        this.transferDay = transferDay;
    }

    /**
     * Getter for TransferEnabled.
     * @return Returns the boolean
     */
    @JsonGetter("transfer_enabled")
    public boolean getTransferEnabled() {
        return transferEnabled;
    }

    /**
     * Setter for TransferEnabled.
     * @param transferEnabled Value for boolean
     */
    @JsonSetter("transfer_enabled")
    public void setTransferEnabled(boolean transferEnabled) {
        this.transferEnabled = transferEnabled;
    }

    /**
     * Getter for TransferInterval.
     * @return Returns the String
     */
    @JsonGetter("transfer_interval")
    public String getTransferInterval() {
        return transferInterval;
    }

    /**
     * Setter for TransferInterval.
     * @param transferInterval Value for String
     */
    @JsonSetter("transfer_interval")
    public void setTransferInterval(String transferInterval) {
        this.transferInterval = transferInterval;
    }

    /**
     * Getter for TransferDay.
     * @return Returns the int
     */
    @JsonGetter("transfer_day")
    public int getTransferDay() {
        return transferDay;
    }

    /**
     * Setter for TransferDay.
     * @param transferDay Value for int
     */
    @JsonSetter("transfer_day")
    public void setTransferDay(int transferDay) {
        this.transferDay = transferDay;
    }

    /**
     * Converts this CreateTransferSettingsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateTransferSettingsRequest [" + "transferEnabled=" + transferEnabled
                + ", transferInterval=" + transferInterval + ", transferDay=" + transferDay + "]";
    }

    /**
     * Builds a new {@link CreateTransferSettingsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateTransferSettingsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transferEnabled, transferInterval, transferDay);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateTransferSettingsRequest}.
     */
    public static class Builder {
        private boolean transferEnabled;
        private String transferInterval;
        private int transferDay;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transferEnabled  boolean value for transferEnabled.
         * @param  transferInterval  String value for transferInterval.
         * @param  transferDay  int value for transferDay.
         */
        public Builder(boolean transferEnabled, String transferInterval, int transferDay) {
            this.transferEnabled = transferEnabled;
            this.transferInterval = transferInterval;
            this.transferDay = transferDay;
        }

        /**
         * Setter for transferEnabled.
         * @param  transferEnabled  boolean value for transferEnabled.
         * @return Builder
         */
        public Builder transferEnabled(boolean transferEnabled) {
            this.transferEnabled = transferEnabled;
            return this;
        }

        /**
         * Setter for transferInterval.
         * @param  transferInterval  String value for transferInterval.
         * @return Builder
         */
        public Builder transferInterval(String transferInterval) {
            this.transferInterval = transferInterval;
            return this;
        }

        /**
         * Setter for transferDay.
         * @param  transferDay  int value for transferDay.
         * @return Builder
         */
        public Builder transferDay(int transferDay) {
            this.transferDay = transferDay;
            return this;
        }

        /**
         * Builds a new {@link CreateTransferSettingsRequest} object using the set fields.
         * @return {@link CreateTransferSettingsRequest}
         */
        public CreateTransferSettingsRequest build() {
            return new CreateTransferSettingsRequest(transferEnabled, transferInterval,
                    transferDay);
        }
    }
}
