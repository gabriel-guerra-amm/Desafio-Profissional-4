package org.example.domain;

public class FichaPaciente{
    private String sintomas;
    private String diagnostico;
    private String medicamentos;
    private String observacoes;

    public FichaPaciente(String sintomas, String diagnostico, String medicamentos, String obsevacoes){
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
        this.observacoes = observacoes;
    }

    public String getSintomas(){
        return this.sintomas;
    }
    public String getDiagnosticos(){
        return this.diagnostico;
    }
    public String getMedicamentos(){
        return this.medicamentos;
    }
    public String getObservacoes(){
        return this.observacoes;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}