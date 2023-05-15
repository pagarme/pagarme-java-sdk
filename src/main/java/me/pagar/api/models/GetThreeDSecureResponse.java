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
 * This is a model class for GetThreeDSecureResponse type.
 */
public class GetThreeDSecureResponse {
    private OptionalNullable<String> mpi;
    private OptionalNullable<String> eci;
    private OptionalNullable<String> cavv;
    private OptionalNullable<String> transactionId;
    private OptionalNullable<String> successUrl;

    /**
     * Default constructor.
     */
    public GetThreeDSecureResponse() {
    }

    /**
     * Initialization constructor.
     * @param  mpi  String value for mpi.
     * @param  eci  String value for eci.
     * @param  cavv  String value for cavv.
     * @param  transactionId  String value for transactionId.
     * @param  successUrl  String value for successUrl.
     */
    public GetThreeDSecureResponse(
            String mpi,
            String eci,
            String cavv,
            String transactionId,
            String successUrl) {
        this.mpi = OptionalNullable.of(mpi);
        this.eci = OptionalNullable.of(eci);
        this.cavv = OptionalNullable.of(cavv);
        this.transactionId = OptionalNullable.of(transactionId);
        this.successUrl = OptionalNullable.of(successUrl);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetThreeDSecureResponse(OptionalNullable<String> mpi, OptionalNullable<String> eci,
            OptionalNullable<String> cavv, OptionalNullable<String> transactionId,
            OptionalNullable<String> successUrl) {
        this.mpi = mpi;
        this.eci = eci;
        this.cavv = cavv;
        this.transactionId = transactionId;
        this.successUrl = successUrl;
    }

    /**
     * Internal Getter for Mpi.
     * MPI Vendor
     * @return Returns the Internal String
     */
    @JsonGetter("mpi")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMpi() {
        return this.mpi;
    }

    /**
     * Getter for Mpi.
     * MPI Vendor
     * @return Returns the String
     */
    public String getMpi() {
        return OptionalNullable.getFrom(mpi);
    }

    /**
     * Setter for Mpi.
     * MPI Vendor
     * @param mpi Value for String
     */
    @JsonSetter("mpi")
    public void setMpi(String mpi) {
        this.mpi = OptionalNullable.of(mpi);
    }

    /**
     * UnSetter for Mpi.
     * MPI Vendor
     */
    public void unsetMpi() {
        mpi = null;
    }

    /**
     * Internal Getter for Eci.
     * Electronic Commerce Indicator (ECI) (Opcional)
     * @return Returns the Internal String
     */
    @JsonGetter("eci")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEci() {
        return this.eci;
    }

    /**
     * Getter for Eci.
     * Electronic Commerce Indicator (ECI) (Opcional)
     * @return Returns the String
     */
    public String getEci() {
        return OptionalNullable.getFrom(eci);
    }

    /**
     * Setter for Eci.
     * Electronic Commerce Indicator (ECI) (Opcional)
     * @param eci Value for String
     */
    @JsonSetter("eci")
    public void setEci(String eci) {
        this.eci = OptionalNullable.of(eci);
    }

    /**
     * UnSetter for Eci.
     * Electronic Commerce Indicator (ECI) (Opcional)
     */
    public void unsetEci() {
        eci = null;
    }

    /**
     * Internal Getter for Cavv.
     * Online payment cryptogram, definido pelo 3-D Secure.
     * @return Returns the Internal String
     */
    @JsonGetter("cavv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCavv() {
        return this.cavv;
    }

    /**
     * Getter for Cavv.
     * Online payment cryptogram, definido pelo 3-D Secure.
     * @return Returns the String
     */
    public String getCavv() {
        return OptionalNullable.getFrom(cavv);
    }

    /**
     * Setter for Cavv.
     * Online payment cryptogram, definido pelo 3-D Secure.
     * @param cavv Value for String
     */
    @JsonSetter("cavv")
    public void setCavv(String cavv) {
        this.cavv = OptionalNullable.of(cavv);
    }

    /**
     * UnSetter for Cavv.
     * Online payment cryptogram, definido pelo 3-D Secure.
     */
    public void unsetCavv() {
        cavv = null;
    }

    /**
     * Internal Getter for TransactionId.
     * Identificador da transação (XID)
     * @return Returns the Internal String
     */
    @JsonGetter("transaction_Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTransactionId() {
        return this.transactionId;
    }

    /**
     * Getter for TransactionId.
     * Identificador da transação (XID)
     * @return Returns the String
     */
    public String getTransactionId() {
        return OptionalNullable.getFrom(transactionId);
    }

    /**
     * Setter for TransactionId.
     * Identificador da transação (XID)
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_Id")
    public void setTransactionId(String transactionId) {
        this.transactionId = OptionalNullable.of(transactionId);
    }

    /**
     * UnSetter for TransactionId.
     * Identificador da transação (XID)
     */
    public void unsetTransactionId() {
        transactionId = null;
    }

    /**
     * Internal Getter for SuccessUrl.
     * Url de redirecionamento de sucessso
     * @return Returns the Internal String
     */
    @JsonGetter("success_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSuccessUrl() {
        return this.successUrl;
    }

    /**
     * Getter for SuccessUrl.
     * Url de redirecionamento de sucessso
     * @return Returns the String
     */
    public String getSuccessUrl() {
        return OptionalNullable.getFrom(successUrl);
    }

    /**
     * Setter for SuccessUrl.
     * Url de redirecionamento de sucessso
     * @param successUrl Value for String
     */
    @JsonSetter("success_url")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = OptionalNullable.of(successUrl);
    }

    /**
     * UnSetter for SuccessUrl.
     * Url de redirecionamento de sucessso
     */
    public void unsetSuccessUrl() {
        successUrl = null;
    }

    /**
     * Converts this GetThreeDSecureResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetThreeDSecureResponse [" + "mpi=" + mpi + ", eci=" + eci + ", cavv=" + cavv
                + ", transactionId=" + transactionId + ", successUrl=" + successUrl + "]";
    }

    /**
     * Builds a new {@link GetThreeDSecureResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetThreeDSecureResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.mpi = internalGetMpi();
        builder.eci = internalGetEci();
        builder.cavv = internalGetCavv();
        builder.transactionId = internalGetTransactionId();
        builder.successUrl = internalGetSuccessUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link GetThreeDSecureResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> mpi;
        private OptionalNullable<String> eci;
        private OptionalNullable<String> cavv;
        private OptionalNullable<String> transactionId;
        private OptionalNullable<String> successUrl;



        /**
         * Setter for mpi.
         * @param  mpi  String value for mpi.
         * @return Builder
         */
        public Builder mpi(String mpi) {
            this.mpi = OptionalNullable.of(mpi);
            return this;
        }

        /**
         * UnSetter for mpi.
         * @return Builder
         */
        public Builder unsetMpi() {
            mpi = null;
            return this;
        }

        /**
         * Setter for eci.
         * @param  eci  String value for eci.
         * @return Builder
         */
        public Builder eci(String eci) {
            this.eci = OptionalNullable.of(eci);
            return this;
        }

        /**
         * UnSetter for eci.
         * @return Builder
         */
        public Builder unsetEci() {
            eci = null;
            return this;
        }

        /**
         * Setter for cavv.
         * @param  cavv  String value for cavv.
         * @return Builder
         */
        public Builder cavv(String cavv) {
            this.cavv = OptionalNullable.of(cavv);
            return this;
        }

        /**
         * UnSetter for cavv.
         * @return Builder
         */
        public Builder unsetCavv() {
            cavv = null;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = OptionalNullable.of(transactionId);
            return this;
        }

        /**
         * UnSetter for transactionId.
         * @return Builder
         */
        public Builder unsetTransactionId() {
            transactionId = null;
            return this;
        }

        /**
         * Setter for successUrl.
         * @param  successUrl  String value for successUrl.
         * @return Builder
         */
        public Builder successUrl(String successUrl) {
            this.successUrl = OptionalNullable.of(successUrl);
            return this;
        }

        /**
         * UnSetter for successUrl.
         * @return Builder
         */
        public Builder unsetSuccessUrl() {
            successUrl = null;
            return this;
        }

        /**
         * Builds a new {@link GetThreeDSecureResponse} object using the set fields.
         * @return {@link GetThreeDSecureResponse}
         */
        public GetThreeDSecureResponse build() {
            return new GetThreeDSecureResponse(mpi, eci, cavv, transactionId, successUrl);
        }
    }
}
