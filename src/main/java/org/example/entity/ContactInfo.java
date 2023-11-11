package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
public class ContactInfo {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private long phoneNumber;

}
