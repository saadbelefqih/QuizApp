package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Test;
import ma.ac.fsac.repository.TestRepository;
import ma.ac.fsac.services.TestService;
@Slf4j
@Service
public class TestServiceImpl implements TestService{
	
	private TestRepository testRepository;

	@Override
	public Test save(Test test) {
		try {
			if(test!=null){return testRepository.save(test);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Test getByID(Long id) {
		try {return testRepository.getOne(id);}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Test> getAll() {
		try {return testRepository.findAll();}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
