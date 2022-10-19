package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.composedId.PetId;
import br.com.agroisa.petshopschedulingsys.model.enums.PetGender;
import br.com.agroisa.petshopschedulingsys.model.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(PetId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet implements Serializable {
    @Id
    @Column(length = 50)
    private String name;
    @Id
    @ManyToOne
    @JoinColumn(name = "client_email")
    private Client client;
    private String breed;
    private Size size;
    private int age;
    private PetGender gender;
}
