package repo;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoy extends JpaRepository<Employee, String> {
}
