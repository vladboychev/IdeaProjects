package net.nsd.dmsversion0.repositories;

import net.nsd.dmsversion0.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "empls")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
