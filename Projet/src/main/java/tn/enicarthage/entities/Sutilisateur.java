package tn.enicarthage.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@DiscriminatorValue("Sutilisateur")

@Entity
//@PrimaryKeyJoinColumn(name = "Utilisateur_ID" )
//@PrimaryKeyJoinColumn(name = "Utilisateur_Mail" )
@Table(name = "T_Sutilisateur")
public class Sutilisateur   {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "SUtilisateur_Id")
	private int idyser;
	
	@Column(name = "SUtilisateur_Mail")
	private String mail;
	@Column(name = "SUtilisateur_Password")
	private String password;
	@Column(name = "SUtilisateur_name")
	private String name;
	@Column(name = "SUtilisateur_dep")
	private String dep;
	/*@OneToMany(mappedBy="user")
	private List<Book> reservedBooks;*/


	}
	



