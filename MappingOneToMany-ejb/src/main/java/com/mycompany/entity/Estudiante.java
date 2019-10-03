/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "estudiante")

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cedula")
    private String cedula;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "diplomado_id", nullable = false)
    private Diplomado diplomado_id;
    /**
     * Constructor
     * @param id
     * @param nombre
     * @param cedula
     * @param estado 
     */
    public Estudiante(int id, String nombre, String cedula, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.estado = estado;
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
    public boolean isEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    /**
     * 
     * @return 
     */
    public Diplomado getDiplomado_id() {
        return diplomado_id;
    }
    /**
     * 
     * @param diplomado_id 
     */
    public void setDiplomado_id(Diplomado diplomado_id) {
        this.diplomado_id = diplomado_id;
    }
    
    
    
}
