package it.booking.devicemanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Dipendente {

    @Id
    @GeneratedValue
    public UUID id;
    public String username;
    public String nome;
    public String cognome;
    public String email;

    @OneToMany(mappedBy = "dipendente")
    public List<Dispositivo> dispositivo;

}
