package com.opeoluwa.Spring.Login.Security.dto;

import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
