package matheus.github.library_api.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_loans")
@Entity
public class Loan {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     @ManyToOne
     private User user;

     @ManyToOne
     private Book book;

}
