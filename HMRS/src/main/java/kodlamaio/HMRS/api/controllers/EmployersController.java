package kodlamaio.HMRS.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HMRS.business.abstracts.EmployersService;
import kodlamaio.HMRS.entities.concretes.Employers;
@RestController
@RequestMapping("/api/employers")
public class EmployersController implements EmployersService{
	@Autowired
	private EmployersController employersController;
	public EmployersController(EmployersController employersController) {
		super();
		this.employersController = employersController;
	}
	@GetMapping("/getAll")
	public List<Employers> getAll() {
		return this.employersController.getAll();
	}
}