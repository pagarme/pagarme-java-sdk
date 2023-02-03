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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetBankAccountResponse type.
 */
public class GetBankAccountResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> holderName;
    private OptionalNullable<String> holderType;
    private OptionalNullable<String> bank;
    private OptionalNullable<String> branchNumber;
    private OptionalNullable<String> branchCheckDigit;
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<String> accountCheckDigit;
    private OptionalNullable<String> type;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<LocalDateTime> deletedAt;
    private OptionalNullable<GetRecipientResponse> recipient;
    private OptionalNullable<Map<String, String>> metadata;
    private OptionalNullable<String> pixKey;

    /**
     * Default constructor.
     */
    public GetBankAccountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  holderName  String value for holderName.
     * @param  holderType  String value for holderType.
     * @param  bank  String value for bank.
     * @param  branchNumber  String value for branchNumber.
     * @param  branchCheckDigit  String value for branchCheckDigit.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountCheckDigit  String value for accountCheckDigit.
     * @param  type  String value for type.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     * @param  recipient  GetRecipientResponse value for recipient.
     * @param  metadata  Map of String, value for metadata.
     * @param  pixKey  String value for pixKey.
     */
    public GetBankAccountResponse(
            String id,
            String holderName,
            String holderType,
            String bank,
            String branchNumber,
            String branchCheckDigit,
            String accountNumber,
            String accountCheckDigit,
            String type,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            GetRecipientResponse recipient,
            Map<String, String> metadata,
            String pixKey) {
        this.id = OptionalNullable.of(id);
        this.holderName = OptionalNullable.of(holderName);
        this.holderType = OptionalNullable.of(holderType);
        this.bank = OptionalNullable.of(bank);
        this.branchNumber = OptionalNullable.of(branchNumber);
        this.branchCheckDigit = OptionalNullable.of(branchCheckDigit);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.accountCheckDigit = OptionalNullable.of(accountCheckDigit);
        this.type = OptionalNullable.of(type);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.deletedAt = OptionalNullable.of(deletedAt);
        this.recipient = OptionalNullable.of(recipient);
        this.metadata = OptionalNullable.of(metadata);
        this.pixKey = OptionalNullable.of(pixKey);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetBankAccountResponse(OptionalNullable<String> id,
            OptionalNullable<String> holderName, OptionalNullable<String> holderType,
            OptionalNullable<String> bank, OptionalNullable<String> branchNumber,
            OptionalNullable<String> branchCheckDigit, OptionalNullable<String> accountNumber,
            OptionalNullable<String> accountCheckDigit, OptionalNullable<String> type,
            OptionalNullable<String> status, OptionalNullable<LocalDateTime> createdAt,
            OptionalNullable<LocalDateTime> updatedAt, OptionalNullable<LocalDateTime> deletedAt,
            OptionalNullable<GetRecipientResponse> recipient,
            OptionalNullable<Map<String, String>> metadata, OptionalNullable<String> pixKey) {
        this.id = id;
        this.holderName = holderName;
        this.holderType = holderType;
        this.bank = bank;
        this.branchNumber = branchNumber;
        this.branchCheckDigit = branchCheckDigit;
        this.accountNumber = accountNumber;
        this.accountCheckDigit = accountCheckDigit;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.recipient = recipient;
        this.metadata = metadata;
        this.pixKey = pixKey;
    }

    /**
     * Internal Getter for Id.
     * Id
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
     * Id
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * Id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     * Id
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for HolderName.
     * Holder name
     * @return Returns the Internal String
     */
    @JsonGetter("holder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHolderName() {
        return this.holderName;
    }

    /**
     * Getter for HolderName.
     * Holder name
     * @return Returns the String
     */
    public String getHolderName() {
        return OptionalNullable.getFrom(holderName);
    }

    /**
     * Setter for HolderName.
     * Holder name
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = OptionalNullable.of(holderName);
    }

    /**
     * UnSetter for HolderName.
     * Holder name
     */
    public void unsetHolderName() {
        holderName = null;
    }

    /**
     * Internal Getter for HolderType.
     * Holder type
     * @return Returns the Internal String
     */
    @JsonGetter("holder_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHolderType() {
        return this.holderType;
    }

    /**
     * Getter for HolderType.
     * Holder type
     * @return Returns the String
     */
    public String getHolderType() {
        return OptionalNullable.getFrom(holderType);
    }

    /**
     * Setter for HolderType.
     * Holder type
     * @param holderType Value for String
     */
    @JsonSetter("holder_type")
    public void setHolderType(String holderType) {
        this.holderType = OptionalNullable.of(holderType);
    }

    /**
     * UnSetter for HolderType.
     * Holder type
     */
    public void unsetHolderType() {
        holderType = null;
    }

    /**
     * Internal Getter for Bank.
     * Bank
     * @return Returns the Internal String
     */
    @JsonGetter("bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBank() {
        return this.bank;
    }

    /**
     * Getter for Bank.
     * Bank
     * @return Returns the String
     */
    public String getBank() {
        return OptionalNullable.getFrom(bank);
    }

    /**
     * Setter for Bank.
     * Bank
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = OptionalNullable.of(bank);
    }

    /**
     * UnSetter for Bank.
     * Bank
     */
    public void unsetBank() {
        bank = null;
    }

    /**
     * Internal Getter for BranchNumber.
     * Branch number
     * @return Returns the Internal String
     */
    @JsonGetter("branch_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBranchNumber() {
        return this.branchNumber;
    }

    /**
     * Getter for BranchNumber.
     * Branch number
     * @return Returns the String
     */
    public String getBranchNumber() {
        return OptionalNullable.getFrom(branchNumber);
    }

    /**
     * Setter for BranchNumber.
     * Branch number
     * @param branchNumber Value for String
     */
    @JsonSetter("branch_number")
    public void setBranchNumber(String branchNumber) {
        this.branchNumber = OptionalNullable.of(branchNumber);
    }

    /**
     * UnSetter for BranchNumber.
     * Branch number
     */
    public void unsetBranchNumber() {
        branchNumber = null;
    }

    /**
     * Internal Getter for BranchCheckDigit.
     * Branch check digit
     * @return Returns the Internal String
     */
    @JsonGetter("branch_check_digit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBranchCheckDigit() {
        return this.branchCheckDigit;
    }

    /**
     * Getter for BranchCheckDigit.
     * Branch check digit
     * @return Returns the String
     */
    public String getBranchCheckDigit() {
        return OptionalNullable.getFrom(branchCheckDigit);
    }

    /**
     * Setter for BranchCheckDigit.
     * Branch check digit
     * @param branchCheckDigit Value for String
     */
    @JsonSetter("branch_check_digit")
    public void setBranchCheckDigit(String branchCheckDigit) {
        this.branchCheckDigit = OptionalNullable.of(branchCheckDigit);
    }

    /**
     * UnSetter for BranchCheckDigit.
     * Branch check digit
     */
    public void unsetBranchCheckDigit() {
        branchCheckDigit = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account number
     * @return Returns the Internal String
     */
    @JsonGetter("account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * Account number
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account number
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account number
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for AccountCheckDigit.
     * Account check digit
     * @return Returns the Internal String
     */
    @JsonGetter("account_check_digit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountCheckDigit() {
        return this.accountCheckDigit;
    }

    /**
     * Getter for AccountCheckDigit.
     * Account check digit
     * @return Returns the String
     */
    public String getAccountCheckDigit() {
        return OptionalNullable.getFrom(accountCheckDigit);
    }

    /**
     * Setter for AccountCheckDigit.
     * Account check digit
     * @param accountCheckDigit Value for String
     */
    @JsonSetter("account_check_digit")
    public void setAccountCheckDigit(String accountCheckDigit) {
        this.accountCheckDigit = OptionalNullable.of(accountCheckDigit);
    }

    /**
     * UnSetter for AccountCheckDigit.
     * Account check digit
     */
    public void unsetAccountCheckDigit() {
        accountCheckDigit = null;
    }

    /**
     * Internal Getter for Type.
     * Bank account type
     * @return Returns the Internal String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetType() {
        return this.type;
    }

    /**
     * Getter for Type.
     * Bank account type
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * Bank account type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     * Bank account type
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for Status.
     * Bank account status
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
     * Bank account status
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * Bank account status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     * Bank account status
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for CreatedAt.
     * Creation date
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
     * Creation date
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCreatedAt() {
        return OptionalNullable.getFrom(createdAt);
    }

    /**
     * Setter for CreatedAt.
     * Creation date
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = OptionalNullable.of(createdAt);
    }

    /**
     * UnSetter for CreatedAt.
     * Creation date
     */
    public void unsetCreatedAt() {
        createdAt = null;
    }

    /**
     * Internal Getter for UpdatedAt.
     * Last update date
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
     * Last update date
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getUpdatedAt() {
        return OptionalNullable.getFrom(updatedAt);
    }

    /**
     * Setter for UpdatedAt.
     * Last update date
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * UnSetter for UpdatedAt.
     * Last update date
     */
    public void unsetUpdatedAt() {
        updatedAt = null;
    }

    /**
     * Internal Getter for DeletedAt.
     * Deletion date
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
     * Deletion date
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDeletedAt() {
        return OptionalNullable.getFrom(deletedAt);
    }

    /**
     * Setter for DeletedAt.
     * Deletion date
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * UnSetter for DeletedAt.
     * Deletion date
     */
    public void unsetDeletedAt() {
        deletedAt = null;
    }

    /**
     * Internal Getter for Recipient.
     * Recipient
     * @return Returns the Internal GetRecipientResponse
     */
    @JsonGetter("recipient")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetRecipientResponse> internalGetRecipient() {
        return this.recipient;
    }

    /**
     * Getter for Recipient.
     * Recipient
     * @return Returns the GetRecipientResponse
     */
    public GetRecipientResponse getRecipient() {
        return OptionalNullable.getFrom(recipient);
    }

    /**
     * Setter for Recipient.
     * Recipient
     * @param recipient Value for GetRecipientResponse
     */
    @JsonSetter("recipient")
    public void setRecipient(GetRecipientResponse recipient) {
        this.recipient = OptionalNullable.of(recipient);
    }

    /**
     * UnSetter for Recipient.
     * Recipient
     */
    public void unsetRecipient() {
        recipient = null;
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
     * Internal Getter for PixKey.
     * Pix Key
     * @return Returns the Internal String
     */
    @JsonGetter("pix_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPixKey() {
        return this.pixKey;
    }

    /**
     * Getter for PixKey.
     * Pix Key
     * @return Returns the String
     */
    public String getPixKey() {
        return OptionalNullable.getFrom(pixKey);
    }

    /**
     * Setter for PixKey.
     * Pix Key
     * @param pixKey Value for String
     */
    @JsonSetter("pix_key")
    public void setPixKey(String pixKey) {
        this.pixKey = OptionalNullable.of(pixKey);
    }

    /**
     * UnSetter for PixKey.
     * Pix Key
     */
    public void unsetPixKey() {
        pixKey = null;
    }

    /**
     * Converts this GetBankAccountResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetBankAccountResponse [" + "id=" + id + ", holderName=" + holderName
                + ", holderType=" + holderType + ", bank=" + bank + ", branchNumber=" + branchNumber
                + ", branchCheckDigit=" + branchCheckDigit + ", accountNumber=" + accountNumber
                + ", accountCheckDigit=" + accountCheckDigit + ", type=" + type + ", status="
                + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt="
                + deletedAt + ", recipient=" + recipient + ", metadata=" + metadata + ", pixKey="
                + pixKey + "]";
    }

    /**
     * Builds a new {@link GetBankAccountResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetBankAccountResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.holderName = internalGetHolderName();
        builder.holderType = internalGetHolderType();
        builder.bank = internalGetBank();
        builder.branchNumber = internalGetBranchNumber();
        builder.branchCheckDigit = internalGetBranchCheckDigit();
        builder.accountNumber = internalGetAccountNumber();
        builder.accountCheckDigit = internalGetAccountCheckDigit();
        builder.type = internalGetType();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.deletedAt = internalGetDeletedAt();
        builder.recipient = internalGetRecipient();
        builder.metadata = internalGetMetadata();
        builder.pixKey = internalGetPixKey();
        return builder;
    }

    /**
     * Class to build instances of {@link GetBankAccountResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> holderName;
        private OptionalNullable<String> holderType;
        private OptionalNullable<String> bank;
        private OptionalNullable<String> branchNumber;
        private OptionalNullable<String> branchCheckDigit;
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<String> accountCheckDigit;
        private OptionalNullable<String> type;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<LocalDateTime> deletedAt;
        private OptionalNullable<GetRecipientResponse> recipient;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<String> pixKey;



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
         * Setter for holderName.
         * @param  holderName  String value for holderName.
         * @return Builder
         */
        public Builder holderName(String holderName) {
            this.holderName = OptionalNullable.of(holderName);
            return this;
        }

        /**
         * UnSetter for holderName.
         * @return Builder
         */
        public Builder unsetHolderName() {
            holderName = null;
            return this;
        }

        /**
         * Setter for holderType.
         * @param  holderType  String value for holderType.
         * @return Builder
         */
        public Builder holderType(String holderType) {
            this.holderType = OptionalNullable.of(holderType);
            return this;
        }

        /**
         * UnSetter for holderType.
         * @return Builder
         */
        public Builder unsetHolderType() {
            holderType = null;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
            this.bank = OptionalNullable.of(bank);
            return this;
        }

        /**
         * UnSetter for bank.
         * @return Builder
         */
        public Builder unsetBank() {
            bank = null;
            return this;
        }

        /**
         * Setter for branchNumber.
         * @param  branchNumber  String value for branchNumber.
         * @return Builder
         */
        public Builder branchNumber(String branchNumber) {
            this.branchNumber = OptionalNullable.of(branchNumber);
            return this;
        }

        /**
         * UnSetter for branchNumber.
         * @return Builder
         */
        public Builder unsetBranchNumber() {
            branchNumber = null;
            return this;
        }

        /**
         * Setter for branchCheckDigit.
         * @param  branchCheckDigit  String value for branchCheckDigit.
         * @return Builder
         */
        public Builder branchCheckDigit(String branchCheckDigit) {
            this.branchCheckDigit = OptionalNullable.of(branchCheckDigit);
            return this;
        }

        /**
         * UnSetter for branchCheckDigit.
         * @return Builder
         */
        public Builder unsetBranchCheckDigit() {
            branchCheckDigit = null;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for accountCheckDigit.
         * @param  accountCheckDigit  String value for accountCheckDigit.
         * @return Builder
         */
        public Builder accountCheckDigit(String accountCheckDigit) {
            this.accountCheckDigit = OptionalNullable.of(accountCheckDigit);
            return this;
        }

        /**
         * UnSetter for accountCheckDigit.
         * @return Builder
         */
        public Builder unsetAccountCheckDigit() {
            accountCheckDigit = null;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = OptionalNullable.of(type);
            return this;
        }

        /**
         * UnSetter for type.
         * @return Builder
         */
        public Builder unsetType() {
            type = null;
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
         * Setter for recipient.
         * @param  recipient  GetRecipientResponse value for recipient.
         * @return Builder
         */
        public Builder recipient(GetRecipientResponse recipient) {
            this.recipient = OptionalNullable.of(recipient);
            return this;
        }

        /**
         * UnSetter for recipient.
         * @return Builder
         */
        public Builder unsetRecipient() {
            recipient = null;
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
         * Setter for pixKey.
         * @param  pixKey  String value for pixKey.
         * @return Builder
         */
        public Builder pixKey(String pixKey) {
            this.pixKey = OptionalNullable.of(pixKey);
            return this;
        }

        /**
         * UnSetter for pixKey.
         * @return Builder
         */
        public Builder unsetPixKey() {
            pixKey = null;
            return this;
        }

        /**
         * Builds a new {@link GetBankAccountResponse} object using the set fields.
         * @return {@link GetBankAccountResponse}
         */
        public GetBankAccountResponse build() {
            return new GetBankAccountResponse(id, holderName, holderType, bank, branchNumber,
                    branchCheckDigit, accountNumber, accountCheckDigit, type, status, createdAt,
                    updatedAt, deletedAt, recipient, metadata, pixKey);
        }
    }
}
