package userletters.api.letter.addLetter.request;

import javax.validation.constraints.NotBlank;

public class InformationRequest {

    @NotBlank
    private int size;
    @NotBlank
    private TypeRequest typeRequest;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TypeRequest getType2() {
        return typeRequest;
    }

    public void setType2(TypeRequest typeRequest) {
        this.typeRequest = typeRequest;
    }
}

