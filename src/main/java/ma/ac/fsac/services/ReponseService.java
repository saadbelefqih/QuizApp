package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Reponse;

public interface ReponseService {
	public Reponse save(Reponse reponse);
	public Reponse getById(Long idReponse);
	public List<Reponse> getAll();

}
