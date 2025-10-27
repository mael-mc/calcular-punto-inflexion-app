package com.puntoinflexion.modelo.icalcularpuntoinflexion;

public class CalcularPuntoInflexion {
    private String funcionDerivada;

    public CalcularPuntoInflexion(String funcionDerivada) {
        this.funcionDerivada = funcionDerivada;
    }

    public String getFuncionDerivada() {
        return funcionDerivada;
    }

    public void setFuncionDerivada(String funcionDerivada) {
        this.funcionDerivada = funcionDerivada;
    }

}