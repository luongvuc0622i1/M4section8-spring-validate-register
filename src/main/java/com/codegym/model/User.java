package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, max = 45, message = "{error.name.blank}")
    private String firstName;

    @Size(min = 5, max = 45, message = "{error.name.blank}")
    private String lastName;

    @Size(min = 10, max = 10)
    @Pattern(regexp = "^[0]{1}[0-9]{9}$", message = "{error.phone}")
    private String phoneNumber;

    @Min(value = 18, message = "{error.age.under18}")
    @Max(value = 150, message = "{error.age.upto150}")
    private int age;

    @NotEmpty
    @Email
    private String email;

    public User() {
    }

    public User(@Size(min = 5, max = 45) String firstName, @Size(min = 5, max = 45) String lastName, @Size(min = 10, max = 10) @Pattern(regexp = "^[0]{1}[0-9]{9}$") String phoneNumber, @Min(18) @Max(150) int age, @NotEmpty @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
