/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.util.Date;

/**
 *
 * @author angie
 */
public class DTOView {
    /**
     * Declaracion de variables
     */
    private String nombreUniversidad;
    private String extension;
    private String nombreDiplomado;
    private Date fechaInicio;
    private Date fechaFin;
    private String nombreEstudiante;
    private String foto;
    /**
     * Constructor vacio
     */
    public DTOView() {
    }
    /**
     * Constructor
     * @param nombreUniversidad
     * @param extension
     * @param nombreDiplomado
     * @param fechaInicio
     * @param fechaFin
     * @param nombreEstudiante
     * @param foto 
     */
    public DTOView(String nombreUniversidad, String extension, String nombreDiplomado, Date fechaInicio, Date fechaFin, String nombreEstudiante, String foto) {
        this.nombreUniversidad = nombreUniversidad;
        this.extension = extension;
        this.nombreDiplomado = nombreDiplomado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEstudiante = nombreEstudiante;
        this.foto = foto;
    }
    /**
     * 
     * @return 
     */
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }
    /**
     * 
     * @param nombreUniversidad 
     */
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
    /**
     * 
     * @return 
     */
    public String getExtension() {
        return extension;
    }
    /**
     * 
     * @param extension 
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * 
     * @return 
     */
    public String getNombreDiplomado() {
        return nombreDiplomado;
    }
    /**
     * 
     * @param nombreDiplomado 
     */
    public void setNombreDiplomado(String nombreDiplomado) {
        this.nombreDiplomado = nombreDiplomado;
    }
    /**
     * 
     * @return 
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }
    /**
     * 
     * @param fechaInicio 
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * 
     * @return 
     */
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * 
     * @param fechaFin 
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * 
     * @return 
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    /**
     * 
     * @param nombreEstudiante 
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    /**
     * 
     * @return 
     */
    public String getFoto() {
        return foto;
    }
    /**
     * 
     * @param foto 
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
          
    
}
