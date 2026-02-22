package com.yashd15.idvalidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class IdentityValidatorTest {

    @Test
    void testAadhaar() {
        assertTrue(IdentityValidator.isValidAadhaar("123456789012"));
        assertTrue(IdentityValidator.isValidAadhaar("1234 5678 9012"));
        assertFalse(IdentityValidator.isValidAadhaar("12345678"));
    }

    @Test
    void testPAN() {
        assertTrue(IdentityValidator.isValidPAN("ABCDE1234F"));
        assertTrue(IdentityValidator.isValidPAN("abcde1234f"));
        assertFalse(IdentityValidator.isValidPAN("AB1234567F"));
    }

    @Test
    void testPassport() {
        assertTrue(IdentityValidator.isValidPassport("E1234567"));
        assertFalse(IdentityValidator.isValidPassport("A1234567"));
    }

    @Test
    void testVoterID() {
        assertTrue(IdentityValidator.isValidVoterID("ABCD12345E"));
        assertFalse(IdentityValidator.isValidVoterID("ABC123456E"));
    }

    @Test
    void testDrivingLicense() {
        assertTrue(IdentityValidator.isValidDrivingLicense("DL12345678901234"));
        assertFalse(IdentityValidator.isValidDrivingLicense("DL12345"));
    }
}