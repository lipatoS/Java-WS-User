package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> users = new HashMap<>();

    static {
        initData();
    }

    private static void initData() {
        User oleg = new User();
        oleg.setName("Oleg");
        oleg.setPhone("111-111");
        oleg.setAge(44);
        oleg.setGender(Gender.MALE);

        users.put(oleg.getName(), oleg);


        User alex = new User();
        alex.setName("Alex");
        alex.setPhone("222-222");
        alex.setAge(20);
        alex.setGender(Gender.MALE);

        users.put(alex.getName(), alex);


        User olga = new User();
        olga.setName("Olga");
        olga.setPhone("333-333");
        olga.setAge(35);
        olga.setGender(Gender.FEMALE);

        users.put(olga.getName(), olga);
    }

    public User findUser(String name) {
        return users.get(name);
    }
}
