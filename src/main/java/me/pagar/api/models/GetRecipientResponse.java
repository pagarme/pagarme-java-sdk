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
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetRecipientResponse type.
 */
public class GetRecipientResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> name;
    private OptionalNullable<String> email;
    private OptionalNullable<String> document;
    private OptionalNullable<String> description;
    private OptionalNullable<String> type;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<LocalDateTime> deletedAt;
    private OptionalNullable<GetBankAccountResponse> defaultBankAccount;
    private OptionalNullable<List<GetGatewayRecipientResponse>> gatewayRecipients;
    private OptionalNullable<Map<String, String>> metadata;
    private OptionalNullable<GetAutomaticAnticipationResponse> automaticAnticipationSettings;
    private OptionalNullable<GetTransferSettingsResponse> transferSettings;
    private OptionalNullable<String> code;
    private OptionalNullable<String> paymentMode;

    /**
     * Default constructor.
     */
    public GetRecipientResponse() {
        paymentMode = OptionalNullable.of("bank_transfer");
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  document  String value for document.
     * @param  description  String value for description.
     * @param  type  String value for type.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     * @param  defaultBankAccount  GetBankAccountResponse value for defaultBankAccount.
     * @param  gatewayRecipients  List of GetGatewayRecipientResponse value for gatewayRecipients.
     * @param  metadata  Map of String, value for metadata.
     * @param  automaticAnticipationSettings  GetAutomaticAnticipationResponse value for
     *         automaticAnticipationSettings.
     * @param  transferSettings  GetTransferSettingsResponse value for transferSettings.
     * @param  code  String value for code.
     * @param  paymentMode  String value for paymentMode.
     */
    public GetRecipientResponse(
            String id,
            String name,
            String email,
            String document,
            String description,
            String type,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            GetBankAccountResponse defaultBankAccount,
            List<GetGatewayRecipientResponse> gatewayRecipients,
            Map<String, String> metadata,
            GetAutomaticAnticipationResponse automaticAnticipationSettings,
            GetTransferSettingsResponse transferSettings,
            String code,
            String paymentMode) {
        this.id = OptionalNullable.of(id);
        this.name = OptionalNullable.of(name);
        this.email = OptionalNullable.of(email);
        this.document = OptionalNullable.of(document);
        this.description = OptionalNullable.of(description);
        this.type = OptionalNullable.of(type);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.deletedAt = OptionalNullable.of(deletedAt);
        this.defaultBankAccount = OptionalNullable.of(defaultBankAccount);
        this.gatewayRecipients = OptionalNullable.of(gatewayRecipients);
        this.metadata = OptionalNullable.of(metadata);
        this.automaticAnticipationSettings = OptionalNullable.of(automaticAnticipationSettings);
        this.transferSettings = OptionalNullable.of(transferSettings);
        this.code = OptionalNullable.of(code);
        this.paymentMode = OptionalNullable.of(paymentMode);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetRecipientResponse(OptionalNullable<String> id, OptionalNullable<String> name,
            OptionalNullable<String> email, OptionalNullable<String> document,
            OptionalNullable<String> description, OptionalNullable<String> type,
            OptionalNullable<String> status, OptionalNullable<LocalDateTime> createdAt,
            OptionalNullable<LocalDateTime> updatedAt, OptionalNullable<LocalDateTime> deletedAt,
            OptionalNullable<GetBankAccountResponse> defaultBankAccount,
            OptionalNullable<List<GetGatewayRecipientResponse>> gatewayRecipients,
            OptionalNullable<Map<String, String>> metadata,
            OptionalNullable<GetAutomaticAnticipationResponse> automaticAnticipationSettings,
            OptionalNullable<GetTransferSettingsResponse> transferSettings,
            OptionalNullable<String> code, OptionalNullable<String> paymentMode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.document = document;
        this.description = description;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.defaultBankAccount = defaultBankAccount;
        this.gatewayRecipients = gatewayRecipients;
        this.metadata = metadata;
        this.automaticAnticipationSettings = automaticAnticipationSettings;
        this.transferSettings = transferSettings;
        this.code = code;
        this.paymentMode = paymentMode;
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
     * Internal Getter for Name.
     * Name
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
     * Name
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * Name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     * Name
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Internal Getter for Email.
     * Email
     * @return Returns the Internal String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmail() {
        return this.email;
    }

    /**
     * Getter for Email.
     * Email
     * @return Returns the String
     */
    public String getEmail() {
        return OptionalNullable.getFrom(email);
    }

    /**
     * Setter for Email.
     * Email
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = OptionalNullable.of(email);
    }

    /**
     * UnSetter for Email.
     * Email
     */
    public void unsetEmail() {
        email = null;
    }

    /**
     * Internal Getter for Document.
     * Document
     * @return Returns the Internal String
     */
    @JsonGetter("document")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocument() {
        return this.document;
    }

    /**
     * Getter for Document.
     * Document
     * @return Returns the String
     */
    public String getDocument() {
        return OptionalNullable.getFrom(document);
    }

    /**
     * Setter for Document.
     * Document
     * @param document Value for String
     */
    @JsonSetter("document")
    public void setDocument(String document) {
        this.document = OptionalNullable.of(document);
    }

    /**
     * UnSetter for Document.
     * Document
     */
    public void unsetDocument() {
        document = null;
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
     * Internal Getter for Type.
     * Type
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
     * Type
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     * Type
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for Status.
     * Status
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
     * Status
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     * Status
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
     * Internal Getter for DefaultBankAccount.
     * Default bank account
     * @return Returns the Internal GetBankAccountResponse
     */
    @JsonGetter("default_bank_account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetBankAccountResponse> internalGetDefaultBankAccount() {
        return this.defaultBankAccount;
    }

    /**
     * Getter for DefaultBankAccount.
     * Default bank account
     * @return Returns the GetBankAccountResponse
     */
    public GetBankAccountResponse getDefaultBankAccount() {
        return OptionalNullable.getFrom(defaultBankAccount);
    }

    /**
     * Setter for DefaultBankAccount.
     * Default bank account
     * @param defaultBankAccount Value for GetBankAccountResponse
     */
    @JsonSetter("default_bank_account")
    public void setDefaultBankAccount(GetBankAccountResponse defaultBankAccount) {
        this.defaultBankAccount = OptionalNullable.of(defaultBankAccount);
    }

    /**
     * UnSetter for DefaultBankAccount.
     * Default bank account
     */
    public void unsetDefaultBankAccount() {
        defaultBankAccount = null;
    }

    /**
     * Internal Getter for GatewayRecipients.
     * Info about the recipient on the gateway
     * @return Returns the Internal List of GetGatewayRecipientResponse
     */
    @JsonGetter("gateway_recipients")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetGatewayRecipientResponse>> internalGetGatewayRecipients() {
        return this.gatewayRecipients;
    }

    /**
     * Getter for GatewayRecipients.
     * Info about the recipient on the gateway
     * @return Returns the List of GetGatewayRecipientResponse
     */
    public List<GetGatewayRecipientResponse> getGatewayRecipients() {
        return OptionalNullable.getFrom(gatewayRecipients);
    }

    /**
     * Setter for GatewayRecipients.
     * Info about the recipient on the gateway
     * @param gatewayRecipients Value for List of GetGatewayRecipientResponse
     */
    @JsonSetter("gateway_recipients")
    public void setGatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) {
        this.gatewayRecipients = OptionalNullable.of(gatewayRecipients);
    }

    /**
     * UnSetter for GatewayRecipients.
     * Info about the recipient on the gateway
     */
    public void unsetGatewayRecipients() {
        gatewayRecipients = null;
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
     * Internal Getter for AutomaticAnticipationSettings.
     * @return Returns the Internal GetAutomaticAnticipationResponse
     */
    @JsonGetter("automatic_anticipation_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetAutomaticAnticipationResponse> internalGetAutomaticAnticipationSettings() {
        return this.automaticAnticipationSettings;
    }

    /**
     * Getter for AutomaticAnticipationSettings.
     * @return Returns the GetAutomaticAnticipationResponse
     */
    public GetAutomaticAnticipationResponse getAutomaticAnticipationSettings() {
        return OptionalNullable.getFrom(automaticAnticipationSettings);
    }

    /**
     * Setter for AutomaticAnticipationSettings.
     * @param automaticAnticipationSettings Value for GetAutomaticAnticipationResponse
     */
    @JsonSetter("automatic_anticipation_settings")
    public void setAutomaticAnticipationSettings(GetAutomaticAnticipationResponse automaticAnticipationSettings) {
        this.automaticAnticipationSettings = OptionalNullable.of(automaticAnticipationSettings);
    }

    /**
     * UnSetter for AutomaticAnticipationSettings.
     */
    public void unsetAutomaticAnticipationSettings() {
        automaticAnticipationSettings = null;
    }

    /**
     * Internal Getter for TransferSettings.
     * @return Returns the Internal GetTransferSettingsResponse
     */
    @JsonGetter("transfer_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetTransferSettingsResponse> internalGetTransferSettings() {
        return this.transferSettings;
    }

    /**
     * Getter for TransferSettings.
     * @return Returns the GetTransferSettingsResponse
     */
    public GetTransferSettingsResponse getTransferSettings() {
        return OptionalNullable.getFrom(transferSettings);
    }

    /**
     * Setter for TransferSettings.
     * @param transferSettings Value for GetTransferSettingsResponse
     */
    @JsonSetter("transfer_settings")
    public void setTransferSettings(GetTransferSettingsResponse transferSettings) {
        this.transferSettings = OptionalNullable.of(transferSettings);
    }

    /**
     * UnSetter for TransferSettings.
     */
    public void unsetTransferSettings() {
        transferSettings = null;
    }

    /**
     * Internal Getter for Code.
     * Recipient code
     * @return Returns the Internal String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCode() {
        return this.code;
    }

    /**
     * Getter for Code.
     * Recipient code
     * @return Returns the String
     */
    public String getCode() {
        return OptionalNullable.getFrom(code);
    }

    /**
     * Setter for Code.
     * Recipient code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = OptionalNullable.of(code);
    }

    /**
     * UnSetter for Code.
     * Recipient code
     */
    public void unsetCode() {
        code = null;
    }

    /**
     * Internal Getter for PaymentMode.
     * Payment mode
     * @return Returns the Internal String
     */
    @JsonGetter("payment_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentMode() {
        return this.paymentMode;
    }

    /**
     * Getter for PaymentMode.
     * Payment mode
     * @return Returns the String
     */
    public String getPaymentMode() {
        return OptionalNullable.getFrom(paymentMode);
    }

    /**
     * Setter for PaymentMode.
     * Payment mode
     * @param paymentMode Value for String
     */
    @JsonSetter("payment_mode")
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = OptionalNullable.of(paymentMode);
    }

    /**
     * UnSetter for PaymentMode.
     * Payment mode
     */
    public void unsetPaymentMode() {
        paymentMode = null;
    }

    /**
     * Converts this GetRecipientResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetRecipientResponse [" + "id=" + id + ", name=" + name + ", email=" + email
                + ", document=" + document + ", description=" + description + ", type=" + type
                + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", deletedAt=" + deletedAt + ", defaultBankAccount=" + defaultBankAccount
                + ", gatewayRecipients=" + gatewayRecipients + ", metadata=" + metadata
                + ", automaticAnticipationSettings=" + automaticAnticipationSettings
                + ", transferSettings=" + transferSettings + ", code=" + code + ", paymentMode="
                + paymentMode + "]";
    }

    /**
     * Builds a new {@link GetRecipientResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetRecipientResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.name = internalGetName();
        builder.email = internalGetEmail();
        builder.document = internalGetDocument();
        builder.description = internalGetDescription();
        builder.type = internalGetType();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.deletedAt = internalGetDeletedAt();
        builder.defaultBankAccount = internalGetDefaultBankAccount();
        builder.gatewayRecipients = internalGetGatewayRecipients();
        builder.metadata = internalGetMetadata();
        builder.automaticAnticipationSettings = internalGetAutomaticAnticipationSettings();
        builder.transferSettings = internalGetTransferSettings();
        builder.code = internalGetCode();
        builder.paymentMode = internalGetPaymentMode();
        return builder;
    }

    /**
     * Class to build instances of {@link GetRecipientResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> name;
        private OptionalNullable<String> email;
        private OptionalNullable<String> document;
        private OptionalNullable<String> description;
        private OptionalNullable<String> type;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<LocalDateTime> deletedAt;
        private OptionalNullable<GetBankAccountResponse> defaultBankAccount;
        private OptionalNullable<List<GetGatewayRecipientResponse>> gatewayRecipients;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<GetAutomaticAnticipationResponse> automaticAnticipationSettings;
        private OptionalNullable<GetTransferSettingsResponse> transferSettings;
        private OptionalNullable<String> code;
        private OptionalNullable<String> paymentMode = OptionalNullable.of("bank_transfer");



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
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = OptionalNullable.of(email);
            return this;
        }

        /**
         * UnSetter for email.
         * @return Builder
         */
        public Builder unsetEmail() {
            email = null;
            return this;
        }

        /**
         * Setter for document.
         * @param  document  String value for document.
         * @return Builder
         */
        public Builder document(String document) {
            this.document = OptionalNullable.of(document);
            return this;
        }

        /**
         * UnSetter for document.
         * @return Builder
         */
        public Builder unsetDocument() {
            document = null;
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
         * Setter for defaultBankAccount.
         * @param  defaultBankAccount  GetBankAccountResponse value for defaultBankAccount.
         * @return Builder
         */
        public Builder defaultBankAccount(GetBankAccountResponse defaultBankAccount) {
            this.defaultBankAccount = OptionalNullable.of(defaultBankAccount);
            return this;
        }

        /**
         * UnSetter for defaultBankAccount.
         * @return Builder
         */
        public Builder unsetDefaultBankAccount() {
            defaultBankAccount = null;
            return this;
        }

        /**
         * Setter for gatewayRecipients.
         * @param  gatewayRecipients  List of GetGatewayRecipientResponse value for
         *         gatewayRecipients.
         * @return Builder
         */
        public Builder gatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) {
            this.gatewayRecipients = OptionalNullable.of(gatewayRecipients);
            return this;
        }

        /**
         * UnSetter for gatewayRecipients.
         * @return Builder
         */
        public Builder unsetGatewayRecipients() {
            gatewayRecipients = null;
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
         * Setter for automaticAnticipationSettings.
         * @param  automaticAnticipationSettings  GetAutomaticAnticipationResponse value for
         *         automaticAnticipationSettings.
         * @return Builder
         */
        public Builder automaticAnticipationSettings(
                GetAutomaticAnticipationResponse automaticAnticipationSettings) {
            this.automaticAnticipationSettings = OptionalNullable.of(automaticAnticipationSettings);
            return this;
        }

        /**
         * UnSetter for automaticAnticipationSettings.
         * @return Builder
         */
        public Builder unsetAutomaticAnticipationSettings() {
            automaticAnticipationSettings = null;
            return this;
        }

        /**
         * Setter for transferSettings.
         * @param  transferSettings  GetTransferSettingsResponse value for transferSettings.
         * @return Builder
         */
        public Builder transferSettings(GetTransferSettingsResponse transferSettings) {
            this.transferSettings = OptionalNullable.of(transferSettings);
            return this;
        }

        /**
         * UnSetter for transferSettings.
         * @return Builder
         */
        public Builder unsetTransferSettings() {
            transferSettings = null;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = OptionalNullable.of(code);
            return this;
        }

        /**
         * UnSetter for code.
         * @return Builder
         */
        public Builder unsetCode() {
            code = null;
            return this;
        }

        /**
         * Setter for paymentMode.
         * @param  paymentMode  String value for paymentMode.
         * @return Builder
         */
        public Builder paymentMode(String paymentMode) {
            this.paymentMode = OptionalNullable.of(paymentMode);
            return this;
        }

        /**
         * UnSetter for paymentMode.
         * @return Builder
         */
        public Builder unsetPaymentMode() {
            paymentMode = null;
            return this;
        }

        /**
         * Builds a new {@link GetRecipientResponse} object using the set fields.
         * @return {@link GetRecipientResponse}
         */
        public GetRecipientResponse build() {
            return new GetRecipientResponse(id, name, email, document, description, type, status,
                    createdAt, updatedAt, deletedAt, defaultBankAccount, gatewayRecipients,
                    metadata, automaticAnticipationSettings, transferSettings, code, paymentMode);
        }
    }
}
