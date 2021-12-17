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
 * This is a model class for CreateSplitOptionsRequest type.
 */
public class CreateSplitOptionsRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean liable;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean chargeProcessingFee;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean chargeRemainderFee;

    /**
     * Default constructor.
     */
    public CreateSplitOptionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  liable  Boolean value for liable.
     * @param  chargeProcessingFee  Boolean value for chargeProcessingFee.
     * @param  chargeRemainderFee  Boolean value for chargeRemainderFee.
     */
    public CreateSplitOptionsRequest(
            Boolean liable,
            Boolean chargeProcessingFee,
            Boolean chargeRemainderFee) {
        this.liable = liable;
        this.chargeProcessingFee = chargeProcessingFee;
        this.chargeRemainderFee = chargeRemainderFee;
    }

    /**
     * Getter for Liable.
     * Liable options
     * @return Returns the Boolean
     */
    @JsonGetter("liable")
    public Boolean getLiable() {
        return liable;
    }

    /**
     * Setter for Liable.
     * Liable options
     * @param liable Value for Boolean
     */
    @JsonSetter("liable")
    public void setLiable(Boolean liable) {
        this.liable = liable;
    }

    /**
     * Getter for ChargeProcessingFee.
     * Charge processing fee
     * @return Returns the Boolean
     */
    @JsonGetter("charge_processing_fee")
    public Boolean getChargeProcessingFee() {
        return chargeProcessingFee;
    }

    /**
     * Setter for ChargeProcessingFee.
     * Charge processing fee
     * @param chargeProcessingFee Value for Boolean
     */
    @JsonSetter("charge_processing_fee")
    public void setChargeProcessingFee(Boolean chargeProcessingFee) {
        this.chargeProcessingFee = chargeProcessingFee;
    }

    /**
     * Getter for ChargeRemainderFee.
     * @return Returns the Boolean
     */
    @JsonGetter("charge_remainder_fee")
    public Boolean getChargeRemainderFee() {
        return chargeRemainderFee;
    }

    /**
     * Setter for ChargeRemainderFee.
     * @param chargeRemainderFee Value for Boolean
     */
    @JsonSetter("charge_remainder_fee")
    public void setChargeRemainderFee(Boolean chargeRemainderFee) {
        this.chargeRemainderFee = chargeRemainderFee;
    }

    /**
     * Converts this CreateSplitOptionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSplitOptionsRequest [" + "liable=" + liable + ", chargeProcessingFee="
                + chargeProcessingFee + ", chargeRemainderFee=" + chargeRemainderFee + "]";
    }

    /**
     * Builds a new {@link CreateSplitOptionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSplitOptionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .liable(getLiable())
                .chargeProcessingFee(getChargeProcessingFee())
                .chargeRemainderFee(getChargeRemainderFee());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSplitOptionsRequest}.
     */
    public static class Builder {
        private Boolean liable;
        private Boolean chargeProcessingFee;
        private Boolean chargeRemainderFee;



        /**
         * Setter for liable.
         * @param  liable  Boolean value for liable.
         * @return Builder
         */
        public Builder liable(Boolean liable) {
            this.liable = liable;
            return this;
        }

        /**
         * Setter for chargeProcessingFee.
         * @param  chargeProcessingFee  Boolean value for chargeProcessingFee.
         * @return Builder
         */
        public Builder chargeProcessingFee(Boolean chargeProcessingFee) {
            this.chargeProcessingFee = chargeProcessingFee;
            return this;
        }

        /**
         * Setter for chargeRemainderFee.
         * @param  chargeRemainderFee  Boolean value for chargeRemainderFee.
         * @return Builder
         */
        public Builder chargeRemainderFee(Boolean chargeRemainderFee) {
            this.chargeRemainderFee = chargeRemainderFee;
            return this;
        }

        /**
         * Builds a new {@link CreateSplitOptionsRequest} object using the set fields.
         * @return {@link CreateSplitOptionsRequest}
         */
        public CreateSplitOptionsRequest build() {
            return new CreateSplitOptionsRequest(liable, chargeProcessingFee, chargeRemainderFee);
        }
    }
}
