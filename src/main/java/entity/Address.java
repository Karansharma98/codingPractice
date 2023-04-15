package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;
    private String city;

    private String postalCode;
    private String streetName;
    private String province;
    private String country;



}
