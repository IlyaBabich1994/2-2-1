package hiber.dao;

import hiber.model.*;

import java.util.List;

public interface UserDao {
   void add(User user);
   void add(Car car);
   List<User> listUsers();
   User getUsers(String model, int series);
}
