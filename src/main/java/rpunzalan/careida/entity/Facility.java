package rpunzalan.careida.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


public class Facility {

    private String facilityName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

}
