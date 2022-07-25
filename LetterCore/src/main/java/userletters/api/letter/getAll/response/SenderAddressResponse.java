package userletters.api.letter.getAll.response;

public class SenderAddressResponse {

    private String postcodeResponse;
    private String cityResponse;
    private String buildingNumberResponse;
    private String flatNumberResponse;

    public String getPostcodeResponse() {
        return postcodeResponse;
    }

    public void setPostcodeResponse(String postcodeResponse) {
        this.postcodeResponse = postcodeResponse;
    }

    public String getCityResponse() {
        return cityResponse;
    }

    public void setCityResponse(String cityResponse) {
        this.cityResponse = cityResponse;
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


