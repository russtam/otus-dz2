package ru.rustam.otus.dz2.models;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;

    @Size(max = 256)
    private String username;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
