/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.DTOEstudiante;
import com.mycompany.entity.Estudiante;
import com.mycompany.interfaces.IEstudianteFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author angie
 */
@Named(value = "estudianteController")
@SessionScoped
public class EstudianteController implements Serializable{
    
    private String nombre;
    private String cedula;
    DTOEstudiante dtoEstudiante = new DTOEstudiante();
    
    
    @EJB
    IEstudianteFacadeLocal estudianteFacade;

    public EstudianteController() {
    }
    
    public List<Estudiante> listarEstudiante(){
        return estudianteFacade.findAll();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public DTOEstudiante getDtoEstudiante() {
        return dtoEstudiante;
    }

    public void setDtoEstudiante(DTOEstudiante dtoEstudiante) {
        this.dtoEstudiante = dtoEstudiante;
    }

    public IEstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    public void setEstudianteFacade(IEstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
    }
    
    
}
