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
public class DTOEstudiante {
    
    /**
     * Declaracion de variables
     */
    private int id;
    private String nombre;
    private String cedula;
    private String foto;
    private int diplomado_id;
    /**
     * Constructor vacio
     */
    public DTOEstudiante() {
    }
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    public String getCedula() {
        return cedula;
    }
    /**
     * 
     * @param cedula 
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    
    /**
     * 
     * @return 
     */
    public int getDiplomado_id() {
        return diplomado_id;
    }
    /**
     * 
     * @param diplomado_id 
     */
    public void setDiplomado_id(int diplomado_id) {
        this.diplomado_id = diplomado_id;
    }
    
    
    
    
}
