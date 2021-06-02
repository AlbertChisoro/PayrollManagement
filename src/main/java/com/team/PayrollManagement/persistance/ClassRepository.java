package com.team.PayrollManagement.persistance;

import com.team.PayrollManagement.domain.EmployeeClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<EmployeeClass,Long> {
}
