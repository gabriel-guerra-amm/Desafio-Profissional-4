package org.example.domain;

import org.example.domain.enums.Cargo;
import org.example.domain.enums.TipoMedico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {

    //private Calendario calendario;
    private List<LocalDateTime> agenda;
    private Cargo cargo;
    private TipoMedico tipoMedico;

    public Medico(
            String nome,
            Date dataNascimento,
            String cpf,

            // Calendario calendario,
            Cargo cargo,
            TipoMedico tipoMedico
    ) {
        super(nome, dataNascimento, cpf);
        //this.calendario = calendario;
        this.cargo = cargo;
        this.tipoMedico = tipoMedico;
        this.agenda = new ArrayList<LocalDateTime>();
    }

    public void atenderPaciente(Paciente paciente) {
    }

    public void adicionarAgenda(LocalDateTime data){
        agenda.add(data);
    }

    public List<LocalDateTime> getAgenda(){
        return this.agenda;
    }

}