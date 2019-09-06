package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

import entity.Employee;

@Repository
public interface EmployeeRepo  extends CrudRepository<Employee, Long>{
	
	EmployeeCreateResponse createEmployee()
	
}
