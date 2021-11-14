package kodlamaio.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HMRS.business.abstracts.EmployeesService;
import kodlamaio.HMRS.dataAccess.abstracts.EmployeesDao;
import kodlamaio.HMRS.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService{
	private EmployeesDao employeesDao;
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}
	@Override
	public List<Employees> getAll() {
		return this.employeesDao.findAll();
	}

}
