package userletters.api.letter.getByPhoneNumber;

public class LetterByPhoneNumberReceiver {

    private String surnameReceiver;
    private String nameReceiver;
    private String phoneNumberReceiver;
    private String emailReceiver;

    public String getSurnameReceiver() {
        return surnameReceiver;
    }

    public void setSurnameReceiver(String surnameReceiver) {
        this.surnameReceiver = surnameReceiver;
    }

    public String getNameReceiver() {
        return nameReceiver;
    }

    public void setNameReceiver(String nameReceiver) {
        this.nameReceiver = nameReceiver;
    }

    public String getPhoneNumberReceiver() {
        return phoneNumberReceiver;
    }

    public void setPhoneNumberReceiver(String phoneNumberReceiver) {
        this.phoneNumberReceiver = phoneNumberReceiver;
    }

    public String getEmailReceiver() {
        return emailReceiver;
    }

    public void setEmailReceiver(String emailReceiver) {
        this.emailReceiver = emailReceiver;
    }
}


