package tn.enicarthage.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.entities.Book;
import tn.enicarthage.entities.Sutilisateur;
import tn.enicarthage.repositories.BookRepository;
import tn.enicarthage.repositories.SUserRepository;

@Service
public class BookService implements BookServiceI {
	@Autowired
	BookRepository bookrepo;
	@Override
	public Book ajouterbook(Book b) {
		
		return bookrepo.save(b);
	}

	@Override
	public List<Book> listebook() {

		List<Book> bs = (List<Book>) bookrepo.findAll();
		
		return bs;
	}

	@Override
	public void deletebook(int id) {
		bookrepo.deleteById(id);
		
	}

	@Override
	public void deletebookById(int id) {
		bookrepo.deleteById(id);
		
	}

	@Override
	public Book findbookById(int id) {
		return bookrepo.findById(id).get();
		
	}

	@Override
	public List<Book> findAllBooks() {
		return   (List<Book>) bookrepo.findAll();
	}

	@Override
	public Book UpdateBook(Book b, int id) {
		Book b2= bookrepo.findById(id).get();
		b2.setAuthor(b.getAuthor());
		b2.setCatag(b.getCatag());
		b2.setCopies(b.getCopies());
		b2.setDate(b.getDate());
		b2.setIsbn(b.getIsbn());
		b2.setPub(b.getPub());
		b2.setPubname(b.getPubname());
		b2.setStatus(b.getStatus());
		b2.setTitle(b.getTitle());
		b2.setYear(b.getYear());
		return bookrepo.save(b2);

	}

	@Override
	public List<Book> findAllBooksbyStatut(String status) {
		return bookrepo.findByStatus(status);
	}

	public List<Book> findAllBooksByReservedUserid(int idb) {
		
		return null;
	}
	
}