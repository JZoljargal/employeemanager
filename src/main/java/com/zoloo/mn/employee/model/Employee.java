package com.zoloo.mn.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @NotNull(message = "Name may not be null")
    @NotBlank(message = "Name may not be blank")
    @Column(name = "name")
    private String name;

    @NotNull(message = "Email may not be null")
    @NotBlank(message = "Email may not be blank")
    @Column(name = "email")
    private String email;

    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "phone")
    private String phone;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "employee_code")
    private String employeeCode;

}
