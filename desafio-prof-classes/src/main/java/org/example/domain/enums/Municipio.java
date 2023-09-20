package org.example.domain.enums;

public enum Municipio {
    MARINGA("Maringa");
    //Rever enum. Muita informacao +- 5570 municipios, necessário validação


    private String nomeMunicipio;

    Municipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getNome() {
        return nomeMunicipio;
    }

}