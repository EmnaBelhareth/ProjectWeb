package tn.enicarthage.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
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
@DiscriminatorValue("Admin")

@Entity
//@PrimaryKeyJoinColumn(name = "Utilisateur_ID" )
//@PrimaryKeyJoinColumn(name = "Utilisateur_Mail" )
@Table(name = "T_Admin")
public class Admin  {
	@Id
	@Column(name = "Admin_Mail")
	private String mailad;
	@Column(name="Admin_Name")
	private String namead;
	
	@Column(name = "Admin_Password")
	private String passwordad;
/*	@OneToMany(mappedBy="IssuesReceiver")
	private List<Contact> Contacts;*/
	
}
