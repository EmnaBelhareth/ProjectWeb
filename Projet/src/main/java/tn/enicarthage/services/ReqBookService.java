package tn.enicarthage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.ReqBook;
import tn.enicarthage.repositories.ReqBookRepository;

@Service
public class ReqBookService {
	@Autowired
	ReqBookRepository bookrepo;

	public List<ReqBook> findAllReqBooks() {
		return   (List<ReqBook>) bookrepo.findAll();
	}

	public ReqBook ajouterbook(ReqBook userData) {
	
		 return bookrepo.save(userData);
	}

	
	}
	


