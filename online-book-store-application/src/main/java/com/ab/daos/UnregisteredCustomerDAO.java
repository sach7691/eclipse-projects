package com.ab.daos;
import java.util.List;
import com.ab.models.Book;
import com.ab.models.Customer;

public interface UnregisteredCustomerDAO {

	public Customer registerCustomer(Customer customer);
	public List<Book> viewBooks();
	public Book searchBook(int bookISBN);
	public String readBookInformation(Book book);
	public Book addBookToBasket(int bookISBN); //check isbn is already in the store
	public List<Book> viewBasket();
	public Book modifyBasket(int bookISBN);
	public boolean checkout();
		
}
