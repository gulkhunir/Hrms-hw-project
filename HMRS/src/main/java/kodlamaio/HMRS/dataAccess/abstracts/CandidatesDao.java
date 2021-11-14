package kodlamaio.HMRS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HMRS.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>{

}
