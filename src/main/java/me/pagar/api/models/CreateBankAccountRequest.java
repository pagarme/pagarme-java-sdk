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
 * This is a model class for CreateBankAccountRequest type.
 */
public class CreateBankAccountRequest {
    private String holderName;
    private String holderType;
    private String holderDocument;
    private String bank;
    private String branchNumber;
    private OptionalNullable<String> branchCheckDigit;
    private String accountNumber;
    private String accountCheckDigit;
    private String type;
    private Map<String, String> metadata;
    private OptionalNullable<String> pixKey;

    /**
     * Default constructor.
     */
    public CreateBankAccountRequest() {
    }

    /**
     * Initialization constructor.
     * @param  holderName  String value for holderName.
     * @param  holderType  String value for holderType.
     * @param  holderDocument  String value for holderDocument.
     * @param  bank  String value for bank.
     * @param  branchNumber  String value for branchNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountCheckDigit  String value for accountCheckDigit.
     * @param  type  String value for type.
     * @param  metadata  Map of String, value for metadata.
     * @param  branchCheckDigit  String value for branchCheckDigit.
     * @param  pixKey  String value for pixKey.
     */
    public CreateBankAccountRequest(
            String holderName,
            String holderType,
            String holderDocument,
            String bank,
            String branchNumber,
            String accountNumber,
            String accountCheckDigit,
            String type,
            Map<String, String> metadata,
            String branchCheckDigit,
            String pixKey) {
        this.holderName = holderName;
        this.holderType = holderType;
        this.holderDocument = holderDocument;
        this.bank = bank;
        this.branchNumber = branchNumber;
        this.branchCheckDigit = OptionalNullable.of(branchCheckDigit);
        this.accountNumber = accountNumber;
        this.accountCheckDigit = accountCheckDigit;
        this.type = type;
        this.metadata = metadata;
        this.pixKey = OptionalNullable.of(pixKey);
    }

    /**
     * Initialization constructor.
     * @param  holderName  String value for holderName.
     * @param  holderType  String value for holderType.
     * @param  holderDocument  String value for holderDocument.
     * @param  bank  String value for bank.
     * @param  branchNumber  String value for branchNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountCheckDigit  String value for accountCheckDigit.
     * @param  type  String value for type.
     * @param  metadata  Map of String, value for metadata.
     * @param  branchCheckDigit  String value for branchCheckDigit.
     * @param  pixKey  String value for pixKey.
     */

    protected CreateBankAccountRequest(String holderName, String holderType, String holderDocument,
            String bank, String branchNumber, String accountNumber, String accountCheckDigit,
            String type, Map<String, String> metadata, OptionalNullable<String> branchCheckDigit,
            OptionalNullable<String> pixKey) {
        this.holderName = holderName;
        this.holderType = holderType;
        this.holderDocument = holderDocument;
        this.bank = bank;
        this.branchNumber = branchNumber;
        this.branchCheckDigit = branchCheckDigit;
        this.accountNumber = accountNumber;
        this.accountCheckDigit = accountCheckDigit;
        this.type = type;
        this.metadata = metadata;
        this.pixKey = pixKey;
    }

    /**
     * Getter for HolderName.
     * Bank account holder name
     * @return Returns the String
     */
    @JsonGetter("holder_name")
    public String getHolderName() {
        return holderName;
    }

    /**
     * Setter for HolderName.
     * Bank account holder name
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * Getter for HolderType.
     * Bank account holder type
     * @return Returns the String
     */
    @JsonGetter("holder_type")
    public String getHolderType() {
        return holderType;
    }

    /**
     * Setter for HolderType.
     * Bank account holder type
     * @param holderType Value for String
     */
    @JsonSetter("holder_type")
    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    /**
     * Getter for HolderDocument.
     * Bank account holder document
     * @return Returns the String
     */
    @JsonGetter("holder_document")
    public String getHolderDocument() {
        return holderDocument;
    }

    /**
     * Setter for HolderDocument.
     * Bank account holder document
     * @param holderDocument Value for String
     */
    @JsonSetter("holder_document")
    public void setHolderDocument(String holderDocument) {
        this.holderDocument = holderDocument;
    }

    /**
     * Getter for Bank.
     * Bank
     * @return Returns the String
     */
    @JsonGetter("bank")
    public String getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * Bank
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Getter for BranchNumber.
     * Branch number
     * @return Returns the String
     */
    @JsonGetter("branch_number")
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * Setter for BranchNumber.
     * Branch number
     * @param branchNumber Value for String
     */
    @JsonSetter("branch_number")
    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
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
     * Getter for AccountNumber.
     * Account number
     * @return Returns the String
     */
    @JsonGetter("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * Account number
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for AccountCheckDigit.
     * Account check digit
     * @return Returns the String
     */
    @JsonGetter("account_check_digit")
    public String getAccountCheckDigit() {
        return accountCheckDigit;
    }

    /**
     * Setter for AccountCheckDigit.
     * Account check digit
     * @param accountCheckDigit Value for String
     */
    @JsonSetter("account_check_digit")
    public void setAccountCheckDigit(String accountCheckDigit) {
        this.accountCheckDigit = accountCheckDigit;
    }

    /**
     * Getter for Type.
     * Bank account type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Bank account type
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
     * Internal Getter for PixKey.
     * Pix key
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
     * Pix key
     * @return Returns the String
     */
    public String getPixKey() {
        return OptionalNullable.getFrom(pixKey);
    }

    /**
     * Setter for PixKey.
     * Pix key
     * @param pixKey Value for String
     */
    @JsonSetter("pix_key")
    public void setPixKey(String pixKey) {
        this.pixKey = OptionalNullable.of(pixKey);
    }

    /**
     * UnSetter for PixKey.
     * Pix key
     */
    public void unsetPixKey() {
        pixKey = null;
    }

    /**
     * Converts this CreateBankAccountRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBankAccountRequest [" + "holderName=" + holderName + ", holderType="
                + holderType + ", holderDocument=" + holderDocument + ", bank=" + bank
                + ", branchNumber=" + branchNumber + ", accountNumber=" + accountNumber
                + ", accountCheckDigit=" + accountCheckDigit + ", type=" + type + ", metadata="
                + metadata + ", branchCheckDigit=" + branchCheckDigit + ", pixKey=" + pixKey + "]";
    }

    /**
     * Builds a new {@link CreateBankAccountRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBankAccountRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(holderName, holderType, holderDocument, bank, branchNumber,
                accountNumber, accountCheckDigit, type, metadata);
        builder.branchCheckDigit = internalGetBranchCheckDigit();
        builder.pixKey = internalGetPixKey();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBankAccountRequest}.
     */
    public static class Builder {
        private String holderName;
        private String holderType;
        private String holderDocument;
        private String bank;
        private String branchNumber;
        private String accountNumber;
        private String accountCheckDigit;
        private String type;
        private Map<String, String> metadata;
        private OptionalNullable<String> branchCheckDigit;
        private OptionalNullable<String> pixKey;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  holderName  String value for holderName.
         * @param  holderType  String value for holderType.
         * @param  holderDocument  String value for holderDocument.
         * @param  bank  String value for bank.
         * @param  branchNumber  String value for branchNumber.
         * @param  accountNumber  String value for accountNumber.
         * @param  accountCheckDigit  String value for accountCheckDigit.
         * @param  type  String value for type.
         * @param  metadata  Map of String, value for metadata.
         */
        public Builder(String holderName, String holderType, String holderDocument, String bank,
                String branchNumber, String accountNumber, String accountCheckDigit, String type,
                Map<String, String> metadata) {
            this.holderName = holderName;
            this.holderType = holderType;
            this.holderDocument = holderDocument;
            this.bank = bank;
            this.branchNumber = branchNumber;
            this.accountNumber = accountNumber;
            this.accountCheckDigit = accountCheckDigit;
            this.type = type;
            this.metadata = metadata;
        }

        /**
         * Setter for holderName.
         * @param  holderName  String value for holderName.
         * @return Builder
         */
        public Builder holderName(String holderName) {
            this.holderName = holderName;
            return this;
        }

        /**
         * Setter for holderType.
         * @param  holderType  String value for holderType.
         * @return Builder
         */
        public Builder holderType(String holderType) {
            this.holderType = holderType;
            return this;
        }

        /**
         * Setter for holderDocument.
         * @param  holderDocument  String value for holderDocument.
         * @return Builder
         */
        public Builder holderDocument(String holderDocument) {
            this.holderDocument = holderDocument;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for branchNumber.
         * @param  branchNumber  String value for branchNumber.
         * @return Builder
         */
        public Builder branchNumber(String branchNumber) {
            this.branchNumber = branchNumber;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for accountCheckDigit.
         * @param  accountCheckDigit  String value for accountCheckDigit.
         * @return Builder
         */
        public Builder accountCheckDigit(String accountCheckDigit) {
            this.accountCheckDigit = accountCheckDigit;
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
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
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
         * Builds a new {@link CreateBankAccountRequest} object using the set fields.
         * @return {@link CreateBankAccountRequest}
         */
        public CreateBankAccountRequest build() {
            return new CreateBankAccountRequest(holderName, holderType, holderDocument, bank,
                    branchNumber, accountNumber, accountCheckDigit, type, metadata,
                    branchCheckDigit, pixKey);
        }
    }
}
