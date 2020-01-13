package ma.ac.fsac.entities;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_user",discriminatorType=DiscriminatorType.STRING,length=4)
@Data @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
public abstract class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	@Pattern(regexp = "^(Mr|Mme)$", message="civilité invalid")
	private String genre;
	private String nomUser;
	private String prenomUser;
	private String adresse;
	private String photoUser;
	@Column(name = "active", columnDefinition = "boolean default false",nullable=false)
	private Boolean active;
	@Column(name = "connected", columnDefinition = "boolean default false", nullable = false)
	private Boolean connected=false;
	@Column(unique=true)
	@NotNull
	@Email
	private String username;
	@NotNull
	@Size(min=6, message="la langeur doit être supérieur de 6")
    private String password;
	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<Profile> profiles = new ArrayList<>();


}
