package example02;

import java.util.Map;

public class User {

    private final Map data;

    public User(Map data) {
        this.data = data;
    }

    public String getUsername() {
        return (String) data.get("username");
    }

    public String getPassword() {
        return (String) data.get("password");
    }
}
