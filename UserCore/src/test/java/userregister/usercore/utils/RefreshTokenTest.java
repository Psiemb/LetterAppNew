package userregister.usercore.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefreshTokenTest {

    private RefreshToken refreshToken;

    @BeforeEach
    void setUp(){
        this.refreshToken = new RefreshToken();
    }

    @Test
    public void checkIfWorkingWhenHappyPath() {

        //when
        String token = refreshToken.tokenCreator();

        //then
        assertEquals("1234567899", token);
    }
}