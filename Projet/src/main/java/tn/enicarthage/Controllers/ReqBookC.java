package tn.enicarthage.Controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Book;
import tn.enicarthage.entities.ReqBook;
import tn.enicarthage.repositories.BookRepository;
import tn.enicarthage.repositories.ReqBookRepository;
import tn.enicarthage.repositories.SUserRepository;
import tn.enicarthage.services.BookService;
import tn.enicarthage.services.ReqBookService;


	@RestController
	@RequestMapping("/Reqbook")
	@CrossOrigin(origins="http://localhost:4200")
	public class ReqBookC {
		@Autowired
		private ReqBookRepository repo;
		@Autowired
		private SUserRepository repou;
		
		@Autowired
		private ReqBookService bookserv;
		   private static final Logger LG = Logger.getLogger(ReqBook.class);
		    @GetMapping("")
		    public ResponseEntity<List<ReqBook>> getAllReqBooks()
		    {
		    	LG.info("Début de la méthode getAllReqBooks(): ");
		    	List<ReqBook> books=bookserv.findAllReqBooks();
		    	LG.info("fin de la méthode getAllReqBooks(): ");
		    	
		    	return new ResponseEntity<List<ReqBook>>(books,HttpStatus.OK);
		    }
		    @PostMapping("")
		    public ResponseEntity<List<ReqBook>> addbook(@RequestBody ReqBook userData){
		    	List<ReqBook> newbook = (List<ReqBook>) bookserv.ajouterbook(userData);
		    	return new ResponseEntity<List<ReqBook>>(HttpStatus.CREATED);
		    }
}
