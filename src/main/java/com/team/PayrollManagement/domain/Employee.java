package com.team.PayrollManagement.domain;

import com.team.PayrollManagement.domain.parameters.Designation;

import javax.persistence.*;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "pinCode",unique = true)
    private Integer pinCode;
    @Embedded
    private ContactDetails contactDetails;
    @OneToOne
    private WorkClass workClass;
    @OneToOne
    private Designation designation;


}
