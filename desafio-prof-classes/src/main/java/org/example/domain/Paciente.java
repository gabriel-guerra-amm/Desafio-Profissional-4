package org.example.domain;

import org.example.domain.enums.Estado;
import org.example.domain.enums.Municipio;
import org.example.domain.enums.TipoConsulta;
import org.example.service.OperacoesService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends Pessoa {

    private String endereco;
    private String cep;
    private String complemento;
    private Estado estado;
    private Municipio municipio;
    private List<Consulta> consultas;
    private List<FichaPaciente> fichas;

    public Paciente(String nome, Date dataNascimento, String cpf, String endereco, String cep, String complemento, Estado estado, Municipio municipio) {
        super(nome, dataNascimento, cpf);
        this.endereco = endereco;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.municipio = municipio;
        this.consultas = new ArrayList<Consulta>();
        this.fichas = new ArrayList<FichaPaciente>();
    }

    public String getEndereco() {
        return endereco;
    }
    public String getCep() {
        return cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public Estado getEstado() {
        return estado;
    }
    public Municipio getMunicipio() {
        return municipio;
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public List<FichaPaciente> getFichas() {
        return fichas;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public void criarConsulta(LocalDateTime dataHora, Medico m, TipoConsulta tc){
        Consulta c = new Consulta(dataHora, m, tc);
        consultas.add(c);
    }

    public void adicionarNovaFicha(FichaPaciente ficha){
        fichas.add(ficha);
    }

    public void agendarConsulta(Medico medico, TipoConsulta tipoConsulta, LocalDateTime dataHora){
        medico.adicionarAgenda(dataHora);
        criarConsulta(dataHora, medico, tipoConsulta);
    }

}