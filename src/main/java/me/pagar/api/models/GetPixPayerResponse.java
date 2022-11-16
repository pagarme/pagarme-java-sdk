/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for GetPixPayerResponse type.
 */
public class GetPixPayerResponse {
    private String name;
    private String document;
    private String documentType;
    private GetPixBankAccountResponse bankAccount;

    /**
     * Default constructor.
     */
    public GetPixPayerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  document  String value for document.
     * @param  documentType  String value for documentType.
     * @param  bankAccount  GetPixBankAccountResponse value for bankAccount.
     */
    public GetPixPayerResponse(
            String name,
            String document,
            String documentType,
            GetPixBankAccountResponse bankAccount) {
        this.name = name;
        this.document = document;
        this.documentType = documentType;
        this.bankAccount = bankAccount;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Document.
     * @return Returns the String
     */
    @JsonGetter("document")
    public String getDocument() {
        return document;
    }

    /**
     * Setter for Document.
     * @param document Value for String
     */
    @JsonSetter("document")
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Getter for DocumentType.
     * @return Returns the String
     */
    @JsonGetter("document_type")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Setter for DocumentType.
     * @param documentType Value for String
     */
    @JsonSetter("document_type")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * Getter for BankAccount.
     * @return Returns the GetPixBankAccountResponse
     */
    @JsonGetter("bank_account")
    public GetPixBankAccountResponse getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * @param bankAccount Value for GetPixBankAccountResponse
     */
    @JsonSetter("bank_account")
    public void setBankAccount(GetPixBankAccountResponse bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Converts this GetPixPayerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPixPayerResponse [" + "name=" + name + ", document=" + document
                + ", documentType=" + documentType + ", bankAccount=" + bankAccount + "]";
    }

    /**
     * Builds a new {@link GetPixPayerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPixPayerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, document, documentType, bankAccount);
        return builder;
    }

    /**
     * Class to build instances of {@link GetPixPayerResponse}.
     */
    public static class Builder {
        private String name;
        private String document;
        private String documentType;
        private GetPixBankAccountResponse bankAccount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  document  String value for document.
         * @param  documentType  String value for documentType.
         * @param  bankAccount  GetPixBankAccountResponse value for bankAccount.
         */
        public Builder(String name, String document, String documentType,
                GetPixBankAccountResponse bankAccount) {
            this.name = name;
            this.document = document;
            this.documentType = documentType;
            this.bankAccount = bankAccount;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for document.
         * @param  document  String value for document.
         * @return Builder
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * Setter for documentType.
         * @param  documentType  String value for documentType.
         * @return Builder
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * Setter for bankAccount.
         * @param  bankAccount  GetPixBankAccountResponse value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(GetPixBankAccountResponse bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Builds a new {@link GetPixPayerResponse} object using the set fields.
         * @return {@link GetPixPayerResponse}
         */
        public GetPixPayerResponse build() {
            return new GetPixPayerResponse(name, document, documentType, bankAccount);
        }
    }
}
