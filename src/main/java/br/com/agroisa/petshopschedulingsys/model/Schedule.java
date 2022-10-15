package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.composedId.ScheduleId;
import br.com.agroisa.petshopschedulingsys.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ScheduleId.class)
public class Schedule  implements Serializable {
    @Id
    private LocalDateTime appoitment;
    @Id
    @ManyToOne
    private Client client;
    private Double price;
    private Status status;
}
