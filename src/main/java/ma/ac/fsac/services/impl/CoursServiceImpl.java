package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Cours;
import ma.ac.fsac.repository.CoursRepository;
import ma.ac.fsac.services.CoursService;
@Slf4j
@Service
public class CoursServiceImpl implements CoursService{
	
	@Autowired
	private CoursRepository coursRepository;
	

	@Override
	public Cours save(Cours cours) {
		try {
			if(cours!=null){return coursRepository.save(cours);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Cours getbyId(Long idcours) {
		try {
			return coursRepository.getOne(idcours);
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Cours> getAll() {
		try {
			return coursRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
