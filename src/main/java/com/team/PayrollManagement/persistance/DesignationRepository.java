package com.team.PayrollManagement.persistance;

import com.team.PayrollManagement.domain.parameters.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DesignationRepository extends JpaRepository<Designation,Long> {


}
