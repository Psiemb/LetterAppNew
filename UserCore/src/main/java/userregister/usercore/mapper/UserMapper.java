package userregister.usercore.mapper;

import org.springframework.stereotype.Component;
import userregister.usercore.dao.entity.User;

import java.util.Objects;

@Component
public class UserMapper {

    public User getUser(String phoneNumber, String refreshToken) {
        if (Objects.isNull(phoneNumber) || Objects.isNull(refreshToken)) {
            return null;
        }
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setRefreshedToken(refreshToken);
        return user;
    }
}

