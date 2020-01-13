package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Etudiant;

public interface EtudiantService {
	public Etudiant save(Etudiant etudiant);
	public Etudiant getById(Long idEtudiant);
	public List<Etudiant> getAll();

}
