package api.controller;

import api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /** ユーザ登録API */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void userRegister(){

    }

    /** ユーザ情報取得API */
//    @RequestMapping(value = "/get", method = RequestMethod.GET)


}
