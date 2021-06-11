package com.team.PayrollManagement.web;


import com.team.PayrollManagement.domain.WorkClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import com.team.PayrollManagement.service.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/class")
public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping("")
    public ResponseEntity createClass(@RequestBody CreateClassRequest createClassRequest){
        return classService.createClass(createClassRequest);
    }

    @PutMapping("{id}")
    public ResponseEntity updateClass(@PathVariable Long id,@RequestBody CreateClassRequest createClassRequest){
        return classService.updateClass(id, createClassRequest);
    }

}
