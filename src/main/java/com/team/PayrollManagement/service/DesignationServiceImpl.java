package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.parameters.Designation;
import com.team.PayrollManagement.domain.requests.DesignationRequest;
import com.team.PayrollManagement.persistance.DesignationRepository;
import org.springframework.stereotype.Service;

import java.io.InvalidClassException;
import java.util.List;
import java.util.Optional;

@Service
public class DesignationServiceImpl implements DesignationService{
    private final DesignationRepository designationRepository;

    public DesignationServiceImpl(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    @Override
    public Designation createDesignation(DesignationRequest designationRequest) throws InvalidClassException {
        try {
            Designation designation=Designation.createDesignation(designationRequest);
            return designationRepository.save(designation);
        }catch (Exception exception){
            throw new InvalidClassException("Cannot create Designation");
        }

    }

    @Override
    public Designation updateDesignation(Long id, DesignationRequest designationRequest) throws ClassNotFoundException {
        Designation designation=getDesignation(id);
        designation=Designation.updateDesignation(designation,designationRequest);
        return designationRepository.save(designation);
    }

    @Override
    public Designation getDesignation(Long id) throws ClassNotFoundException {
        Optional<Designation> designation= designationRepository.findById(id);
        if (designation.isEmpty()){
            throw new ClassNotFoundException("Designation with provided id not found");
        }
        return designation.get();
    }

    @Override
    public List<Designation> getDesignations() {
        return designationRepository.findAll();
    }

    @Override
    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }
}
