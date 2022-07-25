package userletters.api.letter.addLetter.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ReceiverRequest {

    @NotBlank
    private String surname;

    private String name;
    @NotBlank
    private String phoneNumber;
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



