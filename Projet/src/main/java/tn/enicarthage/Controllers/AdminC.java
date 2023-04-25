package tn.enicarthage.Controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Admin;
import tn.enicarthage.entities.Book;
import tn.enicarthage.repositories.AdminRepository;



@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class AdminC {
	@Autowired
	private AdminRepository repo;
	private static final Logger LG = Logger.getLogger(SutilisateurC.class);
    @PostMapping("/login")
	public ResponseEntity<?> loginAdmin(@RequestBody Admin userData) {
    	System.out.println(userData);
    	LG.info("Debut de la methode LoginAdmin()");
		Admin admin= repo.findById(userData.getMailad()).get();
		if(admin.getPasswordad().equals(userData.getPasswordad())) {
			LG.info("Fin de la methode LoginAdmin()");
			return ResponseEntity.ok(admin);
	 	
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
  @GetMapping("/{namead}")
  public Admin getAdminbyName(@PathVariable("namead") String namead)
  {
  	return repo.findByNamead(namead);
  }
  

}
