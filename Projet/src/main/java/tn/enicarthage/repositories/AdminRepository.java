package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin , String> {

	Admin findByNamead(String namead);


}
