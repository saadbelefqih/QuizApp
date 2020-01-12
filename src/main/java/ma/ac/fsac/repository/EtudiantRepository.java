package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
