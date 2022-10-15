package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class Client extends User{
    public Client(String email, String password, String firstname, String lastname, Telephone telephone, UserRole userRole) {
        super(email, password, firstname, lastname, telephone, userRole);
    }
}
