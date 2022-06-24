package edu.miu.productreview.service;

import edu.miu.productreview.model.Users;

import java.util.List;
import java.util.Optional;

public interface IUsersService {
    public List<Users> getAllUsers();
    public Optional<Users> getUserById(int id);
    public Users createUser(Users users);
    public Users updateUser(Users user);
    public void deleteUserById(int id);
}
