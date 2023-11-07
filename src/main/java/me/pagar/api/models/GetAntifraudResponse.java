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
 * This is a model class for GetAntifraudResponse type.
 */
public class GetAntifraudResponse {
    private OptionalNullable<String> status;
    private OptionalNullable<String> returnCode;
    private OptionalNullable<String> returnMessage;
    private OptionalNullable<String> providerName;
    private OptionalNullable<String> score;

    /**
     * Default constructor.
     */
    public GetAntifraudResponse() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  returnCode  String value for returnCode.
     * @param  returnMessage  String value for returnMessage.
     * @param  providerName  String value for providerName.
     * @param  score  String value for score.
     */
    public GetAntifraudResponse(
            String status,
            String returnCode,
            String returnMessage,
            String providerName,
            String score) {
        this.status = OptionalNullable.of(status);
        this.returnCode = OptionalNullable.of(returnCode);
        this.returnMessage = OptionalNullable.of(returnMessage);
        this.providerName = OptionalNullable.of(providerName);
        this.score = OptionalNullable.of(score);
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  returnCode  String value for returnCode.
     * @param  returnMessage  String value for returnMessage.
     * @param  providerName  String value for providerName.
     * @param  score  String value for score.
     */

    protected GetAntifraudResponse(OptionalNullable<String> status,
            OptionalNullable<String> returnCode, OptionalNullable<String> returnMessage,
            OptionalNullable<String> providerName, OptionalNullable<String> score) {
        this.status = status;
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.providerName = providerName;
        this.score = score;
    }

    /**
     * Internal Getter for Status.
     * @return Returns the Internal String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStatus() {
        return this.status;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for ReturnCode.
     * @return Returns the Internal String
     */
    @JsonGetter("return_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReturnCode() {
        return this.returnCode;
    }

    /**
     * Getter for ReturnCode.
     * @return Returns the String
     */
    public String getReturnCode() {
        return OptionalNullable.getFrom(returnCode);
    }

    /**
     * Setter for ReturnCode.
     * @param returnCode Value for String
     */
    @JsonSetter("return_code")
    public void setReturnCode(String returnCode) {
        this.returnCode = OptionalNullable.of(returnCode);
    }

    /**
     * UnSetter for ReturnCode.
     */
    public void unsetReturnCode() {
        returnCode = null;
    }

    /**
     * Internal Getter for ReturnMessage.
     * @return Returns the Internal String
     */
    @JsonGetter("return_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReturnMessage() {
        return this.returnMessage;
    }

    /**
     * Getter for ReturnMessage.
     * @return Returns the String
     */
    public String getReturnMessage() {
        return OptionalNullable.getFrom(returnMessage);
    }

    /**
     * Setter for ReturnMessage.
     * @param returnMessage Value for String
     */
    @JsonSetter("return_message")
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = OptionalNullable.of(returnMessage);
    }

    /**
     * UnSetter for ReturnMessage.
     */
    public void unsetReturnMessage() {
        returnMessage = null;
    }

    /**
     * Internal Getter for ProviderName.
     * @return Returns the Internal String
     */
    @JsonGetter("provider_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetProviderName() {
        return this.providerName;
    }

    /**
     * Getter for ProviderName.
     * @return Returns the String
     */
    public String getProviderName() {
        return OptionalNullable.getFrom(providerName);
    }

    /**
     * Setter for ProviderName.
     * @param providerName Value for String
     */
    @JsonSetter("provider_name")
    public void setProviderName(String providerName) {
        this.providerName = OptionalNullable.of(providerName);
    }

    /**
     * UnSetter for ProviderName.
     */
    public void unsetProviderName() {
        providerName = null;
    }

    /**
     * Internal Getter for Score.
     * @return Returns the Internal String
     */
    @JsonGetter("score")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetScore() {
        return this.score;
    }

    /**
     * Getter for Score.
     * @return Returns the String
     */
    public String getScore() {
        return OptionalNullable.getFrom(score);
    }

    /**
     * Setter for Score.
     * @param score Value for String
     */
    @JsonSetter("score")
    public void setScore(String score) {
        this.score = OptionalNullable.of(score);
    }

    /**
     * UnSetter for Score.
     */
    public void unsetScore() {
        score = null;
    }

    /**
     * Converts this GetAntifraudResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAntifraudResponse [" + "status=" + status + ", returnCode=" + returnCode
                + ", returnMessage=" + returnMessage + ", providerName=" + providerName + ", score="
                + score + "]";
    }

    /**
     * Builds a new {@link GetAntifraudResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAntifraudResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.status = internalGetStatus();
        builder.returnCode = internalGetReturnCode();
        builder.returnMessage = internalGetReturnMessage();
        builder.providerName = internalGetProviderName();
        builder.score = internalGetScore();
        return builder;
    }

    /**
     * Class to build instances of {@link GetAntifraudResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> status;
        private OptionalNullable<String> returnCode;
        private OptionalNullable<String> returnMessage;
        private OptionalNullable<String> providerName;
        private OptionalNullable<String> score;



        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = OptionalNullable.of(status);
            return this;
        }

        /**
         * UnSetter for status.
         * @return Builder
         */
        public Builder unsetStatus() {
            status = null;
            return this;
        }

        /**
         * Setter for returnCode.
         * @param  returnCode  String value for returnCode.
         * @return Builder
         */
        public Builder returnCode(String returnCode) {
            this.returnCode = OptionalNullable.of(returnCode);
            return this;
        }

        /**
         * UnSetter for returnCode.
         * @return Builder
         */
        public Builder unsetReturnCode() {
            returnCode = null;
            return this;
        }

        /**
         * Setter for returnMessage.
         * @param  returnMessage  String value for returnMessage.
         * @return Builder
         */
        public Builder returnMessage(String returnMessage) {
            this.returnMessage = OptionalNullable.of(returnMessage);
            return this;
        }

        /**
         * UnSetter for returnMessage.
         * @return Builder
         */
        public Builder unsetReturnMessage() {
            returnMessage = null;
            return this;
        }

        /**
         * Setter for providerName.
         * @param  providerName  String value for providerName.
         * @return Builder
         */
        public Builder providerName(String providerName) {
            this.providerName = OptionalNullable.of(providerName);
            return this;
        }

        /**
         * UnSetter for providerName.
         * @return Builder
         */
        public Builder unsetProviderName() {
            providerName = null;
            return this;
        }

        /**
         * Setter for score.
         * @param  score  String value for score.
         * @return Builder
         */
        public Builder score(String score) {
            this.score = OptionalNullable.of(score);
            return this;
        }

        /**
         * UnSetter for score.
         * @return Builder
         */
        public Builder unsetScore() {
            score = null;
            return this;
        }

        /**
         * Builds a new {@link GetAntifraudResponse} object using the set fields.
         * @return {@link GetAntifraudResponse}
         */
        public GetAntifraudResponse build() {
            return new GetAntifraudResponse(status, returnCode, returnMessage, providerName, score);
        }
    }
}
