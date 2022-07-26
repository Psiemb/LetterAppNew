package userregister.usercore.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phoneNumber;
    private String code;

    private Date createTime;

    @OneToOne(mappedBy = "register")
    private User user;

    public Register() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Register setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }
}

