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
public class DTODiplomado {
    /**
     * Declaracion de variables
     */
    private int id;
    private String nombre;
    private String duracion;
    private Date fechaInicio;
    private Date fechaFin;
    private int universidad_id;
    /**
     * constructor vacio
     */
    public DTODiplomado() {
    }
    /**
     * Metodo get
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo set
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo get
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo set
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get
     * @return 
     */
    public String getDuracion() {
        return duracion;
    }
    /**
     * Metodo set
     * @param duracion 
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
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
     * Metodo get
     * @return 
     */
    public int getUniversidad_id() {
        return universidad_id;
    }
    /**
     * Metodo set
     * @param universidad_id 
     */
    public void setUniversidad_id(int universidad_id) {
        this.universidad_id = universidad_id;
    }
    
    
    
}
