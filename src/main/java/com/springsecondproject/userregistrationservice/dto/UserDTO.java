package com.springsecondproject.userregistrationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDTO {

    private String email;
    private String dateOfBirth;
    private String mobileNumber;

//    {
//        "email": "Seelan.Pandiyan@gmail.com",
//        "dateOfBirth": "07-18-1987",
//        "mobileNumber": "2066181181"
//    }



}
