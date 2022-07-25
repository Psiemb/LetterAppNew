package userregister.usercore.utils;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Validator {

    public boolean validatePhoneNumber(String number) {
        return Objects.nonNull(number) && number.length() == 9 && number.matches("\\d{9}");
    }
}
