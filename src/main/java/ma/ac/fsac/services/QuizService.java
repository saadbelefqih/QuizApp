package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Quiz;

public interface QuizService {
	public Quiz save(Quiz quiz);
	public Quiz getById(Long idQuiz);
	public List<Quiz> getAll();
	

}
