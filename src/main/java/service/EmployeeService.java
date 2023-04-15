package service;

import entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repo.EmployeeRepositoy;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepositoy employeeRepositoy;

    public Employee save(Employee employee) {
        return employeeRepositoy.save(employee);
    }
}
