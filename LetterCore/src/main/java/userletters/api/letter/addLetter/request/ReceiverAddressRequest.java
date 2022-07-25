package userletters.api.letter.addLetter.request;

import javax.validation.constraints.NotBlank;

public class ReceiverAddressRequest {

    @NotBlank
    private String postCode;
    @NotBlank
    private String city;
    @NotBlank
    private String street;
    @NotBlank
    private String buildingNumber;
    @NotBlank
    private String flatNumber;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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



