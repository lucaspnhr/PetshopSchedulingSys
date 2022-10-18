package br.com.agroisa.petshopschedulingsys.service;

import br.com.agroisa.petshopschedulingsys.model.Client;
import br.com.agroisa.petshopschedulingsys.model.Employee;
import br.com.agroisa.petshopschedulingsys.model.User;
import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import br.com.agroisa.petshopschedulingsys.repository.ClientRepository;
import br.com.agroisa.petshopschedulingsys.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl implements UserDetailsService {
    private final ClientRepository clientRepository;
    private final EmployeeRepository employeeRepository;

    private  final BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findUserByEmail(username);//userService.getUserByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));
    }

    public void registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        if(user instanceof Employee){
            user.setUserRole(UserRole.EMPLOYEE);
            employeeRepository.save((Employee) user);
            return;
        }
        user.setUserRole(UserRole.USER);
        clientRepository.save((Client) user);
    }

    @Transactional
    public User findUserByEmail(String email) {
        Optional<Employee> employeeOptional = employeeRepository.findByEmail(email);
        if (employeeOptional.isEmpty()){
            Client client = clientRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email));
            return client;
        }
        return employeeOptional.get();
    }
}
