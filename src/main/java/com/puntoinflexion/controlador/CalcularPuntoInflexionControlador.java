package com.puntoinflexion.controlador;

import com.puntoinflexion.modelo.icalcularpuntoinflexion.ICalcularPuntoInflexion;
import com.puntoinflexion.vista.CalcularPuntoInflexionPanel;
import com.puntoinflexion.vista.CalcularPuntoInflexionVista;

public class CalcularPuntoInflexionControlador {
    private CalcularPuntoInflexionVista calcularPuntoInflexionVista;
    private CalcularPuntoInflexionPanel calcularPuntoInflexionPanel;
    private ICalcularPuntoInflexion iCalcularPuntoInflexion;

    public CalcularPuntoInflexionControlador(CalcularPuntoInflexionVista calcularPuntoInflexionVista,
            CalcularPuntoInflexionPanel calcularPuntoInflexionPanel, ICalcularPuntoInflexion iCalcularPuntoInflexion) {
        this.calcularPuntoInflexionVista = calcularPuntoInflexionVista;
        this.calcularPuntoInflexionPanel = calcularPuntoInflexionPanel;
        this.iCalcularPuntoInflexion = iCalcularPuntoInflexion;
    }

    public boolean calcularPuntoInflexion(){
        return true;
    }

    public void imprimirPuntoInflexion(){
        
    }
}