package userregister.usercore.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp(){
        this.validator = new Validator();
    }

    @Test
    public void checkIfWorkingWhenHappyPath(){
        assertTrue(validator.validatePhoneNumber("332444555"));

        //when
//        boolean result = validator.validatePhoneNumber("332444555");

        //then
//        assertTrue(result);
    }

    @Test
    public void checkIfNullWhenStringISNull(){
        assertFalse(validator.validatePhoneNumber(null));
    }
    @Test
    public void checkIfFalseWhenStringIsMoreDigits(){

        //when
        boolean result = validator.validatePhoneNumber("232123111111");

        //then
        assertFalse(result);
    }
    @Test
    public void checkIfFalseWhenStringIsLessDigits(){

        //when
        boolean result = validator.validatePhoneNumber("23212");

        //then
        assertFalse(result);
    }

}

