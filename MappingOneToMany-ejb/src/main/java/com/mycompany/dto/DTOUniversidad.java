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
public class DTOUniversidad {
    /**
     * Declaracion de variables
     */
    private int id;
    private String nombre;
    private String extension;
    private String escudo;
    /**
     * Constructor vacio
     */
    public DTOUniversidad() {
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
    public String getExtension() {
        return extension;
    }
    /**
     * Metodo set
     * @param extension 
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * Metodo get
     * @return 
     */
    public String getEscudo() {
        return escudo;
    }
    /**
     * Metodo set
     * @param escudo 
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
    
    
}
