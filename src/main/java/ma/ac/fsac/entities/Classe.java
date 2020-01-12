package ma.ac.fsac.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString @AllArgsConstructor @NoArgsConstructor @Data
public class Classe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClasse;
	private String nomClasse;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="classe")
	private List<Etudiant> etudiants;
	@ManyToMany(fetch=FetchType.LAZY)
	 @JoinTable(name = "Classe_PROF",
     joinColumns = {
             @JoinColumn(name = "idClasse", referencedColumnName = "idClasse",
                     nullable = false, updatable = false)},
     inverseJoinColumns = {
             @JoinColumn(name = "idprofesseur", referencedColumnName = "idUser",
                     nullable = false, updatable = false)})
	private List<Professeur> professeurs;

}
