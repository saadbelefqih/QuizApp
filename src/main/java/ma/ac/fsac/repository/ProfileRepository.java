package ma.ac.fsac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ac.fsac.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
