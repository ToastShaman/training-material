package example02;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

public class UserDao {

    public List<Map> userFor(String username) {
        return Lists.<Map>newArrayList(ImmutableMap.builder()
                .put("username", username)
                .put("password", "password")
                .build());
    }
}
