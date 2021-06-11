package com.team.PayrollManagement.persistance;

import com.team.PayrollManagement.domain.WorkClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<WorkClass,Long> {

    boolean existsWorkClassByName(String name);
}
