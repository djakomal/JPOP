package JPOP.Presentation.ServiceImpl;


import JPOP.Presentation.Models.LoginRequest;
import jakarta.transaction.Transactional;

public interface LoginRequestService {
    @Transactional
    LoginRequest add(LoginRequest loginRequest);


    //void delete(Long userId);




}
