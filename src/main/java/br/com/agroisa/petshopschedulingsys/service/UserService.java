package br.com.agroisa.petshopschedulingsys.service;

import br.com.agroisa.petshopschedulingsys.model.User;
import br.com.agroisa.petshopschedulingsys.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
