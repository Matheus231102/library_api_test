package matheus.github.library_api.repositories;

import matheus.github.library_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
     User findByName(String name);
}
