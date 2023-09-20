package org.example.domain;

import org.example.domain.enums.Cargo;
import org.example.service.OperacoesService;

import java.time.LocalDateTime;
import java.util.Date;

public class Atendente extends Pessoa implements OperacoesService {

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

    @Override
    public void agendarConsulta(Medico medico, LocalDateTime data){
        medico.adicionarAgenda(data);
    }

}