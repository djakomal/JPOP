package JPOP.Presentation.Controllers;

import JPOP.Presentation.Models.LoginRequest;
import JPOP.Presentation.ServiceImpl.LoginRequestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/LoginRequest")
public class LoginRequestController {

    @Autowired
    private LoginRequestService loginRequestService;


    @PostMapping("/")
    public LoginRequest add(@Valid @RequestBody LoginRequest loginRequest){

        return  loginRequestService.add(loginRequest);
    }





/*    @DeleteMapping("/delete/{taxeId}")
    public  void delete(@PathVariable Long taxeId){
        taxesService.delete(taxeId);
    }*/


}
