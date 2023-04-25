package tn.enicarthage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.enicarthage.entities.Contact;
import tn.enicarthage.repositories.ContactRepository;
import tn.enicarthage.services.ContactServiceI;

@RestController
@RequestMapping("/contact")
@CrossOrigin(origins="http://localhost:4200")

public class ContactC {
	@Autowired
	private ContactRepository rep;
	@Autowired
	private ContactServiceI is;
	/*@GetMapping("") 
	public List<contact> getContact(){
		return (List<contact>) rep.findAll();
		
	}*/
	@GetMapping("")
    public ResponseEntity<List<Contact>> getAllcontacts()
    {
    	List<Contact> contacts=is.findAllcontact();
    	return new ResponseEntity<List<Contact>>(contacts,HttpStatus.OK);
    }
	@PostMapping("/add")
	public void addcontact(@RequestBody Contact con) {
		is.addcontact(con);
	}
	@PutMapping ("/update/{id}")
	public Contact updatecontact(@RequestBody Contact con,@PathVariable("id") int id) {
		return is.updatecontact(con, id);
	}
	
	  @DeleteMapping("/delete/{id}")
	    public ResponseEntity<List<Contact>> deletecontact(@PathVariable("id") int id){
	      is.deletecontact(id);
	    	return new ResponseEntity<>(HttpStatus.OK);
	    }
}