package ru.itis.pizzaonline.security.details;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.itis.pizzaonline.models.User;
import ru.itis.pizzaonline.repositories.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

   private UserRepository userRepository;

    private UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findFirstByEmail(email).orElseThrow(() ->
                new IllegalArgumentException("User not found by <"+ email+">"));
        return new UserDetailsImpl(user);
    }
}
