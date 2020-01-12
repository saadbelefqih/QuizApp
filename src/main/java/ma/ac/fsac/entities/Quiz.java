package ma.ac.fsac.entities;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idQuiz;
	@NotNull
	@Column(unique=true)
	private String intituleQuiz;
	private String descQuiz;
	@Column(scale=2)
	private Float durree;	
	@Pattern(regexp = "^(Facile|Moyen|Difficile)$", message="niveau invalid")
	private String niveau;
	@ManyToOne
	@ToString.Exclude
	private Professeur propretaire;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="quiz")
	private List<Question> questions;

	

}
