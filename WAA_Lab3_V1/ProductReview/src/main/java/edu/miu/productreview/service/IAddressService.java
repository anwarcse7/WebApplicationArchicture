package edu.miu.productreview.service;

import edu.miu.productreview.model.Address;
import java.util.List;
import java.util.Optional;

public interface IAddressService {
    public List<Address> getAllAddress();
    public Optional<Address> getAddressById(int id);
    public Address createAddress(Address address);
    public Address updateAddress(Address address);
    public void deleteAddressById(int id);
}
