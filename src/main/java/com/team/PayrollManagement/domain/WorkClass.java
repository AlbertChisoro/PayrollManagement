package com.team.PayrollManagement.domain;


import com.team.PayrollManagement.domain.requests.CreateClassRequest;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "class")
public class WorkClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "basicPay")
    private BigDecimal basicPay;
    @Column(name = "salary")
    private BigDecimal salary;
    @Column(name = "travelAllowance")
    private BigDecimal travelAllowance;
    @Column(name = "medicalAllowance")
    private BigDecimal medicalAllowance;
    @Column(name = "washingAllowance")
    private BigDecimal washingAllowance;

    public WorkClass(){}

    private WorkClass(String name, BigDecimal basicPay, BigDecimal salary,
                      BigDecimal travelAllowance, BigDecimal medicalAllowance,
                      BigDecimal washingAllowance) {
        this.name = name;
        this.basicPay = basicPay;
        this.salary = salary;
        this.travelAllowance = travelAllowance;
        this.medicalAllowance = medicalAllowance;
        this.washingAllowance = washingAllowance;
    }

    public static WorkClass createEmployeeClass(CreateClassRequest createClassRequest){
        return new WorkClass(
                createClassRequest.getName(),
                createClassRequest.getBasicPay(),
                createClassRequest.getSalary(),
                createClassRequest.getTravelAllowance(),
                createClassRequest.getMedicalAllowance(),
                createClassRequest.getWashingAllowance()
        );
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

    public BigDecimal getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(BigDecimal basicPay) {
        this.basicPay = basicPay;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getTravelAllowance() {
        return travelAllowance;
    }

    public void setTravelAllowance(BigDecimal travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public BigDecimal getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(BigDecimal medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public BigDecimal getWashingAllowance() {
        return washingAllowance;
    }

    public void setWashingAllowance(BigDecimal washingAllowance) {
        this.washingAllowance = washingAllowance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeClass{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", basicPay=").append(basicPay);
        sb.append(", salary=").append(salary);
        sb.append(", travelAllowance=").append(travelAllowance);
        sb.append(", medicalAllowance=").append(medicalAllowance);
        sb.append(", washingAllowance=").append(washingAllowance);
        sb.append('}');
        return sb.toString();
    }
}
