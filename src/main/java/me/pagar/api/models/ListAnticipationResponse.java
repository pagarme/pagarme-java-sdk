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
 * This is a model class for ListAnticipationResponse type.
 */
public class ListAnticipationResponse {
    private OptionalNullable<List<GetAnticipationResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListAnticipationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetAnticipationResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListAnticipationResponse(
            List<GetAnticipationResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetAnticipationResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */

    protected ListAnticipationResponse(OptionalNullable<List<GetAnticipationResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * Anticipations
     * @return Returns the Internal List of GetAnticipationResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetAnticipationResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * Anticipations
     * @return Returns the List of GetAnticipationResponse
     */
    public List<GetAnticipationResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * Anticipations
     * @param data Value for List of GetAnticipationResponse
     */
    @JsonSetter("data")
    public void setData(List<GetAnticipationResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * Anticipations
     */
    public void unsetData() {
        data = null;
    }

    /**
     * Internal Getter for Paging.
     * Paging
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
     * Paging
     * @return Returns the PagingResponse
     */
    public PagingResponse getPaging() {
        return OptionalNullable.getFrom(paging);
    }

    /**
     * Setter for Paging.
     * Paging
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * UnSetter for Paging.
     * Paging
     */
    public void unsetPaging() {
        paging = null;
    }

    /**
     * Converts this ListAnticipationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListAnticipationResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListAnticipationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListAnticipationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListAnticipationResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetAnticipationResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetAnticipationResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetAnticipationResponse> data) {
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
         * Builds a new {@link ListAnticipationResponse} object using the set fields.
         * @return {@link ListAnticipationResponse}
         */
        public ListAnticipationResponse build() {
            return new ListAnticipationResponse(data, paging);
        }
    }
}
