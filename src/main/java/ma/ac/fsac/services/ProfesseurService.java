package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Professeur;

public interface ProfesseurService {
	public Professeur save(Professeur professeur);
	public Professeur getById(Long idProffesseur);
	public List<Professeur> getAll();

}
