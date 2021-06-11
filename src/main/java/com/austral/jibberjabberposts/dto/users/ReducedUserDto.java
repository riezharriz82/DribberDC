package com.austral.jibberjabberposts.dto.users;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReducedUserDto {

    private String id;

    private String firstName;

    private String lastName;

    private String username;

    private String email;
}
