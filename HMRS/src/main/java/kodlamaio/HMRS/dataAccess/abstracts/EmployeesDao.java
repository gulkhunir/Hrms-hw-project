package kodlamaio.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HMRS.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}
