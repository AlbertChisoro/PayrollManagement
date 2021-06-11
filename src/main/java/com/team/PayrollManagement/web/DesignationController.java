package com.team.PayrollManagement.web;

import com.team.PayrollManagement.domain.parameters.Designation;
import com.team.PayrollManagement.domain.requests.DesignationRequest;
import com.team.PayrollManagement.service.DesignationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.InvalidClassException;
import java.util.List;

@Controller
@RequestMapping("v1/designation/")
public class DesignationController {
    private final DesignationService designationService;

    public DesignationController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @PostMapping("")
    public Designation createDesignation(@RequestBody DesignationRequest designationRequest) throws InvalidClassException {
        return designationService.createDesignation(designationRequest);
    }

    @GetMapping("")
    public List<Designation> getDestinations(){
        return designationService.getDesignations();
    }
}
