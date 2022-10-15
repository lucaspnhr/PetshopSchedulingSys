package br.com.agroisa.petshopschedulingsys.model.composedId;

import br.com.agroisa.petshopschedulingsys.model.Client;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
@EqualsAndHashCode
public class ScheduleId implements Serializable {
    private LocalDateTime appoitment;
    private Client client;
}
