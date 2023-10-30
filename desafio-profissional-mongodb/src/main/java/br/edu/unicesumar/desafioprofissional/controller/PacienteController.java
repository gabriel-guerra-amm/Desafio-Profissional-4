package br.edu.unicesumar.desafioprofissional.controller;

import br.edu.unicesumar.desafioprofissional.model.domain.Paciente;
import br.edu.unicesumar.desafioprofissional.model.repository.PacienteRepository;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pr;

    @GetMapping
    public List<Paciente> getAllPacientes(){
        return pr.findAll();
    }

    @GetMapping("/{cpf}")
    public Paciente getPacienteByCpf(@PathVariable String cpf){
        return pr.findByCpf(cpf);
    }

    @GetMapping("/pesquisa/{regex}")
    public List<Paciente> getPacienteByRegex(@PathVariable String regex){
        return pr.findByRegex(regex);
    }

    @PostMapping
    public String createPaciente(@RequestBody Paciente p){
        pr.save(p);
        return "Paciente cadastrado com sucesso.";
    }

    @PutMapping("/{cpf}")
    public String updatePacienteByCpf(@PathVariable String cpf, @RequestBody Paciente p){

        Paciente pacienteDb = pr.findByCpf(cpf);

        if (pacienteDb == null){
            pr.save(p);
            return "Paciente cadastrado com sucesso.";
        }

        p.setId(pacienteDb.getId());
        pr.save(p);

        return "Paciente atualizado com sucesso.";
    }

    @DeleteMapping("/{cpf}")
    public String deletePacienteByCpf(@PathVariable String cpf){

        Paciente pacienteDb = pr.findByCpf(cpf);

        if (pacienteDb == null){
            return "Paciente não encontrado.";
        }

        pr.delete(pacienteDb);
        return "Cadastro de paciente excluído";
    }

}
