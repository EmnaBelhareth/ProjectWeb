package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.enicarthage.entities.*;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {
	


}



