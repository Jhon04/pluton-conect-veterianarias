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

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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


                // Actualizar las propiedades del usuario
                Date fechaActual = new Date();
                // Convertir la fecha actual a un objeto LocalDateTime
                Instant instant = fechaActual.toInstant();
                LocalDateTime fechaActualLocalDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
                // Sumar 15 minutos a la fecha actual
                LocalDateTime fechaCon15MinutosMas = fechaActualLocalDateTime.plusMinutes(15);
                // Convertir la fecha actualizada a un objeto Date
                Instant instantActualizado = fechaCon15MinutosMas.atZone(ZoneId.systemDefault()).toInstant();
                Date fechaActualizada = Date.from(instantActualizado);

                // Guardar los cambios en la base de datos
                user.setFechFinUsu(fechaActualizada);
                usuarioService.updateFechaFinUsu(user);


            return new User(user.getEmailUsu(), user.getPasswordUsu(), new ArrayList<>());
        }

        return null;
    }


}
