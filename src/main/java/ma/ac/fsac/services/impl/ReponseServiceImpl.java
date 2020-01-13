package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Reponse;
import ma.ac.fsac.repository.ReponseRepository;
import ma.ac.fsac.services.ReponseService;
@Slf4j
@Service
public class ReponseServiceImpl implements ReponseService{
	@Autowired
	private ReponseRepository reponseRepository;

	@Override
	public Reponse save(Reponse reponse) {
		try {
			if(reponse!=null){return reponseRepository.save(reponse);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Reponse getById(Long idReponse) {
		try {return reponseRepository.getOne(idReponse);}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Reponse> getAll() {
		try {return reponseRepository.findAll();}
		catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
