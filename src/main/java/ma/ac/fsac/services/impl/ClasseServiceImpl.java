package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Classe;
import ma.ac.fsac.repository.ClasseRepository;
import ma.ac.fsac.services.ClasseService;
@Slf4j
@Service
public class ClasseServiceImpl implements ClasseService{
	
	@Autowired
	private ClasseRepository classeRepository;

	@Override
	public Classe save(Classe classe) {
		try{
			if(classe!=null){return classeRepository.save(classe);}
			return null;
			
		}catch(Exception e){
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Classe getById(Long idClasse) {
		try {
			return classeRepository.getOne(idClasse);
			
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Classe> getAll() {
		try {
			return classeRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
