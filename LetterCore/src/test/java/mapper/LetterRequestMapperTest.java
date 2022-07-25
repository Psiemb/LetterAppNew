package mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userletters.api.letter.addLetter.request.*;
import userletters.dao.entity.Letter;
import userletters.mapper.LetterRequestMapper;


import static org.junit.jupiter.api.Assertions.assertNull;

class LetterRequestMapperTest {

    private LetterRequestMapper letterRequestMapper;

    @BeforeEach
    void setUp() {
        this.letterRequestMapper = new LetterRequestMapper();
    }


    @Test
    void checkIfResultIsOkWhenSurnameIsGiven() {

        //given
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setSurname2("Wojciech");

        LetterRequest letterRequest = new LetterRequest();
        letterRequest.setSenderRequest(senderRequest);
        letterRequest.setSenderAddressRequest(new SenderAddressRequest());
        letterRequest.setReceiverRequest(new ReceiverRequest());
        letterRequest.setReceiverAddressRequest(new ReceiverAddressRequest());
        letterRequest.setInformationRequest(new InformationRequest());
        letterRequest.setCreatedAtRequest(new CreatedAtRequest());
        letterRequest.setUpdatedAtRequest(new UpdatedAtRequest());

        //when
        Letter result = letterRequestMapper.mapToLetter(letterRequest);

        //Then
        assertEquals("Wojciech", result.getSender().getSurname());
    }

    private void assertEquals(String wojciech, String surname) {
    }

    @Test
    void returnNullWhenLetterRequestIsNull() {

        assertNull(letterRequestMapper.mapToLetter(null));
    }

    @Test
    void returnNullWhenLetterRequestSender2IsNull() {

        //given
        LetterRequest letterRequest = new LetterRequest();
        letterRequest.setSenderRequest(null);

        //when
        Letter letter = letterRequestMapper.mapToLetter(letterRequest);

        //then
        assertNull(letter);
    }

    @Test
    void returnNullWhenLetterRequestSender2Surname2IsNull() {

        //given
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setSurname2(null);
        LetterRequest letterRequest = new LetterRequest();
        letterRequest.setSenderRequest(senderRequest);

        //when
        Letter letter = letterRequestMapper.mapToLetter(letterRequest);

        //then
        assertNull(letter);
    }


}