package br.com.agroisa.petshopschedulingsys.repository;

import br.com.agroisa.petshopschedulingsys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@NoRepositoryBean
public interface UserRepository<T> extends JpaRepository<T, String > {

    Optional<T> findByEmail(String email);
}
