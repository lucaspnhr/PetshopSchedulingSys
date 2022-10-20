package br.com.agroisa.petshopschedulingsys.model.composedId;

import br.com.agroisa.petshopschedulingsys.model.Client;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@EqualsAndHashCode
public class ScheduleId implements Serializable {
    private LocalDate appoitmentDate;
    private LocalTime appoitmentHour;
    private Client client;
}
