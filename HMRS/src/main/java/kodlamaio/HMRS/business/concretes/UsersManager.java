package kodlamaio.HMRS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HMRS.business.abstracts.UsersService;
import kodlamaio.HMRS.dataAccess.abstracts.UsersDao;
import kodlamaio.HMRS.entities.concretes.Users;
@Service
public class UsersManager implements UsersService{
	private UsersDao usersDao;
	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}
	@Override
	public List<Users> getAll() {
		return this.usersDao.findAll();
	}

}
