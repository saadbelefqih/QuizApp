package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Quiz;
import ma.ac.fsac.repository.QuizRepository;
import ma.ac.fsac.services.QuizService;
@Slf4j
@Service
public class QuizServiceImpl implements QuizService{
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz save(Quiz quiz) {
		try {
			if(quiz!=null){return quizRepository.save(quiz);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Quiz getById(Long idQuiz) {
		try {return quizRepository.getOne(idQuiz);} 
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Quiz> getAll() {
		try {return quizRepository.findAll();} 
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
