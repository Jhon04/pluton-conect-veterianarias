package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.dto.AuthenticationRequest;
import com.pluton.veterianaria.domain.dto.AuthenticationResponse;
import com.pluton.veterianaria.domain.services.PlutonUserDetailsService;
import com.pluton.veterianaria.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PlutonUserDetailsService plutonUserDetailsService;
    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request, HttpServletResponse response){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = plutonUserDetailsService.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);

            // Crea una nueva cookie con el token JWT
            Cookie tokenCookie = new Cookie("jwt", jwt);
            //tokenCookie.setMaxAge(900); // Expira en 15 minutos
            tokenCookie.setMaxAge(30);
            tokenCookie.setHttpOnly(true);
            tokenCookie.setSecure(false); // Solo para HTTPS
            response.addCookie(tokenCookie);

            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
        } catch (BadCredentialsException e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}
