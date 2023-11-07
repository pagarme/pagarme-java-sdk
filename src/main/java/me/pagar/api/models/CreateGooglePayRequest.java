/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateGooglePayRequest type.
 */
public class CreateGooglePayRequest {
    private String version;
    private String data;
    private CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey;
    private String signature;
    private String signedMessage;

    /**
     * Default constructor.
     */
    public CreateGooglePayRequest() {
    }

    /**
     * Initialization constructor.
     * @param  version  String value for version.
     * @param  data  String value for data.
     * @param  intermediateSigningKey  CreateGooglePayIntermediateSigningKeyRequest value for
     *         intermediateSigningKey.
     * @param  signature  String value for signature.
     * @param  signedMessage  String value for signedMessage.
     */
    public CreateGooglePayRequest(
            String version,
            String data,
            CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey,
            String signature,
            String signedMessage) {
        this.version = version;
        this.data = data;
        this.intermediateSigningKey = intermediateSigningKey;
        this.signature = signature;
        this.signedMessage = signedMessage;
    }

    /**
     * Getter for Version.
     * Informação sobre a versão do token. Único valor aceito é EC_v2
     * @return Returns the String
     */
    @JsonGetter("version")
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * Informação sobre a versão do token. Único valor aceito é EC_v2
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for Data.
     * Dados de pagamento criptografados. Corresponde ao encryptedMessage do token Google.
     * @return Returns the String
     */
    @JsonGetter("data")
    public String getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Dados de pagamento criptografados. Corresponde ao encryptedMessage do token Google.
     * @param data Value for String
     */
    @JsonSetter("data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Getter for IntermediateSigningKey.
     * The GooglePay intermediate signing key request
     * @return Returns the CreateGooglePayIntermediateSigningKeyRequest
     */
    @JsonGetter("intermediate_signing_key")
    public CreateGooglePayIntermediateSigningKeyRequest getIntermediateSigningKey() {
        return intermediateSigningKey;
    }

    /**
     * Setter for IntermediateSigningKey.
     * The GooglePay intermediate signing key request
     * @param intermediateSigningKey Value for CreateGooglePayIntermediateSigningKeyRequest
     */
    @JsonSetter("intermediate_signing_key")
    public void setIntermediateSigningKey(CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey) {
        this.intermediateSigningKey = intermediateSigningKey;
    }

    /**
     * Getter for Signature.
     * Assinatura dos dados de pagamento. Verifica se a origem da mensagem é o Google. Corresponde
     * ao signature do token Google.
     * @return Returns the String
     */
    @JsonGetter("signature")
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * Assinatura dos dados de pagamento. Verifica se a origem da mensagem é o Google. Corresponde
     * ao signature do token Google.
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Getter for SignedMessage.
     * @return Returns the String
     */
    @JsonGetter("signed_message")
    public String getSignedMessage() {
        return signedMessage;
    }

    /**
     * Setter for SignedMessage.
     * @param signedMessage Value for String
     */
    @JsonSetter("signed_message")
    public void setSignedMessage(String signedMessage) {
        this.signedMessage = signedMessage;
    }

    /**
     * Converts this CreateGooglePayRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateGooglePayRequest [" + "version=" + version + ", data=" + data
                + ", intermediateSigningKey=" + intermediateSigningKey + ", signature=" + signature
                + ", signedMessage=" + signedMessage + "]";
    }

    /**
     * Builds a new {@link CreateGooglePayRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateGooglePayRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(version, data, intermediateSigningKey, signature,
                signedMessage);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateGooglePayRequest}.
     */
    public static class Builder {
        private String version;
        private String data;
        private CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey;
        private String signature;
        private String signedMessage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  version  String value for version.
         * @param  data  String value for data.
         * @param  intermediateSigningKey  CreateGooglePayIntermediateSigningKeyRequest value for
         *         intermediateSigningKey.
         * @param  signature  String value for signature.
         * @param  signedMessage  String value for signedMessage.
         */
        public Builder(String version, String data,
                CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey,
                String signature, String signedMessage) {
            this.version = version;
            this.data = data;
            this.intermediateSigningKey = intermediateSigningKey;
            this.signature = signature;
            this.signedMessage = signedMessage;
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
         * Setter for intermediateSigningKey.
         * @param  intermediateSigningKey  CreateGooglePayIntermediateSigningKeyRequest value for
         *         intermediateSigningKey.
         * @return Builder
         */
        public Builder intermediateSigningKey(
                CreateGooglePayIntermediateSigningKeyRequest intermediateSigningKey) {
            this.intermediateSigningKey = intermediateSigningKey;
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
         * Setter for signedMessage.
         * @param  signedMessage  String value for signedMessage.
         * @return Builder
         */
        public Builder signedMessage(String signedMessage) {
            this.signedMessage = signedMessage;
            return this;
        }

        /**
         * Builds a new {@link CreateGooglePayRequest} object using the set fields.
         * @return {@link CreateGooglePayRequest}
         */
        public CreateGooglePayRequest build() {
            return new CreateGooglePayRequest(version, data, intermediateSigningKey, signature,
                    signedMessage);
        }
    }
}
