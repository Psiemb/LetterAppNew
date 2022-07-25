package userletters.api.letter.getAll.response;

import java.util.List;

public class LetterInfo {

    private List<LetterResponse> letterResponses;
    private int quantity;

    public LetterInfo() {
    }

    public List<LetterResponse> getLetterResponses() {
        return letterResponses;
    }

    public void setLetterResponses(List<LetterResponse> letterResponses) {
        this.letterResponses = letterResponses;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


