package com.autumnxtruong.NikPik.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long roleId;
     String roleName;



    public Role(String roleName) {
        super();
        this.roleName = roleName;
    }


}