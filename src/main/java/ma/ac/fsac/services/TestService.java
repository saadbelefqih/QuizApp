package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Test;

public interface TestService {
	public Test save(Test test);
	public Test getByID(Long id);
	public List<Test> getAll();

}
