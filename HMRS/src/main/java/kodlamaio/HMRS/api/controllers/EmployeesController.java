package kodlamaio.HMRS.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HMRS.business.abstracts.EmployeesService;
import kodlamaio.HMRS.entities.concretes.Employees;
@RestController
@RequestMapping("/api/employees")
public class EmployeesController implements EmployeesService{
	private EmployeesController employeeController;
		@Autowired
	public EmployeesController(EmployeesController employeeController) {
		super();
		this.employeeController = employeeController;
	}
	@GetMapping("/getAll")
	public List<Employees> getAll() {
		return this.employeeController.getAll();
	}
}
