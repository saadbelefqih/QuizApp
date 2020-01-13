package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Classe;

public interface ClasseService {
	public Classe save(Classe classe);
	public Classe getById(Long idClasse);
	public List<Classe> getAll();

}
