package it.booking.devicemanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Dispositivo {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dipendente_assegnato", referencedColumnName = "id")
    public Dipendente dipendente;

}
