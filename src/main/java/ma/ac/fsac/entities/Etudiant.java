package ma.ac.fsac.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@DiscriminatorValue("ETUD")
@EqualsAndHashCode(callSuper=true)
public class Etudiant extends User{
	@ManyToOne
	@ToString.Exclude
	private Classe classe;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="etudiant")
	private List<Reponse> reponses;
	
	


}
