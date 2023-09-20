package org.example.domain;

import org.example.domain.enums.Estado;
import org.example.domain.enums.Municipio;
import org.example.service.OperacoesService;

import java.time.LocalDateTime;
import java.util.Date;

public class Paciente extends Pessoa implements OperacoesService {

    public Paciente(String nome, Date dataNascimento, String cpf, String endereco, String cep, String complemento, Estado estado, Municipio municipio) {
        super(nome, dataNascimento, cpf);
        this.endereco = endereco;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.municipio = municipio;
    }

    //atributos
    private String endereco;
    private String cep;
    private String complemento;
    private Estado estado;
    private Municipio municipio;

    //metodos
    public Paciente(String endereco, String cep, String complemento, String nome, Date dataNascimento, String cpf, Estado estado, Municipio municipio){
        super(nome,dataNascimento,cpf);
        this.endereco = endereco;
        this.cep = cep;
        this.complemento = complemento;
        this.municipio = municipio;
    }
    //metodos Getters
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

    //metodos Setters
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
    //--------------

    @Override
    public void agendarConsulta(Medico medico, LocalDateTime data){
        medico.adicionarAgenda(data);
    }

}