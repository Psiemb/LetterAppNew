package mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import userletters.api.letter.getAll.response.LetterInfo;
import userletters.dao.entity.*;
import userletters.mapper.LetterInfoMapper;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterInfoMapperTest {

    private LetterInfoMapper letterInfoMapper;

    @BeforeEach
    void setUp(){
        this.letterInfoMapper = new LetterInfoMapper();
    }

    @Test
    void checkIfResultISOkWhenSurnameIsGiven(){

        //given
        Sender sender = new Sender();
        sender.setSurname("dsfsdf");
        Letter letter = new Letter();
        letter.setSender(sender);
        letter.setSenderAddress(new SenderAddress());
        letter.setReceiver(new Receiver());
        letter.setReceiverAddress(new ReceiverAddress());
        letter.setCreatedAt(new CreatedAt());
        letter.setUpdatedAt(new UpdatedAt());
        letter.setInformation(new Information());
        List<Letter> letters = Arrays.asList(letter);


        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then
        assertEquals("dsfsdf", letterInfo.getLetterResponses().get(0).getSenderResponse().getSurnameResponse());
    }

    @Test
    void checkIfResultIsOkWhenSurnamesIsGiven() {
        //given
        Sender sender = new Sender();
        sender.setSurname("fdfdsf");
        Letter letter = new Letter();
        letter.setSender(sender);

        Sender sender2 = new Sender();
        sender2.setSurname("ewrwer");
        Letter letter2 = new Letter();
        letter2.setSender(sender2);
        List<Letter> letters = Arrays.asList(letter, letter2);

        letter.setSenderAddress(new SenderAddress());
        letter.setReceiver(new Receiver());
        letter.setReceiverAddress(new ReceiverAddress());
        letter.setCreatedAt(new CreatedAt());
        letter.setUpdatedAt(new UpdatedAt());
        letter.setInformation(new Information());

        letter2.setSenderAddress(new SenderAddress());
        letter2.setReceiver(new Receiver());
        letter2.setReceiverAddress(new ReceiverAddress());
        letter2.setCreatedAt(new CreatedAt());
        letter2.setUpdatedAt(new UpdatedAt());
        letter2.setInformation(new Information());

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then

        assertEquals("fdfdsf", letterInfo.getLetterResponses().get(0).getSenderResponse().getSurnameResponse());
        assertEquals("ewrwer", letterInfo.getLetterResponses().get(1).getSenderResponse().getSurnameResponse());
    }

    @Test
    void returnEmptySurnameWhenGivenEmptySurname(){
        //given
        Sender sender = new Sender();
        sender.setSurname("");
        Letter letter = new Letter();
        letter.setSender(sender);
        List<Letter> letters = Arrays.asList(letter);

        letter.setSenderAddress(new SenderAddress());
        letter.setReceiver(new Receiver());
        letter.setReceiverAddress(new ReceiverAddress());
        letter.setCreatedAt(new CreatedAt());
        letter.setUpdatedAt(new UpdatedAt());
        letter.setInformation(new Information());

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then
        assertEquals("", letterInfo.getLetterResponses().get(0).getSenderResponse().getSurnameResponse());
    }
}