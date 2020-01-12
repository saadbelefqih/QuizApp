package ma.ac.fsac.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @ToString @AllArgsConstructor
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long profileId;
	@Column(unique=true)
    private String name;

}
