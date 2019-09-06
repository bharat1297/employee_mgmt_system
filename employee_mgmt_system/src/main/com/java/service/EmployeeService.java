
public interface EmployeeService {
	

	protected createEmployeeResponse saveEmployee(createEmployeeRequest emp);

	protected updateEmployeeResponse updateEmployee(updateEmployeeRequest emp);

	protected List<readEmployeeResponse> findById(readEmployeeRequest emp);

	protected readEmployeeResponse findByFirstName(readEmployeeRequestByFirstName emp);

	protected readEmployeeResponse findByMobileNumber(readEmployeeRequestByMobileNumber emp);

	protected readEmployeeResponse findByDesignation(readEmployeeRequestByDesignation emp);

	protected deleteEmployeeResponse deleteEmployee(deleteEmployeeRequest emp);


}
