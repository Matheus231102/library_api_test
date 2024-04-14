package matheus.github.library_api.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_users")
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     @Column
     private String name;

     @Column(unique = true)
     private String userName;

     @Column(unique = true)
     private String CPF;

     @Column
     private boolean isActive;

     @Column
     private LocalDateTime registrationDate;

     @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
     private List<Loan> LoanHistory;

     @PrePersist
     public void setComplementOfInfouser() {
          setRegistrationDate(LocalDateTime.now());
          setActive(true);
          setLoanHistory(new ArrayList<>());
     }

}
