package JPOP.Presentation.Repository;


import JPOP.Presentation.Models.LoginRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRequestRepository extends JpaRepository<LoginRequest, Long> {
    //List<Taxes> findByBillingId(Long id);

}
