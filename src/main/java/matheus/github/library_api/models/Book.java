package matheus.github.library_api.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_books")
public class Book {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     @Column(unique = true)
     private String name;

     @Column
     private Integer quantityInStock;

     @Column
     private Double price;

     public Book(String name, Integer quantityInStock, Double price) {
          this.name = name;
          this.quantityInStock = quantityInStock;
          this.price = price;
     }
}
