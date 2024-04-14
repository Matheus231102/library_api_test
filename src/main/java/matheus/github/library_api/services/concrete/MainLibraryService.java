package matheus.github.library_api.services.concrete;

import matheus.github.library_api.models.Book;
import matheus.github.library_api.models.User;
import matheus.github.library_api.repositories.BookRepository;
import matheus.github.library_api.repositories.UserRepository;
import matheus.github.library_api.services.interfaces_services.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainLibraryService implements ILibraryService {

     @Autowired
     private BookRepository bookRepository;

     @Autowired
     private UserRepository userRepository;

     @Override
     public List<User> getAllUsers() {
          return userRepository.findAll();
     }

     @Override
     public List<Book> getAllBooks() {
          return bookRepository.findAll();
     }

     @Override
     public User insertUser(User user) {
          return userRepository.save(user);
     }

     @Override
     public Book insertBook(Book book) {
          return bookRepository.save(book);
     }

     @Override
     public boolean deleteUserForId(Integer userId) {
          return false;
     }

     @Override
     public boolean deleteBookForId(Integer bookId) {
          return false;
     }

     @Override
     public boolean deleteUserForName(String usersName) {
          return false;
     }

     @Override
     public boolean deleteBookForName(String booksName) {
          return false;
     }

     @Override
     public User getUserById(Integer id) {
          return null;
     }

     @Override
     public Book getBookById(Integer id) {
          return null;
     }

     @Override
     public User getUserByUserName(Integer id) {
          return null;
     }

     @Override
     public Book getBookByName(Integer id) {
          return null;
     }

     @Override
     public User updateUser(User user) {
          return null;
     }

     @Override
     public Book updateBook(Book book) {
          return null;
     }

     @Override
     public Integer addBookInStock(Book book, Integer quantityToAdd) {
          return null;
     }

     @Override
     public Integer addOneBookInStock(Book book) {
          return null;
     }
}
