package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Question;

public interface QuestionService {
	public Question save(Question question);
	public Question getById(Long idQuestion);
	public List<Question> getAll();

}
