
package JPOP.Presentation.Models;

import JPOP.Presentation.Enum.Categorie;
import JPOP.Presentation.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "login")
public class Evenement {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "titre")
    private String titre;
    @Column(name = "Description")
    private String Description ;
    @Column(name = "eventDate")
    private LocalDateTime eventDate ;
    @Column(name = "categorie")
    private Categorie categorie ;
    @Column(name = "status")
    private Status status;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vote> votes;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
