package br.com.agroisa.petshopschedulingsys.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Telephone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 2, nullable = false)
    private String ddd;
    @Column(length = 9, nullable = false)
    private String number;


}
