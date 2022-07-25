package userletters.api.letter.addLetter.request;

import javax.validation.constraints.NotNull;

public class LetterRequest {

    private Long id;
    @NotNull
    private SenderRequest senderRequest;
    @NotNull
    private SenderAddressRequest senderAddressRequest;
    @NotNull
    private ReceiverRequest receiverRequest;
    @NotNull
    private ReceiverAddressRequest receiverAddressRequest;
    @NotNull
    private CreatedAtRequest createdAtRequest;

    private UpdatedAtRequest updatedAtRequest;

    private InformationRequest informationRequest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SenderRequest getSenderRequest() {
        return senderRequest;
    }

    public void setSenderRequest(SenderRequest senderRequest) {
        this.senderRequest = senderRequest;
    }

    public SenderAddressRequest getSenderAddressRequest() {
        return senderAddressRequest;
    }

    public void setSenderAddressRequest(SenderAddressRequest senderAddressRequest) {
        this.senderAddressRequest = senderAddressRequest;
    }

    public ReceiverRequest getReceiverRequest() {
        return receiverRequest;
    }

    public void setReceiverRequest(ReceiverRequest receiverRequest) {
        this.receiverRequest = receiverRequest;
    }

    public ReceiverAddressRequest getReceiverAddressRequest() {
        return receiverAddressRequest;
    }

    public void setReceiverAddressRequest(ReceiverAddressRequest receiverAddressRequest) {
        this.receiverAddressRequest = receiverAddressRequest;
    }

    public CreatedAtRequest getCreatedAtRequest() {
        return createdAtRequest;
    }

    public void setCreatedAtRequest(CreatedAtRequest createdAtRequest) {
        this.createdAtRequest = createdAtRequest;
    }

    public UpdatedAtRequest getUpdatedAtRequest() {
        return updatedAtRequest;
    }

    public void setUpdatedAtRequest(UpdatedAtRequest updatedAtRequest) {
        this.updatedAtRequest = updatedAtRequest;
    }

    public InformationRequest getInformationRequest() {
        return informationRequest;
    }

    public void setInformationRequest(InformationRequest informationRequest) {
        this.informationRequest = informationRequest;
    }
}


