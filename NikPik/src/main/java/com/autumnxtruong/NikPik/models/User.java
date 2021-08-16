package com.autumnxtruong.NikPik.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
    String profilePik;

}
