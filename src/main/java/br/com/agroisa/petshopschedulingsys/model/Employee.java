package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Employee extends User{
    public Employee(String email, String password, String firstname, String lastname, Telephone telephone, UserRole userRole) {
        super(email, password, firstname, lastname, telephone, userRole);
    }
}
