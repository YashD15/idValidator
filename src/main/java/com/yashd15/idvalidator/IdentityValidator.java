package com.yashd15.idvalidator;

import java.util.regex.Pattern;

public class IdentityValidator {

    // Aadhaar
    /**
    * Validates Aadhaar number format.
    * Accepts 12 digit numeric string (spaces allowed).
    *
    * @param aadhaar input Aadhaar string
    * @return true if format is valid, false otherwise
    */
    public static boolean isValidAadhaar(String aadhaar) {
        if (aadhaar == null) return false;
        aadhaar = aadhaar.replaceAll("\\s+", "");
        return Pattern.matches("^\\d{12}$", aadhaar);
    }

    // PAN
    /**
    * Validates PAN number format.
    * Accepts 19 aplhanumeric string.
    *
    * @param pan input PAN string
    * @return true if format is valid, false otherwise
    */
    public static boolean isValidPAN(String pan) {
        if (pan == null) return false;
        pan = pan.toUpperCase();
        return Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]$", pan);
    }

    // Indian Passport
    /**
    * Validates Passport format.
    * Accepts 8 alphanumeric string.
    *
    * @param passport input Passport string
    * @return true if format is valid, false otherwise
    */
    public static boolean isValidPassport(String passport) {
        if (passport == null) return false;
        passport = passport.toUpperCase();
        return Pattern.matches("^[EPX][0-9]{7}$", passport);
    }

    // Voter ID
    /**
    * Validates Voter ID number format.
    * Accepts 10 alphanumeric string.
    *
    * @param voterId input VoterId string
    * @return true if format is valid, false otherwise
    */
    public static boolean isValidVoterID(String voterId) {
        if (voterId == null) return false;
        voterId = voterId.toUpperCase();
        return Pattern.matches("^[A-Z]{4}[0-9]{5}[A-Z]$", voterId);
    }

    // Driving License
    /**
    * Validates Driving License format.
    * Accepts 16 alphanumeric string.
    *
    * @param license input Driving License string
    * @return true if format is valid, false otherwise
    */
    public static boolean isValidDrivingLicense(String license) {
        if (license == null) return false;
        license = license.toUpperCase();
        return Pattern.matches("^DL[0-9]{14}$", license);
    }
}