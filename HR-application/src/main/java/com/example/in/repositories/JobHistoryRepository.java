package com.example.in.repositories;
import com.example.in.entities.JobHistory;
import com.example.in.entities.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface JobHistoryRepository extends JpaRepository<JobHistory,JobHistoryId> {
    List<JobHistory> findByIdEmployeeId(BigDecimal employeeId);

}
