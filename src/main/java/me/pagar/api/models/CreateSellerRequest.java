/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for CreateSellerRequest type.
 */
public class CreateSellerRequest {
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String document;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CreateAddressRequest address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public CreateSellerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  metadata  Map of String, value for metadata.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  document  String value for document.
     * @param  address  CreateAddressRequest value for address.
     * @param  type  String value for type.
     */
    public CreateSellerRequest(
            String name,
            Map<String, String> metadata,
            String code,
            String description,
            String document,
            CreateAddressRequest address,
            String type) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.document = document;
        this.address = address;
        this.type = type;
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
     * Getter for Code.
     * Seller's code identification
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Seller's code identification
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
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
     * Getter for Document.
     * Document number (individual / company)
     * @return Returns the String
     */
    @JsonGetter("document")
    public String getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * Document number (individual / company)
     * @param document Value for String
     */
    @JsonSetter("document")
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Getter for Address.
     * Address
     * @return Returns the CreateAddressRequest
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * Address
     * @param address Value for CreateAddressRequest
     */
    @JsonSetter("address")
    public void setAddress(CreateAddressRequest address) {
        this.address = address;
    }

    /**
     * Getter for Type.
     * Person type (individual / company)
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Person type (individual / company)
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
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
     * Converts this CreateSellerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSellerRequest [" + "name=" + name + ", metadata=" + metadata + ", code="
                + code + ", description=" + description + ", document=" + document + ", address="
                + address + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CreateSellerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSellerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, metadata)
                .code(getCode())
                .description(getDescription())
                .document(getDocument())
                .address(getAddress())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSellerRequest}.
     */
    public static class Builder {
        private String name;
        private Map<String, String> metadata;
        private String code;
        private String description;
        private String document;
        private CreateAddressRequest address;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String name, Map<String, String> metadata) {
            this.name = name;
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
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
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
         * Setter for document.
         * @param  document  String value for document.
         * @return Builder
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  CreateAddressRequest value for address.
         * @return Builder
         */
        public Builder address(CreateAddressRequest address) {
            this.address = address;
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
         * Builds a new {@link CreateSellerRequest} object using the set fields.
         * @return {@link CreateSellerRequest}
         */
        public CreateSellerRequest build() {
            return new CreateSellerRequest(name, metadata, code, description, document, address,
                    type);
        }
    }
}
