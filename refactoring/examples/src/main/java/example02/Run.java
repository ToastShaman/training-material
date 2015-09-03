package example02;

import com.google.common.base.Optional;

public class Run {

    public static void main(String[] args) {
        final Optional<User> login = new LoginService().login("username", "password");
        if (login.isPresent()) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
