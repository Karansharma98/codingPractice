package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    private String city;
    @Id
    private String postalCode;
    private String streetName;
    private String province;
    private String country;
}
