package br.com.agroisa.petshopschedulingsys.model.dto;

import br.com.agroisa.petshopschedulingsys.model.Telephone;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDTO {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Telephone telephone;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
