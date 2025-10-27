package com.puntoinflexion.controlador;

import com.puntoinflexion.modelo.ifuncion.IFuncion;
import com.puntoinflexion.vista.FuncionPanel;
import com.puntoinflexion.vista.FuncionVista;

public class FuncionControlador {
    FuncionVista funcionVista;
    IFuncion ifuncion;
    FuncionPanel funcionPanel;
    
    public FuncionControlador(FuncionVista funcionVista, IFuncion ifuncion, FuncionPanel funcionPanel) {
        this.funcionVista = funcionVista;
        this.ifuncion = ifuncion;
        this.funcionPanel = funcionPanel;
    }

    
}