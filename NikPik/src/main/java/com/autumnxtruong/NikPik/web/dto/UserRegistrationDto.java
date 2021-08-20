package com.autumnxtruong.NikPik.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegistrationDto {
     String firstName;
     String lastName;
     String email;
     String password;

}