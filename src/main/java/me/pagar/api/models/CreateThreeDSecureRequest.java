/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateThreeDSecureRequest type.
 */
public class CreateThreeDSecureRequest {
    private String mpi;
    private String cavv;
    private String eci;
    private String transactionId;
    private String successUrl;
    private String dsTransactionId;
    private String version;

    /**
     * Default constructor.
     */
    public CreateThreeDSecureRequest() {
    }

    /**
     * Initialization constructor.
     * @param  mpi  String value for mpi.
     * @param  cavv  String value for cavv.
     * @param  eci  String value for eci.
     * @param  transactionId  String value for transactionId.
     * @param  successUrl  String value for successUrl.
     * @param  dsTransactionId  String value for dsTransactionId.
     * @param  version  String value for version.
     */
    public CreateThreeDSecureRequest(
            String mpi,
            String cavv,
            String eci,
            String transactionId,
            String successUrl,
            String dsTransactionId,
            String version) {
        this.mpi = mpi;
        this.cavv = cavv;
        this.eci = eci;
        this.transactionId = transactionId;
        this.successUrl = successUrl;
        this.dsTransactionId = dsTransactionId;
        this.version = version;
    }

    /**
     * Getter for Mpi.
     * The MPI Vendor (MerchantPlugin)
     * @return Returns the String
     */
    @JsonGetter("mpi")
    public String getMpi() {
        return mpi;
    }

    /**
     * Setter for Mpi.
     * The MPI Vendor (MerchantPlugin)
     * @param mpi Value for String
     */
    @JsonSetter("mpi")
    public void setMpi(String mpi) {
        this.mpi = mpi;
    }

    /**
     * Getter for Cavv.
     * The Cardholder Authentication Verification value
     * @return Returns the String
     */
    @JsonGetter("cavv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCavv() {
        return cavv;
    }

    /**
     * Setter for Cavv.
     * The Cardholder Authentication Verification value
     * @param cavv Value for String
     */
    @JsonSetter("cavv")
    public void setCavv(String cavv) {
        this.cavv = cavv;
    }

    /**
     * Getter for Eci.
     * The Electronic Commerce Indicator value
     * @return Returns the String
     */
    @JsonGetter("eci")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEci() {
        return eci;
    }

    /**
     * Setter for Eci.
     * The Electronic Commerce Indicator value
     * @param eci Value for String
     */
    @JsonSetter("eci")
    public void setEci(String eci) {
        this.eci = eci;
    }

    /**
     * Getter for TransactionId.
     * The TransactionId value (XID)
     * @return Returns the String
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The TransactionId value (XID)
     * @param transactionId Value for String
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for SuccessUrl.
     * The success URL after the authentication
     * @return Returns the String
     */
    @JsonGetter("success_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Setter for SuccessUrl.
     * The success URL after the authentication
     * @param successUrl Value for String
     */
    @JsonSetter("success_url")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    /**
     * Getter for DsTransactionId.
     * Directory Service Transaction Identifier
     * @return Returns the String
     */
    @JsonGetter("ds_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDsTransactionId() {
        return dsTransactionId;
    }

    /**
     * Setter for DsTransactionId.
     * Directory Service Transaction Identifier
     * @param dsTransactionId Value for String
     */
    @JsonSetter("ds_transaction_id")
    public void setDsTransactionId(String dsTransactionId) {
        this.dsTransactionId = dsTransactionId;
    }

    /**
     * Getter for Version.
     * ThreeDSecure Version
     * @return Returns the String
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * ThreeDSecure Version
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Converts this CreateThreeDSecureRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateThreeDSecureRequest [" + "mpi=" + mpi + ", cavv=" + cavv + ", eci=" + eci
                + ", transactionId=" + transactionId + ", successUrl=" + successUrl
                + ", dsTransactionId=" + dsTransactionId + ", version=" + version + "]";
    }

    /**
     * Builds a new {@link CreateThreeDSecureRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateThreeDSecureRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mpi)
                .cavv(getCavv())
                .eci(getEci())
                .transactionId(getTransactionId())
                .successUrl(getSuccessUrl())
                .dsTransactionId(getDsTransactionId())
                .version(getVersion());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateThreeDSecureRequest}.
     */
    public static class Builder {
        private String mpi;
        private String cavv;
        private String eci;
        private String transactionId;
        private String successUrl;
        private String dsTransactionId;
        private String version;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mpi  String value for mpi.
         */
        public Builder(String mpi) {
            this.mpi = mpi;
        }

        /**
         * Setter for mpi.
         * @param  mpi  String value for mpi.
         * @return Builder
         */
        public Builder mpi(String mpi) {
            this.mpi = mpi;
            return this;
        }

        /**
         * Setter for cavv.
         * @param  cavv  String value for cavv.
         * @return Builder
         */
        public Builder cavv(String cavv) {
            this.cavv = cavv;
            return this;
        }

        /**
         * Setter for eci.
         * @param  eci  String value for eci.
         * @return Builder
         */
        public Builder eci(String eci) {
            this.eci = eci;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for successUrl.
         * @param  successUrl  String value for successUrl.
         * @return Builder
         */
        public Builder successUrl(String successUrl) {
            this.successUrl = successUrl;
            return this;
        }

        /**
         * Setter for dsTransactionId.
         * @param  dsTransactionId  String value for dsTransactionId.
         * @return Builder
         */
        public Builder dsTransactionId(String dsTransactionId) {
            this.dsTransactionId = dsTransactionId;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds a new {@link CreateThreeDSecureRequest} object using the set fields.
         * @return {@link CreateThreeDSecureRequest}
         */
        public CreateThreeDSecureRequest build() {
            return new CreateThreeDSecureRequest(mpi, cavv, eci, transactionId, successUrl,
                    dsTransactionId, version);
        }
    }
}
