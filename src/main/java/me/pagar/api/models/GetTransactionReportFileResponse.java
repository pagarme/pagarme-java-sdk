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
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetTransactionReportFileResponse type.
 */
public class GetTransactionReportFileResponse {
    private OptionalNullable<String> name;
    private OptionalNullable<LocalDateTime> date;

    /**
     * Default constructor.
     */
    public GetTransactionReportFileResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  date  LocalDateTime value for date.
     */
    public GetTransactionReportFileResponse(
            String name,
            LocalDateTime date) {
        this.name = OptionalNullable.of(name);
        this.date = OptionalNullable.of(date);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  date  LocalDateTime value for date.
     */

    protected GetTransactionReportFileResponse(OptionalNullable<String> name,
            OptionalNullable<LocalDateTime> date) {
        this.name = name;
        this.date = date;
    }

    /**
     * Internal Getter for Name.
     * @return Returns the Internal String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetName() {
        return this.name;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Internal Getter for Date.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDate() {
        return this.date;
    }

    /**
     * Getter for Date.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDate() {
        return OptionalNullable.getFrom(date);
    }

    /**
     * Setter for Date.
     * @param date Value for LocalDateTime
     */
    @JsonSetter("date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDate(LocalDateTime date) {
        this.date = OptionalNullable.of(date);
    }

    /**
     * UnSetter for Date.
     */
    public void unsetDate() {
        date = null;
    }

    /**
     * Converts this GetTransactionReportFileResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetTransactionReportFileResponse [" + "name=" + name + ", date=" + date + "]";
    }

    /**
     * Builds a new {@link GetTransactionReportFileResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetTransactionReportFileResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.name = internalGetName();
        builder.date = internalGetDate();
        return builder;
    }

    /**
     * Class to build instances of {@link GetTransactionReportFileResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> name;
        private OptionalNullable<LocalDateTime> date;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = OptionalNullable.of(name);
            return this;
        }

        /**
         * UnSetter for name.
         * @return Builder
         */
        public Builder unsetName() {
            name = null;
            return this;
        }

        /**
         * Setter for date.
         * @param  date  LocalDateTime value for date.
         * @return Builder
         */
        public Builder date(LocalDateTime date) {
            this.date = OptionalNullable.of(date);
            return this;
        }

        /**
         * UnSetter for date.
         * @return Builder
         */
        public Builder unsetDate() {
            date = null;
            return this;
        }

        /**
         * Builds a new {@link GetTransactionReportFileResponse} object using the set fields.
         * @return {@link GetTransactionReportFileResponse}
         */
        public GetTransactionReportFileResponse build() {
            return new GetTransactionReportFileResponse(name, date);
        }
    }
}
