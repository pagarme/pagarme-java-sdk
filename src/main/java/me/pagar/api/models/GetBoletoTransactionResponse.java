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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetBoletoTransactionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "transaction_type",
        defaultImpl = GetBoletoTransactionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetBoletoTransactionResponse
        extends GetTransactionResponse {
    private String url;
    private String barcode;
    private String nossoNumero;
    private String bank;
    private String documentNumber;
    private String instructions;
    private GetBillingAddressResponse billingAddress;
    private OptionalNullable<LocalDateTime> dueAt;
    private String qrCode;
    private String line;
    private String pdfPassword;
    private String pdf;
    private OptionalNullable<LocalDateTime> paidAt;
    private String paidAmount;
    private String type;
    private OptionalNullable<LocalDateTime> creditAt;
    private String statementDescriptor;

    /**
     * Default constructor.
     */
    public GetBoletoTransactionResponse() {
        super();
        setTransactionType("boleto");
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
     * @param  id  String value for id.
     * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
     * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
     * @param  split  List of GetSplitResponse value for split.
     * @param  url  String value for url.
     * @param  barcode  String value for barcode.
     * @param  nossoNumero  String value for nossoNumero.
     * @param  bank  String value for bank.
     * @param  documentNumber  String value for documentNumber.
     * @param  instructions  String value for instructions.
     * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
     * @param  qrCode  String value for qrCode.
     * @param  line  String value for line.
     * @param  pdfPassword  String value for pdfPassword.
     * @param  pdf  String value for pdf.
     * @param  paidAmount  String value for paidAmount.
     * @param  type  String value for type.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  nextAttempt  LocalDateTime value for nextAttempt.
     * @param  transactionType  String value for transactionType.
     * @param  metadata  Map of String, value for metadata.
     * @param  interest  GetInterestResponse value for interest.
     * @param  fine  GetFineResponse value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     * @param  dueAt  LocalDateTime value for dueAt.
     * @param  paidAt  LocalDateTime value for paidAt.
     * @param  creditAt  LocalDateTime value for creditAt.
     */
    public GetBoletoTransactionResponse(
            String gatewayId,
            Integer amount,
            String status,
            Boolean success,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Integer attemptCount,
            Integer maxAttempts,
            List<GetSplitResponse> splits,
            String id,
            GetGatewayResponseResponse gatewayResponse,
            GetAntifraudResponse antifraudResponse,
            List<GetSplitResponse> split,
            String url,
            String barcode,
            String nossoNumero,
            String bank,
            String documentNumber,
            String instructions,
            GetBillingAddressResponse billingAddress,
            String qrCode,
            String line,
            String pdfPassword,
            String pdf,
            String paidAmount,
            String type,
            String statementDescriptor,
            LocalDateTime nextAttempt,
            String transactionType,
            Map<String, String> metadata,
            GetInterestResponse interest,
            GetFineResponse fine,
            Integer maxDaysToPayPastDue,
            LocalDateTime dueAt,
            LocalDateTime paidAt,
            LocalDateTime creditAt) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.url = url;
        this.barcode = barcode;
        this.nossoNumero = nossoNumero;
        this.bank = bank;
        this.documentNumber = documentNumber;
        this.instructions = instructions;
        this.billingAddress = billingAddress;
        this.dueAt = OptionalNullable.of(dueAt);
        this.qrCode = qrCode;
        this.line = line;
        this.pdfPassword = pdfPassword;
        this.pdf = pdf;
        this.paidAt = OptionalNullable.of(paidAt);
        this.paidAmount = paidAmount;
        this.type = type;
        this.creditAt = OptionalNullable.of(creditAt);
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Internal initialization constructor.
     */
    protected GetBoletoTransactionResponse(String gatewayId, Integer amount, String status,
            Boolean success, LocalDateTime createdAt, LocalDateTime updatedAt, Integer attemptCount,
            Integer maxAttempts, List<GetSplitResponse> splits, String id,
            GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
            List<GetSplitResponse> split, String url, String barcode, String nossoNumero,
            String bank, String documentNumber, String instructions,
            GetBillingAddressResponse billingAddress, String qrCode, String line,
            String pdfPassword, String pdf, String paidAmount, String type,
            String statementDescriptor, OptionalNullable<LocalDateTime> nextAttempt,
            String transactionType, OptionalNullable<Map<String, String>> metadata,
            OptionalNullable<GetInterestResponse> interest, OptionalNullable<GetFineResponse> fine,
            OptionalNullable<Integer> maxDaysToPayPastDue, OptionalNullable<LocalDateTime> dueAt,
            OptionalNullable<LocalDateTime> paidAt, OptionalNullable<LocalDateTime> creditAt) {
        super(gatewayId, amount, status, success, createdAt, updatedAt, attemptCount, maxAttempts,
                splits, id, gatewayResponse, antifraudResponse, split, nextAttempt, transactionType,
                metadata, interest, fine, maxDaysToPayPastDue);
        this.url = url;
        this.barcode = barcode;
        this.nossoNumero = nossoNumero;
        this.bank = bank;
        this.documentNumber = documentNumber;
        this.instructions = instructions;
        this.billingAddress = billingAddress;
        this.dueAt = dueAt;
        this.qrCode = qrCode;
        this.line = line;
        this.pdfPassword = pdfPassword;
        this.pdf = pdf;
        this.paidAt = paidAt;
        this.paidAmount = paidAmount;
        this.type = type;
        this.creditAt = creditAt;
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Barcode.
     * @return Returns the String
     */
    @JsonGetter("barcode")
    public String getBarcode() {
        return barcode;
    }

    /**
     * Setter for Barcode.
     * @param barcode Value for String
     */
    @JsonSetter("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Getter for NossoNumero.
     * @return Returns the String
     */
    @JsonGetter("nosso_numero")
    public String getNossoNumero() {
        return nossoNumero;
    }

    /**
     * Setter for NossoNumero.
     * @param nossoNumero Value for String
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    /**
     * Getter for Bank.
     * @return Returns the String
     */
    @JsonGetter("bank")
    public String getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Getter for DocumentNumber.
     * @return Returns the String
     */
    @JsonGetter("document_number")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Setter for DocumentNumber.
     * @param documentNumber Value for String
     */
    @JsonSetter("document_number")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Getter for Instructions.
     * @return Returns the String
     */
    @JsonGetter("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * Setter for Instructions.
     * @param instructions Value for String
     */
    @JsonSetter("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the GetBillingAddressResponse
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for GetBillingAddressResponse
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(GetBillingAddressResponse billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Internal Getter for DueAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDueAt() {
        return this.dueAt;
    }

    /**
     * Getter for DueAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDueAt() {
        return OptionalNullable.getFrom(dueAt);
    }

    /**
     * Setter for DueAt.
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = OptionalNullable.of(dueAt);
    }

    /**
     * UnSetter for DueAt.
     */
    public void unsetDueAt() {
        dueAt = null;
    }

    /**
     * Getter for QrCode.
     * @return Returns the String
     */
    @JsonGetter("qr_code")
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Setter for QrCode.
     * @param qrCode Value for String
     */
    @JsonSetter("qr_code")
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * Getter for Line.
     * @return Returns the String
     */
    @JsonGetter("line")
    public String getLine() {
        return line;
    }

    /**
     * Setter for Line.
     * @param line Value for String
     */
    @JsonSetter("line")
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * Getter for PdfPassword.
     * @return Returns the String
     */
    @JsonGetter("pdf_password")
    public String getPdfPassword() {
        return pdfPassword;
    }

    /**
     * Setter for PdfPassword.
     * @param pdfPassword Value for String
     */
    @JsonSetter("pdf_password")
    public void setPdfPassword(String pdfPassword) {
        this.pdfPassword = pdfPassword;
    }

    /**
     * Getter for Pdf.
     * @return Returns the String
     */
    @JsonGetter("pdf")
    public String getPdf() {
        return pdf;
    }

    /**
     * Setter for Pdf.
     * @param pdf Value for String
     */
    @JsonSetter("pdf")
    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    /**
     * Internal Getter for PaidAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("paid_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetPaidAt() {
        return this.paidAt;
    }

    /**
     * Getter for PaidAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getPaidAt() {
        return OptionalNullable.getFrom(paidAt);
    }

    /**
     * Setter for PaidAt.
     * @param paidAt Value for LocalDateTime
     */
    @JsonSetter("paid_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = OptionalNullable.of(paidAt);
    }

    /**
     * UnSetter for PaidAt.
     */
    public void unsetPaidAt() {
        paidAt = null;
    }

    /**
     * Getter for PaidAmount.
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Internal Getter for CreditAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("credit_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCreditAt() {
        return this.creditAt;
    }

    /**
     * Getter for CreditAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCreditAt() {
        return OptionalNullable.getFrom(creditAt);
    }

    /**
     * Setter for CreditAt.
     * @param creditAt Value for LocalDateTime
     */
    @JsonSetter("credit_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreditAt(LocalDateTime creditAt) {
        this.creditAt = OptionalNullable.of(creditAt);
    }

    /**
     * UnSetter for CreditAt.
     */
    public void unsetCreditAt() {
        creditAt = null;
    }

    /**
     * Getter for StatementDescriptor.
     * Soft Descriptor
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Soft Descriptor
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Converts this GetBoletoTransactionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetBoletoTransactionResponse [" + "url=" + url + ", barcode=" + barcode
                + ", nossoNumero=" + nossoNumero + ", bank=" + bank + ", documentNumber="
                + documentNumber + ", instructions=" + instructions + ", billingAddress="
                + billingAddress + ", qrCode=" + qrCode + ", line=" + line + ", pdfPassword="
                + pdfPassword + ", pdf=" + pdf + ", paidAmount=" + paidAmount + ", type=" + type
                + ", statementDescriptor=" + statementDescriptor + ", dueAt=" + dueAt + ", paidAt="
                + paidAt + ", creditAt=" + creditAt + ", gatewayId=" + getGatewayId() + ", amount="
                + getAmount() + ", status=" + getStatus() + ", success=" + getSuccess()
                + ", createdAt=" + getCreatedAt() + ", updatedAt=" + getUpdatedAt()
                + ", attemptCount=" + getAttemptCount() + ", maxAttempts=" + getMaxAttempts()
                + ", splits=" + getSplits() + ", id=" + getId() + ", gatewayResponse="
                + getGatewayResponse() + ", antifraudResponse=" + getAntifraudResponse()
                + ", split=" + getSplit() + ", nextAttempt=" + getNextAttempt()
                + ", transactionType=" + getTransactionType() + ", metadata=" + getMetadata()
                + ", interest=" + getInterest() + ", fine=" + getFine() + ", maxDaysToPayPastDue="
                + getMaxDaysToPayPastDue() + "]";
    }

    /**
     * Builds a new {@link GetBoletoTransactionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetBoletoTransactionResponse.Builder} object
     */
    public Builder toGetBoletoTransactionResponseBuilder() {
        Builder builder = new Builder(getGatewayId(), getAmount(), getStatus(), getSuccess(),
                getCreatedAt(), getUpdatedAt(), getAttemptCount(), getMaxAttempts(), getSplits(),
                getId(), getGatewayResponse(), getAntifraudResponse(), getSplit(), url, barcode,
                nossoNumero, bank, documentNumber, instructions, billingAddress, qrCode, line,
                pdfPassword, pdf, paidAmount, type, statementDescriptor)
                .transactionType(getTransactionType());
        builder.dueAt = internalGetDueAt();
        builder.paidAt = internalGetPaidAt();
        builder.creditAt = internalGetCreditAt();
        builder.nextAttempt = internalGetNextAttempt();
        builder.metadata = internalGetMetadata();
        builder.interest = internalGetInterest();
        builder.fine = internalGetFine();
        builder.maxDaysToPayPastDue = internalGetMaxDaysToPayPastDue();
        return builder;
    }

    /**
     * Class to build instances of {@link GetBoletoTransactionResponse}.
     */
    public static class Builder {
        private String gatewayId;
        private Integer amount;
        private String status;
        private Boolean success;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Integer attemptCount;
        private Integer maxAttempts;
        private List<GetSplitResponse> splits;
        private String id;
        private GetGatewayResponseResponse gatewayResponse;
        private GetAntifraudResponse antifraudResponse;
        private List<GetSplitResponse> split;
        private String url;
        private String barcode;
        private String nossoNumero;
        private String bank;
        private String documentNumber;
        private String instructions;
        private GetBillingAddressResponse billingAddress;
        private String qrCode;
        private String line;
        private String pdfPassword;
        private String pdf;
        private String paidAmount;
        private String type;
        private String statementDescriptor;
        private OptionalNullable<LocalDateTime> nextAttempt;
        private String transactionType = "boleto";
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<GetInterestResponse> interest;
        private OptionalNullable<GetFineResponse> fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;
        private OptionalNullable<LocalDateTime> dueAt;
        private OptionalNullable<LocalDateTime> paidAt;
        private OptionalNullable<LocalDateTime> creditAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
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
         * @param  id  String value for id.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @param  split  List of GetSplitResponse value for split.
         * @param  url  String value for url.
         * @param  barcode  String value for barcode.
         * @param  nossoNumero  String value for nossoNumero.
         * @param  bank  String value for bank.
         * @param  documentNumber  String value for documentNumber.
         * @param  instructions  String value for instructions.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @param  qrCode  String value for qrCode.
         * @param  line  String value for line.
         * @param  pdfPassword  String value for pdfPassword.
         * @param  pdf  String value for pdf.
         * @param  paidAmount  String value for paidAmount.
         * @param  type  String value for type.
         * @param  statementDescriptor  String value for statementDescriptor.
         */
        public Builder(String gatewayId, Integer amount, String status, Boolean success,
                LocalDateTime createdAt, LocalDateTime updatedAt, Integer attemptCount,
                Integer maxAttempts, List<GetSplitResponse> splits, String id,
                GetGatewayResponseResponse gatewayResponse, GetAntifraudResponse antifraudResponse,
                List<GetSplitResponse> split, String url, String barcode, String nossoNumero,
                String bank, String documentNumber, String instructions,
                GetBillingAddressResponse billingAddress, String qrCode, String line,
                String pdfPassword, String pdf, String paidAmount, String type,
                String statementDescriptor) {
            this.gatewayId = gatewayId;
            this.amount = amount;
            this.status = status;
            this.success = success;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.attemptCount = attemptCount;
            this.maxAttempts = maxAttempts;
            this.splits = splits;
            this.id = id;
            this.gatewayResponse = gatewayResponse;
            this.antifraudResponse = antifraudResponse;
            this.split = split;
            this.url = url;
            this.barcode = barcode;
            this.nossoNumero = nossoNumero;
            this.bank = bank;
            this.documentNumber = documentNumber;
            this.instructions = instructions;
            this.billingAddress = billingAddress;
            this.qrCode = qrCode;
            this.line = line;
            this.pdfPassword = pdfPassword;
            this.pdf = pdf;
            this.paidAmount = paidAmount;
            this.type = type;
            this.statementDescriptor = statementDescriptor;
        }

        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for success.
         * @param  success  Boolean value for success.
         * @return Builder
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for attemptCount.
         * @param  attemptCount  Integer value for attemptCount.
         * @return Builder
         */
        public Builder attemptCount(Integer attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        /**
         * Setter for maxAttempts.
         * @param  maxAttempts  Integer value for maxAttempts.
         * @return Builder
         */
        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * Setter for splits.
         * @param  splits  List of GetSplitResponse value for splits.
         * @return Builder
         */
        public Builder splits(List<GetSplitResponse> splits) {
            this.splits = splits;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for gatewayResponse.
         * @param  gatewayResponse  GetGatewayResponseResponse value for gatewayResponse.
         * @return Builder
         */
        public Builder gatewayResponse(GetGatewayResponseResponse gatewayResponse) {
            this.gatewayResponse = gatewayResponse;
            return this;
        }

        /**
         * Setter for antifraudResponse.
         * @param  antifraudResponse  GetAntifraudResponse value for antifraudResponse.
         * @return Builder
         */
        public Builder antifraudResponse(GetAntifraudResponse antifraudResponse) {
            this.antifraudResponse = antifraudResponse;
            return this;
        }

        /**
         * Setter for split.
         * @param  split  List of GetSplitResponse value for split.
         * @return Builder
         */
        public Builder split(List<GetSplitResponse> split) {
            this.split = split;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for barcode.
         * @param  barcode  String value for barcode.
         * @return Builder
         */
        public Builder barcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        /**
         * Setter for nossoNumero.
         * @param  nossoNumero  String value for nossoNumero.
         * @return Builder
         */
        public Builder nossoNumero(String nossoNumero) {
            this.nossoNumero = nossoNumero;
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
         * Setter for documentNumber.
         * @param  documentNumber  String value for documentNumber.
         * @return Builder
         */
        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }

        /**
         * Setter for instructions.
         * @param  instructions  String value for instructions.
         * @return Builder
         */
        public Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(GetBillingAddressResponse billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for qrCode.
         * @param  qrCode  String value for qrCode.
         * @return Builder
         */
        public Builder qrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }

        /**
         * Setter for line.
         * @param  line  String value for line.
         * @return Builder
         */
        public Builder line(String line) {
            this.line = line;
            return this;
        }

        /**
         * Setter for pdfPassword.
         * @param  pdfPassword  String value for pdfPassword.
         * @return Builder
         */
        public Builder pdfPassword(String pdfPassword) {
            this.pdfPassword = pdfPassword;
            return this;
        }

        /**
         * Setter for pdf.
         * @param  pdf  String value for pdf.
         * @return Builder
         */
        public Builder pdf(String pdf) {
            this.pdf = pdf;
            return this;
        }

        /**
         * Setter for paidAmount.
         * @param  paidAmount  String value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(String paidAmount) {
            this.paidAmount = paidAmount;
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
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
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
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = OptionalNullable.of(dueAt);
            return this;
        }

        /**
         * UnSetter for dueAt.
         * @return Builder
         */
        public Builder unsetDueAt() {
            dueAt = null;
            return this;
        }

        /**
         * Setter for paidAt.
         * @param  paidAt  LocalDateTime value for paidAt.
         * @return Builder
         */
        public Builder paidAt(LocalDateTime paidAt) {
            this.paidAt = OptionalNullable.of(paidAt);
            return this;
        }

        /**
         * UnSetter for paidAt.
         * @return Builder
         */
        public Builder unsetPaidAt() {
            paidAt = null;
            return this;
        }

        /**
         * Setter for creditAt.
         * @param  creditAt  LocalDateTime value for creditAt.
         * @return Builder
         */
        public Builder creditAt(LocalDateTime creditAt) {
            this.creditAt = OptionalNullable.of(creditAt);
            return this;
        }

        /**
         * UnSetter for creditAt.
         * @return Builder
         */
        public Builder unsetCreditAt() {
            creditAt = null;
            return this;
        }

        /**
         * Builds a new {@link GetBoletoTransactionResponse} object using the set fields.
         * @return {@link GetBoletoTransactionResponse}
         */
        public GetBoletoTransactionResponse build() {
            return new GetBoletoTransactionResponse(gatewayId, amount, status, success, createdAt,
                    updatedAt, attemptCount, maxAttempts, splits, id, gatewayResponse,
                    antifraudResponse, split, url, barcode, nossoNumero, bank, documentNumber,
                    instructions, billingAddress, qrCode, line, pdfPassword, pdf, paidAmount, type,
                    statementDescriptor, nextAttempt, transactionType, metadata, interest, fine,
                    maxDaysToPayPastDue, dueAt, paidAt, creditAt);
        }
    }
}
