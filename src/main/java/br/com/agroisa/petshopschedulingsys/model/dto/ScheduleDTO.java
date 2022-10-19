package br.com.agroisa.petshopschedulingsys.model.dto;

import br.com.agroisa.petshopschedulingsys.model.enums.ClippingType;
import br.com.agroisa.petshopschedulingsys.model.enums.PetGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
    private String ownerName;
    private String petName;
    private String petBreed;
    private int petAge;
    private String gender;
    private boolean withFlea;
    private boolean withTick;
    private List<String> injures;
    private List<String> objectsWith;
    private String alergies;
    private String observation;
    private List<String> services = new ArrayList<>(4);
    private String clippingType;
    private String equipamentDesired;
    private String clippingSize;
    private String price;

}
