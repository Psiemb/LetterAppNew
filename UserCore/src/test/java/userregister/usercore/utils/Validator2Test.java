package userregister.usercore.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Validator2Test {

    private Validator2 validator2;

    @BeforeEach
    void setUp(){
        this.validator2 = new Validator2();
    }

    @Test
    void checkIfWorkingWhenHappyPathForValidator2(){
        assertTrue(validator2.validatePhoneNumberAndCode("123456789", "123456"));
    }

    @Test
    public void checkIfNullWhenStringsAreNull(){
        assertFalse(validator2.validatePhoneNumberAndCode(null, null));
    }

    @Test
    public void checkIfFalseWhenStringIsMoreDigits(){

        //when
        boolean result = validator2.validatePhoneNumberAndCode("1234567899", "1234567");

        //then
        assertFalse(result);
    }
    @Test
    public void checkIfFalseWhenStringIsLessDigits(){

        //when
        boolean result = validator2.validatePhoneNumberAndCode("12345678", "12345");
        //then
        assertFalse(result);
    }
}