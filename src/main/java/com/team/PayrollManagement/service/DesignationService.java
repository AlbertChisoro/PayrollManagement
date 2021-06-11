package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.parameters.Designation;
import com.team.PayrollManagement.domain.requests.DesignationRequest;

import java.io.InvalidClassException;
import java.util.List;

public interface DesignationService {

    Designation createDesignation(DesignationRequest designationRequest) throws InvalidClassException;
    Designation updateDesignation(Long id,DesignationRequest designationRequest) throws ClassNotFoundException;
    Designation getDesignation(Long id) throws ClassNotFoundException;
    List<Designation> getDesignations();
    void deleteDesignation(Long id);
}
