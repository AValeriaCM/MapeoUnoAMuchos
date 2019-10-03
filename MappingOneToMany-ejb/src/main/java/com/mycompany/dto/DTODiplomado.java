/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

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
    private boolean estado;
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
     * Metodo 
     * @return 
     */
    public boolean isEstado() {
        return estado;
    }
    /**
     * Metodo set
     * @param estado 
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
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
