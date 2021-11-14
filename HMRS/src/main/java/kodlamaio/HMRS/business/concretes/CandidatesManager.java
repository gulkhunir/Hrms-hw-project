package kodlamaio.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HMRS.business.abstracts.CandidatesService;
import kodlamaio.HMRS.dataAccess.abstracts.CandidatesDao;
import kodlamaio.HMRS.entities.concretes.Candidates;
@Service
public class CandidatesManager implements CandidatesService{
	private CandidatesDao candidateDao;
	@Autowired
	public CandidatesManager(CandidatesDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	@Override
	public List<Candidates> getAll() {
		return this.candidateDao.findAll();
	}

}
