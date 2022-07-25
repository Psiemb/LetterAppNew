package userletters.mapper;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import userletters.api.letter.getByPhoneNumber.LetterByPhoneNumber;
import userletters.api.letter.getByPhoneNumber.LettersByPhoneNumber;
import userletters.api.letter.getByPhoneNumber.LetterByPhoneNumberReceiver;
import userletters.dao.entity.Letter;
import userletters.dao.entity.Receiver;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class LetterByPhoneNumberMapper {

    public LettersByPhoneNumber mapToLetterByPhoneNumberResponse (List<Letter> letters){

        if(CollectionUtils.isEmpty(letters)){
            return null;
        }
        List<LetterByPhoneNumber> letterByPhoneNumbers = letters.stream()
                .filter(Objects::nonNull)
                .map(this::toLetterByPhoneNumber)
                .collect(Collectors.toList());

        LettersByPhoneNumber response = new LettersByPhoneNumber();
        response.setLetterByPhoneNumberReceiverList(letterByPhoneNumbers);

        return response;

    }

    private LetterByPhoneNumber toLetterByPhoneNumber(Letter letter) {

        Receiver receiver = letter.getReceiver();

        LetterByPhoneNumberReceiver letterByPhoneNumberReceiver = new LetterByPhoneNumberReceiver();

        letterByPhoneNumberReceiver.setEmailReceiver(receiver.getEmail());
        letterByPhoneNumberReceiver.setNameReceiver(receiver.getName());
        letterByPhoneNumberReceiver.setPhoneNumberReceiver(receiver.getPhoneNumber());
        letterByPhoneNumberReceiver.setSurnameReceiver(receiver.getSurname());

        LetterByPhoneNumber letterByPhoneNumber = new LetterByPhoneNumber();

        letterByPhoneNumber.setLetterByPhoneNumberReceiver(letterByPhoneNumberReceiver);

        return letterByPhoneNumber;

    }
}

