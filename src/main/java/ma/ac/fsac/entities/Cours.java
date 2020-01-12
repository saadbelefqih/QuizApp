package ma.ac.fsac.entities;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Cours {
	private Long idCours;
	private String cheminCours;
	@ToString.Exclude
	@ManyToOne
	private Professeur professeur;


}
