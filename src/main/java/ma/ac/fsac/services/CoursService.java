package ma.ac.fsac.services;

import java.util.List;

import ma.ac.fsac.entities.Cours;

public interface CoursService {
	public Cours save(Cours cours);
	public Cours getbyId(Long idcours);
	public List<Cours> getAll();
	

}
