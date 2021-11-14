package kodlamaio.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HMRS.business.abstracts.EmployersService;
import kodlamaio.HMRS.dataAccess.abstracts.EmployersDao;
import kodlamaio.HMRS.entities.concretes.Employers;
@Service
public class EmployersManager implements EmployersService{
	private EmployersDao employersDao;
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}
	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}

}
