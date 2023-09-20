package org.example.service;

import org.example.domain.Consulta;
import org.example.domain.Medico;

import java.time.LocalDateTime;

public interface OperacoesService{

    public void agendarConsulta(Medico medico, LocalDateTime data);

}