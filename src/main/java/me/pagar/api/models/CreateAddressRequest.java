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
import java.util.Map;

/**
 * This is a model class for CreateAddressRequest type.
 */
public class CreateAddressRequest {
    private String street;
    private String number;
    private String zipCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String complement;
    private OptionalNullable<Map<String, String>> metadata;
    private String line1;
    private String line2;

    /**
     * Default constructor.
     */
    public CreateAddressRequest() {
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  number  String value for number.
     * @param  zipCode  String value for zipCode.
     * @param  neighborhood  String value for neighborhood.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  country  String value for country.
     * @param  complement  String value for complement.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  metadata  Map of String, value for metadata.
     */
    public CreateAddressRequest(
            String street,
            String number,
            String zipCode,
            String neighborhood,
            String city,
            String state,
            String country,
            String complement,
            String line1,
            String line2,
            Map<String, String> metadata) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.complement = complement;
        this.metadata = OptionalNullable.of(metadata);
        this.line1 = line1;
        this.line2 = line2;
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  number  String value for number.
     * @param  zipCode  String value for zipCode.
     * @param  neighborhood  String value for neighborhood.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  country  String value for country.
     * @param  complement  String value for complement.
     * @param  line1  String value for line1.
     * @param  line2  String value for line2.
     * @param  metadata  Map of String, value for metadata.
     */

    protected CreateAddressRequest(String street, String number, String zipCode,
            String neighborhood, String city, String state, String country, String complement,
            String line1, String line2, OptionalNullable<Map<String, String>> metadata) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.complement = complement;
        this.metadata = metadata;
        this.line1 = line1;
        this.line2 = line2;
    }

    /**
     * Getter for Street.
     * Street
     * @return Returns the String
     */
    @JsonGetter("street")
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * Street
     * @param street Value for String
     */
    @JsonSetter("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for Number.
     * Number
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * Number
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for ZipCode.
     * The zip code containing only numbers. No special characters or spaces.
     * @return Returns the String
     */
    @JsonGetter("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * The zip code containing only numbers. No special characters or spaces.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for Neighborhood.
     * Neighborhood
     * @return Returns the String
     */
    @JsonGetter("neighborhood")
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Setter for Neighborhood.
     * Neighborhood
     * @param neighborhood Value for String
     */
    @JsonSetter("neighborhood")
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Getter for City.
     * City
     * @return Returns the String
     */
    @JsonGetter("city")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * City
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for State.
     * State
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * State
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Country.
     * Country. Must be entered using ISO 3166-1 alpha-2 format. See
     * https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2
     * @return Returns the String
     */
    @JsonGetter("country")
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Country. Must be entered using ISO 3166-1 alpha-2 format. See
     * https://pt.wikipedia.org/wiki/ISO_3166-1_alfa-2
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Complement.
     * Complement
     * @return Returns the String
     */
    @JsonGetter("complement")
    public String getComplement() {
        return complement;
    }

    /**
     * Setter for Complement.
     * Complement
     * @param complement Value for String
     */
    @JsonSetter("complement")
    public void setComplement(String complement) {
        this.complement = complement;
    }

    /**
     * Internal Getter for Metadata.
     * Metadata
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
     * Metadata
     * @return Returns the Map of String, String
     */
    public Map<String, String> getMetadata() {
        return OptionalNullable.getFrom(metadata);
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = OptionalNullable.of(metadata);
    }

    /**
     * UnSetter for Metadata.
     * Metadata
     */
    public void unsetMetadata() {
        metadata = null;
    }

    /**
     * Getter for Line1.
     * Line 1 for address
     * @return Returns the String
     */
    @JsonGetter("line_1")
    public String getLine1() {
        return line1;
    }

    /**
     * Setter for Line1.
     * Line 1 for address
     * @param line1 Value for String
     */
    @JsonSetter("line_1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Getter for Line2.
     * Line 2 for address
     * @return Returns the String
     */
    @JsonGetter("line_2")
    public String getLine2() {
        return line2;
    }

    /**
     * Setter for Line2.
     * Line 2 for address
     * @param line2 Value for String
     */
    @JsonSetter("line_2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * Converts this CreateAddressRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateAddressRequest [" + "street=" + street + ", number=" + number + ", zipCode="
                + zipCode + ", neighborhood=" + neighborhood + ", city=" + city + ", state=" + state
                + ", country=" + country + ", complement=" + complement + ", line1=" + line1
                + ", line2=" + line2 + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link CreateAddressRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateAddressRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(street, number, zipCode, neighborhood, city, state, country,
                complement, line1, line2);
        builder.metadata = internalGetMetadata();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateAddressRequest}.
     */
    public static class Builder {
        private String street;
        private String number;
        private String zipCode;
        private String neighborhood;
        private String city;
        private String state;
        private String country;
        private String complement;
        private String line1;
        private String line2;
        private OptionalNullable<Map<String, String>> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  street  String value for street.
         * @param  number  String value for number.
         * @param  zipCode  String value for zipCode.
         * @param  neighborhood  String value for neighborhood.
         * @param  city  String value for city.
         * @param  state  String value for state.
         * @param  country  String value for country.
         * @param  complement  String value for complement.
         * @param  line1  String value for line1.
         * @param  line2  String value for line2.
         */
        public Builder(String street, String number, String zipCode, String neighborhood,
                String city, String state, String country, String complement, String line1,
                String line2) {
            this.street = street;
            this.number = number;
            this.zipCode = zipCode;
            this.neighborhood = neighborhood;
            this.city = city;
            this.state = state;
            this.country = country;
            this.complement = complement;
            this.line1 = line1;
            this.line2 = line2;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Setter for neighborhood.
         * @param  neighborhood  String value for neighborhood.
         * @return Builder
         */
        public Builder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for complement.
         * @param  complement  String value for complement.
         * @return Builder
         */
        public Builder complement(String complement) {
            this.complement = complement;
            return this;
        }

        /**
         * Setter for line1.
         * @param  line1  String value for line1.
         * @return Builder
         */
        public Builder line1(String line1) {
            this.line1 = line1;
            return this;
        }

        /**
         * Setter for line2.
         * @param  line2  String value for line2.
         * @return Builder
         */
        public Builder line2(String line2) {
            this.line2 = line2;
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
         * Builds a new {@link CreateAddressRequest} object using the set fields.
         * @return {@link CreateAddressRequest}
         */
        public CreateAddressRequest build() {
            return new CreateAddressRequest(street, number, zipCode, neighborhood, city, state,
                    country, complement, line1, line2, metadata);
        }
    }
}
