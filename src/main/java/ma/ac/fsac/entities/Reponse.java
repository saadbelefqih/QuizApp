package ma.ac.fsac.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class Reponse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReponse;
	@ToString.Exclude
	@ManyToOne
	private Test test;
	@ToString.Exclude
	@ManyToOne
	private Question question;
	@ToString.Exclude
	@ManyToOne
	private Etudiant etudiant;
	
	@Column(name = "reponse1", columnDefinition = "boolean", nullable = false)
	private Boolean reponse1;
	
	@Column(name = "reponse2", columnDefinition = "boolean", nullable = false)
	private Boolean reponse2;
	
	@Column(name = "reponse3", columnDefinition = "boolean", nullable = false)
	private Boolean reponse3;
	
	@Column(name = "reponse4", columnDefinition = "boolean", nullable = false)
	private Boolean reponse4;

}
