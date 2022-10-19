package br.com.agroisa.petshopschedulingsys.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Observations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "pet_name"), @JoinColumn(name = "client_email")})
    private Pet pet;
    private String type;
    private String dsecription;
}
