package br.com.agroisa.petshopschedulingsys.model;

import br.com.agroisa.petshopschedulingsys.model.composedId.ScheduleServiceId;
import br.com.agroisa.petshopschedulingsys.model.enums.Size;
import br.com.agroisa.petshopschedulingsys.model.enums.ClippingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@IdClass(ScheduleServiceId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleService {
    @Id
    @ManyToOne
//    @JoinColumns()
    private Schedule schedule;
    @Id
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @Enumerated(EnumType.STRING)
    private ClippingType clippingType;
    @Enumerated(EnumType.STRING)
    private Size size;
    private boolean withSisors;
    private boolean withHairClipper;

}
