package br.com.agroisa.petshopschedulingsys.model.composedId;

import br.com.agroisa.petshopschedulingsys.model.Schedule;
import br.com.agroisa.petshopschedulingsys.model.Service;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
public class ScheduleServiceId implements Serializable {
    private Schedule schedule;
    private Service service;
}
