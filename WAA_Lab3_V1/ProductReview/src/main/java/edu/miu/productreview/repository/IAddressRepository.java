package edu.miu.productreview.repository;

import edu.miu.productreview.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Integer> {
}
