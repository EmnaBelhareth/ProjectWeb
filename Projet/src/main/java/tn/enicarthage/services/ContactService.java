package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Contact;
import tn.enicarthage.repositories.ContactRepository;
@Service
public class ContactService implements ContactServiceI {
private List <Contact> c;

@Autowired
private ContactRepository rep;



	@Override
	public List<Contact> getcontact() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Contact addcontact(Contact co) {
		return rep.save(co);
		
	}

	@Override
	public Contact updatecontact(Contact co,int id) {
		Contact c2=rep.findById((long) id).get();
		c2.setName(co.getName());
		c2.setEmail(co.getEmail());
		c2.setSubject(co.getSubject());
		c2.setMessage(co.getMessage());
		return rep.save(c2);
		
	}
	

	@Override
	public List<Contact> findAllcontact() {
		// TODO Auto-generated method stub
		return (List<Contact>) rep.findAll();
	}

	@Override
	public void deletecontact(int id) {
		// TODO Auto-generated method stub
		
	}

}

