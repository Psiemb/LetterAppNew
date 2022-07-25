package com.example.getLettersByReceiver;

import java.util.List;

public class LettersByPhoneNumber {

    private List<LetterByPhoneNumber> letterByPhoneNumberList;

    public List<LetterByPhoneNumber> getLetterByPhoneNumberReceiverList() {
        return letterByPhoneNumberList;
    }

    public void setLetterByPhoneNumberReceiverList(List<LetterByPhoneNumber> letterByPhoneNumberList) {
        this.letterByPhoneNumberList = letterByPhoneNumberList;
    }
}