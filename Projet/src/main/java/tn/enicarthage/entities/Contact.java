package tn.enicarthage.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "T_contact")
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode


public class Contact implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;
     
	@Column(name="subject")
	private String subject;
	@Column(name = "message")
	private String message ;
	/*@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
			fetch = FetchType.LAZY)
	private Admin issueReceiver;*/
	
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
}	
	