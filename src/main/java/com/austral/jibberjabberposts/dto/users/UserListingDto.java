package com.austral.jibberjabberposts.dto.users;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserListingDto {
    List<ReducedUserDto> users;
}
