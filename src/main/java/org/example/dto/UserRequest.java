package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "user Firstname should not be null")
    private String Firstname;
    @NotNull(message = "user Lastname should not be null")
    private String Lastname;
    @NotNull
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private long phoneNumber;

}
