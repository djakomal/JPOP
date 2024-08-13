package JPOP.Presentation.Dtos;

import JPOP.Presentation.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")

    private String email;

    @Column(name = "password")

    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private JPOP.Presentation.Enum.Role role= Role.valueOf("ADMIN");




}
