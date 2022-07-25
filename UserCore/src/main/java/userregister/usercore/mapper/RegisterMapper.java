package userregister.usercore.mapper;

import org.springframework.stereotype.Component;
import userregister.usercore.dao.entity.Register;

import java.util.Objects;

@Component
public class RegisterMapper {

    public Register getRegister(String number, String code) {
        if (Objects.isNull(number) || Objects.isNull(code)) {
            return null;
        }
        Register register = new Register();
        register.setCode(code);
        register.setPhoneNumber(number);
        return register;
    }
}

