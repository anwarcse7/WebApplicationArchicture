package edu.miu.productreview.controller;

import edu.miu.productreview.model.Address;
import edu.miu.productreview.model.Category;
import edu.miu.productreview.service.IAddressService;
import edu.miu.productreview.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @GetMapping
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable int id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress( @RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping
    public Address updateAddress(@RequestBody Address address) {
        return addressService.updateAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable int id) {
        addressService.deleteAddressById(id);
    }
}
