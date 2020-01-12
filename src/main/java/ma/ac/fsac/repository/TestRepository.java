package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Test;

public interface TestRepository extends JpaRepository<Test, Long>{

}
