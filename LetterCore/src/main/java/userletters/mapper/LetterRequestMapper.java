package userletters.mapper;

import org.springframework.stereotype.Component;
import userletters.api.letter.addLetter.request.*;
import userletters.api.letter.getAll.response.LetterResponse;
import userletters.api.letter.getAll.response.ReceiverResponse;
import userletters.api.letter.getAll.response.SenderAddressResponse;
import userletters.api.letter.getAll.response.SenderResponse;
import userletters.api.letter.getById.request.RequestById;
import userletters.api.letter.getByPhoneNumber.RequestByPhoneNumber;
import userletters.dao.entity.*;

import java.util.Objects;

@Component
public class LetterRequestMapper {

    public Letter mapToLetter(LetterRequest letterRequest) {
        if (Objects.isNull(letterRequest) || Objects.isNull(letterRequest.getSenderRequest()) || Objects.isNull(letterRequest.getSenderAddressRequest())
        || Objects.isNull(letterRequest.getReceiverRequest()) || Objects.isNull(letterRequest.getReceiverAddressRequest())
        || Objects.isNull(letterRequest.getCreatedAtRequest()) || Objects.isNull(letterRequest.getUpdatedAtRequest())
                || Objects.isNull(letterRequest.getInformationRequest()))  {
            return null;
        }

        SenderRequest senderRequest = letterRequest.getSenderRequest();

        Sender senderEntity = new Sender();
        senderEntity.setSurname(senderRequest.getSurname2());
        senderEntity.setPhoneNumber(senderRequest.getPhoneNumber2());
        senderEntity.setEmail(senderRequest.getEmail2());

        SenderAddressRequest senderAddressRequest = letterRequest.getSenderAddressRequest();

        SenderAddress senderAddressEntity = new SenderAddress();
        senderAddressEntity.setBuildingNumber((senderAddressRequest.getBuildingNumber()));
        senderAddressEntity.setCity(senderAddressRequest.getCity());
        senderAddressEntity.setFlatNumber(senderAddressRequest.getFlatNumber());
        senderAddressEntity.setPostcode(senderAddressRequest.getPostcode());

        ReceiverRequest receiverRequest = new ReceiverRequest();

        Receiver receiverEntity = new Receiver();
        receiverEntity.setName(receiverRequest.getName());
        receiverEntity.setSurname(receiverRequest.getSurname());
        receiverEntity.setPhoneNumber(receiverRequest.getPhoneNumber());
        receiverEntity.setEmail(receiverRequest.getEmail());

        ReceiverAddressRequest receiverAddressRequest = new ReceiverAddressRequest();

        ReceiverAddress receiverAddressEntity = new ReceiverAddress();
        receiverAddressEntity.setPostCode(receiverAddressRequest.getPostCode());
        receiverAddressEntity.setCity(receiverAddressRequest.getCity());
        receiverAddressEntity.setStreet(receiverAddressRequest.getStreet());
        receiverAddressEntity.setBuildingNumber(receiverAddressRequest.getBuildingNumber());
        receiverAddressEntity.setFlatNumber(receiverAddressRequest.getFlatNumber());

        CreatedAtRequest createdAtRequest = new CreatedAtRequest();

        CreatedAt createdAtEntity = new CreatedAt();
        createdAtEntity.setCreateDate(createdAtRequest.getCreateDate());

        UpdatedAtRequest updatedAtRequest = new UpdatedAtRequest();

        UpdatedAt updatedAtEntity = new UpdatedAt();
        updatedAtEntity.setUpdateDate(updatedAtRequest.getUpdateDate());

        InformationRequest informationRequest = new InformationRequest();

        Information informationEntity = new Information();
        informationEntity.setSize(informationRequest.getSize());
//        informationEntity.setType(information2.getType2());

        Letter letter = new Letter();
        letter.setSender(senderEntity);
        letter.setSenderAddress(senderAddressEntity);
        letter.setReceiver(receiverEntity);
        letter.setReceiverAddress(receiverAddressEntity);
        letter.setCreatedAt(createdAtEntity);
        letter.setUpdatedAt(updatedAtEntity);
        letter.setInformation(informationEntity);

        return letter;
    }

    public LetterResponse mapToLetterResponseById(RequestById requestById){
        if(Objects.isNull(requestById) || requestById.getId()<0){
            return null;
        }

        LetterResponse letterResponse = new LetterResponse();
        letterResponse.setId(requestById.getId());

        return letterResponse;
    }

    public LetterResponse mapToLetterResponseByPhoneNumber(RequestByPhoneNumber requestByPhoneNumber) {
        if(Objects.isNull(requestByPhoneNumber) || requestByPhoneNumber.getPhoneNumber().length() != 9){
            return null;
        }
        String phoneNumber = requestByPhoneNumber.getPhoneNumber();
        LetterResponse letterResponse = new LetterResponse();

        ReceiverResponse receiverResponse = new ReceiverResponse();
        receiverResponse.setPhoneNumberResponse(phoneNumber);
        return letterResponse;
    }
    public Letter mapToLetterByPhoneNumber(RequestByPhoneNumber requestByPhoneNumber) {
        if(Objects.isNull(requestByPhoneNumber) || requestByPhoneNumber.getPhoneNumber().length() != 9){
            return null;
        }
        String phoneNumber = requestByPhoneNumber.getPhoneNumber();
        Letter letter = new Letter();

        ReceiverResponse receiverResponse = new ReceiverResponse();
        receiverResponse.setPhoneNumberResponse(phoneNumber);
        return letter;
    }
}
