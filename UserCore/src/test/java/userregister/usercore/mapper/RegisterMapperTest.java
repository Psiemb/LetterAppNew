package userregister.usercore.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userregister.usercore.dao.entity.Register;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RegisterMapperTest {

    private RegisterMapper registerMapper;

    @BeforeEach
    void setUP() {
        this.registerMapper = new RegisterMapper();
    }

    @Test
    void checkIfWorkingWhenHappyPath() {
        //when
        Register result = registerMapper.getRegister("r23231", "21321");

        //then
        assertEquals("r23231", result.getPhoneNumber());
        assertEquals("21321", result.getCode());
    }

    @Test
    void shouldReturnNullWhenNumberIsNull() {

        //when
        Register result = registerMapper.getRegister(null, "wer");

        //then
        assertNull(result);
    }

    @Test
    void shouldReturnNullWhenCodeIsNull() {

        //when
//        Register result = registerMapper.getRegister("dsf", null);

        //then
//        assertEquals(null, result.getCode());

        //when
        Register result = registerMapper.getRegister("dsf", null);

        //then
        assertNull(result);
    }
    @Test
    void shouldReturnNullWhenNumberAndCodeIsNull() {

        //when
        Register result = registerMapper.getRegister(null, null);

        //then
        assertNull(result);
    }
}