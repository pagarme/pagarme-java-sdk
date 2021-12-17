/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateChargePaymentMethodRequest type.
 */
public class UpdateChargePaymentMethodRequest {
    private boolean updateSubscription;
    private String paymentMethod;
    private CreateCreditCardPaymentRequest creditCard;
    private CreateDebitCardPaymentRequest debitCard;
    private CreateBoletoPaymentRequest boleto;
    private CreateVoucherPaymentRequest voucher;
    private CreateCashPaymentRequest cash;
    private CreateBankTransferPaymentRequest bankTransfer;
    private CreatePrivateLabelPaymentRequest privateLabel;

    /**
     * Default constructor.
     */
    public UpdateChargePaymentMethodRequest() {
    }

    /**
     * Initialization constructor.
     * @param  updateSubscription  boolean value for updateSubscription.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  creditCard  CreateCreditCardPaymentRequest value for creditCard.
     * @param  debitCard  CreateDebitCardPaymentRequest value for debitCard.
     * @param  boleto  CreateBoletoPaymentRequest value for boleto.
     * @param  voucher  CreateVoucherPaymentRequest value for voucher.
     * @param  cash  CreateCashPaymentRequest value for cash.
     * @param  bankTransfer  CreateBankTransferPaymentRequest value for bankTransfer.
     * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
     */
    public UpdateChargePaymentMethodRequest(
            boolean updateSubscription,
            String paymentMethod,
            CreateCreditCardPaymentRequest creditCard,
            CreateDebitCardPaymentRequest debitCard,
            CreateBoletoPaymentRequest boleto,
            CreateVoucherPaymentRequest voucher,
            CreateCashPaymentRequest cash,
            CreateBankTransferPaymentRequest bankTransfer,
            CreatePrivateLabelPaymentRequest privateLabel) {
        this.updateSubscription = updateSubscription;
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
        this.debitCard = debitCard;
        this.boleto = boleto;
        this.voucher = voucher;
        this.cash = cash;
        this.bankTransfer = bankTransfer;
        this.privateLabel = privateLabel;
    }

    /**
     * Getter for UpdateSubscription.
     * Indicates if the payment method from the subscription must also be updated
     * @return Returns the boolean
     */
    @JsonGetter("update_subscription")
    public boolean getUpdateSubscription() {
        return updateSubscription;
    }

    /**
     * Setter for UpdateSubscription.
     * Indicates if the payment method from the subscription must also be updated
     * @param updateSubscription Value for boolean
     */
    @JsonSetter("update_subscription")
    public void setUpdateSubscription(boolean updateSubscription) {
        this.updateSubscription = updateSubscription;
    }

    /**
     * Getter for PaymentMethod.
     * The new payment method
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * The new payment method
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for CreditCard.
     * Credit card data
     * @return Returns the CreateCreditCardPaymentRequest
     */
    @JsonGetter("credit_card")
    public CreateCreditCardPaymentRequest getCreditCard() {
        return creditCard;
    }

    /**
     * Setter for CreditCard.
     * Credit card data
     * @param creditCard Value for CreateCreditCardPaymentRequest
     */
    @JsonSetter("credit_card")
    public void setCreditCard(CreateCreditCardPaymentRequest creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Getter for DebitCard.
     * Debit card data
     * @return Returns the CreateDebitCardPaymentRequest
     */
    @JsonGetter("debit_card")
    public CreateDebitCardPaymentRequest getDebitCard() {
        return debitCard;
    }

    /**
     * Setter for DebitCard.
     * Debit card data
     * @param debitCard Value for CreateDebitCardPaymentRequest
     */
    @JsonSetter("debit_card")
    public void setDebitCard(CreateDebitCardPaymentRequest debitCard) {
        this.debitCard = debitCard;
    }

    /**
     * Getter for Boleto.
     * Boleto data
     * @return Returns the CreateBoletoPaymentRequest
     */
    @JsonGetter("boleto")
    public CreateBoletoPaymentRequest getBoleto() {
        return boleto;
    }

    /**
     * Setter for Boleto.
     * Boleto data
     * @param boleto Value for CreateBoletoPaymentRequest
     */
    @JsonSetter("boleto")
    public void setBoleto(CreateBoletoPaymentRequest boleto) {
        this.boleto = boleto;
    }

    /**
     * Getter for Voucher.
     * Voucher data
     * @return Returns the CreateVoucherPaymentRequest
     */
    @JsonGetter("voucher")
    public CreateVoucherPaymentRequest getVoucher() {
        return voucher;
    }

    /**
     * Setter for Voucher.
     * Voucher data
     * @param voucher Value for CreateVoucherPaymentRequest
     */
    @JsonSetter("voucher")
    public void setVoucher(CreateVoucherPaymentRequest voucher) {
        this.voucher = voucher;
    }

    /**
     * Getter for Cash.
     * Cash data
     * @return Returns the CreateCashPaymentRequest
     */
    @JsonGetter("cash")
    public CreateCashPaymentRequest getCash() {
        return cash;
    }

    /**
     * Setter for Cash.
     * Cash data
     * @param cash Value for CreateCashPaymentRequest
     */
    @JsonSetter("cash")
    public void setCash(CreateCashPaymentRequest cash) {
        this.cash = cash;
    }

    /**
     * Getter for BankTransfer.
     * Bank Transfer data
     * @return Returns the CreateBankTransferPaymentRequest
     */
    @JsonGetter("bank_transfer")
    public CreateBankTransferPaymentRequest getBankTransfer() {
        return bankTransfer;
    }

    /**
     * Setter for BankTransfer.
     * Bank Transfer data
     * @param bankTransfer Value for CreateBankTransferPaymentRequest
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    /**
     * Getter for PrivateLabel.
     * @return Returns the CreatePrivateLabelPaymentRequest
     */
    @JsonGetter("private_label")
    public CreatePrivateLabelPaymentRequest getPrivateLabel() {
        return privateLabel;
    }

    /**
     * Setter for PrivateLabel.
     * @param privateLabel Value for CreatePrivateLabelPaymentRequest
     */
    @JsonSetter("private_label")
    public void setPrivateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
        this.privateLabel = privateLabel;
    }

    /**
     * Converts this UpdateChargePaymentMethodRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateChargePaymentMethodRequest [" + "updateSubscription=" + updateSubscription
                + ", paymentMethod=" + paymentMethod + ", creditCard=" + creditCard + ", debitCard="
                + debitCard + ", boleto=" + boleto + ", voucher=" + voucher + ", cash=" + cash
                + ", bankTransfer=" + bankTransfer + ", privateLabel=" + privateLabel + "]";
    }

    /**
     * Builds a new {@link UpdateChargePaymentMethodRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateChargePaymentMethodRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(updateSubscription, paymentMethod, creditCard, debitCard,
                boleto, voucher, cash, bankTransfer, privateLabel);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateChargePaymentMethodRequest}.
     */
    public static class Builder {
        private boolean updateSubscription;
        private String paymentMethod;
        private CreateCreditCardPaymentRequest creditCard;
        private CreateDebitCardPaymentRequest debitCard;
        private CreateBoletoPaymentRequest boleto;
        private CreateVoucherPaymentRequest voucher;
        private CreateCashPaymentRequest cash;
        private CreateBankTransferPaymentRequest bankTransfer;
        private CreatePrivateLabelPaymentRequest privateLabel;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  updateSubscription  boolean value for updateSubscription.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  creditCard  CreateCreditCardPaymentRequest value for creditCard.
         * @param  debitCard  CreateDebitCardPaymentRequest value for debitCard.
         * @param  boleto  CreateBoletoPaymentRequest value for boleto.
         * @param  voucher  CreateVoucherPaymentRequest value for voucher.
         * @param  cash  CreateCashPaymentRequest value for cash.
         * @param  bankTransfer  CreateBankTransferPaymentRequest value for bankTransfer.
         * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
         */
        public Builder(boolean updateSubscription, String paymentMethod,
                CreateCreditCardPaymentRequest creditCard, CreateDebitCardPaymentRequest debitCard,
                CreateBoletoPaymentRequest boleto, CreateVoucherPaymentRequest voucher,
                CreateCashPaymentRequest cash, CreateBankTransferPaymentRequest bankTransfer,
                CreatePrivateLabelPaymentRequest privateLabel) {
            this.updateSubscription = updateSubscription;
            this.paymentMethod = paymentMethod;
            this.creditCard = creditCard;
            this.debitCard = debitCard;
            this.boleto = boleto;
            this.voucher = voucher;
            this.cash = cash;
            this.bankTransfer = bankTransfer;
            this.privateLabel = privateLabel;
        }

        /**
         * Setter for updateSubscription.
         * @param  updateSubscription  boolean value for updateSubscription.
         * @return Builder
         */
        public Builder updateSubscription(boolean updateSubscription) {
            this.updateSubscription = updateSubscription;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for creditCard.
         * @param  creditCard  CreateCreditCardPaymentRequest value for creditCard.
         * @return Builder
         */
        public Builder creditCard(CreateCreditCardPaymentRequest creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        /**
         * Setter for debitCard.
         * @param  debitCard  CreateDebitCardPaymentRequest value for debitCard.
         * @return Builder
         */
        public Builder debitCard(CreateDebitCardPaymentRequest debitCard) {
            this.debitCard = debitCard;
            return this;
        }

        /**
         * Setter for boleto.
         * @param  boleto  CreateBoletoPaymentRequest value for boleto.
         * @return Builder
         */
        public Builder boleto(CreateBoletoPaymentRequest boleto) {
            this.boleto = boleto;
            return this;
        }

        /**
         * Setter for voucher.
         * @param  voucher  CreateVoucherPaymentRequest value for voucher.
         * @return Builder
         */
        public Builder voucher(CreateVoucherPaymentRequest voucher) {
            this.voucher = voucher;
            return this;
        }

        /**
         * Setter for cash.
         * @param  cash  CreateCashPaymentRequest value for cash.
         * @return Builder
         */
        public Builder cash(CreateCashPaymentRequest cash) {
            this.cash = cash;
            return this;
        }

        /**
         * Setter for bankTransfer.
         * @param  bankTransfer  CreateBankTransferPaymentRequest value for bankTransfer.
         * @return Builder
         */
        public Builder bankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
        }

        /**
         * Setter for privateLabel.
         * @param  privateLabel  CreatePrivateLabelPaymentRequest value for privateLabel.
         * @return Builder
         */
        public Builder privateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
            this.privateLabel = privateLabel;
            return this;
        }

        /**
         * Builds a new {@link UpdateChargePaymentMethodRequest} object using the set fields.
         * @return {@link UpdateChargePaymentMethodRequest}
         */
        public UpdateChargePaymentMethodRequest build() {
            return new UpdateChargePaymentMethodRequest(updateSubscription, paymentMethod,
                    creditCard, debitCard, boleto, voucher, cash, bankTransfer, privateLabel);
        }
    }
}
