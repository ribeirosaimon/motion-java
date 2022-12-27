package com.saimon.motion.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpDTO {

    private String name;
    private String username;
    private String password;
    private String cpf;
    private String phone;
}
