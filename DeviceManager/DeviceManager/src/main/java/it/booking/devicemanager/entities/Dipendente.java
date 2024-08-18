package it.booking.devicemanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Dipendente {

    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String nome;
    private String cognome;
    private String email;

    @OneToMany(mappedBy = "dipendente", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Dispositivo> dispositivo;

}
