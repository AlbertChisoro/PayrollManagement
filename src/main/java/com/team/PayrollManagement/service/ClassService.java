package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.WorkClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ClassService {

    ResponseEntity createClass(CreateClassRequest createClassRequest);
    ResponseEntity updateClass(Long id,CreateClassRequest  createClassRequest);
    ResponseEntity findClass(Long id);
    ResponseEntity deleteClass(Long id);
    ResponseEntity findAllClasses(Pageable pageable);

}
