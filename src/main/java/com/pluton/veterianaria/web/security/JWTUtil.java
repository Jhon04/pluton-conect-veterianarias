package com.pluton.veterianaria.web.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil {

    // Generar una clave segura de 256 bits
    public static byte[] keyBytes = Keys.secretKeyFor(SignatureAlgorithm.HS256).getEncoded();

    public String generateToken(UserDetails userDetails) {
        /*
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() +1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
        */

        /* 15 minutos
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 15))
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
         */

        // 30 Segundos
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 30))
                //.signWith(SignatureAlgorithm.HS256, KEY).compact();
                .signWith(Keys.hmacShaKeyFor(keyBytes), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean validateToken(String token, UserDetails userDetails) {

        return userDetails.getUsername().equals(extracUsername(token)) && !isTokenExpired(token);
    }

    public String extracUsername(String token){
        return  getClaims(token).getSubject();
    }

    public boolean isTokenExpired(String token) {
        try {
            return getClaims(token).getExpiration().before(new Date());
        }catch (ExpiredJwtException e){
            return true;
        } catch (ClaimJwtException c){
            return true;
        }
    }

    private Claims getClaims(String token) {
        return Jwts.parser().setSigningKey(keyBytes).parseClaimsJws(token).getBody();
    }
}
