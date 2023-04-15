package repo;

import Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Addressrepository extends JpaRepository<Address,Integer> {

}
