package com.team.PayrollManagement.web;


import com.team.PayrollManagement.domain.EmployeeClass;
import com.team.PayrollManagement.domain.requests.CreateClassRequest;
import com.team.PayrollManagement.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/class")
public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping("")
    public EmployeeClass createClass(@RequestBody CreateClassRequest createClassRequest){
        return classService.createClass(createClassRequest);
    }
}
