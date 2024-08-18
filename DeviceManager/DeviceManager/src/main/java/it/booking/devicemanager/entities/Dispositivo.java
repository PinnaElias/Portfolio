package it.booking.devicemanager.entities;

import it.booking.devicemanager.entities.enums.StatoDispositivi;
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
    private Dipendente dipendente;
    private StatoDispositivi statoDispositivo;

}
