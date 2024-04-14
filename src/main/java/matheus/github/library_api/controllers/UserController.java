package matheus.github.library_api.controllers;

import matheus.github.library_api.models.User;
import matheus.github.library_api.services.concrete.MainLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

     @Autowired
     private MainLibraryService libraryService;

     @GetMapping
     public String getMessage() {
          return "Message";
     }

     @PostMapping
     private User insertUser(@RequestBody User user) {
          return libraryService.insertUser(user);
     }
}
