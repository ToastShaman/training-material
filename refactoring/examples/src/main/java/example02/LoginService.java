package example02;

import com.google.common.base.Optional;

import java.util.List;

public class LoginService {

    private final UserService userService;

    public LoginService() {
        this.userService = new UserService();
    }

    public Optional<User> login(String username, String password) {
        final List<User> users = this.userService.userFor(username);
        if (users.isEmpty() || users.size() > 1) {
            throw new IllegalArgumentException();
        }

        final User user = users.get(0);
        return "password".equals(user.getPassword()) ? Optional.of(user) : Optional.absent();
    }
}
