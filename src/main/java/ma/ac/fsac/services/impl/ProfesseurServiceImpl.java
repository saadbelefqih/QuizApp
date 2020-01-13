package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Professeur;
import ma.ac.fsac.repository.ProfesseurRepository;
import ma.ac.fsac.services.ProfesseurService;

@Slf4j
@Service
public class ProfesseurServiceImpl implements ProfesseurService{
	private ProfesseurRepository professeurRepository;
	@Override
	public Professeur save(Professeur professeur) {
		try {
			if(professeur!=null){return professeurRepository.save(professeur);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Professeur getById(Long idProffesseur) {
		try {
			
			return professeurRepository.getOne(idProffesseur);
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Professeur> getAll() {
		try {
			return professeurRepository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
