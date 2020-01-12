package ma.ac.fsac.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;

@Entity
@DiscriminatorValue("PROF")
@EqualsAndHashCode(callSuper=true)
public class Professeur extends User{
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="professeur")
	private List<Cours> cours;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="propretaire")
	private List<Quiz> questionnairesRealiser;
	
	@ManyToMany(mappedBy = "professeurs", fetch = FetchType.LAZY)
	private List<Classe> classes;


}
