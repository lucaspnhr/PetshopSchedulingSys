package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.enums.UserRole;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@ToString
public class Client extends User{
    public Client(String email, String password, String firstname, String lastname, Telephone telephone) {
        super(email, password, firstname, lastname, telephone, UserRole.USER);
    }
}
