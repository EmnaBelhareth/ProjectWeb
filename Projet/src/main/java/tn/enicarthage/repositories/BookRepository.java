package tn.enicarthage.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book , Integer> {


	List<Book> findByStatus(String status);

//	List<Book> findByUserIdyser(int id);
	

	

	



	
}
