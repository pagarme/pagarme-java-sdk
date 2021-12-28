/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for UpdateRecipientRequest type.
 */
public class UpdateRecipientRequest {
    private String name;
    private String email;
    private String description;
    private String type;
    private String status;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public UpdateRecipientRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  description  String value for description.
     * @param  type  String value for type.
     * @param  status  String value for status.
     * @param  metadata  Map of String, value for metadata.
     */
    public UpdateRecipientRequest(
            String name,
            String email,
            String description,
            String type,
            String status,
            Map<String, String> metadata) {
        this.name = name;
        this.email = email;
        this.description = description;
        this.type = type;
        this.status = status;
        this.metadata = metadata;
    }

    /**
     * Getter for Name.
     * Name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * Email
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Email
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Type.
     * Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Status.
     * Status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Metadata.
     * Metadata
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this UpdateRecipientRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateRecipientRequest [" + "name=" + name + ", email=" + email + ", description="
                + description + ", type=" + type + ", status=" + status + ", metadata=" + metadata
                + "]";
    }

    /**
     * Builds a new {@link UpdateRecipientRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateRecipientRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, email, description, type, status, metadata);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateRecipientRequest}.
     */
    public static class Builder {
        private String name;
        private String email;
        private String description;
        private String type;
        private String status;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  email  String value for email.
         * @param  description  String value for description.
         * @param  type  String value for type.
         * @param  status  String value for status.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String name, String email, String description, String type, String status,
                Map<String, String> metadata) {
            this.name = name;
            this.email = email;
            this.description = description;
            this.type = type;
            this.status = status;
            this.metadata = metadata;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link UpdateRecipientRequest} object using the set fields.
         * @return {@link UpdateRecipientRequest}
         */
        public UpdateRecipientRequest build() {
            return new UpdateRecipientRequest(name, email, description, type, status, metadata);
        }
    }
}