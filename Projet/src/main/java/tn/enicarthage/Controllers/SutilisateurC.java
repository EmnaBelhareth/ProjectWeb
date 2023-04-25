package tn.enicarthage.Controllers;
import tn.enicarthage.*;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
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
import tn.enicarthage.entities.Sutilisateur;

import tn.enicarthage.repositories.SUserRepository;
import tn.enicarthage.services.SUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class SutilisateurC {
    @Autowired
	private SUserRepository repo;
    @Autowired
    private SUserService userv;
    private static final Logger LG = Logger.getLogger(SutilisateurC.class);
  
    @GetMapping("/login/{login}/{password}")
	  public   ResponseEntity<Sutilisateur> getUtilisateurByLogin(@PathVariable String login,@PathVariable String password) {
    	LG.info("Début de la méthode login (): ");
  		 Sutilisateur Utilisateur = repo.findByMail(login);
  
  		 if(Utilisateur.getPassword().equals(password))
  	 		{LG.info("Fin de la méthode login (): ");
  		   return ResponseEntity.ok().body(Utilisateur);
  	 		}
  		   else
  		 return(ResponseEntity<Sutilisateur>) ResponseEntity.internalServerError();
  	
  		
  		
  		
	  } 
    	
    @GetMapping("")
    public ResponseEntity<List<Sutilisateur>> getAllUsers()
    {
      	
    	List<Sutilisateur> users=userv.listeutilisateur();
    	return new ResponseEntity<List<Sutilisateur>>(users,HttpStatus.OK);
    	
    }
    @PostMapping("/add")
    public ResponseEntity<List<Sutilisateur>> adduser(@RequestBody Sutilisateur userData){
    	LG.info("Début de la méthode adduser(): ");
    	Sutilisateur newuser = userv.ajouterutilisateur(userData);
    	
    	LG.info("Fin de la méthode adduser(): ");
    	return new ResponseEntity<List<Sutilisateur>>(HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<Sutilisateur>> deleteuser(@PathVariable("id") int id){
    	LG.info("Début de la méthode deleteuser(): ");
      userv.deleteutilisateur(id);
      LG.info("Fin de la méthode deleteuser(): ");
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/users/{mail}")
    public ResponseEntity<List<Sutilisateur>> getUser(@PathVariable("mail") String mail)
    {
    	LG.info("Début de la méthode getuser(): ");
    	List<Sutilisateur> users=(List<Sutilisateur>) repo.findByMail(mail);
    	LG.info("Fin de la méthode getuser(): ");
    	return new ResponseEntity<List<Sutilisateur>>(users,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public Sutilisateur  updatebook(@RequestBody Sutilisateur userData, @PathVariable("id") int id) {
    	LG.info("***méthode updateuser():**** ");
    	return userv.UpdateUser(userData, id);
    	
    	
     }
		
}

