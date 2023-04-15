package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "emp_address_id")
    private Address empAddress;
    private String emailAddress;
    private String phoneNumber;
    private Long salary;

}
