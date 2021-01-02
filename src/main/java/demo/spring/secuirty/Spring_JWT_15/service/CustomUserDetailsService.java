package demo.spring.secuirty.Spring_JWT_15.service;

import demo.spring.secuirty.Spring_JWT_15.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        demo.spring.secuirty.Spring_JWT_15.entity.User user = repository.findByUserName(username);
        return new User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }
}
