package userletters.api.letter.getAll.response;

import java.util.Date;

public class UpdatedAtResponse {
    private Date updateDateResponse = new Date();

    public Date getUpdateDateResponse() {
        return updateDateResponse;
    }

    public void setUpdateDateResponse(Date updateDateResponse) {
        this.updateDateResponse = updateDateResponse;
    }
}


