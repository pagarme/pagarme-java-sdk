/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCashTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetCashTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetCashTransactionResponse
        extends GetTransactionResponse {
    private OptionalNullable<String> description;

    /**
     * Default constructor.
     */
    public GetCashTransactionResponse() {
        super();
        setTransactionType("cash");
    }

    /**
     * Initialization constructor.
     * @param  gatewayId  String value for gatewayId.
     * @param  amount  Integer value for amount.
     * @param  status  String value for status.
     * @param  success  Boolean value for success.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  attemptCount  Integer value for attemptCount.
     * @param  maxAttempts  Integer value for maxAttempts.
     * @param  splits  List of GetSplitResponse value for splits.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  id  String value for id.
     * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
     * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
     * @param  metadata  Map of String, value for metadata.
     * @param  split  List of GetSplitResponse value for split.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     * @param  description  String value for description.
     */
    public GetCashTransactionResponse(
            String gatewayId,
            Integer amount,
            String status,
            Boolean success,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Integer attemptCount,
            Integer maxAttempts,
            List<GetSplitResponse> splits,
            LocalDateTime nextAttempt,
            String transactionType,
            String id,
            GetGatewayResponseResponse gatewayResponse,
            GetAntifraudResponse antifraudResponse,
            Map<String, String> metadata,
            List<GetSplitResponse> split,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue,
            String description) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, nextAttempt, transactionType, id, gatewayResponse, antifraudResponse,
                metadata, split, interest, fine, maxDaysToPayPastDue);
        this.description = OptionalNullable.of(description);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetCashTransactionResponse(OptionalNullable<String> gatewayId,
            OptionalNullable<Integer> amount, OptionalNullable<String> status,
            OptionalNullable<Boolean> success, OptionalNullable<LocalDateTime> createdAt,
            OptionalNullable<LocalDateTime> updatedAt, OptionalNullable<Integer> attemptCount,
            OptionalNullable<Integer> maxAttempts, OptionalNullable<List<GetSplitResponse>> splits,
            OptionalNullable<LocalDateTime> nextAttempt, String transactionType,
            OptionalNullable<String> id,
            OptionalNullable<GetGatewayResponseResponse> gatewayResponse,
            OptionalNullable<GetAntifraudResponse> antifraudResponse,
            OptionalNullable<Map<String, String>> metadata,
            OptionalNullable<List<GetSplitResponse>> split,
            OptionalNullable<GetInterestResponse> interest, OptionalNullable<GetFineResponse> fine,
            OptionalNullable<Integer> maxDaysToPayPastDue, OptionalNullable<String> description) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, nextAttempt, transactionType, id, gatewayResponse, antifraudResponse,
                metadata, split, interest, fine, maxDaysToPayPastDue);
        this.description = description;
    }

    /**
     * Internal Getter for Description.
     * Description
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * Description
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Converts this GetCashTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCashTransactionResponse [" + "description=" + description + ", gatewayId="
                + getGatewayId() + ", amount=" + getAmount() + ", status=" + getStatus()
                + ", success=" + getSuccess() + ", createdAt=" + getCreatedAt() + ", updatedAt="
                + getUpdatedAt() + ", attemptCount=" + getAttemptCount() + ", maxAttempts="
                + getMaxAttempts() + ", splits=" + getSplits() + ", nextAttempt=" + getNextAttempt()
                + ", transactionType=" + getTransactionType() + ", id=" + getId()
                + ", gatewayResponse=" + getGatewayResponse() + ", antifraudResponse="
                + getAntifraudResponse() + ", metadata=" + getMetadata() + ", split=" + getSplit()
                + ", interest=" + getInterest() + ", fine=" + getFine() + ", maxDaysToPayPastDue="
                + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetCashTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCashTransactionResponse.Builder} object
     */
    public Builder toGetCashTransactionResponseBuilder() {
        Builder builder = new Builder()
                .transactionType(getTransactionType());
        builder.description = internalGetDescription();
        builder.gatewayId = internalGetGatewayId();
        builder.amount = internalGetAmount();
        builder.status = internalGetStatus();
        builder.success = internalGetSuccess();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.attemptCount = internalGetAttemptCount();
        builder.maxAttempts = internalGetMaxAttempts();
        builder.splits = internalGetSplits();
        builder.nextAttempt = internalGetNextAttempt();
        builder.id = internalGetId();
        builder.gatewayResponse = internalGetGatewayResponse();
        builder.antifraudResponse = internalGetAntifraudResponse();
        builder.metadata = internalGetMetadata();
        builder.split = internalGetSplit();
        builder.interest = internalGetInterest();
        builder.fine = internalGetFine();
        builder.maxDaysToPayPastDue = internalGetMaxDaysToPayPastDue();
        return builder;
    }

    /**
     * Class to build instances of {@link GetCashTransactionResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> gatewayId;
        private OptionalNullable<Integer> amount;
        private OptionalNullable<String> status;
        private OptionalNullable<Boolean> success;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<Integer> attemptCount;
        private OptionalNullable<Integer> maxAttempts;
        private OptionalNullable<List<GetSplitResponse>> splits;
        private OptionalNullable<LocalDateTime> nextAttempt;
        private String transactionType = "cash";
        private OptionalNullable<String> id;
        private OptionalNullable<GetGatewayResponseResponse> gatewayResponse;
        private OptionalNullable<GetAntifraudResponse> antifraudResponse;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<List<GetSplitResponse>> split;
        private OptionalNullable<GetInterestResponse> interest;
        private OptionalNullable<GetFineResponse> fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;
        private OptionalNullable<String> description;



        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = OptionalNullable.of(gatewayId);
            return this;
        }

        /**
         * UnSetter for gatewayId.
         * @return Builder
         */
        public Builder unsetGatewayId() {
            gatewayId = null;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = OptionalNullable.of(amount);
            return this;
        }

        /**
         * UnSetter for amount.
         * @return Builder
         */
        public Builder unsetAmount() {
            amount = null;
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
         * Setter for success.
         * @param  success  Boolean value for success.
         * @return Builder
         */
        public Builder success(Boolean success) {
            this.success = OptionalNullable.of(success);
            return this;
        }

        /**
         * UnSetter for success.
         * @return Builder
         */
        public Builder unsetSuccess() {
            success = null;
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
         * Setter for attemptCount.
         * @param  attemptCount  Integer value for attemptCount.
         * @return Builder
         */
        public Builder attemptCount(Integer attemptCount) {
            this.attemptCount = OptionalNullable.of(attemptCount);
            return this;
        }

        /**
         * UnSetter for attemptCount.
         * @return Builder
         */
        public Builder unsetAttemptCount() {
            attemptCount = null;
            return this;
        }

        /**
         * Setter for maxAttempts.
         * @param  maxAttempts  Integer value for maxAttempts.
         * @return Builder
         */
        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = OptionalNullable.of(maxAttempts);
            return this;
        }

        /**
         * UnSetter for maxAttempts.
         * @return Builder
         */
        public Builder unsetMaxAttempts() {
            maxAttempts = null;
            return this;
        }

        /**
         * Setter for splits.
         * @param  splits  List of GetSplitResponse value for splits.
         * @return Builder
         */
        public Builder splits(List<GetSplitResponse> splits) {
            this.splits = OptionalNullable.of(splits);
            return this;
        }

        /**
         * UnSetter for splits.
         * @return Builder
         */
        public Builder unsetSplits() {
            splits = null;
            return this;
        }

        /**
         * Setter for nextAttempt.
         * @param  nextAttempt  LocalDateTime value for nextAttempt.
         * @return Builder
         */
        public Builder nextAttempt(LocalDateTime nextAttempt) {
            this.nextAttempt = OptionalNullable.of(nextAttempt);
            return this;
        }

        /**
         * UnSetter for nextAttempt.
         * @return Builder
         */
        public Builder unsetNextAttempt() {
            nextAttempt = null;
            return this;
        }

        /**
         * Setter for transactionType.
         * @param  transactionType  String value for transactionType.
         * @return Builder
         */
        public Builder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

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
         * Setter for gatewayResponse.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @return Builder
         */
        public Builder gatewayResponse(GetGatewayResponseResponse gatewayResponse) {
            this.gatewayResponse = OptionalNullable.of(gatewayResponse);
            return this;
        }

        /**
         * UnSetter for gatewayResponse.
         * @return Builder
         */
        public Builder unsetGatewayResponse() {
            gatewayResponse = null;
            return this;
        }

        /**
         * Setter for antifraudResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @return Builder
         */
        public Builder antifraudResponse(GetAntifraudResponse antifraudResponse) {
            this.antifraudResponse = OptionalNullable.of(antifraudResponse);
            return this;
        }

        /**
         * UnSetter for antifraudResponse.
         * @return Builder
         */
        public Builder unsetAntifraudResponse() {
            antifraudResponse = null;
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
         * Setter for split.
         * @param  split  List of GetSplitResponse value for split.
         * @return Builder
         */
        public Builder split(List<GetSplitResponse> split) {
            this.split = OptionalNullable.of(split);
            return this;
        }

        /**
         * UnSetter for split.
         * @return Builder
         */
        public Builder unsetSplit() {
            split = null;
            return this;
        }

        /**
         * Setter for interest.
         * @param  interest  GetInterestResponse value for interest.
         * @return Builder
         */
        public Builder interest(GetInterestResponse interest) {
            this.interest = OptionalNullable.of(interest);
            return this;
        }

        /**
         * UnSetter for interest.
         * @return Builder
         */
        public Builder unsetInterest() {
            interest = null;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  GetFineResponse value for fine.
         * @return Builder
         */
        public Builder fine(GetFineResponse fine) {
            this.fine = OptionalNullable.of(fine);
            return this;
        }

        /**
         * UnSetter for fine.
         * @return Builder
         */
        public Builder unsetFine() {
            fine = null;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
            return this;
        }

        /**
         * UnSetter for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder unsetMaxDaysToPayPastDue() {
            maxDaysToPayPastDue = null;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Builds a new {@link GetCashTransactionResponse} object using the set fields.
         * @return {@link GetCashTransactionResponse}
         */
        public GetCashTransactionResponse build() {
            return new GetCashTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, nextAttempt, transactionType, id,
                    gatewayResponse, antifraudResponse, metadata, split, interest, fine,
                    maxDaysToPayPastDue, description);
        }
    }
}
