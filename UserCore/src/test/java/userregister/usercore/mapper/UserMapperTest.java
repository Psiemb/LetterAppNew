package userregister.usercore.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userregister.usercore.dao.entity.User;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private UserMapper userMapper;

    @BeforeEach
    void setUp(){
        this.userMapper = new UserMapper();
    }

    @Test
    void checkIfWorkingWhenHappyPath(){

        //when
        User user = userMapper.getUser("123456789", "1234567899");

        //then
        assertEquals("123456789", user.getPhoneNumber());
        assertEquals("1234567899", user.getRefreshedToken());
    }

    @Test
    void shouldReturnNullIfPhoneNumberIsNull(){

        //when
        User user = userMapper.getUser(null, "1234567899");

        //then
        assertNull(user);
    }

    @Test
    void shouldReturnNullIfRefreshTokenIsNull(){

        //when
        User user = userMapper.getUser("123456789", null);

        //then
//        assertEquals("123456789",user.getPhoneNumber());
        assertNull(user);
    }

    @Test
    void shouldReturnNullIfPhoneNumberAndRefreshTokenIsNull(){

        //when
        User result = userMapper.getUser(null, null);

        //then
        assertNull(result);
    }
}

