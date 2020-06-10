package io.bearx.jwt.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bearx.jwt.models.ApiToken;
import io.bearx.jwt.models.Client;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/login")
public class LoginController {

    static final long EXPIRATION_TIME = 1000 * 30; // 30 seconds timeout

    @PostMapping
    public ResponseEntity<ApiToken> login(@RequestBody Client client) {
        System.out.println(client.getClientId());
        System.out.println(client.getClientName());
        System.out.println(client.getPasswordTxt());

        return new ResponseEntity<>(
                new ApiToken(Jwts.builder()
                        .setSubject(client.getClientName())
                        .claim("scopes", "admins")
                        .claim("companyId", 99)
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                        .signWith(SignatureAlgorithm.HS256, "123#&*zcvAWEE999")
                        .compact()),
                HttpStatus.OK);
    }
}
