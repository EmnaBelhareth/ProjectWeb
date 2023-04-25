package tn.enicarthage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import tn.enicarthage.entities.Sutilisateur;

import tn.enicarthage.repositories.SUserRepository;
import tn.enicarthage.services.SUserService;

@SpringBootTest
class SUserServiceTest {
	@Autowired
    private SUserService userv;
	@MockBean
	private SUserRepository urepo;
	@Test
	public void testajouterutilisateur() {
		Sutilisateur user = new Sutilisateur();
		user.setIdyser(5);
		user.setMail("john.doe@gmail.com");
		user.setName("johnDoe");
		user.setDep("Info");
		user.setPassword("123456");
		Mockito.when(urepo.save(user)).thenReturn(user);
		assertThat(userv.ajouterutilisateur(user)).isEqualTo(user);	
	}
	@Test 
	public void testdeleteutilisateur()
	{
		Sutilisateur user = new Sutilisateur();
		user.setIdyser(5);
		user.setMail("john.doe@gmail.com");
		user.setName("johnDoe");
		user.setDep("Info");
		user.setPassword("123456");
		userv.deleteutilisateur("john.doe@gmail.com");
		assertThat(urepo.findByMail("john.doe@gmail.com")).isEqualTo(null);
		
	}
	@Test
	
	public void findutilisateurByMailtest() {
		Sutilisateur user = new Sutilisateur();
		user.setIdyser(5);
		user.setMail("john.doe@gmail.com");
		user.setName("johnDoe");
		user.setDep("Info");
		user.setPassword("123456");
		Mockito.when(urepo.findByMail("john.doe@gmail.com")).thenReturn(user);
		assertThat(userv.findutilisateurByMail("john.doe@gmail.com")).isEqualTo(user);
		
	}
	
	
	}



