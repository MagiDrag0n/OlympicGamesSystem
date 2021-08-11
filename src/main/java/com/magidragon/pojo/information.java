package com.magidragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class information {
    private int id;
    private String name;
    private String sex;
    private String password;
    private String email;
    private String phone;
    private String major;
    private int privilege;
}
