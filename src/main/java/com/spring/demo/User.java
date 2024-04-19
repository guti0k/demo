package com.spring.demo;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String name;

    private LocalDate dateOfBirth;

    private String address;

    private String phone;
}
