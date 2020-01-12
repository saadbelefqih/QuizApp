package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
