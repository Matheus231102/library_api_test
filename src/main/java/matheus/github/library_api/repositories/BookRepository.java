package matheus.github.library_api.repositories;

import matheus.github.library_api.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
     Book findByName(String name);
}
