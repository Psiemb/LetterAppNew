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

    public Register setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Register setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Register setCode(String code) {
        this.code = code;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Register setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Register setUser(User user) {
        this.user = user;
        return this;
    }
}

