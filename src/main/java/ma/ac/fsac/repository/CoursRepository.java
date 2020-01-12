package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long>{

}
