package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.EmployeeClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import com.team.PayrollManagement.persistance.ClassRepository;
import org.springframework.stereotype.Service;

@Service
public class ClasssServiceImpl implements ClassService{

    private final ClassRepository classRepository;

    public ClasssServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public EmployeeClass createClass(CreateClassRequest createClassRequest) {
        EmployeeClass employeeClass=EmployeeClass.createEmployeeClass(createClassRequest);
        EmployeeClass eclass=classRepository.save(employeeClass);
        return eclass;
    }
}
