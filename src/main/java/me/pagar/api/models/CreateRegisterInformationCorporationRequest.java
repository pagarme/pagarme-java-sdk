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
 * This is a model class for CreateRegisterInformationCorporationRequest type.
 */
public class CreateRegisterInformationCorporationRequest
        extends CreateRegisterInformationBaseRequest {
    private String companyName;
    private String tradingName;
    private int annualRevenue;
    private OptionalNullable<String> corporationType;
    private OptionalNullable<String> foundingDate;
    private OptionalNullable<String> cnae;
    private List<CreateManagingPartnerRequest> managingPartners;
    private CreateRegisterInformationAddressRequest mainAddress;

    /**
     * Default constructor.
     */
    public CreateRegisterInformationCorporationRequest() {
        super();
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  document  String value for document.
     * @param  type  String value for type.
     * @param  phoneNumbers  List of CreateRegisterInformationPhoneRequest value for phoneNumbers.
     * @param  companyName  String value for companyName.
     * @param  tradingName  String value for tradingName.
     * @param  annualRevenue  int value for annualRevenue.
     * @param  managingPartners  List of CreateManagingPartnerRequest value for managingPartners.
     * @param  mainAddress  CreateRegisterInformationAddressRequest value for mainAddress.
     * @param  siteUrl  String value for siteUrl.
     * @param  corporationType  String value for corporationType.
     * @param  foundingDate  String value for foundingDate.
     * @param  cnae  String value for cnae.
     */
    public CreateRegisterInformationCorporationRequest(
            String email,
            String document,
            String type,
            List<CreateRegisterInformationPhoneRequest> phoneNumbers,
            String companyName,
            String tradingName,
            int annualRevenue,
            List<CreateManagingPartnerRequest> managingPartners,
            CreateRegisterInformationAddressRequest mainAddress,
            String siteUrl,
            String corporationType,
            String foundingDate,
            String cnae) {
        super(email, document, type, phoneNumbers, siteUrl);
        this.companyName = companyName;
        this.tradingName = tradingName;
        this.annualRevenue = annualRevenue;
        this.corporationType = OptionalNullable.of(corporationType);
        this.foundingDate = OptionalNullable.of(foundingDate);
        this.cnae = OptionalNullable.of(cnae);
        this.managingPartners = managingPartners;
        this.mainAddress = mainAddress;
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  document  String value for document.
     * @param  type  String value for type.
     * @param  phoneNumbers  List of CreateRegisterInformationPhoneRequest value for phoneNumbers.
     * @param  companyName  String value for companyName.
     * @param  tradingName  String value for tradingName.
     * @param  annualRevenue  int value for annualRevenue.
     * @param  managingPartners  List of CreateManagingPartnerRequest value for managingPartners.
     * @param  mainAddress  CreateRegisterInformationAddressRequest value for mainAddress.
     * @param  siteUrl  String value for siteUrl.
     * @param  corporationType  String value for corporationType.
     * @param  foundingDate  String value for foundingDate.
     * @param  cnae  String value for cnae.
     */

    protected CreateRegisterInformationCorporationRequest(String email, String document,
            String type, List<CreateRegisterInformationPhoneRequest> phoneNumbers,
            String companyName, String tradingName, int annualRevenue,
            List<CreateManagingPartnerRequest> managingPartners,
            CreateRegisterInformationAddressRequest mainAddress, OptionalNullable<String> siteUrl,
            OptionalNullable<String> corporationType, OptionalNullable<String> foundingDate,
            OptionalNullable<String> cnae) {
        super(email, document, type, phoneNumbers, siteUrl);
        this.companyName = companyName;
        this.tradingName = tradingName;
        this.annualRevenue = annualRevenue;
        this.corporationType = corporationType;
        this.foundingDate = foundingDate;
        this.cnae = cnae;
        this.managingPartners = managingPartners;
        this.mainAddress = mainAddress;
    }

    /**
     * Getter for CompanyName.
     * @return Returns the String
     */
    @JsonGetter("company_name")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * @param companyName Value for String
     */
    @JsonSetter("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for TradingName.
     * @return Returns the String
     */
    @JsonGetter("trading_name")
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Setter for TradingName.
     * @param tradingName Value for String
     */
    @JsonSetter("trading_name")
    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    /**
     * Getter for AnnualRevenue.
     * @return Returns the int
     */
    @JsonGetter("annual_revenue")
    public int getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Setter for AnnualRevenue.
     * @param annualRevenue Value for int
     */
    @JsonSetter("annual_revenue")
    public void setAnnualRevenue(int annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * Internal Getter for CorporationType.
     * @return Returns the Internal String
     */
    @JsonGetter("corporation_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCorporationType() {
        return this.corporationType;
    }

    /**
     * Getter for CorporationType.
     * @return Returns the String
     */
    public String getCorporationType() {
        return OptionalNullable.getFrom(corporationType);
    }

    /**
     * Setter for CorporationType.
     * @param corporationType Value for String
     */
    @JsonSetter("corporation_type")
    public void setCorporationType(String corporationType) {
        this.corporationType = OptionalNullable.of(corporationType);
    }

    /**
     * UnSetter for CorporationType.
     */
    public void unsetCorporationType() {
        corporationType = null;
    }

    /**
     * Internal Getter for FoundingDate.
     * @return Returns the Internal String
     */
    @JsonGetter("founding_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFoundingDate() {
        return this.foundingDate;
    }

    /**
     * Getter for FoundingDate.
     * @return Returns the String
     */
    public String getFoundingDate() {
        return OptionalNullable.getFrom(foundingDate);
    }

    /**
     * Setter for FoundingDate.
     * @param foundingDate Value for String
     */
    @JsonSetter("founding_date")
    public void setFoundingDate(String foundingDate) {
        this.foundingDate = OptionalNullable.of(foundingDate);
    }

    /**
     * UnSetter for FoundingDate.
     */
    public void unsetFoundingDate() {
        foundingDate = null;
    }

    /**
     * Internal Getter for Cnae.
     * @return Returns the Internal String
     */
    @JsonGetter("cnae")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCnae() {
        return this.cnae;
    }

    /**
     * Getter for Cnae.
     * @return Returns the String
     */
    public String getCnae() {
        return OptionalNullable.getFrom(cnae);
    }

    /**
     * Setter for Cnae.
     * @param cnae Value for String
     */
    @JsonSetter("cnae")
    public void setCnae(String cnae) {
        this.cnae = OptionalNullable.of(cnae);
    }

    /**
     * UnSetter for Cnae.
     */
    public void unsetCnae() {
        cnae = null;
    }

    /**
     * Getter for ManagingPartners.
     * @return Returns the List of CreateManagingPartnerRequest
     */
    @JsonGetter("managing_partners")
    public List<CreateManagingPartnerRequest> getManagingPartners() {
        return managingPartners;
    }

    /**
     * Setter for ManagingPartners.
     * @param managingPartners Value for List of CreateManagingPartnerRequest
     */
    @JsonSetter("managing_partners")
    public void setManagingPartners(List<CreateManagingPartnerRequest> managingPartners) {
        this.managingPartners = managingPartners;
    }

    /**
     * Getter for MainAddress.
     * @return Returns the CreateRegisterInformationAddressRequest
     */
    @JsonGetter("main_address")
    public CreateRegisterInformationAddressRequest getMainAddress() {
        return mainAddress;
    }

    /**
     * Setter for MainAddress.
     * @param mainAddress Value for CreateRegisterInformationAddressRequest
     */
    @JsonSetter("main_address")
    public void setMainAddress(CreateRegisterInformationAddressRequest mainAddress) {
        this.mainAddress = mainAddress;
    }

    /**
     * Converts this CreateRegisterInformationCorporationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateRegisterInformationCorporationRequest [" + "companyName=" + companyName
                + ", tradingName=" + tradingName + ", annualRevenue=" + annualRevenue
                + ", managingPartners=" + managingPartners + ", mainAddress=" + mainAddress
                + ", corporationType=" + corporationType + ", foundingDate=" + foundingDate
                + ", cnae=" + cnae + ", email=" + getEmail() + ", document=" + getDocument()
                + ", type=" + getType() + ", phoneNumbers=" + getPhoneNumbers() + ", siteUrl="
                + getSiteUrl() + "]";
    }

    /**
     * Builds a new {@link CreateRegisterInformationCorporationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateRegisterInformationCorporationRequest.Builder} object
     */
    public Builder toCreateRegisterInformationCorporationRequestBuilder() {
        Builder builder = new Builder(getEmail(), getDocument(), getType(), getPhoneNumbers(),
                companyName, tradingName, annualRevenue, managingPartners, mainAddress);
        builder.corporationType = internalGetCorporationType();
        builder.foundingDate = internalGetFoundingDate();
        builder.cnae = internalGetCnae();
        builder.siteUrl = internalGetSiteUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateRegisterInformationCorporationRequest}.
     */
    public static class Builder {
        private String email;
        private String document;
        private String type;
        private List<CreateRegisterInformationPhoneRequest> phoneNumbers;
        private String companyName;
        private String tradingName;
        private int annualRevenue;
        private List<CreateManagingPartnerRequest> managingPartners;
        private CreateRegisterInformationAddressRequest mainAddress;
        private OptionalNullable<String> siteUrl;
        private OptionalNullable<String> corporationType;
        private OptionalNullable<String> foundingDate;
        private OptionalNullable<String> cnae;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  email  String value for email.
         * @param  document  String value for document.
         * @param  type  String value for type.
         * @param  phoneNumbers  List of CreateRegisterInformationPhoneRequest value for
         *         phoneNumbers.
         * @param  companyName  String value for companyName.
         * @param  tradingName  String value for tradingName.
         * @param  annualRevenue  int value for annualRevenue.
         * @param  managingPartners  List of CreateManagingPartnerRequest value for
         *         managingPartners.
         * @param  mainAddress  CreateRegisterInformationAddressRequest value for mainAddress.
         */
        public Builder(String email, String document, String type,
                List<CreateRegisterInformationPhoneRequest> phoneNumbers, String companyName,
                String tradingName, int annualRevenue,
                List<CreateManagingPartnerRequest> managingPartners,
                CreateRegisterInformationAddressRequest mainAddress) {
            this.email = email;
            this.document = document;
            this.type = type;
            this.phoneNumbers = phoneNumbers;
            this.companyName = companyName;
            this.tradingName = tradingName;
            this.annualRevenue = annualRevenue;
            this.managingPartners = managingPartners;
            this.mainAddress = mainAddress;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for phoneNumbers.
         * @param  phoneNumbers  List of CreateRegisterInformationPhoneRequest value for
         *         phoneNumbers.
         * @return Builder
         */
        public Builder phoneNumbers(List<CreateRegisterInformationPhoneRequest> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * Setter for tradingName.
         * @param  tradingName  String value for tradingName.
         * @return Builder
         */
        public Builder tradingName(String tradingName) {
            this.tradingName = tradingName;
            return this;
        }

        /**
         * Setter for annualRevenue.
         * @param  annualRevenue  int value for annualRevenue.
         * @return Builder
         */
        public Builder annualRevenue(int annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        /**
         * Setter for managingPartners.
         * @param  managingPartners  List of CreateManagingPartnerRequest value for
         *         managingPartners.
         * @return Builder
         */
        public Builder managingPartners(List<CreateManagingPartnerRequest> managingPartners) {
            this.managingPartners = managingPartners;
            return this;
        }

        /**
         * Setter for mainAddress.
         * @param  mainAddress  CreateRegisterInformationAddressRequest value for mainAddress.
         * @return Builder
         */
        public Builder mainAddress(CreateRegisterInformationAddressRequest mainAddress) {
            this.mainAddress = mainAddress;
            return this;
        }

        /**
         * Setter for siteUrl.
         * @param  siteUrl  String value for siteUrl.
         * @return Builder
         */
        public Builder siteUrl(String siteUrl) {
            this.siteUrl = OptionalNullable.of(siteUrl);
            return this;
        }

        /**
         * UnSetter for siteUrl.
         * @return Builder
         */
        public Builder unsetSiteUrl() {
            siteUrl = null;
            return this;
        }

        /**
         * Setter for corporationType.
         * @param  corporationType  String value for corporationType.
         * @return Builder
         */
        public Builder corporationType(String corporationType) {
            this.corporationType = OptionalNullable.of(corporationType);
            return this;
        }

        /**
         * UnSetter for corporationType.
         * @return Builder
         */
        public Builder unsetCorporationType() {
            corporationType = null;
            return this;
        }

        /**
         * Setter for foundingDate.
         * @param  foundingDate  String value for foundingDate.
         * @return Builder
         */
        public Builder foundingDate(String foundingDate) {
            this.foundingDate = OptionalNullable.of(foundingDate);
            return this;
        }

        /**
         * UnSetter for foundingDate.
         * @return Builder
         */
        public Builder unsetFoundingDate() {
            foundingDate = null;
            return this;
        }

        /**
         * Setter for cnae.
         * @param  cnae  String value for cnae.
         * @return Builder
         */
        public Builder cnae(String cnae) {
            this.cnae = OptionalNullable.of(cnae);
            return this;
        }

        /**
         * UnSetter for cnae.
         * @return Builder
         */
        public Builder unsetCnae() {
            cnae = null;
            return this;
        }

        /**
         * Builds a new {@link CreateRegisterInformationCorporationRequest} object using the set
         * fields.
         * @return {@link CreateRegisterInformationCorporationRequest}
         */
        public CreateRegisterInformationCorporationRequest build() {
            return new CreateRegisterInformationCorporationRequest(email, document, type,
                    phoneNumbers, companyName, tradingName, annualRevenue, managingPartners,
                    mainAddress, siteUrl, corporationType, foundingDate, cnae);
        }
    }
}