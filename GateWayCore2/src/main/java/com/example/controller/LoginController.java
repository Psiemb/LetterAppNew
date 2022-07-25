package com.example.controller;

import com.example.getLettersByReceiver.LettersByPhoneNumber;
import com.example.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/getLetters")
    public ResponseEntity<LettersByPhoneNumber> myLetters(@RequestParam String phoneNumber, @RequestParam String token) {

        ResponseEntity<LoginResponse> serviceLogin = loginService.getLogin(phoneNumber, token);

        LoginResponse body = serviceLogin.getBody();
        if (Objects.nonNull(body) && body.isLogged()) {

            return loginService.getLetters(phoneNumber);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/getLetters2/{number}/{token}")
    public String myLetters2(@PathVariable("number") String number, @PathVariable("token") String token) {

        ResponseEntity<LoginResponse> serviceLogin2 = loginService.getLogin2(number, token);

        LoginResponse body = serviceLogin2.getBody();
        if (Objects.nonNull(body) && body.isLogged()) {
            return "OK";
        }
        return "Bad";
    }

    @PostMapping("/getLetters3")
    public String myLetters3(@RequestBody LoginParam loginParam) {

        ResponseEntity<LoginResponse> serviceLogin3 = loginService.getLogin3(loginParam.getNumberParam(), loginParam.getFreshTokenParam());

        LoginResponse body = serviceLogin3.getBody();
        if (Objects.nonNull(body) && body.isLogged()) {
            return "OK";
        }
        return "Bad";
    }
}

