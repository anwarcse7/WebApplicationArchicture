package edu.miu.productreview.repository;

import edu.miu.productreview.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends CrudRepository<Users, Integer> {

}
