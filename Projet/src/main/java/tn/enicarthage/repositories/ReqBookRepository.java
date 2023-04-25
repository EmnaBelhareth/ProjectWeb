package tn.enicarthage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.ReqBook;

@Repository
public interface ReqBookRepository extends CrudRepository<ReqBook, Long>{

}
