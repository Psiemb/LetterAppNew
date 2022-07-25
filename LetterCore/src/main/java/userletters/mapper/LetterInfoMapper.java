package userletters.mapper;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import userletters.api.letter.getAll.response.*;
import userletters.dao.entity.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class LetterInfoMapper {

    public LetterInfo mapToResponse(List<Letter> letters) {
        if (CollectionUtils.isEmpty(letters)) {
            return null;
        }

        List<LetterResponse> letterResponse = letters.stream()
                .filter(Objects::nonNull)
                .map(this::toLetterResponse)
                .collect(Collectors.toList());

        LetterInfo letterInfo = new LetterInfo();
        letterInfo.setLetterResponses(letterResponse);
        letterInfo.setQuantity(letterResponse.size());

        return letterInfo;

    }

    public LetterResponse toLetterResponse(Letter letter) {

        if(Objects.isNull(letter) || Objects.isNull(letter.getSender()) || Objects.isNull(letter.getSenderAddress())
                || Objects.isNull(letter.getReceiver()) || Objects.isNull(letter.getReceiverAddress()) || Objects.isNull(letter.getCreatedAt())
                || Objects.isNull(letter.getUpdatedAt()) ){

            return null;
        }

        Sender sender = letter.getSender();

        SenderResponse senderResponse = new SenderResponse();
        senderResponse.setSurnameResponse(sender.getSurname());
        senderResponse.setPhoneNumberResponse(sender.getPhoneNumber());
        senderResponse.setEmailResponse(sender.getEmail());


        SenderAddress senderAddress = letter.getSenderAddress();

        SenderAddressResponse senderAddressResponse = new SenderAddressResponse();
        senderAddressResponse.setBuildingNumberResponse(senderAddress.getBuildingNumber());
        senderAddressResponse.setCityResponse(senderAddress.getCity());
        senderAddressResponse.setFlatNumberResponse(senderAddress.getFlatNumber());
        senderAddressResponse.setPostcodeResponse(senderAddress.getPostcode());


        Receiver receiver = letter.getReceiver();

        ReceiverResponse receiverResponse = new ReceiverResponse();
        receiverResponse.setNameResponse(receiver.getName());
        receiverResponse.setSurnameResponse(receiver.getSurname());
        receiverResponse.setEmailResponse(receiver.getEmail());
        receiverResponse.setPhoneNumberResponse(receiver.getPhoneNumber());


        ReceiverAddress receiverAddress = letter.getReceiverAddress();

        ReceiverAddressResponse receiverAddressResponse = new ReceiverAddressResponse();
        receiverAddressResponse.setBuildingNumberResponse(receiverAddress.getBuildingNumber());
        receiverAddressResponse.setCityResponse(receiverAddress.getCity());
        receiverAddressResponse.setFlatNumberResponse(receiverAddress.getFlatNumber());
        receiverAddressResponse.setPostCodeResponse(receiverAddress.getPostCode());


        CreatedAt createdAt = letter.getCreatedAt();

        CreatedAtResponse createdAtResponse = new CreatedAtResponse();
        createdAtResponse.setCreateDateResponse(createdAt.getCreateDate());


        UpdatedAt updatedAt = letter.getUpdatedAt();

        UpdatedAtResponse updatedAtResponse = new UpdatedAtResponse();
        updatedAtResponse.setUpdateDateResponse(updatedAt.getUpdateDate());


        Information information = letter.getInformation();

        InformationResponse informationResponse = new InformationResponse();
        informationResponse.setSizeResponse(information.getSize());
//        informationResponse.setTypeResponse(information.);

        LetterResponse letterResponse = new LetterResponse();
        letterResponse.setId(letter.getId());
        letterResponse.setSenderResponse(senderResponse);
        letterResponse.setSenderAddressResponse(senderAddressResponse);
        letterResponse.setReceiverResponse(receiverResponse);
        letterResponse.setReceiverAddressResponse(receiverAddressResponse);
        letterResponse.setCreatedAtResponse(createdAtResponse);
        letterResponse.setUpdatedAtResponse(updatedAtResponse);
        letterResponse.setInformationResponse(informationResponse);

        return letterResponse;
    }
}
