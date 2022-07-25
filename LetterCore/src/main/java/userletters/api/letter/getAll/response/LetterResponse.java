package userletters.api.letter.getAll.response;

public class LetterResponse {

    private Long id;
    private SenderResponse senderResponse;
    private SenderAddressResponse senderAddressResponse;
    private ReceiverResponse receiverResponse;
    private ReceiverAddressResponse receiverAddressResponse;
    private CreatedAtResponse createdAtResponse;
    private UpdatedAtResponse updatedAtResponse;
    private InformationResponse informationResponse;

    public LetterResponse() {
    }

//    public LetterResponse(SenderResponse senderResponse, SenderAddressResponse senderAddressResponse, ReceiverResponse receiverResponse, ReceiverAddressResponse receiverAddressResponse, CreatedAtResponse createdAtResponse, UpdatedAtResponse updatedAtResponse, InformationResponse informationResponse) {
//        this.senderResponse = senderResponse;
//        this.senderAddressResponse = senderAddressResponse;
//        this.receiverResponse = receiverResponse;
//        this.receiverAddressResponse = receiverAddressResponse;
//        this.createdAtResponse = createdAtResponse;
//        this.updatedAtResponse = updatedAtResponse;
//        this.informationResponse = informationResponse;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SenderResponse getSenderResponse() {
        return senderResponse;
    }

    public void setSenderResponse(SenderResponse senderResponse) {
        this.senderResponse = senderResponse;
    }

    public SenderAddressResponse getSenderAddressResponse() {
        return senderAddressResponse;
    }

    public void setSenderAddressResponse(SenderAddressResponse senderAddressResponse) {
        this.senderAddressResponse = senderAddressResponse;
    }

    public ReceiverResponse getReceiverResponse() {
        return receiverResponse;
    }

    public void setReceiverResponse(ReceiverResponse receiverResponse) {
        this.receiverResponse = receiverResponse;
    }

    public ReceiverAddressResponse getReceiverAddressResponse() {
        return receiverAddressResponse;
    }

    public void setReceiverAddressResponse(ReceiverAddressResponse receiverAddressResponse) {
        this.receiverAddressResponse = receiverAddressResponse;
    }

    public CreatedAtResponse getCreatedAtResponse() {
        return createdAtResponse;
    }

    public void setCreatedAtResponse(CreatedAtResponse createdAtResponse) {
        this.createdAtResponse = createdAtResponse;
    }

    public UpdatedAtResponse getUpdatedAtResponse() {
        return updatedAtResponse;
    }

    public void setUpdatedAtResponse(UpdatedAtResponse updatedAtResponse) {
        this.updatedAtResponse = updatedAtResponse;
    }

    public InformationResponse getInformationResponse() {
        return informationResponse;
    }

    public void setInformationResponse(InformationResponse informationResponse) {
        this.informationResponse = informationResponse;
    }
}


