package ua.net.azhytnytskyi.articlesserver.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.net.azhytnytskyi.articlesserver.dto.LoginInfoDto;
import ua.net.azhytnytskyi.articlesserver.dto.ResponseDto;
import ua.net.azhytnytskyi.articlesserver.model.User;
import ua.net.azhytnytskyi.articlesserver.service.UserService;

@RestController()
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public ResponseDto<User> login(@RequestBody LoginInfoDto userDto){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setSucceed(false);

        for (User user : userService.getUsers()){
            if (user.getUserName().equals(userDto.getUserName())
                    && user.getUserPassword().equals(userDto.getPassword())){
                responseDto.setEntity(userService.getUserById(user.getId()));
                responseDto.setSucceed(true);
            } else {
                responseDto.setMessage("Incorrest username or password");
            }
        }

        return responseDto;
    }
}
