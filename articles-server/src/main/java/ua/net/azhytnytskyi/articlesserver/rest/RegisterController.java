package ua.net.azhytnytskyi.articlesserver.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.net.azhytnytskyi.articlesserver.dto.RegisterInfoDto;
import ua.net.azhytnytskyi.articlesserver.dto.ResponseDto;
import ua.net.azhytnytskyi.articlesserver.enums.UserRole;
import ua.net.azhytnytskyi.articlesserver.model.User;
import ua.net.azhytnytskyi.articlesserver.service.UserService;

@RestController
public class RegisterController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    public ResponseDto<User> registerUser(@RequestBody RegisterInfoDto registerInfoDto){
        ResponseDto<User> response = new ResponseDto<>();

        for (User user : userService.getUsers()){
            if (user.getUserName().equals(registerInfoDto.getUserName())){
                response.setMessage("User is already registered");
                response.setSucceed(false);
                return response;
            }
        }

        User user = new User();
        user.setUserRole(UserRole.USER);
        user.setUserName(registerInfoDto.getUserName());
        user.setUserPassword(registerInfoDto.getPassword());

        userService.saveUser(user);
        response.setSucceed(true);
        response.setEntity(user);

        return response;
    }
}
