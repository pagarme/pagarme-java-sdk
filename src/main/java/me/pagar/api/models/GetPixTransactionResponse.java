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
 * This is a model class for GetPixTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetPixTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetPixTransactionResponse
        extends GetTransactionResponse {
    private OptionalNullable<String> qrCode;
    private OptionalNullable<String> qrCodeUrl;
    private OptionalNullable<LocalDateTime> expiresAt;
    private OptionalNullable<List<PixAdditionalInformation>> additionalInformation;
    private OptionalNullable<String> endToEndId;
    private OptionalNullable<GetPixPayerResponse> payer;
    private OptionalNullable<String> pixProviderTid;

    /**
     * Default constructor.
     */
    public GetPixTransactionResponse() {
        super();
        setTransactionType("pix");
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
     * @param  qrCode  String value for qrCode.
     * @param  qrCodeUrl  String value for qrCodeUrl.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  additionalInformation  List of PixAdditionalInformation value for
     *         additionalInformation.
     * @param  endToEndId  String value for endToEndId.
     * @param  payer  GetPixPayerResponse value for payer.
     * @param  pixProviderTid  String value for pixProviderTid.
     */
    public GetPixTransactionResponse(
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
            String qrCode,
            String qrCodeUrl,
            LocalDateTime expiresAt,
            List<PixAdditionalInformation> additionalInformation,
            String endToEndId,
            GetPixPayerResponse payer,
            String pixProviderTid) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, nextAttempt, transactionType, id, gatewayResponse, antifraudResponse,
                metadata, split, interest, fine, maxDaysToPayPastDue);
        this.qrCode = OptionalNullable.of(qrCode);
        this.qrCodeUrl = OptionalNullable.of(qrCodeUrl);
        this.expiresAt = OptionalNullable.of(expiresAt);
        this.additionalInformation = OptionalNullable.of(additionalInformation);
        this.endToEndId = OptionalNullable.of(endToEndId);
        this.payer = OptionalNullable.of(payer);
        this.pixProviderTid = OptionalNullable.of(pixProviderTid);
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
     * @param  qrCode  String value for qrCode.
     * @param  qrCodeUrl  String value for qrCodeUrl.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  additionalInformation  List of PixAdditionalInformation value for
     *         additionalInformation.
     * @param  endToEndId  String value for endToEndId.
     * @param  payer  GetPixPayerResponse value for payer.
     * @param  pixProviderTid  String value for pixProviderTid.
     */

    protected GetPixTransactionResponse(OptionalNullable<String> gatewayId,
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
            OptionalNullable<Integer> maxDaysToPayPastDue, OptionalNullable<String> qrCode,
            OptionalNullable<String> qrCodeUrl, OptionalNullable<LocalDateTime> expiresAt,
            OptionalNullable<List<PixAdditionalInformation>> additionalInformation,
            OptionalNullable<String> endToEndId, OptionalNullable<GetPixPayerResponse> payer,
            OptionalNullable<String> pixProviderTid) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, nextAttempt, transactionType, id, gatewayResponse, antifraudResponse,
                metadata, split, interest, fine, maxDaysToPayPastDue);
        this.qrCode = qrCode;
        this.qrCodeUrl = qrCodeUrl;
        this.expiresAt = expiresAt;
        this.additionalInformation = additionalInformation;
        this.endToEndId = endToEndId;
        this.payer = payer;
        this.pixProviderTid = pixProviderTid;
    }

    /**
     * Internal Getter for QrCode.
     * @return Returns the Internal String
     */
    @JsonGetter("qr_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetQrCode() {
        return this.qrCode;
    }

    /**
     * Getter for QrCode.
     * @return Returns the String
     */
    public String getQrCode() {
        return OptionalNullable.getFrom(qrCode);
    }

    /**
     * Setter for QrCode.
     * @param qrCode Value for String
     */
    @JsonSetter("qr_code")
    public void setQrCode(String qrCode) {
        this.qrCode = OptionalNullable.of(qrCode);
    }

    /**
     * UnSetter for QrCode.
     */
    public void unsetQrCode() {
        qrCode = null;
    }

    /**
     * Internal Getter for QrCodeUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("qr_code_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetQrCodeUrl() {
        return this.qrCodeUrl;
    }

    /**
     * Getter for QrCodeUrl.
     * @return Returns the String
     */
    public String getQrCodeUrl() {
        return OptionalNullable.getFrom(qrCodeUrl);
    }

    /**
     * Setter for QrCodeUrl.
     * @param qrCodeUrl Value for String
     */
    @JsonSetter("qr_code_url")
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = OptionalNullable.of(qrCodeUrl);
    }

    /**
     * UnSetter for QrCodeUrl.
     */
    public void unsetQrCodeUrl() {
        qrCodeUrl = null;
    }

    /**
     * Internal Getter for ExpiresAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * UnSetter for ExpiresAt.
     */
    public void unsetExpiresAt() {
        expiresAt = null;
    }

    /**
     * Internal Getter for AdditionalInformation.
     * @return Returns the Internal List of PixAdditionalInformation
     */
    @JsonGetter("additional_information")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<PixAdditionalInformation>> internalGetAdditionalInformation() {
        return this.additionalInformation;
    }

    /**
     * Getter for AdditionalInformation.
     * @return Returns the List of PixAdditionalInformation
     */
    public List<PixAdditionalInformation> getAdditionalInformation() {
        return OptionalNullable.getFrom(additionalInformation);
    }

    /**
     * Setter for AdditionalInformation.
     * @param additionalInformation Value for List of PixAdditionalInformation
     */
    @JsonSetter("additional_information")
    public void setAdditionalInformation(List<PixAdditionalInformation> additionalInformation) {
        this.additionalInformation = OptionalNullable.of(additionalInformation);
    }

    /**
     * UnSetter for AdditionalInformation.
     */
    public void unsetAdditionalInformation() {
        additionalInformation = null;
    }

    /**
     * Internal Getter for EndToEndId.
     * @return Returns the Internal String
     */
    @JsonGetter("end_to_end_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEndToEndId() {
        return this.endToEndId;
    }

    /**
     * Getter for EndToEndId.
     * @return Returns the String
     */
    public String getEndToEndId() {
        return OptionalNullable.getFrom(endToEndId);
    }

    /**
     * Setter for EndToEndId.
     * @param endToEndId Value for String
     */
    @JsonSetter("end_to_end_id")
    public void setEndToEndId(String endToEndId) {
        this.endToEndId = OptionalNullable.of(endToEndId);
    }

    /**
     * UnSetter for EndToEndId.
     */
    public void unsetEndToEndId() {
        endToEndId = null;
    }

    /**
     * Internal Getter for Payer.
     * @return Returns the Internal GetPixPayerResponse
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetPixPayerResponse> internalGetPayer() {
        return this.payer;
    }

    /**
     * Getter for Payer.
     * @return Returns the GetPixPayerResponse
     */
    public GetPixPayerResponse getPayer() {
        return OptionalNullable.getFrom(payer);
    }

    /**
     * Setter for Payer.
     * @param payer Value for GetPixPayerResponse
     */
    @JsonSetter("payer")
    public void setPayer(GetPixPayerResponse payer) {
        this.payer = OptionalNullable.of(payer);
    }

    /**
     * UnSetter for Payer.
     */
    public void unsetPayer() {
        payer = null;
    }

    /**
     * Internal Getter for PixProviderTid.
     * Pix provider TID
     * @return Returns the Internal String
     */
    @JsonGetter("pix_provider_tid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPixProviderTid() {
        return this.pixProviderTid;
    }

    /**
     * Getter for PixProviderTid.
     * Pix provider TID
     * @return Returns the String
     */
    public String getPixProviderTid() {
        return OptionalNullable.getFrom(pixProviderTid);
    }

    /**
     * Setter for PixProviderTid.
     * Pix provider TID
     * @param pixProviderTid Value for String
     */
    @JsonSetter("pix_provider_tid")
    public void setPixProviderTid(String pixProviderTid) {
        this.pixProviderTid = OptionalNullable.of(pixProviderTid);
    }

    /**
     * UnSetter for PixProviderTid.
     * Pix provider TID
     */
    public void unsetPixProviderTid() {
        pixProviderTid = null;
    }

    /**
     * Converts this GetPixTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPixTransactionResponse [" + "qrCode=" + qrCode + ", qrCodeUrl=" + qrCodeUrl
                + ", expiresAt=" + expiresAt + ", additionalInformation=" + additionalInformation
                + ", endToEndId=" + endToEndId + ", payer=" + payer + ", pixProviderTid="
                + pixProviderTid + ", gatewayId=" + getGatewayId() + ", amount=" + getAmount()
                + ", status=" + getStatus() + ", success=" + getSuccess() + ", createdAt="
                + getCreatedAt() + ", updatedAt=" + getUpdatedAt() + ", attemptCount="
                + getAttemptCount() + ", maxAttempts=" + getMaxAttempts() + ", splits="
                + getSplits() + ", nextAttempt=" + getNextAttempt() + ", transactionType="
                + getTransactionType() + ", id=" + getId() + ", gatewayResponse="
                + getGatewayResponse() + ", antifraudResponse=" + getAntifraudResponse()
                + ", metadata=" + getMetadata() + ", split=" + getSplit() + ", interest="
                + getInterest() + ", fine=" + getFine() + ", maxDaysToPayPastDue="
                + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetPixTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPixTransactionResponse.Builder} object
     */
    public Builder toGetPixTransactionResponseBuilder() {
        Builder builder = new Builder()
                .transactionType(getTransactionType());
        builder.qrCode = internalGetQrCode();
        builder.qrCodeUrl = internalGetQrCodeUrl();
        builder.expiresAt = internalGetExpiresAt();
        builder.additionalInformation = internalGetAdditionalInformation();
        builder.endToEndId = internalGetEndToEndId();
        builder.payer = internalGetPayer();
        builder.pixProviderTid = internalGetPixProviderTid();
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
     * Class to build instances of {@link GetPixTransactionResponse}.
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
        private String transactionType = "pix";
        private OptionalNullable<String> id;
        private OptionalNullable<GetGatewayResponseResponse> gatewayResponse;
        private OptionalNullable<GetAntifraudResponse> antifraudResponse;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<List<GetSplitResponse>> split;
        private OptionalNullable<GetInterestResponse> interest;
        private OptionalNullable<GetFineResponse> fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;
        private OptionalNullable<String> qrCode;
        private OptionalNullable<String> qrCodeUrl;
        private OptionalNullable<LocalDateTime> expiresAt;
        private OptionalNullable<List<PixAdditionalInformation>> additionalInformation;
        private OptionalNullable<String> endToEndId;
        private OptionalNullable<GetPixPayerResponse> payer;
        private OptionalNullable<String> pixProviderTid;



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
         * Setter for qrCode.
         * @param  qrCode  String value for qrCode.
         * @return Builder
         */
        public Builder qrCode(String qrCode) {
            this.qrCode = OptionalNullable.of(qrCode);
            return this;
        }

        /**
         * UnSetter for qrCode.
         * @return Builder
         */
        public Builder unsetQrCode() {
            qrCode = null;
            return this;
        }

        /**
         * Setter for qrCodeUrl.
         * @param  qrCodeUrl  String value for qrCodeUrl.
         * @return Builder
         */
        public Builder qrCodeUrl(String qrCodeUrl) {
            this.qrCodeUrl = OptionalNullable.of(qrCodeUrl);
            return this;
        }

        /**
         * UnSetter for qrCodeUrl.
         * @return Builder
         */
        public Builder unsetQrCodeUrl() {
            qrCodeUrl = null;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = OptionalNullable.of(expiresAt);
            return this;
        }

        /**
         * UnSetter for expiresAt.
         * @return Builder
         */
        public Builder unsetExpiresAt() {
            expiresAt = null;
            return this;
        }

        /**
         * Setter for additionalInformation.
         * @param  additionalInformation  List of PixAdditionalInformation value for
         *         additionalInformation.
         * @return Builder
         */
        public Builder additionalInformation(
                List<PixAdditionalInformation> additionalInformation) {
            this.additionalInformation = OptionalNullable.of(additionalInformation);
            return this;
        }

        /**
         * UnSetter for additionalInformation.
         * @return Builder
         */
        public Builder unsetAdditionalInformation() {
            additionalInformation = null;
            return this;
        }

        /**
         * Setter for endToEndId.
         * @param  endToEndId  String value for endToEndId.
         * @return Builder
         */
        public Builder endToEndId(String endToEndId) {
            this.endToEndId = OptionalNullable.of(endToEndId);
            return this;
        }

        /**
         * UnSetter for endToEndId.
         * @return Builder
         */
        public Builder unsetEndToEndId() {
            endToEndId = null;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  GetPixPayerResponse value for payer.
         * @return Builder
         */
        public Builder payer(GetPixPayerResponse payer) {
            this.payer = OptionalNullable.of(payer);
            return this;
        }

        /**
         * UnSetter for payer.
         * @return Builder
         */
        public Builder unsetPayer() {
            payer = null;
            return this;
        }

        /**
         * Setter for pixProviderTid.
         * @param  pixProviderTid  String value for pixProviderTid.
         * @return Builder
         */
        public Builder pixProviderTid(String pixProviderTid) {
            this.pixProviderTid = OptionalNullable.of(pixProviderTid);
            return this;
        }

        /**
         * UnSetter for pixProviderTid.
         * @return Builder
         */
        public Builder unsetPixProviderTid() {
            pixProviderTid = null;
            return this;
        }

        /**
         * Builds a new {@link GetPixTransactionResponse} object using the set fields.
         * @return {@link GetPixTransactionResponse}
         */
        public GetPixTransactionResponse build() {
            return new GetPixTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, nextAttempt, transactionType, id,
                    gatewayResponse, antifraudResponse, metadata, split, interest, fine,
                    maxDaysToPayPastDue, qrCode, qrCodeUrl, expiresAt, additionalInformation,
                    endToEndId, payer, pixProviderTid);
        }
    }
}
