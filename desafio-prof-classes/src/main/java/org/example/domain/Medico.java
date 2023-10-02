package org.example.domain;

import org.example.domain.enums.Cargo;
import org.example.domain.enums.TipoMedico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {

    private List<LocalDateTime> agenda;
    private Cargo cargo;
    private TipoMedico tipoMedico;

    public Medico(
            String nome,
            Date dataNascimento,
            String cpf,
            Cargo cargo,
            TipoMedico tipoMedico) {
        super(nome, dataNascimento, cpf);
        this.cargo = cargo;
        this.tipoMedico = tipoMedico;
        this.agenda = new ArrayList<LocalDateTime>();
    }

    public void atenderPaciente(Paciente paciente, LocalDateTime dataHora, String sintomas, String diagnostico, String medicamentos, String observacoes) {
        FichaPaciente ficha = new FichaPaciente(dataHora, sintomas, diagnostico, medicamentos, observacoes);
        paciente.adicionarNovaFicha(ficha);
    }

    public void adicionarAgenda(LocalDateTime data){
        agenda.add(data);
    }

    public List<LocalDateTime> getAgenda(){
        return this.agenda;
    }

}