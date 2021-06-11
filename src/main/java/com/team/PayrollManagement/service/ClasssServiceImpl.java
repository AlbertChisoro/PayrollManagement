package com.team.PayrollManagement.service;

import com.team.PayrollManagement.domain.WorkClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import com.team.PayrollManagement.persistance.ClassRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClasssServiceImpl implements ClassService{

    private final ClassRepository classRepository;

    public ClasssServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public ResponseEntity createClass(CreateClassRequest createClassRequest) {
        if (classRepository.existsWorkClassByName(createClassRequest.getName()))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("class already exists");
        WorkClass workClass = WorkClass.createEmployeeClass(createClassRequest);
        return ResponseEntity.ok(classRepository.save(workClass));
    }

    @Override
    public ResponseEntity updateClass(Long id, CreateClassRequest createClassRequest) {
        Optional<WorkClass> workClass=classRepository.findById(id);
        if (workClass.isPresent()){
            workClass.get().setName(createClassRequest.getName());
            workClass.get().setSalary(createClassRequest.getSalary());
            return ResponseEntity.ok(classRepository.save(workClass.get()));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Class not found");
    }

    @Override
    public ResponseEntity findClass(Long id) {
        return null;
    }

    @Override
    public ResponseEntity deleteClass(Long id) {
        return null;
    }

    @Override
    public ResponseEntity findAllClasses(Pageable pageable) {
        return null;
    }
}
