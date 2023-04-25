package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.Book;

public interface BookServiceI {
	
	public Book ajouterbook(Book b);
	
	public List<Book> listebook();
	
	public void deletebook(int id );
	
	public void deletebookById(int id);

	public Book findbookById(int id);

	public List<Book> findAllBooks();

	public Book UpdateBook(Book b,int id);
	
	public List<Book> findAllBooksbyStatut(String status);
}
