/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetAddressResponse type.
 */
public class GetAddressResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> street;
    private OptionalNullable<String> number;
    private OptionalNullable<String> complement;
    private OptionalNullable<String> zipCode;
    private OptionalNullable<String> neighborhood;
    private OptionalNullable<String> city;
    private OptionalNullable<String> state;
    private OptionalNullable<String> country;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<GetCustomerResponse> customer;
    private OptionalNullable<Map<String, String>> metadata;
    private OptionalNullable<String> line1;
    private OptionalNullable<String> line2;
    private OptionalNullable<LocalDateTime> deletedAt;

    /**
     * Default constructor.
     */
    public GetAddressResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  street  String value for street.
     * @param  number  String value for number.
     * @param  complement  String value for complement.
     * @param  zipCode  String value for zipCode.
     * @param  neighborhood  String value for neighborhood.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  country  String value for country.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  metadata  Map of String, value for metadata.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetAddressResponse(
            String id,
            String street,
            String number,
            String complement,
            String zipCode,
            String neighborhood,
            String city,
            String state,
            String country,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetCustomerResponse customer,
            Map<String, String> metadata,
            String line1,
            String line2,
            LocalDateTime deletedAt) {
        this.id = OptionalNullable.of(id);
        this.street = OptionalNullable.of(street);
        this.number = OptionalNullable.of(number);
        this.complement = OptionalNullable.of(complement);
        this.zipCode = OptionalNullable.of(zipCode);
        this.neighborhood = OptionalNullable.of(neighborhood);
        this.city = OptionalNullable.of(city);
        this.state = OptionalNullable.of(state);
        this.country = OptionalNullable.of(country);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.customer = OptionalNullable.of(customer);
        this.metadata = OptionalNullable.of(metadata);
        this.line1 = OptionalNullable.of(line1);
        this.line2 = OptionalNullable.of(line2);
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetAddressResponse(OptionalNullable<String> id, OptionalNullable<String> street,
            OptionalNullable<String> number, OptionalNullable<String> complement,
            OptionalNullable<String> zipCode, OptionalNullable<String> neighborhood,
            OptionalNullable<String> city, OptionalNullable<String> state,
            OptionalNullable<String> country, OptionalNullable<String> status,
            OptionalNullable<LocalDateTime> createdAt, OptionalNullable<LocalDateTime> updatedAt,
            OptionalNullable<GetCustomerResponse> customer,
            OptionalNullable<Map<String, String>> metadata, OptionalNullable<String> line1,
            OptionalNullable<String> line2, OptionalNullable<LocalDateTime> deletedAt) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.customer = customer;
        this.metadata = metadata;
        this.line1 = line1;
        this.line2 = line2;
        this.deletedAt = deletedAt;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for Street.
     * @return Returns the Internal String
     */
    @JsonGetter("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStreet() {
        return this.street;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    public String getStreet() {
        return OptionalNullable.getFrom(street);
    }

    /**
     * Setter for Street.
     * @param street Value for String
     */
    @JsonSetter("street")
    public void setStreet(String street) {
        this.street = OptionalNullable.of(street);
    }

    /**
     * UnSetter for Street.
     */
    public void unsetStreet() {
        street = null;
    }

    /**
     * Internal Getter for Number.
     * @return Returns the Internal String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNumber() {
        return this.number;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    public String getNumber() {
        return OptionalNullable.getFrom(number);
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = OptionalNullable.of(number);
    }

    /**
     * UnSetter for Number.
     */
    public void unsetNumber() {
        number = null;
    }

    /**
     * Internal Getter for Complement.
     * @return Returns the Internal String
     */
    @JsonGetter("complement")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetComplement() {
        return this.complement;
    }

    /**
     * Getter for Complement.
     * @return Returns the String
     */
    public String getComplement() {
        return OptionalNullable.getFrom(complement);
    }

    /**
     * Setter for Complement.
     * @param complement Value for String
     */
    @JsonSetter("complement")
    public void setComplement(String complement) {
        this.complement = OptionalNullable.of(complement);
    }

    /**
     * UnSetter for Complement.
     */
    public void unsetComplement() {
        complement = null;
    }

    /**
     * Internal Getter for ZipCode.
     * @return Returns the Internal String
     */
    @JsonGetter("zip_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetZipCode() {
        return this.zipCode;
    }

    /**
     * Getter for ZipCode.
     * @return Returns the String
     */
    public String getZipCode() {
        return OptionalNullable.getFrom(zipCode);
    }

    /**
     * Setter for ZipCode.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = OptionalNullable.of(zipCode);
    }

    /**
     * UnSetter for ZipCode.
     */
    public void unsetZipCode() {
        zipCode = null;
    }

    /**
     * Internal Getter for Neighborhood.
     * @return Returns the Internal String
     */
    @JsonGetter("neighborhood")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNeighborhood() {
        return this.neighborhood;
    }

    /**
     * Getter for Neighborhood.
     * @return Returns the String
     */
    public String getNeighborhood() {
        return OptionalNullable.getFrom(neighborhood);
    }

    /**
     * Setter for Neighborhood.
     * @param neighborhood Value for String
     */
    @JsonSetter("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = OptionalNullable.of(neighborhood);
    }

    /**
     * UnSetter for Neighborhood.
     */
    public void unsetNeighborhood() {
        neighborhood = null;
    }

    /**
     * Internal Getter for City.
     * @return Returns the Internal String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCity() {
        return this.city;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    public String getCity() {
        return OptionalNullable.getFrom(city);
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = OptionalNullable.of(city);
    }

    /**
     * UnSetter for City.
     */
    public void unsetCity() {
        city = null;
    }

    /**
     * Internal Getter for State.
     * @return Returns the Internal String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetState() {
        return this.state;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    public String getState() {
        return OptionalNullable.getFrom(state);
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = OptionalNullable.of(state);
    }

    /**
     * UnSetter for State.
     */
    public void unsetState() {
        state = null;
    }

    /**
     * Internal Getter for Country.
     * @return Returns the Internal String
     */
    @JsonGetter("country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCountry() {
        return this.country;
    }

    /**
     * Getter for Country.
     * @return Returns the String
     */
    public String getCountry() {
        return OptionalNullable.getFrom(country);
    }

    /**
     * Setter for Country.
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = OptionalNullable.of(country);
    }

    /**
     * UnSetter for Country.
     */
    public void unsetCountry() {
        country = null;
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
     * Internal Getter for CreatedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCreatedAt() {
        return OptionalNullable.getFrom(createdAt);
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = OptionalNullable.of(createdAt);
    }

    /**
     * UnSetter for CreatedAt.
     */
    public void unsetCreatedAt() {
        createdAt = null;
    }

    /**
     * Internal Getter for UpdatedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getUpdatedAt() {
        return OptionalNullable.getFrom(updatedAt);
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * UnSetter for UpdatedAt.
     */
    public void unsetUpdatedAt() {
        updatedAt = null;
    }

    /**
     * Internal Getter for Customer.
     * @return Returns the Internal GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetCustomerResponse> internalGetCustomer() {
        return this.customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the GetCustomerResponse
     */
    public GetCustomerResponse getCustomer() {
        return OptionalNullable.getFrom(customer);
    }

    /**
     * Setter for Customer.
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = OptionalNullable.of(customer);
    }

    /**
     * UnSetter for Customer.
     */
    public void unsetCustomer() {
        customer = null;
    }

    /**
     * Internal Getter for Metadata.
     * @return Returns the Internal Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Map<String, String>> internalGetMetadata() {
        return this.metadata;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    public Map<String, String> getMetadata() {
        return OptionalNullable.getFrom(metadata);
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = OptionalNullable.of(metadata);
    }

    /**
     * UnSetter for Metadata.
     */
    public void unsetMetadata() {
        metadata = null;
    }

    /**
     * Internal Getter for Line1.
     * Line 1 for address
     * @return Returns the Internal String
     */
    @JsonGetter("line_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLine1() {
        return this.line1;
    }

    /**
     * Getter for Line1.
     * Line 1 for address
     * @return Returns the String
     */
    public String getLine1() {
        return OptionalNullable.getFrom(line1);
    }

    /**
     * Setter for Line1.
     * Line 1 for address
     * @param line1 Value for String
     */
    @JsonSetter("line_1")
    public void setLine1(String line1) {
        this.line1 = OptionalNullable.of(line1);
    }

    /**
     * UnSetter for Line1.
     * Line 1 for address
     */
    public void unsetLine1() {
        line1 = null;
    }

    /**
     * Internal Getter for Line2.
     * Line 2 for address
     * @return Returns the Internal String
     */
    @JsonGetter("line_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLine2() {
        return this.line2;
    }

    /**
     * Getter for Line2.
     * Line 2 for address
     * @return Returns the String
     */
    public String getLine2() {
        return OptionalNullable.getFrom(line2);
    }

    /**
     * Setter for Line2.
     * Line 2 for address
     * @param line2 Value for String
     */
    @JsonSetter("line_2")
    public void setLine2(String line2) {
        this.line2 = OptionalNullable.of(line2);
    }

    /**
     * UnSetter for Line2.
     * Line 2 for address
     */
    public void unsetLine2() {
        line2 = null;
    }

    /**
     * Internal Getter for DeletedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDeletedAt() {
        return this.deletedAt;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDeletedAt() {
        return OptionalNullable.getFrom(deletedAt);
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * UnSetter for DeletedAt.
     */
    public void unsetDeletedAt() {
        deletedAt = null;
    }

    /**
     * Converts this GetAddressResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAddressResponse [" + "id=" + id + ", street=" + street + ", number=" + number
                + ", complement=" + complement + ", zipCode=" + zipCode + ", neighborhood="
                + neighborhood + ", city=" + city + ", state=" + state + ", country=" + country
                + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", customer=" + customer + ", metadata=" + metadata + ", line1=" + line1
                + ", line2=" + line2 + ", deletedAt=" + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetAddressResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAddressResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.street = internalGetStreet();
        builder.number = internalGetNumber();
        builder.complement = internalGetComplement();
        builder.zipCode = internalGetZipCode();
        builder.neighborhood = internalGetNeighborhood();
        builder.city = internalGetCity();
        builder.state = internalGetState();
        builder.country = internalGetCountry();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.customer = internalGetCustomer();
        builder.metadata = internalGetMetadata();
        builder.line1 = internalGetLine1();
        builder.line2 = internalGetLine2();
        builder.deletedAt = internalGetDeletedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link GetAddressResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> street;
        private OptionalNullable<String> number;
        private OptionalNullable<String> complement;
        private OptionalNullable<String> zipCode;
        private OptionalNullable<String> neighborhood;
        private OptionalNullable<String> city;
        private OptionalNullable<String> state;
        private OptionalNullable<String> country;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<GetCustomerResponse> customer;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<String> line1;
        private OptionalNullable<String> line2;
        private OptionalNullable<LocalDateTime> deletedAt;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = OptionalNullable.of(street);
            return this;
        }

        /**
         * UnSetter for street.
         * @return Builder
         */
        public Builder unsetStreet() {
            street = null;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = OptionalNullable.of(number);
            return this;
        }

        /**
         * UnSetter for number.
         * @return Builder
         */
        public Builder unsetNumber() {
            number = null;
            return this;
        }

        /**
         * Setter for complement.
         * @param  complement  String value for complement.
         * @return Builder
         */
        public Builder complement(String complement) {
            this.complement = OptionalNullable.of(complement);
            return this;
        }

        /**
         * UnSetter for complement.
         * @return Builder
         */
        public Builder unsetComplement() {
            complement = null;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = OptionalNullable.of(zipCode);
            return this;
        }

        /**
         * UnSetter for zipCode.
         * @return Builder
         */
        public Builder unsetZipCode() {
            zipCode = null;
            return this;
        }

        /**
         * Setter for neighborhood.
         * @param  neighborhood  String value for neighborhood.
         * @return Builder
         */
        public Builder neighborhood(String neighborhood) {
            this.neighborhood = OptionalNullable.of(neighborhood);
            return this;
        }

        /**
         * UnSetter for neighborhood.
         * @return Builder
         */
        public Builder unsetNeighborhood() {
            neighborhood = null;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = OptionalNullable.of(city);
            return this;
        }

        /**
         * UnSetter for city.
         * @return Builder
         */
        public Builder unsetCity() {
            city = null;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = OptionalNullable.of(state);
            return this;
        }

        /**
         * UnSetter for state.
         * @return Builder
         */
        public Builder unsetState() {
            state = null;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = OptionalNullable.of(country);
            return this;
        }

        /**
         * UnSetter for country.
         * @return Builder
         */
        public Builder unsetCountry() {
            country = null;
            return this;
        }

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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = OptionalNullable.of(createdAt);
            return this;
        }

        /**
         * UnSetter for createdAt.
         * @return Builder
         */
        public Builder unsetCreatedAt() {
            createdAt = null;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = OptionalNullable.of(updatedAt);
            return this;
        }

        /**
         * UnSetter for updatedAt.
         * @return Builder
         */
        public Builder unsetUpdatedAt() {
            updatedAt = null;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = OptionalNullable.of(customer);
            return this;
        }

        /**
         * UnSetter for customer.
         * @return Builder
         */
        public Builder unsetCustomer() {
            customer = null;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = OptionalNullable.of(metadata);
            return this;
        }

        /**
         * UnSetter for metadata.
         * @return Builder
         */
        public Builder unsetMetadata() {
            metadata = null;
            return this;
        }

        /**
         * Setter for line1.
         * @param  line1  String value for line1.
         * @return Builder
         */
        public Builder line1(String line1) {
            this.line1 = OptionalNullable.of(line1);
            return this;
        }

        /**
         * UnSetter for line1.
         * @return Builder
         */
        public Builder unsetLine1() {
            line1 = null;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = OptionalNullable.of(line2);
            return this;
        }

        /**
         * UnSetter for line2.
         * @return Builder
         */
        public Builder unsetLine2() {
            line2 = null;
            return this;
        }

        /**
         * Setter for deletedAt.
         * @param  deletedAt  LocalDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = OptionalNullable.of(deletedAt);
            return this;
        }

        /**
         * UnSetter for deletedAt.
         * @return Builder
         */
        public Builder unsetDeletedAt() {
            deletedAt = null;
            return this;
        }

        /**
         * Builds a new {@link GetAddressResponse} object using the set fields.
         * @return {@link GetAddressResponse}
         */
        public GetAddressResponse build() {
            return new GetAddressResponse(id, street, number, complement, zipCode, neighborhood,
                    city, state, country, status, createdAt, updatedAt, customer, metadata, line1,
                    line2, deletedAt);
        }
    }
}
