package userletters.api.letter.getAll.response;

public class ReceiverAddressResponse {

    private String postCodeResponse;
    private String cityResponse;
    private String streetResponse;
    private String buildingNumberResponse;
    private String flatNumberResponse;

    public String getPostCodeResponse() {
        return postCodeResponse;
    }

    public void setPostCodeResponse(String postCodeResponse) {
        this.postCodeResponse = postCodeResponse;
    }

    public String getCityResponse() {
        return cityResponse;
    }

    public void setCityResponse(String cityResponse) {
        this.cityResponse = cityResponse;
    }

    public String getStreetResponse() {
        return streetResponse;
    }

    public void setStreetResponse(String streetResponse) {
        this.streetResponse = streetResponse;
    }

    public String getBuildingNumberResponse() {
        return buildingNumberResponse;
    }

    public void setBuildingNumberResponse(String buildingNumberResponse) {
        this.buildingNumberResponse = buildingNumberResponse;
    }

    public String getFlatNumberResponse() {
        return flatNumberResponse;
    }

    public void setFlatNumberResponse(String flatNumberResponse) {
        this.flatNumberResponse = flatNumberResponse;
    }
}


