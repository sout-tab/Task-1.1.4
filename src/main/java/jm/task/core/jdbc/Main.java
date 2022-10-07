package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Person1", "Personov1", (byte) 18);
        userService.saveUser("Person2", "Personov2", (byte) 20);
        userService.saveUser("Person3", "Personov3", (byte) 22);
        userService.saveUser("Person4", "Personov4", (byte) 24);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
