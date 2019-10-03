/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTOUniversidad;
import com.mycompany.entity.Universidad;
import com.mycompany.interfaces.IUniversidadFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author angie
 */
@Named(value = "universidadController")
@SessionScoped
public class UniversidadController implements Serializable {
    
    private String nombre;
    private String extension;
    private String escudo;
    DTOUniversidad dtoUniversidad = new DTOUniversidad();
    
    
    @EJB
    IUniversidadFacadeLocal universidadFacade;

    public UniversidadController() {
    }
    
    public List<Universidad> listarUniversidad(){
        return universidadFacade.findAll();
    }
    
    public void crearUniversidad(){
        System.out.println("ENTRA--------");
        
        dtoUniversidad.setNombre(nombre);
        dtoUniversidad.setExtension(extension);
        dtoUniversidad.setEscudo(escudo);

        FacesContext fCtx = FacesContext.getCurrentInstance();
        fCtx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Agregado",
                        "Inversor "+nombre+" agregado"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public DTOUniversidad getDtoUniversidad() {
        return dtoUniversidad;
    }

    public void setDtoUniversidad(DTOUniversidad dtoUniversidad) {
        this.dtoUniversidad = dtoUniversidad;
    }

    public IUniversidadFacadeLocal getUniversidadFacade() {
        return universidadFacade;
    }

    public void setUniversidadFacade(IUniversidadFacadeLocal universidadFacade) {
        this.universidadFacade = universidadFacade;
    }
    
    
    
}
