package com.pluton.veterianaria.domain.services;

import com.pluton.veterianaria.domain.UsuarioPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class PlutonUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsuarioPojo user = null;
        String usuario = username;

        user = usuarioService.getUsuarioPojoXNombreUsuario(username);

        Set<GrantedAuthority> grantedAuthorityes = new HashSet<>();
        grantedAuthorityes.add(new SimpleGrantedAuthority("ROLE_USER"));

        if(user != null){

            // Configurar la hora, zona horaria, ver el porque te suma 1 dias 5 horas a cualquier fecha que le pongas
            // setear la fecha final de la cookie
            Date fechaActual = new Date();

            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaActual);
            cal.add(Calendar.MINUTE, 15);
            Date fechaRestada = cal.getTime();

            user.setFechFinUsu(fechaRestada);
            usuarioService.updateFechaFinUsu(user);

            return new User(user.getEmailUsu(), user.getPasswordUsu(), new ArrayList<>());
        }

        return null;
    }


}
