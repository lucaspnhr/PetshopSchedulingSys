package br.com.agroisa.petshopschedulingsys.model.dto;

import br.com.agroisa.petshopschedulingsys.model.enums.PetGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
    private String ownerName;
    private String petName;
    private String petBreed;
    private int petAge;
    private PetGender gender;
    private boolean withFlea;
    private boolean withTick;
    private List<String> injure;


}
