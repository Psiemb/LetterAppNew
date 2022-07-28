package userregister.usercore.mapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import userregister.usercore.dao.entity.Register;

import java.util.Date;
import java.util.Objects;

@Component
public class RegisterMapper {

    public Register createRegister(String number, String code) {
        if (StringUtils.isBlank(number) || StringUtils.isBlank(code)) {
            return null;
        }
        return new Register()
            .setCode(code)
            .setPhoneNumber(number)
            .setCreateTime(new Date());
    }
}

