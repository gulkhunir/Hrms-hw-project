package kodlamaio.HMRS.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HMRS.business.abstracts.CandidatesService;
import kodlamaio.HMRS.entities.concretes.Candidates;
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController implements CandidatesService{
	private CandidatesService candidatesService;
		@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
@GetMapping("/getAll")
	public List<Candidates> getAll() {
		return this.candidatesService.getAll();
	}
}
