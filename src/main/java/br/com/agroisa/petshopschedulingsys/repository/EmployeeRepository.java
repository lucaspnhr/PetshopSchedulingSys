package br.com.agroisa.petshopschedulingsys.repository;

import br.com.agroisa.petshopschedulingsys.model.Client;
import br.com.agroisa.petshopschedulingsys.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends UserRepository<Employee> {
}
