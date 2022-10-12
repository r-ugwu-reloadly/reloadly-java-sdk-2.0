/*
 * ReloadlySdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.reloadly.auth.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SenderPhone type.
 */
public class SenderPhone {
    private String countryCode;
    private String number;

    /**
     * Default constructor.
     */
    public SenderPhone() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  number  String value for number.
     */
    public SenderPhone(
            String countryCode,
            String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    /**
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Converts this SenderPhone into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SenderPhone [" + "countryCode=" + countryCode + ", number=" + number + "]";
    }

    /**
     * Builds a new {@link SenderPhone.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SenderPhone.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode, number);
        return builder;
    }

    /**
     * Class to build instances of {@link SenderPhone}.
     */
    public static class Builder {
        private String countryCode;
        private String number;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         * @param  number  String value for number.
         */
        public Builder(String countryCode, String number) {
            this.countryCode = countryCode;
            this.number = number;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Builds a new {@link SenderPhone} object using the set fields.
         * @return {@link SenderPhone}
         */
        public SenderPhone build() {
            return new SenderPhone(countryCode, number);
        }
    }
}
