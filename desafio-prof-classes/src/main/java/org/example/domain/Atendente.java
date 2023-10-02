package org.example.domain;

import org.example.domain.enums.Cargo;
import org.example.domain.enums.TipoConsulta;
import org.example.service.OperacoesService;

import java.time.LocalDateTime;
import java.util.Date;

public class Atendente extends Pessoa {

    private Cargo cargo;

    public Atendente(String nome, Date dataNascimento, String cpf, Cargo cargo) {
        super(nome, dataNascimento, cpf);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void CadastrarDados(Paciente paciente) {

    }

    public void agendarConsulta(Paciente paciente, Medico medico, TipoConsulta tipoConsulta, LocalDateTime dataHora){
        medico.adicionarAgenda(dataHora);
        paciente.criarConsulta(dataHora, medico, tipoConsulta);
    }

}