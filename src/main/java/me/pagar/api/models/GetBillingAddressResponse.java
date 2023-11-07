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
 * This is a model class for GetBillingAddressResponse type.
 */
public class GetBillingAddressResponse {
    private OptionalNullable<String> street;
    private OptionalNullable<String> number;
    private OptionalNullable<String> zipCode;
    private OptionalNullable<String> neighborhood;
    private OptionalNullable<String> city;
    private OptionalNullable<String> state;
    private OptionalNullable<String> country;
    private OptionalNullable<String> complement;
    private OptionalNullable<String> line1;
    private OptionalNullable<String> line2;

    /**
     * Default constructor.
     */
    public GetBillingAddressResponse() {
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
    public GetBillingAddressResponse(
            String street,
            String number,
            String zipCode,
            String neighborhood,
            String city,
            String state,
            String country,
            String complement,
            String line1,
            String line2) {
        this.street = OptionalNullable.of(street);
        this.number = OptionalNullable.of(number);
        this.zipCode = OptionalNullable.of(zipCode);
        this.neighborhood = OptionalNullable.of(neighborhood);
        this.city = OptionalNullable.of(city);
        this.state = OptionalNullable.of(state);
        this.country = OptionalNullable.of(country);
        this.complement = OptionalNullable.of(complement);
        this.line1 = OptionalNullable.of(line1);
        this.line2 = OptionalNullable.of(line2);
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

    protected GetBillingAddressResponse(OptionalNullable<String> street,
            OptionalNullable<String> number, OptionalNullable<String> zipCode,
            OptionalNullable<String> neighborhood, OptionalNullable<String> city,
            OptionalNullable<String> state, OptionalNullable<String> country,
            OptionalNullable<String> complement, OptionalNullable<String> line1,
            OptionalNullable<String> line2) {
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
     * Converts this GetBillingAddressResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetBillingAddressResponse [" + "street=" + street + ", number=" + number
                + ", zipCode=" + zipCode + ", neighborhood=" + neighborhood + ", city=" + city
                + ", state=" + state + ", country=" + country + ", complement=" + complement
                + ", line1=" + line1 + ", line2=" + line2 + "]";
    }

    /**
     * Builds a new {@link GetBillingAddressResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetBillingAddressResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.street = internalGetStreet();
        builder.number = internalGetNumber();
        builder.zipCode = internalGetZipCode();
        builder.neighborhood = internalGetNeighborhood();
        builder.city = internalGetCity();
        builder.state = internalGetState();
        builder.country = internalGetCountry();
        builder.complement = internalGetComplement();
        builder.line1 = internalGetLine1();
        builder.line2 = internalGetLine2();
        return builder;
    }

    /**
     * Class to build instances of {@link GetBillingAddressResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> street;
        private OptionalNullable<String> number;
        private OptionalNullable<String> zipCode;
        private OptionalNullable<String> neighborhood;
        private OptionalNullable<String> city;
        private OptionalNullable<String> state;
        private OptionalNullable<String> country;
        private OptionalNullable<String> complement;
        private OptionalNullable<String> line1;
        private OptionalNullable<String> line2;



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
         * Builds a new {@link GetBillingAddressResponse} object using the set fields.
         * @return {@link GetBillingAddressResponse}
         */
        public GetBillingAddressResponse build() {
            return new GetBillingAddressResponse(street, number, zipCode, neighborhood, city, state,
                    country, complement, line1, line2);
        }
    }
}
