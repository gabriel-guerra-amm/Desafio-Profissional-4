package org.example.domain;

import org.example.domain.enums.TipoConsulta;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Consulta {

    private LocalDateTime dataHoraConsulta;
    private Medico medico;
    private TipoConsulta tipoConsulta;

    public Consulta(
            LocalDateTime dataHoraConsulta,
            Medico medico,
            TipoConsulta tipoConsulta
    ) {
        this.dataHoraConsulta = dataHoraConsulta;
        this.medico = medico;
        this.tipoConsulta = tipoConsulta;
    }


}