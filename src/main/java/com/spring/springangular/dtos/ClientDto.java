package com.spring.springangular.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record ClientDto(@NotNull String name, @NotNull String password, @NotNull @Email String email,@NotNull Double balance) {

}
