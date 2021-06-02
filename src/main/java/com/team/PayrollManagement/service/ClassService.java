package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.EmployeeClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import org.springframework.stereotype.Service;

@Service
public interface ClassService {

    EmployeeClass createClass(CreateClassRequest createClassRequest);

}
