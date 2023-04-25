package tn.enicarthage.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "ReqBook")
public class ReqBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ReqBook_Id")
	private int id;
	@Column(name = "ReqBook_title")
	private String title;
	@Column(name = "ReqBook_catag")
	private String catag;
	@Column(name = "ReqBook_author")
	private String author;
	@Column(name = "ReqBook_copies")
	private int copies;
	@Column(name = "ReqBook_pub")
	private String pub;
	@Column(name = "ReqBook_pubname")
	private String pubname;
	@Column(name = "ReqBook_isbn")
	private String isbn;
	@Column(name = "ReqBook_year")
	private Integer year;
	@Column(name = "ReqBook_date")
	private Date date;
	@Column(name = "ReqBook_status")
	private String status;
	@Column(name = "ReqBook_reserved")
	private String reserved;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	@JsonIgnore 
	private Sutilisateur user ;
}
