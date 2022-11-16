package project.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.departmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
