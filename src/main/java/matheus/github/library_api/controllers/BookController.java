package matheus.github.library_api.controllers;

import matheus.github.library_api.models.Book;
import matheus.github.library_api.services.concrete.MainLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/books")
public class BookController {

     @Autowired
     private MainLibraryService libraryService;

     @PostMapping
     public Book insertBook(@RequestBody Book book) {
          return libraryService.insertBook(book);
     }
}
