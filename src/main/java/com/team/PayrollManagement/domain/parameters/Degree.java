package com.team.PayrollManagement.domain.parameters;

import com.team.PayrollManagement.domain.requests.DegreeRequest;

import javax.persistence.*;

@Entity(name = "degree")
public class Degree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public Degree(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Degree createDegree(DegreeRequest degreeRequest){
        return new Degree(
                degreeRequest.getName(),
                degreeRequest.getDescription()
        );
    }
}
