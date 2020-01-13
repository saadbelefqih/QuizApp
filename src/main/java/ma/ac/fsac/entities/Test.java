package ma.ac.fsac.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTest;
	@ToString.Exclude
	@ManyToOne
	private Classe classe;
	@ToString.Exclude
	@ManyToOne
	private Quiz Quiz;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateTest;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="test")
	private List<Reponse> reponses;

}
