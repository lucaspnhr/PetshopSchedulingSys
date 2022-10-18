package br.com.agroisa.petshopschedulingsys;

import br.com.agroisa.petshopschedulingsys.model.Client;
import br.com.agroisa.petshopschedulingsys.model.Telephone;
import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PetshopSchedulingSysApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(PetshopSchedulingSysApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
