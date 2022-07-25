package userregister.usercore.response;

public class IsLoggedResponse {

    private boolean logged;

    public IsLoggedResponse(boolean logged) {
        this.logged = logged;
    }

    public IsLoggedResponse() {
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
