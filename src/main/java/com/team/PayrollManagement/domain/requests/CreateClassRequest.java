package com.team.PayrollManagement.domain.requests;

import javax.persistence.Column;
import java.math.BigDecimal;

public class CreateClassRequest {

    private String name;
    private BigDecimal basicPay;
    private BigDecimal salary;
    private BigDecimal travelAllowance;
    private BigDecimal medicalAllowance;
    private BigDecimal washingAllowance;


    public CreateClassRequest(String name, BigDecimal basicPay, BigDecimal salary,
                              BigDecimal travelAllowance, BigDecimal medicalAllowance,
                              BigDecimal washingAllowance) {
        this.name = name;
        this.basicPay = basicPay;
        this.salary = salary;
        this.travelAllowance = travelAllowance;
        this.medicalAllowance = medicalAllowance;
        this.washingAllowance = washingAllowance;
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
        final StringBuilder sb = new StringBuilder("CreateClassRequest{");
        sb.append("name='").append(name).append('\'');
        sb.append(", basicPay=").append(basicPay);
        sb.append(", salary=").append(salary);
        sb.append(", travelAllowance=").append(travelAllowance);
        sb.append(", medicalAllowance=").append(medicalAllowance);
        sb.append(", washingAllowance=").append(washingAllowance);
        sb.append('}');
        return sb.toString();
    }
}
