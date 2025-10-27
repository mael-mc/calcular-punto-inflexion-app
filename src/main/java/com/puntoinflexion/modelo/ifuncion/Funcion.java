package com.puntoinflexion.modelo.ifuncion;

public class Funcion {
    private String funcion;
    private String variableIndependienteX;
    private String variableDependienteY;

    
    public Funcion(String funcion, String variableIndependienteX, String variableDependienteY) {
        this.funcion = funcion;
        this.variableIndependienteX = variableIndependienteX;
        this.variableDependienteY = variableDependienteY;
    }


    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getVariableIndependienteX() {
        return variableIndependienteX;
    }

    public void setVariableIndependienteX(String variableIndependienteX) {
        this.variableIndependienteX = variableIndependienteX;
    }

    public String getVariableDependienteY() {
        return variableDependienteY;
    }

    public void setVariableDependienteY(String variableDependienteY) {
        this.variableDependienteY = variableDependienteY;
    }

}