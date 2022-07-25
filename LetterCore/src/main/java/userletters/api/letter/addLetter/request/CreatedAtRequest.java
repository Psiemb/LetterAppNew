package userletters.api.letter.addLetter.request;

import java.util.Date;

public class CreatedAtRequest {

    private Date createDate = new Date();

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

