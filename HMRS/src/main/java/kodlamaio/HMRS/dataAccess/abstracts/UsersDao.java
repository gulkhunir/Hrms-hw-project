package kodlamaio.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HMRS.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users,Integer>{

}
