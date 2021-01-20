package rabehi.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rabehi.store.entity.Customer;
import rabehi.store.entity.Region;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}
