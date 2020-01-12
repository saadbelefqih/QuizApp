package ma.ac.fsac.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Question {
	private Long idQuestion;
	@ManyToOne
	private Quiz quiz;
	
	private String textQuestion;
	
	private String reponse1;
	@Column(name = "reponse1Istrue", columnDefinition = "boolean default false", nullable = false)
	private Boolean reponse1IsTrue;
	
	private String reponse2;
	@Column(name = "reponse2Istrue", columnDefinition = "boolean default false", nullable = false)
	private Boolean reponse2IsTrue;
	
	private String reponse3;
	@Column(name = "reponse3Istrue", columnDefinition = "boolean default false", nullable = false)
	private Boolean reponse3IsTrue;
	
	private String reponse4;
	@Column(name = "reponse4Istrue", columnDefinition = "boolean default false", nullable = false)
	private Boolean reponse4IsTrue;
	

}
