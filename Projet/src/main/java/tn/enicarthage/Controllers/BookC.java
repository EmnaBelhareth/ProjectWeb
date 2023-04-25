package tn.enicarthage.Controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Book;
import tn.enicarthage.repositories.BookRepository;
import tn.enicarthage.repositories.SUserRepository;
import tn.enicarthage.services.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins="http://localhost:4200")
public class BookC {
	@Autowired
	private BookRepository repo;
	@Autowired
	private SUserRepository repou;
	
	@Autowired
	private BookService bookserv;
	   private static final Logger LG = Logger.getLogger(SutilisateurC.class);
	    @GetMapping("")
	    public ResponseEntity<List<Book>> getAllBooks()
	    {
	    	LG.info("Début de la méthode getAllBooks(): ");
	    	List<Book> books=bookserv.findAllBooks();
	    	LG.info("fin de la méthode getAllBooks(): ");
	    	
	    	return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	    }
	    @PostMapping
	    public ResponseEntity<List<Book>> addbook(@RequestBody Book userData){
	    	Book newbook = bookserv.ajouterbook(userData);
	    	return new ResponseEntity<List<Book>>(HttpStatus.CREATED);
	    }
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<List<Book>> deletebook(@PathVariable("id") int id){
	      bookserv.deletebook(id);
	    	return new ResponseEntity<>(HttpStatus.OK);
	    }
        @PutMapping("/update/{id}")
        public Book  updatebook(@RequestBody Book userData, @PathVariable("id") int id) {
        	return bookserv.UpdateBook(userData, id);
         }
        @GetMapping("/search/{id}")
        public Book getBookbyId(@PathVariable("id") int id)
        {
        	return bookserv.findbookById(id);
        }
        @GetMapping("/status/{status}")
        public  List<Book> getbookByStatus (@PathVariable("status") String status)
        {
			return bookserv.findAllBooksbyStatut(status);
        	
        }
      /* @GetMapping("/listbooks/[:id]")
        public  List<Book> getlistbooks (@PathVariable("reservedByUser.id") int idb)
        {
			return repo.findAllByReservedByUser(idb);
        	
        }*/
       /*@GetMapping("/Mybooks/{userId}")
       public ResponseEntity<List<Book>> getAllBooksByIdUser(@PathVariable(value = "userId") int id) {
    	    if (!repou.existsById(id)) {
    	      System.out.println("Not found Tutorial with this id" );
    	    }
    	    List<Book> books = repo.findByUserIdyser(id);
    	    return new ResponseEntity<>(books, HttpStatus.OK);
    	  }*/
        
       }




