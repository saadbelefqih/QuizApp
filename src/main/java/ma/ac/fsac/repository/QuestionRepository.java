package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
