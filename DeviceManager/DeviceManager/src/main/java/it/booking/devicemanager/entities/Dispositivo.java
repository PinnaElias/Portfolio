package it.booking.devicemanager.entities;

import it.booking.devicemanager.entities.enums.StatoDispositivi;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Dispositivo {

    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dipendente_assegnato", referencedColumnName = "id")
    private Dipendente dipendente;
    private StatoDispositivi statoDispositivo;

}
