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
 * This is a model class for GetTransferSourceResponse type.
 */
public class GetTransferSourceResponse {
    private String sourceId;
    private String type;

    /**
     * Default constructor.
     */
    public GetTransferSourceResponse() {
    }

    /**
     * Initialization constructor.
     * @param  sourceId  String value for sourceId.
     * @param  type  String value for type.
     */
    public GetTransferSourceResponse(
            String sourceId,
            String type) {
        this.sourceId = sourceId;
        this.type = type;
    }

    /**
     * Getter for SourceId.
     * @return Returns the String
     */
    @JsonGetter("source_id")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Setter for SourceId.
     * @param sourceId Value for String
     */
    @JsonSetter("source_id")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this GetTransferSourceResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetTransferSourceResponse [" + "sourceId=" + sourceId + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link GetTransferSourceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetTransferSourceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sourceId, type);
        return builder;
    }

    /**
     * Class to build instances of {@link GetTransferSourceResponse}.
     */
    public static class Builder {
        private String sourceId;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sourceId  String value for sourceId.
         * @param  type  String value for type.
         */
        public Builder(String sourceId, String type) {
            this.sourceId = sourceId;
            this.type = type;
        }

        /**
         * Setter for sourceId.
         * @param  sourceId  String value for sourceId.
         * @return Builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link GetTransferSourceResponse} object using the set fields.
         * @return {@link GetTransferSourceResponse}
         */
        public GetTransferSourceResponse build() {
            return new GetTransferSourceResponse(sourceId, type);
        }
    }
}
