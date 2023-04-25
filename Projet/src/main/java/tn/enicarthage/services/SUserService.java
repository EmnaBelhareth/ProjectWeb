package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Sutilisateur;
import tn.enicarthage.repositories.SUserRepository;


@Service
public class SUserService implements SUserServiceI {
	@Autowired
	SUserRepository usrepo;

	@Override
	public Sutilisateur ajouterutilisateur(Sutilisateur user) {
		return usrepo.save(user);
		
	}

	@Override
	public List<Sutilisateur> listeutilisateur() {
		
		List<Sutilisateur> lu = (List<Sutilisateur>) usrepo.findAll();
		
		return lu;
	
	}
	@Override
	public Sutilisateur UpdateUser(Sutilisateur user, int id) {
		Sutilisateur user2= usrepo.findById(id).get();
		user2.setMail(user.getMail());
		user2.setName(user.getName());
		user2.setPassword(user.getPassword());
		user2.setDep(user.getDep());
		return usrepo.save(user2);

	}



	@Override
	public void deleteutilisateurById(String mail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sutilisateur findutilisateurByMail(String mail) {
		return usrepo.findByMail(mail);
	}

	@Override
	public List<Sutilisateur> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteutilisateur(int id) {
		usrepo.deleteById(id);
		
	}

	@Override
	public void deleteutilisateur(String mail) {
		// TODO Auto-generated method stub
		
	}



	
	/*@Override
	public List<Sutilisateur> findAllUsers(){
		return (List<Sutilisateur>) usrepo.findAll();
	}


	@Override
	public void deleteutilisateurById(String mail) {
		// TODO Auto-generated method stub
		
	}*/

	
	}
	


