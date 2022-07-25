package userletters.api.letter.getAll.response;

import java.util.Date;

public class CreatedAtResponse {
    private Date createDateResponse = new Date();

    public Date getCreateDateResponse() {
        return createDateResponse;
    }

    public void setCreateDateResponse(Date createDateResponse) {
        this.createDateResponse = createDateResponse;
    }
}

