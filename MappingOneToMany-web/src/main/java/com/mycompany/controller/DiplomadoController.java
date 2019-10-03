/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTODiplomado;
import com.mycompany.entity.Diplomado;
import com.mycompany.interfaces.IDiplomadoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author angie
 */

@Named(value = "diplomadoController")
@SessionScoped
public class DiplomadoController implements Serializable{
    
    private String nombre;
    private String duracion;
    
    DTODiplomado dtoDiplomado = new DTODiplomado();
    
    @EJB
    IDiplomadoFacadeLocal diplomadoFacade;

    public DiplomadoController() {
    }
    
    public List<Diplomado> listarDiplomado(){
        return diplomadoFacade.findAll();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public DTODiplomado getDtoDiplomado() {
        return dtoDiplomado;
    }

    public void setDtoDiplomado(DTODiplomado dtoDiplomado) {
        this.dtoDiplomado = dtoDiplomado;
    }

    public IDiplomadoFacadeLocal getDiplomadoFacade() {
        return diplomadoFacade;
    }

    public void setDiplomadoFacade(IDiplomadoFacadeLocal diplomadoFacade) {
        this.diplomadoFacade = diplomadoFacade;
    }
    
}
