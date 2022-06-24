package edu.miu.productreview.service.Impl;

import edu.miu.productreview.model.Users;
import edu.miu.productreview.repository.IUsersRepository;
import edu.miu.productreview.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements IUsersService {
    @Autowired
    IUsersRepository usersRepository;

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) usersRepository.findAll();
    }

    @Override
    public Optional<Users> getUserById(int id) {
        return usersRepository.findById(id);
    }

    @Override
    public Users createUser(Users users) {

        return usersRepository.save(users);
    }

    @Override
    public Users updateUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        usersRepository.deleteById(id);
    }

}
