package userletters.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UpdatedAt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date updateDate;

    @OneToOne(mappedBy = "updatedAt")
    private Letter letter;

    public UpdatedAt() {
    }

    public UpdatedAt(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
