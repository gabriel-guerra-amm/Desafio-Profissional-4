package br.edu.unicesumar.desafioprofissional.controller;

import br.edu.unicesumar.desafioprofissional.model.domain.Medico;
import br.edu.unicesumar.desafioprofissional.model.domain.Paciente;
import br.edu.unicesumar.desafioprofissional.model.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoRepository mr;

    @GetMapping
    public List<Medico> getAllMedico(){
        return mr.findAll();
    }

    @GetMapping("/{crm}")
    public Medico getMedicoByCrm(@PathVariable String crm){
        return mr.findByCrm(crm);
    }

    @GetMapping("/pesquisa/{regex}")
    public List<Medico> getMedicoByRegex(@PathVariable String regex){
        return mr.findByRegex(regex);
    }

    @PostMapping
    public String createMedico(@RequestBody Medico m){
        mr.save(m);
        return "Médico cadastrado com sucesso.";
    }

    @PutMapping("/{crm}")
    public String updateMedicoByCpf(@PathVariable String crm, @RequestBody Medico m){

        Medico medicoDb = mr.findByCrm(crm);

        if (medicoDb == null){
            mr.save(m);
            return "Médico cadastrado com sucesso.";
        }

        m.setId(medicoDb.getId());
        mr.save(m);

        return "Médico atualizado com sucesso.";
    }

    @DeleteMapping("/{crm}")
    public String deletePacienteByCpf(@PathVariable String crm){

        Medico medicoDb = mr.findByCrm(crm);

        if (medicoDb == null){
            return "Médico não encontrado.";
        }

        mr.delete(medicoDb);
        return "Cadastro de médico excluído";
    }

}
