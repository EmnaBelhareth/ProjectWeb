package tn.enicarthage.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "T_Utilisateur")
public class Utilisateur implements Serializable{

	//int cin;
	/*@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Utilisateur_ID")
	@Id
	int userid;*/
	
	@Column(name = "Utilisateur_Mail")
	private String mail;
	
	@Column(name = "Utilisateur_Password")
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUtilisateur_Id")
	private int idbranch;
	
	@Column(name = "SUtilisateur_name")
	private String name;
	@Column(name = "SUtilisateur_dep")
	private String dep;

}
