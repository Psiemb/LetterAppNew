package userregister.usercore.request;

public class RequestLogin {

    private String numberParam;
    private String freshTokenParam;

    public RequestLogin() {
    }

    public RequestLogin(String numberParam, String freshTokenParam) {
        this.numberParam = numberParam;
        this.freshTokenParam = freshTokenParam;
    }

    public String getNumberParam() {
        return numberParam;
    }

    public void setNumberParam(String numberParam) {
        this.numberParam = numberParam;
    }

    public String getFreshTokenParam() {
        return freshTokenParam;
    }

    public void setFreshTokenParam(String freshTokenParam) {
        this.freshTokenParam = freshTokenParam;
    }
}
