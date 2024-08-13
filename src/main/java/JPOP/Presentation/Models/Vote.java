package JPOP.Presentation.Models;

import JPOP.Presentation.Enum.TypeVote;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vote")
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "typevote")
    private TypeVote typevote ;
    @Column(name = "Enddate")
    private LocalDateTime voteTime ;
    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Evenement event;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
