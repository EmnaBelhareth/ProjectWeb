package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Sutilisateur;

public interface SUserServiceI {
	public Sutilisateur ajouterutilisateur(Sutilisateur user);
	
	public List<Sutilisateur> listeutilisateur();
	
	public void deleteutilisateur(String mail);
	
	public void deleteutilisateurById(String mail);

	public List<Sutilisateur> findAllUsers();

	public void deleteutilisateur(int id);

	Sutilisateur UpdateUser(Sutilisateur user, int id);

	public Sutilisateur findutilisateurByMail(String mail);
	
	 

}
