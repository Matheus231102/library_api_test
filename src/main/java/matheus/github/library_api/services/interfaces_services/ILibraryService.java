package matheus.github.library_api.services.interfaces_services;

import matheus.github.library_api.models.Book;
import matheus.github.library_api.models.User;

import java.util.List;

public interface ILibraryService {

     List<User> getAllUsers();
     List<Book> getAllBooks();

     User insertUser(User user);
     Book insertBook(Book book);

     boolean deleteUserForId(Integer userId);
     boolean deleteBookForId(Integer bookId);
     boolean deleteUserForName(String usersName);
     boolean deleteBookForName(String booksName);

     User getUserById(Integer id);
     Book getBookById(Integer id);

     User getUserByUserName(Integer id);
     Book getBookByName(Integer id);

     User updateUser(User user);
     Book updateBook(Book book);

     Integer addBookInStock(Book book, Integer quantityToAdd);
     Integer addOneBookInStock(Book book);


}
