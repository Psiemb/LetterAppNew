package userletters.dao.entity;

import javax.persistence.*;

@Entity
public class SenderAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String postcode;
    private String city;
    private String buildingNumber;
    private String flatNumber;

    @OneToOne(mappedBy = "senderAddress")
    private Letter letter;

    public SenderAddress() {
    }

    public SenderAddress(String postcode, String city, String buildingNumber, String flatNumber) {
        this.postcode = postcode;
        this.city = city;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
