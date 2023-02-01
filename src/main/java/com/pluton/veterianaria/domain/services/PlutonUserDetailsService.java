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

import java.util.ArrayList;
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
            return new User(user.getEmailUsu(), user.getPasswordUsu(), new ArrayList<>());
        }

        return null;
    }
}
