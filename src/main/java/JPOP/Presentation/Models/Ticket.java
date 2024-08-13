package JPOP.Presentation.Models;

import JPOP.Presentation.Enum.ModePaiment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "login")
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "price")
    private Double price ;
    @Column(name = "modepaiment")
    private ModePaiment modepaiment;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
