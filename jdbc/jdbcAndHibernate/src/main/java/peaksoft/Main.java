package peaksoft;

import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();
      //  userService.createUsersTable();
       // userService.dropUsersTable();
      //  userService.saveUser("Mike","Meyers",(byte) 24);
      //  userService.removeUserById(1L);
        userService.getAllUsers().forEach(System.out::println);
      //  userService.cleanUsersTable();
    }
}
