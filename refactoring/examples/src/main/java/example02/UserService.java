package example02;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class UserService {

    private final UserDao db;

    public UserService() {
        this.db = new UserDao();
    }

    public List<User> userFor(String username) {
        return db.userFor(username).stream().map(User::new).collect(toList());
    }
}
