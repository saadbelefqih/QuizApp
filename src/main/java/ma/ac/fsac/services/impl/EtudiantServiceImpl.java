package ma.ac.fsac.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import ma.ac.fsac.entities.Etudiant;
import ma.ac.fsac.repository.EtudiantRepository;
import ma.ac.fsac.services.EtudiantService;
@Slf4j
@Service
public class EtudiantServiceImpl implements EtudiantService{
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Override
	public Etudiant save(Etudiant etudiant) {
		try {
			if(etudiant!=null){return etudiantRepository.save(etudiant);}
			return null;
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public Etudiant getById(Long idEtudiant) {
		try {
			return etudiantRepository.getOne(idEtudiant);
		} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

	@Override
	public List<Etudiant> getAll() {
		try {
			return etudiantRepository.findAll();
					} catch (Exception e) {
			log.error(e.getMessage()+" "+e.toString());
			throw new RuntimeException("ERREUR ! veuillez contacter Administrateur");
		}
	}

}
