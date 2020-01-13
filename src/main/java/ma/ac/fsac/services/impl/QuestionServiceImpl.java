package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Question;
import ma.ac.fsac.repository.QuestionRepository;
import ma.ac.fsac.services.QuestionService;
@Slf4j
@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionRepository questionRepository;


	@Override
	public Question save(Question question) {
		try {
			if(question!=null){return questionRepository.save(question);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Question getById(Long idQuestion) {
		try {return questionRepository.getOne(idQuestion);}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}
	
	@Override
	public List<Question> getAll() {
		try {return questionRepository.findAll();} 
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}
	

}
