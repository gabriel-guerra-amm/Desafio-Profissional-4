package org.example.service;

import org.example.domain.Atendente;
import org.example.domain.Medico;
import org.example.domain.Paciente;
import org.example.domain.enums.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class OperacoesServiceTest {

    @Test
    public void deveAgendarConsultaPaciente(){

        Medico med = new Medico("João", new Date("01/01/1980"), "12345679810", Cargo.MEDICO, TipoMedico.GENERALISTA);

        Paciente pac = new Paciente("Cláudio", new Date("01/01/1990"), "12345670871", "Avenida Brasil, 156",
                "12345678", "N/A", Estado.PARANA, Municipio.MARINGA);

        pac.agendarConsulta(med, TipoConsulta.GENERALISTA, LocalDateTime.of(2023, 10, 31, 15,30));

        Assertions.assertFalse(med.getAgenda().isEmpty());
        Assertions.assertFalse(pac.getConsultas().isEmpty());

    }

    @Test
    public void deveAgendarConsultaAtendente(){

        Medico med = new Medico("João", new Date("01/01/1980"), "12345679810", Cargo.MEDICO, TipoMedico.GENERALISTA);

        Paciente pac = new Paciente("Cláudio", new Date("01/01/1990"), "12345670871", "Avenida Brasil, 156",
                "12345678", "N/A", Estado.PARANA, Municipio.MARINGA);

        Atendente at = new Atendente("Maria", new Date("01/01/1995"), "12345680147", Cargo.ATENDENTE);

        at.agendarConsulta(pac, med, TipoConsulta.GENERALISTA, LocalDateTime.of(2023, 10, 31, 15,30));

        Assertions.assertFalse(med.getAgenda().isEmpty());
        Assertions.assertFalse(pac.getConsultas().isEmpty());
    }

    @Test
    public void deveAtenderPaciente(){

        Medico med = new Medico("João", new Date("01/01/1980"), "12345679810", Cargo.MEDICO, TipoMedico.GENERALISTA);

        Paciente pac = new Paciente("Cláudio", new Date("01/01/1990"), "12345670871", "Avenida Brasil, 156",
                "12345678", "N/A", Estado.PARANA, Municipio.MARINGA);


        String sintomas = "Febre, dor de cabeça";
        String diagnostico = "Resfriado";
        String medicamentos = "Medicamento X";
        String observacoes = "Ficar em repouso por 2 dias";

        med.atenderPaciente(pac, LocalDateTime.of(2023, 10, 31, 15,30), sintomas, diagnostico, medicamentos, observacoes);

        Assertions.assertFalse(pac.getFichas().isEmpty());
    }

}
