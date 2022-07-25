package userletters.dao.entity;

import javax.persistence.*;

@Entity
public class Sender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String surname;
    private String phoneNumber;
    private String email;

//    public Sender(String surname, String phoneNumber, String email) {
//        this.surname = surname;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//    }

    @OneToOne(mappedBy = "sender")
    private Letter letter;

    public Sender() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
