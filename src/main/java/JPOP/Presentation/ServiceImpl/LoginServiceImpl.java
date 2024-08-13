package JPOP.Presentation.ServiceImpl;

import JPOP.Presentation.Models.LoginRequest;
import JPOP.Presentation.Repository.LoginRequestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginRequestService {
    @Autowired
    private LoginRequestRepository loginRequestRepository;

    @Override
    @Transactional
    public LoginRequest add(LoginRequest loginRequest) {

        if(loginRequest==null){
            throw new IllegalArgumentException("User cannot be null");
        }
        try {
            //User user = userdtomapper.mapToUser(userDto);
            LoginRequest savedloginRequest = loginRequestRepository.save(loginRequest);
            //UserDto savedUserDto = Userdtomapper.userdtomapper.mapToUserDto(savedUser);
            return savedloginRequest;
        }catch(Exception e){
            System.err.println("Error while adding user: " + e.getMessage());
            // Rejeter une exception personnalisée ou une exception runtime
            throw new RuntimeException("Error while adding user", e);
        }
    }


}
