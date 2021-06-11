package com.team.PayrollManagement.domain.parameters;

import com.team.PayrollManagement.domain.requests.DesignationRequest;

import javax.persistence.*;

@Entity(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    private Designation(){}

    public Designation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Designation createDesignation(DesignationRequest designationRequest){
        return new Designation(
                designationRequest.getName(),
                designationRequest.getDescription()
        );
    }

    public static Designation updateDesignation(Designation designation,DesignationRequest designationRequest){
        designation.setName(designationRequest.getName());
        designation.setDescription(designation.getDescription());
        return designation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Designation{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
