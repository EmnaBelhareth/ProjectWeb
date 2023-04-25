package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Sutilisateur;

@Repository
public interface SUserRepository extends CrudRepository<Sutilisateur , Integer> {

	Sutilisateur findByMail(String mail);

	Sutilisateur findSutilsateurByMail(String mail);

	void deleteByMail(String mail);

	Object findByIdyser(int i);

	Sutilisateur getSutilisateurByMail(String mail);


	
}
