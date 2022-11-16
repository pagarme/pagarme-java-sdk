/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateApplePayRequest type.
 */
public class CreateApplePayRequest {
    private String version;
    private String data;
    private CreateApplePayHeaderRequest header;
    private String signature;
    private String merchantIdentifier;

    /**
     * Default constructor.
     */
    public CreateApplePayRequest() {
    }

    /**
     * Initialization constructor.
     * @param  version  String value for version.
     * @param  data  String value for data.
     * @param  header  CreateApplePayHeaderRequest value for header.
     * @param  signature  String value for signature.
     * @param  merchantIdentifier  String value for merchantIdentifier.
     */
    public CreateApplePayRequest(
            String version,
            String data,
            CreateApplePayHeaderRequest header,
            String signature,
            String merchantIdentifier) {
        this.version = version;
        this.data = data;
        this.header = header;
        this.signature = signature;
        this.merchantIdentifier = merchantIdentifier;
    }

    /**
     * Getter for Version.
     * The token version
     * @return Returns the String
     */
    @JsonGetter("version")
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * The token version
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for Data.
     * The cryptography data
     * @return Returns the String
     */
    @JsonGetter("data")
    public String getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The cryptography data
     * @param data Value for String
     */
    @JsonSetter("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Getter for Header.
     * The ApplePay header request
     * @return Returns the CreateApplePayHeaderRequest
     */
    @JsonGetter("header")
    public CreateApplePayHeaderRequest getHeader() {
        return header;
    }

    /**
     * Setter for Header.
     * The ApplePay header request
     * @param header Value for CreateApplePayHeaderRequest
     */
    @JsonSetter("header")
    public void setHeader(CreateApplePayHeaderRequest header) {
        this.header = header;
    }

    /**
     * Getter for Signature.
     * Detached PKCS #7 signature, Base64 encoded as string
     * @return Returns the String
     */
    @JsonGetter("signature")
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * Detached PKCS #7 signature, Base64 encoded as string
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Getter for MerchantIdentifier.
     * ApplePay Merchant identifier
     * @return Returns the String
     */
    @JsonGetter("merchant_identifier")
    public String getMerchantIdentifier() {
        return merchantIdentifier;
    }

    /**
     * Setter for MerchantIdentifier.
     * ApplePay Merchant identifier
     * @param merchantIdentifier Value for String
     */
    @JsonSetter("merchant_identifier")
    public void setMerchantIdentifier(String merchantIdentifier) {
        this.merchantIdentifier = merchantIdentifier;
    }

    /**
     * Converts this CreateApplePayRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateApplePayRequest [" + "version=" + version + ", data=" + data + ", header="
                + header + ", signature=" + signature + ", merchantIdentifier=" + merchantIdentifier
                + "]";
    }

    /**
     * Builds a new {@link CreateApplePayRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateApplePayRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(version, data, header, signature, merchantIdentifier);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateApplePayRequest}.
     */
    public static class Builder {
        private String version;
        private String data;
        private CreateApplePayHeaderRequest header;
        private String signature;
        private String merchantIdentifier;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  version  String value for version.
         * @param  data  String value for data.
         * @param  header  CreateApplePayHeaderRequest value for header.
         * @param  signature  String value for signature.
         * @param  merchantIdentifier  String value for merchantIdentifier.
         */
        public Builder(String version, String data, CreateApplePayHeaderRequest header,
                String signature, String merchantIdentifier) {
            this.version = version;
            this.data = data;
            this.header = header;
            this.signature = signature;
            this.merchantIdentifier = merchantIdentifier;
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
         * Setter for data.
         * @param  data  String value for data.
         * @return Builder
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for header.
         * @param  header  CreateApplePayHeaderRequest value for header.
         * @return Builder
         */
        public Builder header(CreateApplePayHeaderRequest header) {
            this.header = header;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Setter for merchantIdentifier.
         * @param  merchantIdentifier  String value for merchantIdentifier.
         * @return Builder
         */
        public Builder merchantIdentifier(String merchantIdentifier) {
            this.merchantIdentifier = merchantIdentifier;
            return this;
        }

        /**
         * Builds a new {@link CreateApplePayRequest} object using the set fields.
         * @return {@link CreateApplePayRequest}
         */
        public CreateApplePayRequest build() {
            return new CreateApplePayRequest(version, data, header, signature, merchantIdentifier);
        }
    }
}
