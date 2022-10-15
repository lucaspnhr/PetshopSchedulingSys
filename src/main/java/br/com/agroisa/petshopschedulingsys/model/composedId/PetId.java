package br.com.agroisa.petshopschedulingsys.model.composedId;

import br.com.agroisa.petshopschedulingsys.model.Client;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class PetId implements Serializable {
    private String name;
    private Client client;
}
