package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@EnableJpaAuditing
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	
	@RequestMapping("/employee")
	public class SimpleController {
		@Value("${spring.application.name}")
		String appName;

		
		@PostMapping("/createEmployee")
		public String createEmployee(@RequestBody createEmployeeRequest create) {
			
			return ;
		}
		@GetMapping("/find/{id}")
		public Employee findById(@PathVariable Long id)
		{
			employeeService.findById(id);
			
			return 
		}

		
	}
}
