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
import java.util.List;

/**
 * This is a model class for ListCyclesResponse type.
 */
public class ListCyclesResponse {
    private OptionalNullable<List<GetPeriodResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListCyclesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetPeriodResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListCyclesResponse(
            List<GetPeriodResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Internal initialization constructor.
     */
    protected ListCyclesResponse(OptionalNullable<List<GetPeriodResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * The subscription cycles objects
     * @return Returns the Internal List of GetPeriodResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetPeriodResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * The subscription cycles objects
     * @return Returns the List of GetPeriodResponse
     */
    public List<GetPeriodResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * The subscription cycles objects
     * @param data Value for List of GetPeriodResponse
     */
    @JsonSetter("data")
    public void setData(List<GetPeriodResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * The subscription cycles objects
     */
    public void unsetData() {
        data = null;
    }

    /**
     * Internal Getter for Paging.
     * Paging object
     * @return Returns the Internal PagingResponse
     */
    @JsonGetter("paging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PagingResponse> internalGetPaging() {
        return this.paging;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    public PagingResponse getPaging() {
        return OptionalNullable.getFrom(paging);
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * UnSetter for Paging.
     * Paging object
     */
    public void unsetPaging() {
        paging = null;
    }

    /**
     * Converts this ListCyclesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCyclesResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListCyclesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCyclesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListCyclesResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetPeriodResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetPeriodResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetPeriodResponse> data) {
            this.data = OptionalNullable.of(data);
            return this;
        }

        /**
         * UnSetter for data.
         * @return Builder
         */
        public Builder unsetData() {
            data = null;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = OptionalNullable.of(paging);
            return this;
        }

        /**
         * UnSetter for paging.
         * @return Builder
         */
        public Builder unsetPaging() {
            paging = null;
            return this;
        }

        /**
         * Builds a new {@link ListCyclesResponse} object using the set fields.
         * @return {@link ListCyclesResponse}
         */
        public ListCyclesResponse build() {
            return new ListCyclesResponse(data, paging);
        }
    }
}
