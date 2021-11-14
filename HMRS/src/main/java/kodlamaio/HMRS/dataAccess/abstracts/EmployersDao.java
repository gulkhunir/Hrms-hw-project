package kodlamaio.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HMRS.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers,Integer>{

}
