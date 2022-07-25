package userletters.api.letter.getByPhoneNumber;

import java.util.List;

public class LettersByPhoneNumber {

    private List<LetterByPhoneNumber> letterByPhoneNumberReceiverList;

    public List<LetterByPhoneNumber> getLetterByPhoneNumberReceiverList() {
        return letterByPhoneNumberReceiverList;
    }

    public void setLetterByPhoneNumberReceiverList(List<LetterByPhoneNumber> letterByPhoneNumberReceiverList) {
        this.letterByPhoneNumberReceiverList = letterByPhoneNumberReceiverList;
    }
}



