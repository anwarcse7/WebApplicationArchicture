package edu.miu.productreview.service.Impl;

import edu.miu.productreview.model.Address;
import edu.miu.productreview.repository.IAddressRepository;
import edu.miu.productreview.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements IAddressService {
    @Autowired
    IAddressRepository addressRepository;

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Optional<Address> getAddressById(int id) {
        return addressRepository.findById(id);
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddressById(int id) {
        addressRepository.deleteById(id);
    }
}
