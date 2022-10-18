package br.com.agroisa.petshopschedulingsys.repository;

import br.com.agroisa.petshopschedulingsys.model.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends UserRepository<Client> {
}
