package org.example.domain;

import org.example.domain.enums.TipoConsulta;

import java.time.LocalTime;
import java.util.Date;

public class Consulta {

    private Date dataConsulta;
    private Paciente paciente;
    private Medico medico;
    private LocalTime hora;
    private TipoConsulta tipoConsulta;

    public Consulta(
            Date dataConsulta,
            Paciente paciente,
            Medico medico,
            LocalTime hora,
            TipoConsulta tipoConsulta
    ) {
        this.dataConsulta = dataConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.hora = hora;
        this.tipoConsulta = tipoConsulta;
    }


    public void reagendarPaciente(Paciente paciente, Medico medico) {

    }

}